package ru.book.chapter02.ex2;

/**
 * Created by Alexey on 21.09.2017.
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkQuest() throws QuestException {
        quest.embark();
    }
}
