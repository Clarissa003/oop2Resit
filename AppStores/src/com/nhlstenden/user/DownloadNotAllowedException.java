package com.nhlstenden.user;

public class DownloadNotAllowedException extends Exception
{
    public DownloadNotAllowedException(String message)
    {
        super("You do not meet the conditions to download this app");
    }
}
