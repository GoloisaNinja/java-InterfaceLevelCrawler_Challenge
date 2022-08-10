package com.company;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {
    List<String> saveValues();
    void populateValues(List<String> list);
}
