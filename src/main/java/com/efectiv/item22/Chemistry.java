package com.efectiv.item22;

// A class using the constants
public class Chemistry implements PhysicalConstants {
    public double calculateMolecules(double moles) {
        return PhysicalConstants.AVOGADRO_NUMBER * moles;
        //PhysicalConstants.AVOGADRO_NUMBER
    }
}
/*


🚨 Problems with this approach:
Chemistry inherits constants unnecessarily.
It exposes implementation details to clients using Chemistry.
If Chemistry stops using these constants, it must still implement the interface for backward compatibility.
Subclasses of Chemistry also inherit constants, further polluting their namespace.

 */