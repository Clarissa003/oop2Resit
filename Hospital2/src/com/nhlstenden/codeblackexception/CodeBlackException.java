package com.nhlstenden.codeblackexception;

public class CodeBlackException extends Exception
{
    public CodeBlackException(String message)
    {
        super("The hospital has no room for a new patient");
    }
}
