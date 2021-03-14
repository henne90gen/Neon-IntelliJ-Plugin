package de.henne90gen

import com.intellij.lexer.FlexAdapter

class NeonLexerAdapter : FlexAdapter(NeonLexer(null)) {
}
