package com.efectiv.item22;


public interface PhysicalConstants {
    // Avogadro's number (1/mol)
    static final double AVOGADRO_NUMBER = 6.022_140_857e23;

    // Boltzmann constant (J/K)
    static final double BOLTZMANN_CONSTANT = 1.380_648_52e-23;

    // Electron mass (kg)
    static final double ELECTRON_MASS = 9.109_383_56e-31;
}



/*

🔥 Final Summary
✅ DO
✔ Use utility classes for constants.
✔ Use enum for logical groupings of constants.
✔ Use static imports for cleaner code if necessary.
✔ Keep constants inside related classes when appropriate.
✔ Write unit tests to ensure correctness.

🚫 DON’T
❌ Use interfaces to define constants.
❌ Force classes to implement interfaces just to get constants.
❌ Expose unnecessary constants outside of their relevant scope.

 */