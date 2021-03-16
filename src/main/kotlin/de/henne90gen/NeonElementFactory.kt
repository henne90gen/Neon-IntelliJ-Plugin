package de.henne90gen

import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFileFactory
import de.henne90gen.psi.NeonVariable
import de.henne90gen.psi.NeonVariableDefinition

class NeonElementFactory {
    companion object {
        fun createVariable(project: Project, name: String): NeonVariable {
            val file = createFile(project, name)
            return file.firstChild as NeonVariable
        }

        fun createVariableDefinition(project: Project, name: String): NeonVariableDefinition {
            val file = createFile(project, name)
            return file.firstChild as NeonVariableDefinition
        }

        private fun createFile(project: Project, text: String): NeonFile {
            val name = "dummy.ne"
            return PsiFileFactory.getInstance(project).createFileFromText(name, NeonFileType.INSTANCE, text) as NeonFile
        }
    }
}