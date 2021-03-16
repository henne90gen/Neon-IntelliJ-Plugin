package de.henne90gen

import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiElementResolveResult
import com.intellij.psi.PsiReferenceBase
import com.intellij.psi.ResolveResult
import de.henne90gen.psi.NeonVariable
import de.henne90gen.psi.NeonVariableDefinition
import java.util.*
import java.util.logging.Logger

class NeonVariableReference(element: NeonVariable) : PsiReferenceBase<PsiElement>(element) {

    private val log = Logger.getLogger(NeonVariableReference::class.java.simpleName)

    private val name: String? = element.name

    override fun resolve(): PsiElement? {
        log.info("resolve()")
        if (name == null) {
            return null
        }
        val variables = NeonUtil.findVariableDefinitions(myElement.project, name)
        val results = ArrayList<ResolveResult>()
        for (variable in variables) {
            results.add(PsiElementResolveResult(variable))
        }
        return if (results.size == 1) {
            log.info("resolve() was successful: ${results[0].element}")
            results[0].element
        } else {
            null
        }
    }

    override fun isReferenceTo(element: PsiElement): Boolean {
        if (element !is NeonVariableDefinition) {
            log.info("isReferenceTo() false")
            return false
        }
        val result = element.name == name
        log.info("isReferenceTo() $result")
        return result
    }

    override fun getRangeInElement(): TextRange {
        // FIXME references start with a space
        return TextRange.from(1, element.textLength)
    }
}
