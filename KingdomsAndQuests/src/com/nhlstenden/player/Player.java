package com.nhlstenden.player;

import com.nhlstenden.characters.Character;
import com.nhlstenden.quests.Quest;

import java.util.ArrayList;

public class Player
{
    private ArrayList<Quest> quests;
    private ArrayList<Character> characters;
    private int earnedXp;
    private int earnedItems;

    public Player(ArrayList<Quest> quests, ArrayList<Character> characters, int earnedXp)
    {
        this.quests = quests;
        this.characters = characters;
        this.earnedXp = earnedXp;
        this.earnedItems = 0;
    }

    public ArrayList<Quest> getQuests()
    {
        return quests;
    }

    public void setQuests(ArrayList<Quest> quests)
    {
        this.quests = quests;
    }

    public ArrayList<Character> getCharacters()
    {
        return characters;
    }

    public void setCharacters(ArrayList<Character> characters)
    {
        this.characters = characters;
    }

    public int getEarnedXp()
    {
        return earnedXp;
    }

    public void setEarnedXp(int earnedXp)
    {
        this.earnedXp = earnedXp;
    }

    public int getEarnedItems()
    {
        return earnedItems;
    }

    public void setEarnedItems(int earnedItems)
    {
        this.earnedItems = earnedItems;
    }

    public boolean canPlay()
    {
        for(Quest quest : this.quests)
        {
            if(this.getEarnedXp() >= quest.getNeededXp())
            {
                return true;
            }
        }
        return false;
    }

    public boolean levelUp()
    {
        if(this.getEarnedXp() >= 200)
        {
            return true;
        }
        return false;
    }
}
