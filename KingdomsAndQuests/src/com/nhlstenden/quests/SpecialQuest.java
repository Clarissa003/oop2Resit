package com.nhlstenden.quests;

import com.nhlstenden.quests.Quest;

import java.util.ArrayList;

public class SpecialQuest extends Quest
{
    private ArrayList<Item> items;

    public SpecialQuest(int xp, int difficultyLevel, ArrayList<Item> items)
    {
        super(xp, difficultyLevel);
        this.items = items;
    }

    public ArrayList<Item> getItems()
    {
        return items;
    }

    public void setItems(ArrayList<Item> items)
    {
        this.items = items;
    }
}
