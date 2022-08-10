package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ISaveable currentLevel = new Level("Druids Penthouse", 2, "Checkpoint 1");
        System.out.println(currentLevel.toString());
        saveObject(currentLevel);

        ((Level) currentLevel).setLevelName("Orc Mountain");
        ((Level) currentLevel).setLevelNumber(4);
        ((Level) currentLevel).setLevelLocation("No checkpoint - start of level");
        System.out.println("=======================");
        System.out.println(currentLevel.toString());
        System.out.println("========================");
        loadObject(currentLevel, "level");
        System.out.println(currentLevel.toString());

        System.out.println("++++++++++++++++++++++++++++++");
        ISaveable seaMonster = new Monster("Kraken", 300, "fire", "water");
        System.out.println(seaMonster.toString());
        saveObject(seaMonster);
        ((Monster) seaMonster).setMonsterName("Orc Demigod");
        ((Monster) seaMonster).setMonsterHitPoints(450);
        ((Monster) seaMonster).setWeaknessTo("projectile weapons");
        ((Monster) seaMonster).setStrengthAgainst("melee weapons");
        System.out.println("===========================");
        System.out.println(seaMonster.toString());
        System.out.println("=============================");
        loadObject(seaMonster, "monster");
        System.out.println(seaMonster.toString());

    }

    public static void saveObject(ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.saveValues().size(); i++) {
            System.out.println("Saving " + objectToSave.saveValues().get(i) + " to storage...");
        }
    }
    public static void loadObject(ISaveable objectToLoad, String type) {
        List<String> newData = new ArrayList<>();
        if (type.equals("level")) {
            newData.add(0, "Goblin Cave");
            newData.add(1, "3");
            newData.add(2, "Checkpoint 2");
            newData.add(3, "false");
        } else {
            newData.add(0, "Dragon King");
            newData.add(1, "500");
            newData.add(2, "ice weapons");
            newData.add(3, "fire weapons");
        }
        objectToLoad.populateValues(newData);
    }

}
