package de.henne90gen;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import de.henne90gen.psi.NeonTypes;
import com.intellij.psi.TokenType;

/**
 * Lexer for the Neon language.
 */
%%

%class NeonLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

NEW_LINE = \r | \n | \r\n
INPUT_CHARACTER = [^\r\n]
WHITE_SPACE = {NEW_LINE} | [\ \t\f]
COMMENT = "#" {INPUT_CHARACTER}* {NEW_LINE}?
IDENTIFIER = [:jletter:] [:jletterdigit:]*
INTEGER = [:digit:] [:digit:]*
FLOAT = [:digit:] [:digit:]* \. [:digit:] [:digit:]*
STRING = \" [:jletterdigit:]* \"

%state WAITING_VALUE

%%

/* keywords */
<YYINITIAL> "fun"    { return NeonTypes.FUN; }
<YYINITIAL> "int"    { return NeonTypes.SIMPLE_DATA_TYPE; }
<YYINITIAL> "float"  { return NeonTypes.SIMPLE_DATA_TYPE; }
<YYINITIAL> "bool"   { return NeonTypes.SIMPLE_DATA_TYPE; }
<YYINITIAL> "string" { return NeonTypes.SIMPLE_DATA_TYPE; }
<YYINITIAL> "return" { return NeonTypes.RETURN; }
<YYINITIAL> "for"    { return NeonTypes.FOR; }
<YYINITIAL> "if"     { return NeonTypes.IF; }
<YYINITIAL> "extern" { return NeonTypes.EXTERN; }
<YYINITIAL> "assert" { return NeonTypes.ASSERT; }
<YYINITIAL> "import" { return NeonTypes.IMPORT; }
<YYINITIAL> "or"     { return NeonTypes.OR; }
<YYINITIAL> "and"    { return NeonTypes.AND; }

<YYINITIAL> {
    /* symbols */
    "," { return NeonTypes.COMMA; }
    "(" { return NeonTypes.LEFT_PARAN; }
    ")" { return NeonTypes.RIGHT_PARAN; }
    "[" { return NeonTypes.LEFT_BRACKET; }
    "]" { return NeonTypes.RIGHT_BRACKET; }
    "{" { return NeonTypes.LEFT_CURLY_BRACE; }
    "}" { return NeonTypes.RIGHT_CURLY_BRACE; }
    "+" { return NeonTypes.PLUS; }
    "-" { return NeonTypes.MINUS; }
    "*" { return NeonTypes.STAR; }
    "/" { return NeonTypes.DIV; }
    "=" { return NeonTypes.SINGLE_EQUALS; }
    "<" { return NeonTypes.LESS_THAN; }
    ">" { return NeonTypes.GREATER_THAN; }
    "==" { return NeonTypes.DOUBLE_EQUALS; }
    "!=" { return NeonTypes.NOT_EQUALS; }
    "<=" { return NeonTypes.LESS_EQUALS; }
    ">=" { return NeonTypes.GREATER_EQUALS; }

    "true" | "false" { return NeonTypes.BOOLEAN; }
    {INTEGER}        { return NeonTypes.INTEGER; }
    {FLOAT}          { return NeonTypes.FLOAT; }
    {STRING}         { return NeonTypes.STRING; }
    {IDENTIFIER}     { return NeonTypes.IDENTIFIER; }
    {NEW_LINE}       { return NeonTypes.NEW_LINE; }
    {COMMENT}        { return NeonTypes.COMMENT; }
    {WHITE_SPACE}    {/* ignore */}
}

/*
<STRING> {
    \"                             { yybegin(YYINITIAL);
                                   return symbol(sym.STRING_LITERAL, string.toString()); }
    [^\n\r\"\\]+                   { string.append( yytext() ); }
    \\t                            { string.append('\t'); }
    \\n                            { string.append('\n'); }

    \\r                            { string.append('\r'); }
    \\\"                           { string.append('\"'); }
    \\                             { string.append('\\'); }
}
*/

/* error fallback */
[^] { return TokenType.BAD_CHARACTER; }
