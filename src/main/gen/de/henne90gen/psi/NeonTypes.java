// This is a generated file. Not intended for manual editing.
package de.henne90gen.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import de.henne90gen.NeonElementType;
import de.henne90gen.NeonTokenType;
import de.henne90gen.psi.impl.*;

public interface NeonTypes {

  IElementType ASSIGNMENT = new NeonElementType("ASSIGNMENT");
  IElementType ASSIGNMENT_LEFT = new NeonElementType("ASSIGNMENT_LEFT");
  IElementType DATA_TYPE = new NeonElementType("DATA_TYPE");
  IElementType EXPRESSION = new NeonElementType("EXPRESSION");
  IElementType EXTERNAL_FUNCTION = new NeonElementType("EXTERNAL_FUNCTION");
  IElementType FOR_STATEMENT = new NeonElementType("FOR_STATEMENT");
  IElementType FUNCTION = new NeonElementType("FUNCTION");
  IElementType FUNCTION_ARGUMENTS = new NeonElementType("FUNCTION_ARGUMENTS");
  IElementType IF_STATEMENT = new NeonElementType("IF_STATEMENT");
  IElementType IMPORT_STATEMENT = new NeonElementType("IMPORT_STATEMENT");
  IElementType STATEMENT = new NeonElementType("STATEMENT");
  IElementType VARIABLE = new NeonElementType("VARIABLE");
  IElementType VARIABLE_DEFINITION = new NeonElementType("VARIABLE_DEFINITION");

  IElementType AND = new NeonTokenType("AND");
  IElementType BOOLEAN = new NeonTokenType("BOOLEAN");
  IElementType COMMA = new NeonTokenType("COMMA");
  IElementType COMMENT = new NeonTokenType("COMMENT");
  IElementType DIV = new NeonTokenType("DIV");
  IElementType DOUBLE_EQUALS = new NeonTokenType("DOUBLE_EQUALS");
  IElementType EXTERN = new NeonTokenType("EXTERN");
  IElementType FLOAT = new NeonTokenType("FLOAT");
  IElementType FOR = new NeonTokenType("FOR");
  IElementType FUN = new NeonTokenType("FUN");
  IElementType GREATER_EQUALS = new NeonTokenType("GREATER_EQUALS");
  IElementType GREATER_THAN = new NeonTokenType("GREATER_THAN");
  IElementType IDENTIFIER = new NeonTokenType("IDENTIFIER");
  IElementType IF = new NeonTokenType("IF");
  IElementType IMPORT = new NeonTokenType("IMPORT");
  IElementType INTEGER = new NeonTokenType("INTEGER");
  IElementType LEFT_BRACKET = new NeonTokenType("LEFT_BRACKET");
  IElementType LEFT_CURLY_BRACE = new NeonTokenType("LEFT_CURLY_BRACE");
  IElementType LEFT_PARAN = new NeonTokenType("LEFT_PARAN");
  IElementType LESS_EQUALS = new NeonTokenType("LESS_EQUALS");
  IElementType LESS_THAN = new NeonTokenType("LESS_THAN");
  IElementType MINUS = new NeonTokenType("MINUS");
  IElementType NEW_LINE = new NeonTokenType("NEW_LINE");
  IElementType NOT_EQUALS = new NeonTokenType("NOT_EQUALS");
  IElementType OR = new NeonTokenType("OR");
  IElementType PLUS = new NeonTokenType("PLUS");
  IElementType RETURN = new NeonTokenType("RETURN");
  IElementType RIGHT_BRACKET = new NeonTokenType("RIGHT_BRACKET");
  IElementType RIGHT_CURLY_BRACE = new NeonTokenType("RIGHT_CURLY_BRACE");
  IElementType RIGHT_PARAN = new NeonTokenType("RIGHT_PARAN");
  IElementType SEMICOLON = new NeonTokenType("SEMICOLON");
  IElementType SIMPLE_DATA_TYPE = new NeonTokenType("SIMPLE_DATA_TYPE");
  IElementType SINGLE_EQUALS = new NeonTokenType("SINGLE_EQUALS");
  IElementType STAR = new NeonTokenType("STAR");
  IElementType STRING = new NeonTokenType("STRING");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ASSIGNMENT) {
        return new NeonAssignmentImpl(node);
      }
      else if (type == ASSIGNMENT_LEFT) {
        return new NeonAssignmentLeftImpl(node);
      }
      else if (type == DATA_TYPE) {
        return new NeonDataTypeImpl(node);
      }
      else if (type == EXPRESSION) {
        return new NeonExpressionImpl(node);
      }
      else if (type == EXTERNAL_FUNCTION) {
        return new NeonExternalFunctionImpl(node);
      }
      else if (type == FOR_STATEMENT) {
        return new NeonForStatementImpl(node);
      }
      else if (type == FUNCTION) {
        return new NeonFunctionImpl(node);
      }
      else if (type == FUNCTION_ARGUMENTS) {
        return new NeonFunctionArgumentsImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new NeonIfStatementImpl(node);
      }
      else if (type == IMPORT_STATEMENT) {
        return new NeonImportStatementImpl(node);
      }
      else if (type == STATEMENT) {
        return new NeonStatementImpl(node);
      }
      else if (type == VARIABLE) {
        return new NeonVariableImpl(node);
      }
      else if (type == VARIABLE_DEFINITION) {
        return new NeonVariableDefinitionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
