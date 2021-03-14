package de.henne90gen

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class NeonFileType private constructor() : LanguageFileType(NeonLanguage.INSTANCE) {
    companion object {
        val INSTANCE: NeonFileType = NeonFileType()
    }

    override fun getName(): String {
        return "Neon File"
    }

    override fun getDescription(): String {
        return "Neon language File"
    }

    override fun getDefaultExtension(): String {
        return "ne"
    }

    override fun getIcon(): Icon {
        return NeonIcons.FILE
    }
}
