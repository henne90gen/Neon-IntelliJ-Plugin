// This is a generated file. Not intended for manual editing.
package de.henne90gen.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static de.henne90gen.psi.NeonTypes.*;
import de.henne90gen.NeonNamedElementImpl;
import de.henne90gen.psi.*;
import de.henne90gen.NeonPsiUtil;

public class NeonVariableDefinitionImpl extends NeonNamedElementImpl implements NeonVariableDefinition {

  public NeonVariableDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NeonVisitor visitor) {
    visitor.visitVariableDefinition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NeonVisitor) accept((NeonVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public NeonDataType getDataType() {
    return findNotNullChildByClass(NeonDataType.class);
  }

  @Override
  @Nullable
  public String getName() {
    return NeonPsiUtil.getName(this);
  }

  @Override
  @NotNull
  public PsiElement setName(@NotNull String newName) {
    return NeonPsiUtil.setName(this, newName);
  }

  @Override
  @Nullable
  public PsiElement getNameIdentifier() {
    return NeonPsiUtil.getNameIdentifier(this);
  }

}
