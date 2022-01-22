// This is a generated file. Not intended for manual editing.
package de.henne90gen.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;
import de.henne90gen.NeonNamedElement;

public class NeonVisitor extends PsiElementVisitor {

  public void visitAssertStatement(@NotNull NeonAssertStatement o) {
    visitPsiElement(o);
  }

  public void visitAssignment(@NotNull NeonAssignment o) {
    visitPsiElement(o);
  }

  public void visitAssignmentLeft(@NotNull NeonAssignmentLeft o) {
    visitPsiElement(o);
  }

  public void visitDataType(@NotNull NeonDataType o) {
    visitPsiElement(o);
  }

  public void visitExpression(@NotNull NeonExpression o) {
    visitPsiElement(o);
  }

  public void visitExternalFunction(@NotNull NeonExternalFunction o) {
    visitPsiElement(o);
  }

  public void visitForStatement(@NotNull NeonForStatement o) {
    visitPsiElement(o);
  }

  public void visitFunction(@NotNull NeonFunction o) {
    visitPsiElement(o);
  }

  public void visitFunctionArguments(@NotNull NeonFunctionArguments o) {
    visitPsiElement(o);
  }

  public void visitIfStatement(@NotNull NeonIfStatement o) {
    visitPsiElement(o);
  }

  public void visitImportStatement(@NotNull NeonImportStatement o) {
    visitPsiElement(o);
  }

  public void visitStatement(@NotNull NeonStatement o) {
    visitPsiElement(o);
  }

  public void visitVariable(@NotNull NeonVariable o) {
    visitPsiElement(o);
  }

  public void visitVariableDefinition(@NotNull NeonVariableDefinition o) {
    visitNamedElement(o);
  }

  public void visitNamedElement(@NotNull NeonNamedElement o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
