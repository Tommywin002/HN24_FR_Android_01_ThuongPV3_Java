package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment2.question4;

import java.util.List;

public class Street {
    List<Family> familyList;

    public Street(List<Family> familyList) {
        this.familyList = familyList;
    }

    public List<Family> getFamilyList() {
        return familyList;
    }

    public void setFamilyList(List<Family> familyList) {
        this.familyList = familyList;
    }
}
