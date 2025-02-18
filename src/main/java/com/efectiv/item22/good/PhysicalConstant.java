package com.efectiv.item22.good;

public enum PhysicalConstant {
    AVOGADROS_NUMBER(6.022_140_857e23),
    BOLTZMANN_CONSTANT(1.380_648_52e-23),
    ELECTRON_MASS(9.109_383_56e-31);

    private final double value;

    PhysicalConstant(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
