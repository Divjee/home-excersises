package io.codelex.arithmetic.practice;

import io.codelex.NoCodeWrittenException;

import java.math.BigDecimal;

class Geometry {
    static BigDecimal areaOfCircle(BigDecimal radius) {

        return radius.multiply(radius).multiply(BigDecimal.valueOf(Math.PI));
    }

    static BigDecimal areaOfRectangle(BigDecimal length, BigDecimal width) {

        return length.multiply(width);
    }

    static BigDecimal areaOfTriangle(BigDecimal base, BigDecimal height) {

        return base.multiply(height).multiply(BigDecimal.valueOf(0.5));
    }
}
