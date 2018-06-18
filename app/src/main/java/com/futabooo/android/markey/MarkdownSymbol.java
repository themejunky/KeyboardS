package com.futabooo.android.markey;

public enum MarkdownSymbol {

  H1("#"), H2("##"), H3("###"), H4("####"), H5("#####"), H6("######"),
  ITALICS("**"), BOLD("****"), STRIKETHROUGH("~~~~"), HIGHLIGHT("===="),
  NUMBER("1. \n2. \n3. \n"), MINUS("- \n- \n- \n"),
  image("![]()"),
  Inline("``"), Block("```\n```"),
  Hyphens("---");

  private final String symbol;

  MarkdownSymbol(String symbol) {
    this.symbol = symbol;
  }
}