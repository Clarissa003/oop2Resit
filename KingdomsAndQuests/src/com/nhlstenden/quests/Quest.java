package com.nhlstenden.quests;

public class Quest
{
    private int xp;
    private int difficultyLevel;

    public Quest(int xp, int difficultyLevel)
    {
        this.xp = xp;
        this.difficultyLevel = difficultyLevel;
    }

    public int getXp()
    {
        return xp;
    }

    public void setXp(int xp)
    {
        this.xp = xp;
    }

    public int getDifficultyLevel()
    {
        return difficultyLevel;
    }

    public void setDifficultyLevel(int difficultyLevel)
    {
        this.difficultyLevel = difficultyLevel;
    }
}
