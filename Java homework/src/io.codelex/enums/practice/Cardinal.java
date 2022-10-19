package io.codelex.enums.practice;

import io.codelex.collections.practice.Exercise1;

import java.util.EnumMap;

public enum Cardinal {
    NORTH("up"),
    SOUTH("down"),
    EAST("right"),
    WEST("left");


    private final String direction;

    Cardinal(String direction) {
        this.direction = direction;

    }

    public String getFirstCapitalized() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }


    public void toGo(){
        System.out.println(getFirstCapitalized()+":"+ direction.toLowerCase() +":"+ ordinal());
    }


}
