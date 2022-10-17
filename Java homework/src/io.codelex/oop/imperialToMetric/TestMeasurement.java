package io.codelex.oop.imperialToMetric;

public class TestMeasurement {
    public static void main(String[] args) {
        MeasurementConverter meters = new MeasurementConverter(25);

        System.out.println(meters.measurementConverted(ConversionType.INCHES_TO_CENTIMETERS));
    }
}
