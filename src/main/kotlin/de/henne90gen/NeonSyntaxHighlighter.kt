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
        val SEPARATOR = createTextAttributesKey("NEON_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN)
        val KEY = createTextAttributesKey("NEON_KEY", DefaultLanguageHighlighterColors.KEYWORD)
        val VALUE = createTextAttributesKey("NEON_VALUE", DefaultLanguageHighlighterColors.STRING)
        val COMMENT = createTextAttributesKey("NEON_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        val BAD_CHARACTER = createTextAttributesKey("NEON_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)
    }

    private val BAD_CHAR_KEYS = arrayOf(BAD_CHARACTER)
    private val SEPARATOR_KEYS = arrayOf(SEPARATOR)
    private val KEY_KEYS = arrayOf(KEY)
    private val VALUE_KEYS = arrayOf(VALUE)
    private val COMMENT_KEYS = arrayOf(COMMENT)
    private val EMPTY_KEYS = arrayOf<TextAttributesKey>()

    override fun getHighlightingLexer(): Lexer {
        return NeonLexerAdapter()
    }

    override fun getTokenHighlights(p0: IElementType?): Array<TextAttributesKey> {
        return when (p0) {
            NeonTypes.SEPARATOR -> SEPARATOR_KEYS
            NeonTypes.KEY -> KEY_KEYS
            NeonTypes.VALUE -> VALUE_KEYS
            NeonTypes.COMMENT -> COMMENT_KEYS
            TokenType.BAD_CHARACTER -> BAD_CHAR_KEYS
            else -> EMPTY_KEYS
        }
    }
}