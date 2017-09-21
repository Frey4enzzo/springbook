package ru.book.chapter02.ex2;

/**
 * Created by Alexey on 21.09.2017.
 */

public class DamselRescueKnight implements Knight {

    private ResqueDamseQuest quest;

    public DamselRescueKnight() {
        quest = new ResqueDamseQuest();  // тесная связь с классом ResqueDamseQuest
    }


    public void embarkQuest() throws QuestException {
        quest.embark();
    }
}
