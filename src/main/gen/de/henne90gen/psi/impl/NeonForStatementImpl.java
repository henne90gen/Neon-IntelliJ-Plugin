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

public class NeonForStatementImpl extends ASTWrapperPsiElement implements NeonForStatement {

  public NeonForStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NeonVisitor visitor) {
    visitor.visitForStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NeonVisitor) accept((NeonVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<NeonAssignment> getAssignmentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NeonAssignment.class);
  }

  @Override
  @NotNull
  public NeonExpression getExpression() {
    return findNotNullChildByClass(NeonExpression.class);
  }

  @Override
  @NotNull
  public List<NeonStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NeonStatement.class);
  }

}
