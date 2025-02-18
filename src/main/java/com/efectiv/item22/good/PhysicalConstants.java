// ✅ GOOD PRACTICE: Constant Utility Class
package com.efectiv.item22.good;

public final class PhysicalConstants {
    private PhysicalConstants() {
        // Prevents instantiation
    }

    public static final double AVOGADROS_NUMBER = 6.022_140_857e23;
    public static final double BOLTZMANN_CONSTANT = 1.380_648_52e-23;
    public static final double ELECTRON_MASS = 9.109_383_56e-31;
}
/*

🎯 Why is this better?
✔ The constants are now properly encapsulated.
✔ No unnecessary inheritance.
✔ We prevent instantiation of PhysicalConstants.
✔ Constants can still be referenced easily.

 */