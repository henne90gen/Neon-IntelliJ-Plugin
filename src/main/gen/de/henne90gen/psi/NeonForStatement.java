// This is a generated file. Not intended for manual editing.
package de.henne90gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NeonForStatement extends PsiElement {

  @NotNull
  List<NeonAssignment> getAssignmentList();

  @NotNull
  NeonExpression getExpression();

  @NotNull
  List<NeonStatement> getStatementList();

}
