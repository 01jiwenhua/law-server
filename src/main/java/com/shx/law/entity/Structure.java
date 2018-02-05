package com.shx.law.entity;

public class Structure {
    private Integer id;

    private String structureName;

    private String preNameLevelOne;

    private String preNameLevelTwo;

    private String preNameLevelThree;

    private String propertyNumber;

    private String choiceLevel;

    private String classLevelTwo;

    private String classLevelOne;

    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStructureName() {
        return structureName;
    }

    public void setStructureName(String structureName) {
        this.structureName = structureName == null ? null : structureName.trim();
    }

    public String getPreNameLevelOne() {
        return preNameLevelOne;
    }

    public void setPreNameLevelOne(String preNameLevelOne) {
        this.preNameLevelOne = preNameLevelOne == null ? null : preNameLevelOne.trim();
    }

    public String getPreNameLevelTwo() {
        return preNameLevelTwo;
    }

    public void setPreNameLevelTwo(String preNameLevelTwo) {
        this.preNameLevelTwo = preNameLevelTwo == null ? null : preNameLevelTwo.trim();
    }

    public String getPreNameLevelThree() {
        return preNameLevelThree;
    }

    public void setPreNameLevelThree(String preNameLevelThree) {
        this.preNameLevelThree = preNameLevelThree == null ? null : preNameLevelThree.trim();
    }

    public String getPropertyNumber() {
        return propertyNumber;
    }

    public void setPropertyNumber(String propertyNumber) {
        this.propertyNumber = propertyNumber == null ? null : propertyNumber.trim();
    }

    public String getChoiceLevel() {
        return choiceLevel;
    }

    public void setChoiceLevel(String choiceLevel) {
        this.choiceLevel = choiceLevel == null ? null : choiceLevel.trim();
    }

    public String getClassLevelTwo() {
        return classLevelTwo;
    }

    public void setClassLevelTwo(String classLevelTwo) {
        this.classLevelTwo = classLevelTwo == null ? null : classLevelTwo.trim();
    }

    public String getClassLevelOne() {
        return classLevelOne;
    }

    public void setClassLevelOne(String classLevelOne) {
        this.classLevelOne = classLevelOne == null ? null : classLevelOne.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}