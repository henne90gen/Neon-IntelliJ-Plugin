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

public class NeonExternalFunctionImpl extends ASTWrapperPsiElement implements NeonExternalFunction {

  public NeonExternalFunctionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NeonVisitor visitor) {
    visitor.visitExternalFunction(this);
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

}
