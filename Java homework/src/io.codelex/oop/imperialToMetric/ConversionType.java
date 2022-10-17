package io.codelex.oop.imperialToMetric;

public enum ConversionType {
    METERS_TO_YARDS(0),
    YARDS_TO_METERS(0),
    CENTIMETERS_TO_INCHES(0),
    INCHES_TO_CENTIMETERS(0),
    KILOMETERS_TO_MILES(0),
    MILES_TO_KILOMETERS(0);

    int converstionType;

    ConversionType(int conversionType) {
        this.converstionType = converstionType;
    }
}
