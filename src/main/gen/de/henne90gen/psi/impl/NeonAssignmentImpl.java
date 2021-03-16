// This is a generated file. Not intended for manual editing.
package de.henne90gen.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static de.henne90gen.psi.NeonTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import de.henne90gen.psi.*;
import de.henne90gen.NeonPsiUtil;

public class NeonAssignmentImpl extends ASTWrapperPsiElement implements NeonAssignment {

  public NeonAssignmentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NeonVisitor visitor) {
    visitor.visitAssignment(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NeonVisitor) accept((NeonVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public NeonAssignmentLeft getAssignmentLeft() {
    return findNotNullChildByClass(NeonAssignmentLeft.class);
  }

  @Override
  @NotNull
  public NeonExpression getExpression() {
    return findNotNullChildByClass(NeonExpression.class);
  }

}
