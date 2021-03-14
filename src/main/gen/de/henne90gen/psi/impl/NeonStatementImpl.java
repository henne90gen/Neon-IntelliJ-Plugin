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

public class NeonStatementImpl extends ASTWrapperPsiElement implements NeonStatement {

  public NeonStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NeonVisitor visitor) {
    visitor.visitStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NeonVisitor) accept((NeonVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NeonAssignment getAssignment() {
    return findChildByClass(NeonAssignment.class);
  }

  @Override
  @Nullable
  public NeonDefinition getDefinition() {
    return findChildByClass(NeonDefinition.class);
  }

  @Override
  @Nullable
  public NeonExpression getExpression() {
    return findChildByClass(NeonExpression.class);
  }

  @Override
  @Nullable
  public NeonExternalFunction getExternalFunction() {
    return findChildByClass(NeonExternalFunction.class);
  }

  @Override
  @Nullable
  public NeonForStatement getForStatement() {
    return findChildByClass(NeonForStatement.class);
  }

  @Override
  @Nullable
  public NeonFunction getFunction() {
    return findChildByClass(NeonFunction.class);
  }

  @Override
  @Nullable
  public NeonIfStatement getIfStatement() {
    return findChildByClass(NeonIfStatement.class);
  }

  @Override
  @Nullable
  public NeonImportStatement getImportStatement() {
    return findChildByClass(NeonImportStatement.class);
  }

}
