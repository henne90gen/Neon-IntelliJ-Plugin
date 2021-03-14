package de.henne90gen

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class NeonFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, NeonLanguage.INSTANCE) {
    override fun getFileType(): FileType {
        return NeonFileType.INSTANCE
    }

    override fun toString(): String {
        return "Neon File"
    }
}