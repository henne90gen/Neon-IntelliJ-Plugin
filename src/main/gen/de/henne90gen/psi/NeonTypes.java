// This is a generated file. Not intended for manual editing.
package de.henne90gen.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import de.henne90gen.NeonElementType;
import de.henne90gen.NeonTokenType;
import de.henne90gen.psi.impl.*;

public interface NeonTypes {

  IElementType PROPERTY = new NeonElementType("PROPERTY");

  IElementType COMMENT = new NeonTokenType("COMMENT");
  IElementType CRLF = new NeonTokenType("CRLF");
  IElementType KEY = new NeonTokenType("KEY");
  IElementType SEPARATOR = new NeonTokenType("SEPARATOR");
  IElementType VALUE = new NeonTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new NeonPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
