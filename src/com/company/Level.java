package com.company;

import java.util.ArrayList;
import java.util.List;

public class Level implements ISaveable {
    private String levelName;
    private int levelNumber;
    private String levelLocation;
    private boolean levelComplete;

    // Constructor
    public Level(String name, int level, String location) {
        this.levelName = name;
        this.levelNumber = level;
        this.levelLocation = location;
        this.levelComplete = false;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public void setLevelNumber(int levelNumber) {
        this.levelNumber = levelNumber;
    }

    public String getLevelLocation() {
        return levelLocation;
    }

    public void setLevelLocation(String levelLocation) {
        this.levelLocation = levelLocation;
    }

    public boolean isLevelComplete() {
        return levelComplete;
    }

    public void setLevelComplete(boolean levelComplete) {
        this.levelComplete = levelComplete;
    }

    @Override
    public String toString() {
        return "Level Name: " + this.levelName + "\n" +
               "Level Number: " + this.levelNumber + "\n" +
               "Level Location: " + this.levelLocation + "\n" +
               "Level Finished?: " + this.levelComplete + "\n";
    }

    @Override
    public List<String> saveValues() {
        List<String> savedValues = new ArrayList();
        savedValues.add(0, this.levelName);
        savedValues.add(1, "" + this.levelNumber);
        savedValues.add(2, this.levelLocation);
        savedValues.add(3, String.valueOf(this.levelComplete));
        return savedValues;
    }

    @Override
    public void populateValues(List<String> list) {
        if (list != null && list.size() > 0) {
            this.levelName = list.get(0);
            this.levelNumber = Integer.parseInt(list.get(1));
            this.levelLocation = list.get(2);
            this.levelComplete = Boolean.getBoolean(list.get(3));
        }
    }


}
