package com.nhlstenden.quests;

import com.nhlstenden.player.Player;

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

    public int getNeededXp()
    {
        int neededXp = 0;
        neededXp = this.difficultyLevel * 10;
        return neededXp;
    }

    public void play(Player player , Character character)
    {
        int originalXp = player.getEarnedXp();
        player.setEarnedItems(originalXp + this.xp);
    }
}
