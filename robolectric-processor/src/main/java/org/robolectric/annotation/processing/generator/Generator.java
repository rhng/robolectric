package org.robolectric.annotation.processing.generator;

public abstract class Generator {
  protected static final String GEN_CLASS = "Shadows";

  public abstract void generate(String shadowPackage);
}
