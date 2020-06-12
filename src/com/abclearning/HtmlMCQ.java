package com.abclearning;

public class HtmlMCQ extends MCQuestion {
    // abstraction and method overriding
    @Override
    public String getFileName() {
        return "src\\com\\abclearning\\html.csv";
    }

    // abstraction and method overriding
    @Override
    public String getMcqName() {
        return "HTML";
    }
}
