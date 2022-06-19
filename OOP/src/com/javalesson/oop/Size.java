package com.javalesson.oop;

public enum Size {

    VERY_SMALL("XS"), SMALL("s"), AVARAGE("M"), BIG("L"), VERY_BIG("XL"), UNDEFINED("");

    Size(String abbreviation){
        this.abbreviation = abbreviation;
    }
    private String abbreviation;

    public String getAbbreviation() {
        return abbreviation;
    }

}
