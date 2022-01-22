// This is a generated file. Not intended for manual editing.
package de.henne90gen;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static de.henne90gen.psi.NeonTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class NeonParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return neonFile(b, l + 1);
  }

  /* ********************************************************** */
  // ASSERT expression
  public static boolean assert_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assert_statement")) return false;
    if (!nextTokenIs(b, ASSERT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSERT);
    r = r && expression(b, l + 1);
    exit_section_(b, m, ASSERT_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // assignment_left SINGLE_EQUALS expression
  public static boolean assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment")) return false;
    if (!nextTokenIs(b, "<assignment>", IDENTIFIER, SIMPLE_DATA_TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT, "<assignment>");
    r = assignment_left(b, l + 1);
    r = r && consumeToken(b, SINGLE_EQUALS);
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // variable_definition | IDENTIFIER
  public static boolean assignment_left(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_left")) return false;
    if (!nextTokenIs(b, "<assignment left>", IDENTIFIER, SIMPLE_DATA_TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT_LEFT, "<assignment left>");
    r = variable_definition(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER | SIMPLE_DATA_TYPE
  public static boolean data_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_type")) return false;
    if (!nextTokenIs(b, "<data type>", IDENTIFIER, SIMPLE_DATA_TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATA_TYPE, "<data type>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, SIMPLE_DATA_TYPE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (LEFT_PARAN expression RIGHT_PARAN) |
  //     ((BOOLEAN | INTEGER | FLOAT | STRING | variable) (PLUS | MINUS | STAR | DIV | AND | OR | LESS_THAN | LESS_EQUALS | NOT_EQUALS | DOUBLE_EQUALS | GREATER_EQUALS | GREATER_THAN) expression) |
  //     (BOOLEAN | INTEGER | FLOAT | STRING | variable)
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPRESSION, "<expression>");
    r = expression_0(b, l + 1);
    if (!r) r = expression_1(b, l + 1);
    if (!r) r = expression_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LEFT_PARAN expression RIGHT_PARAN
  private static boolean expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PARAN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARAN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (BOOLEAN | INTEGER | FLOAT | STRING | variable) (PLUS | MINUS | STAR | DIV | AND | OR | LESS_THAN | LESS_EQUALS | NOT_EQUALS | DOUBLE_EQUALS | GREATER_EQUALS | GREATER_THAN) expression
  private static boolean expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_1_0(b, l + 1);
    r = r && expression_1_1(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BOOLEAN | INTEGER | FLOAT | STRING | variable
  private static boolean expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1_0")) return false;
    boolean r;
    r = consumeToken(b, BOOLEAN);
    if (!r) r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, FLOAT);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = variable(b, l + 1);
    return r;
  }

  // PLUS | MINUS | STAR | DIV | AND | OR | LESS_THAN | LESS_EQUALS | NOT_EQUALS | DOUBLE_EQUALS | GREATER_EQUALS | GREATER_THAN
  private static boolean expression_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1_1")) return false;
    boolean r;
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, STAR);
    if (!r) r = consumeToken(b, DIV);
    if (!r) r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, OR);
    if (!r) r = consumeToken(b, LESS_THAN);
    if (!r) r = consumeToken(b, LESS_EQUALS);
    if (!r) r = consumeToken(b, NOT_EQUALS);
    if (!r) r = consumeToken(b, DOUBLE_EQUALS);
    if (!r) r = consumeToken(b, GREATER_EQUALS);
    if (!r) r = consumeToken(b, GREATER_THAN);
    return r;
  }

  // BOOLEAN | INTEGER | FLOAT | STRING | variable
  private static boolean expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_2")) return false;
    boolean r;
    r = consumeToken(b, BOOLEAN);
    if (!r) r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, FLOAT);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = variable(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // EXTERN FUN IDENTIFIER
  //     LEFT_PARAN function_arguments? RIGHT_PARAN data_type?
  public static boolean external_function(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "external_function")) return false;
    if (!nextTokenIs(b, EXTERN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, EXTERN, FUN, IDENTIFIER, LEFT_PARAN);
    r = r && external_function_4(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARAN);
    r = r && external_function_6(b, l + 1);
    exit_section_(b, m, EXTERNAL_FUNCTION, r);
    return r;
  }

  // function_arguments?
  private static boolean external_function_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "external_function_4")) return false;
    function_arguments(b, l + 1);
    return true;
  }

  // data_type?
  private static boolean external_function_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "external_function_6")) return false;
    data_type(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // FOR assignment SEMICOLON expression SEMICOLON assignment LEFT_CURLY_BRACE statement* RIGHT_CURLY_BRACE
  public static boolean for_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && assignment(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && assignment(b, l + 1);
    r = r && consumeToken(b, LEFT_CURLY_BRACE);
    r = r && for_statement_7(b, l + 1);
    r = r && consumeToken(b, RIGHT_CURLY_BRACE);
    exit_section_(b, m, FOR_STATEMENT, r);
    return r;
  }

  // statement*
  private static boolean for_statement_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "for_statement_7", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // FUN IDENTIFIER
  //     LEFT_PARAN function_arguments?
  //     RIGHT_PARAN data_type?
  //     LEFT_CURLY_BRACE statement* RIGHT_CURLY_BRACE
  public static boolean function(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function")) return false;
    if (!nextTokenIs(b, FUN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FUN, IDENTIFIER, LEFT_PARAN);
    r = r && function_3(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARAN);
    r = r && function_5(b, l + 1);
    r = r && consumeToken(b, LEFT_CURLY_BRACE);
    r = r && function_7(b, l + 1);
    r = r && consumeToken(b, RIGHT_CURLY_BRACE);
    exit_section_(b, m, FUNCTION, r);
    return r;
  }

  // function_arguments?
  private static boolean function_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_3")) return false;
    function_arguments(b, l + 1);
    return true;
  }

  // data_type?
  private static boolean function_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_5")) return false;
    data_type(b, l + 1);
    return true;
  }

  // statement*
  private static boolean function_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "function_7", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // data_type IDENTIFIER (COMMA function_arguments)?
  public static boolean function_arguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_arguments")) return false;
    if (!nextTokenIs(b, "<function arguments>", IDENTIFIER, SIMPLE_DATA_TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_ARGUMENTS, "<function arguments>");
    r = data_type(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && function_arguments_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA function_arguments)?
  private static boolean function_arguments_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_arguments_2")) return false;
    function_arguments_2_0(b, l + 1);
    return true;
  }

  // COMMA function_arguments
  private static boolean function_arguments_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_arguments_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && function_arguments(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IF expression LEFT_CURLY_BRACE statement* RIGHT_CURLY_BRACE
  public static boolean if_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, LEFT_CURLY_BRACE);
    r = r && if_statement_3(b, l + 1);
    r = r && consumeToken(b, RIGHT_CURLY_BRACE);
    exit_section_(b, m, IF_STATEMENT, r);
    return r;
  }

  // statement*
  private static boolean if_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_statement_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IMPORT STRING
  public static boolean import_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_statement")) return false;
    if (!nextTokenIs(b, IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IMPORT, STRING);
    exit_section_(b, m, IMPORT_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // function | COMMENT | NEW_LINE
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    r = function(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, NEW_LINE);
    return r;
  }

  /* ********************************************************** */
  // item_*
  static boolean neonFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "neonFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "neonFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // NEW_LINE |
  //     RETURN expression NEW_LINE |
  //     assignment NEW_LINE |
  //     variable_definition NEW_LINE |
  //     external_function NEW_LINE |
  //     if_statement |
  //     for_statement |
  //     import_statement |
  //     assert_statement
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = consumeToken(b, NEW_LINE);
    if (!r) r = statement_1(b, l + 1);
    if (!r) r = statement_2(b, l + 1);
    if (!r) r = statement_3(b, l + 1);
    if (!r) r = statement_4(b, l + 1);
    if (!r) r = if_statement(b, l + 1);
    if (!r) r = for_statement(b, l + 1);
    if (!r) r = import_statement(b, l + 1);
    if (!r) r = assert_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // RETURN expression NEW_LINE
  private static boolean statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    exit_section_(b, m, null, r);
    return r;
  }

  // assignment NEW_LINE
  private static boolean statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assignment(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    exit_section_(b, m, null, r);
    return r;
  }

  // variable_definition NEW_LINE
  private static boolean statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable_definition(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    exit_section_(b, m, null, r);
    return r;
  }

  // external_function NEW_LINE
  private static boolean statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = external_function(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER (LEFT_BRACKET expression RIGHT_BRACKET)?
  public static boolean variable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && variable_1(b, l + 1);
    exit_section_(b, m, VARIABLE, r);
    return r;
  }

  // (LEFT_BRACKET expression RIGHT_BRACKET)?
  private static boolean variable_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_1")) return false;
    variable_1_0(b, l + 1);
    return true;
  }

  // LEFT_BRACKET expression RIGHT_BRACKET
  private static boolean variable_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACKET);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // data_type (LEFT_BRACKET INTEGER RIGHT_BRACKET)? IDENTIFIER
  public static boolean variable_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_definition")) return false;
    if (!nextTokenIs(b, "<variable definition>", IDENTIFIER, SIMPLE_DATA_TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DEFINITION, "<variable definition>");
    r = data_type(b, l + 1);
    r = r && variable_definition_1(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (LEFT_BRACKET INTEGER RIGHT_BRACKET)?
  private static boolean variable_definition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_definition_1")) return false;
    variable_definition_1_0(b, l + 1);
    return true;
  }

  // LEFT_BRACKET INTEGER RIGHT_BRACKET
  private static boolean variable_definition_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_definition_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_BRACKET, INTEGER, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

}
