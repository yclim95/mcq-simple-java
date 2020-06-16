package com.abclearning;

public class ExcelMCQ extends MCQuestion {
    // abstraction and method overriding
    @Override
    public String getFileName() {
        return "src\\com\\abclearning\\excel.csv";
    }

    // abstraction and method overriding
    @Override
    public String getMcqName() {
        return "Microsoft Excel";
    }
}