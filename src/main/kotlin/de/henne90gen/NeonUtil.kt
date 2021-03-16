package de.henne90gen

import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiManager
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import de.henne90gen.psi.NeonVariableDefinition


class NeonUtil {
    companion object {
        fun findVariableDefinitions(project: Project, name: String): List<NeonVariableDefinition> {
            val result = ArrayList<NeonVariableDefinition>()
            // NOTE this searches in all Neon files in the project
            val virtualFiles = FileTypeIndex.getFiles(NeonFileType.INSTANCE, GlobalSearchScope.allScope(project))
            for (virtualFile in virtualFiles) {
                if (virtualFile == null) {
                    continue
                }

                val neonFile = PsiManager.getInstance(project).findFile(virtualFile) as NeonFile?
                    ?: continue

                val variableDefinitions = findVariableDefinitions(neonFile)
                for (variableDefinition in variableDefinitions) {
                    if (name == variableDefinition.name) {
                        result.add(variableDefinition)
                    }
                }
            }
            return result
        }

        private fun findVariableDefinitions(element: PsiElement): List<NeonVariableDefinition> {
            val result = ArrayList<NeonVariableDefinition>()
            for (child in element.children) {
                if (child is NeonVariableDefinition) {
                    result.add(child)
                    continue
                }
                result.addAll(findVariableDefinitions(child))
            }
            return result
        }
    }
}
