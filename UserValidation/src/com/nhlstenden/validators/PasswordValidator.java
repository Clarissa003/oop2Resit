package com.nhlstenden.validators;

import com.nhlstenden.useraccount.UserAccount;

public class PasswordValidator implements Validator
{
    private boolean allowsSpaces;
    private boolean allowsSpecialCharacters;
    private boolean allowsNumbers;
    private boolean allowsLowercase;
    private boolean allowsUppercase;

    public PasswordValidator(boolean allowsSpaces, boolean allowsSpecialCharacters, boolean allowsNumbers, boolean allowsLowercase, boolean allowsUppercase)
    {
        this.allowsSpaces = allowsSpaces;
        this.allowsSpecialCharacters = allowsSpecialCharacters;
        this.allowsNumbers = allowsNumbers;
        this.allowsLowercase = allowsLowercase;
        this.allowsUppercase = allowsUppercase;
    }

    public boolean isAllowsSpaces()
    {
        return allowsSpaces;
    }

    public void setAllowsSpaces(boolean allowsSpaces)
    {
        this.allowsSpaces = allowsSpaces;
    }

    public boolean isAllowsSpecialCharacters()
    {
        return allowsSpecialCharacters;
    }

    public void setAllowsSpecialCharacters(boolean allowsSpecialCharacters)
    {
        this.allowsSpecialCharacters = allowsSpecialCharacters;
    }

    public boolean isAllowsNumbers()
    {
        return allowsNumbers;
    }

    public void setAllowsNumbers(boolean allowsNumbers)
    {
        this.allowsNumbers = allowsNumbers;
    }

    public boolean isAllowsLowercase()
    {
        return allowsLowercase;
    }

    public void setAllowsLowercase(boolean allowsLowercase)
    {
        this.allowsLowercase = allowsLowercase;
    }

    public boolean isAllowsUppercase()
    {
        return allowsUppercase;
    }

    public void setAllowsUppercase(boolean allowsUppercase)
    {
        this.allowsUppercase = allowsUppercase;
    }

    public boolean hasSpaces(String password)
    {
        if(password.contains(" "))
        {
            return true;
        }
        return false;
    }

    public boolean hasSpecialCharacters(String password)
    {
        if(password.matches(".*[-+_!@#$%^&*.,?].*"))
        {
            return true;
        }
        return false;
    }

    public boolean hasNumbers(String password)
    {
        if(password.matches(".*\\d.*"))
        {
            return true;
        }
        return false;
    }

    public boolean hasLowercase(String password)
    {
        if(password.matches(".*[a-z].*"))
        {
            return true;
        }
        return false;
    }

    public boolean hasUppercase(String password)
    {
        if(password.matches(".*[A-Z].*"))
        {
            return true;
        }
        return false;
    }

    @Override
    public boolean validate(UserAccount userAccount) {
        String password = userAccount.getPassword();

        if (this.allowsSpaces == hasSpaces(password)) {
            return true;
        }
        if (this.allowsSpecialCharacters == hasSpecialCharacters(password)) {
            return true;
        }
        if (this.allowsNumbers == hasNumbers(password)) {
            return true;
        }
        if (this.allowsLowercase == hasLowercase(password)) {
            return true;
        }
        if (this.allowsUppercase == hasUppercase(password)) {
            return true;
        }

        return false;
    }
}
