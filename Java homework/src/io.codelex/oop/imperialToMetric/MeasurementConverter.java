package io.codelex.oop.imperialToMetric;

public class MeasurementConverter {
    int value;

    public MeasurementConverter(int value) {
        this.value = value;
    }

    public double measurementConverted(ConversionType conversionType) {

        if (conversionType == ConversionType.METERS_TO_YARDS) {
            return value * 1.0936;
        } else if (conversionType == ConversionType.CENTIMETERS_TO_INCHES) {
            return value / 2.54;
        } else if (conversionType == ConversionType.KILOMETERS_TO_MILES) {
            return value * 0.6214;
        } else if (conversionType == ConversionType.MILES_TO_KILOMETERS) {
            return value * 1.6;
        } else if (conversionType == ConversionType.YARDS_TO_METERS) {
            return value * 0.9144;
        } else if (conversionType == ConversionType.INCHES_TO_CENTIMETERS) {
            return value * 2.54;
        }
        return -1;
    }
}
