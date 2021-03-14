package de.henne90gen

import com.intellij.psi.tree.IElementType

class NeonTokenType(debugName: String) : IElementType(debugName, NeonLanguage.INSTANCE) {
    override fun toString(): String {
        return "NeonTokenType." + super.toString()
    }
}
