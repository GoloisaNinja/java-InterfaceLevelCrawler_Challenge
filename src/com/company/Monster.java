package com.company;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String monsterName;
    private int monsterHitPoints;
    private String weaknessTo;
    private String strengthAgainst;

    // Constructor
    public Monster(String name, int hp, String weakness, String strength) {
        this.monsterName = name;
        this.monsterHitPoints = hp;
        this.weaknessTo = weakness;
        this.strengthAgainst = strength;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public int getMonsterHitPoints() {
        return monsterHitPoints;
    }

    public void setMonsterHitPoints(int monsterHitPoints) {
        this.monsterHitPoints = monsterHitPoints;
    }

    public String getWeaknessTo() {
        return weaknessTo;
    }

    public void setWeaknessTo(String weaknessTo) {
        this.weaknessTo = weaknessTo;
    }

    public String getStrengthAgainst() {
        return strengthAgainst;
    }

    public void setStrengthAgainst(String strengthAgainst) {
        this.strengthAgainst = strengthAgainst;
    }

    @Override
    public String toString() {
        return "Monster: " + this.monsterName + "\n" +
               "HP: " + this.monsterHitPoints + "\n" +
               "Weakness to: " + this.weaknessTo + "\n" +
               "Strength against: " + this.strengthAgainst + "\n";
    }

    @Override
    public List<String> saveValues() {
        List<String> savedValues = new ArrayList<>();
        savedValues.add(0, this.monsterName);
        savedValues.add(1, "" + this.monsterHitPoints);
        savedValues.add(2, this.weaknessTo);
        savedValues.add(3, this.strengthAgainst);
        return savedValues;
    }

    @Override
    public void populateValues(List<String> list) {
        if (list != null && list.size() > 0) {
            this.monsterName = list.get(0);
            this.monsterHitPoints = Integer.parseInt(list.get(1));
            this.weaknessTo = list.get(2);
            this.strengthAgainst = list.get(3);
        }
    }
}
