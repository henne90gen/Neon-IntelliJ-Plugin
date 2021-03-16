package de.henne90gen

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode

abstract class NeonNamedElementImpl(node: ASTNode) : ASTWrapperPsiElement(node), NeonNamedElement
