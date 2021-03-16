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

public class NeonFunctionImpl extends ASTWrapperPsiElement implements NeonFunction {

  public NeonFunctionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NeonVisitor visitor) {
    visitor.visitFunction(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NeonVisitor) accept((NeonVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NeonDataType getDataType() {
    return findChildByClass(NeonDataType.class);
  }

  @Override
  @Nullable
  public NeonFunctionArguments getFunctionArguments() {
    return findChildByClass(NeonFunctionArguments.class);
  }

  @Override
  @NotNull
  public List<NeonStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NeonStatement.class);
  }

}
