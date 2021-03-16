package de.henne90gen

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import de.henne90gen.psi.NeonTypes

class NeonSyntaxHighlighter : SyntaxHighlighterBase() {
    companion object {
        val OPERATION = createTextAttributesKey("NEON_OPERATION", DefaultLanguageHighlighterColors.OPERATION_SIGN)
        val KEY_WORD = createTextAttributesKey("NEON_KEY_WORD", DefaultLanguageHighlighterColors.KEYWORD)
        val SEMICOLON = createTextAttributesKey("NEON_SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON)
        val COMMA = createTextAttributesKey("NEON_COMMA", DefaultLanguageHighlighterColors.COMMA)
        val PARENTHESES = createTextAttributesKey("NEON_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES)
        val BRACKETS = createTextAttributesKey("NEON_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS)
        val BRACES = createTextAttributesKey("NEON_BRACES", DefaultLanguageHighlighterColors.BRACES)
        val NUMBER = createTextAttributesKey("NEON_NUMBER", DefaultLanguageHighlighterColors.NUMBER)
        val IDENTIFIER = createTextAttributesKey("NEON_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER)
        val COMMENT = createTextAttributesKey("NEON_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        val BAD_CHARACTER = createTextAttributesKey("NEON_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)

        private val BAD_CHAR_KEYS = arrayOf(BAD_CHARACTER)
        private val OPERATION_KEYS = arrayOf(OPERATION)
        private val KEY_WORD_KEYS = arrayOf(KEY_WORD)
        private val SEMICOLON_KEYS = arrayOf(SEMICOLON)
        private val COMMA_KEYS = arrayOf(COMMA)
        private val PARENTHESES_KEYS = arrayOf(PARENTHESES)
        private val BRACKETS_KEYS = arrayOf(BRACKETS)
        private val BRACES_KEYS = arrayOf(BRACES)
        private val NUMBER_KEYS = arrayOf(NUMBER)
        private val IDENTIFIER_KEYS = arrayOf(IDENTIFIER)
        private val COMMENT_KEYS = arrayOf(COMMENT)
        private val EMPTY_KEYS = arrayOf<TextAttributesKey>()
    }

    override fun getHighlightingLexer(): Lexer {
        return NeonLexerAdapter()
    }

    override fun getTokenHighlights(token: IElementType?): Array<TextAttributesKey> {
        return when (token) {
            NeonTypes.FUN -> KEY_WORD_KEYS
            NeonTypes.SIMPLE_DATA_TYPE -> KEY_WORD_KEYS
            NeonTypes.RETURN -> KEY_WORD_KEYS
            NeonTypes.FOR -> KEY_WORD_KEYS
            NeonTypes.IF -> KEY_WORD_KEYS
            NeonTypes.EXTERN -> KEY_WORD_KEYS
            NeonTypes.IMPORT -> KEY_WORD_KEYS
            NeonTypes.AND -> KEY_WORD_KEYS
            NeonTypes.OR -> KEY_WORD_KEYS
            NeonTypes.BOOLEAN -> KEY_WORD_KEYS

            NeonTypes.PLUS -> OPERATION_KEYS
            NeonTypes.MINUS -> OPERATION_KEYS
            NeonTypes.STAR -> OPERATION_KEYS
            NeonTypes.DIV -> OPERATION_KEYS
            NeonTypes.LESS_THAN -> OPERATION_KEYS
            NeonTypes.LESS_EQUALS -> OPERATION_KEYS
            NeonTypes.GREATER_THAN -> OPERATION_KEYS
            NeonTypes.GREATER_EQUALS -> OPERATION_KEYS
            NeonTypes.DOUBLE_EQUALS -> OPERATION_KEYS
            NeonTypes.NOT_EQUALS -> OPERATION_KEYS

            NeonTypes.LEFT_PARAN -> PARENTHESES_KEYS
            NeonTypes.RIGHT_PARAN -> PARENTHESES_KEYS

            NeonTypes.LEFT_BRACKET -> BRACKETS_KEYS
            NeonTypes.RIGHT_BRACKET -> BRACKETS_KEYS

            NeonTypes.LEFT_CURLY_BRACE -> BRACES_KEYS
            NeonTypes.RIGHT_CURLY_BRACE -> BRACES_KEYS

            NeonTypes.INTEGER -> NUMBER_KEYS
            NeonTypes.FLOAT -> NUMBER_KEYS

            NeonTypes.SEMICOLON -> SEMICOLON_KEYS
            NeonTypes.COMMA -> COMMA_KEYS

            NeonTypes.IDENTIFIER -> IDENTIFIER_KEYS
            NeonTypes.COMMENT -> COMMENT_KEYS
            TokenType.BAD_CHARACTER -> BAD_CHAR_KEYS
            else -> EMPTY_KEYS
        }
    }
}