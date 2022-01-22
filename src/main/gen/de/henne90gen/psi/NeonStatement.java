// This is a generated file. Not intended for manual editing.
package de.henne90gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NeonStatement extends PsiElement {

  @Nullable
  NeonAssertStatement getAssertStatement();

  @Nullable
  NeonAssignment getAssignment();

  @Nullable
  NeonExpression getExpression();

  @Nullable
  NeonExternalFunction getExternalFunction();

  @Nullable
  NeonForStatement getForStatement();

  @Nullable
  NeonIfStatement getIfStatement();

  @Nullable
  NeonImportStatement getImportStatement();

  @Nullable
  NeonVariableDefinition getVariableDefinition();

}
