package de.henne90gen

import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReference
import de.henne90gen.psi.NeonTypes
import de.henne90gen.psi.NeonVariable
import de.henne90gen.psi.NeonVariableDefinition
import java.util.logging.Logger

class NeonPsiUtil {
    companion object {
        private val log = Logger.getLogger(NeonPsiUtil::class.java.simpleName)

        @JvmStatic
        fun getName(element: NeonVariable): String? {
            return element.node.findChildByType(NeonTypes.IDENTIFIER)?.text
        }

        @JvmStatic
        fun getReference(element: NeonVariable): PsiReference {
            log.info("getReference() has been called for $element")
            return NeonVariableReference(element)
        }

        @JvmStatic
        fun getName(element: NeonVariableDefinition): String? {
            val identifier = element.node.findChildByType(NeonTypes.IDENTIFIER)
            val name = identifier?.text
            log.info("Getting name of $element: $name")
            return name
        }

        @JvmStatic
        fun setName(element: NeonVariableDefinition, newName: String): PsiElement {
            log.info("Setting name of $element: $newName")
            val identifierNode = element.node.findChildByType(NeonTypes.IDENTIFIER)
            if (identifierNode != null) {
                val variable = NeonElementFactory.createVariableDefinition(element.project, newName)
                val newKeyNode = variable.firstChild.node
                element.node.replaceChild(identifierNode, newKeyNode)
            }
            return element
        }

        @JvmStatic
        fun getNameIdentifier(element: NeonVariableDefinition): PsiElement? {
            val identifierNode = element.node.findChildByType(NeonTypes.IDENTIFIER)
            return identifierNode?.psi
        }
    }
}
