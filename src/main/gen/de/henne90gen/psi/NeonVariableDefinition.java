// This is a generated file. Not intended for manual editing.
package de.henne90gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import de.henne90gen.NeonNamedElement;

public interface NeonVariableDefinition extends NeonNamedElement {

  @NotNull
  NeonDataType getDataType();

  @Nullable
  String getName();

  @NotNull
  PsiElement setName(@NotNull String newName);

  @Nullable
  PsiElement getNameIdentifier();

}
