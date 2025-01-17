package com.low_of_demeter;

public class OrderService {
    public void shipOrder(Customer customer) {
        // ❌ VIOLATION: Directly accessing internal objects ("Train Wreck")
        String street = customer.getAddress();
        System.out.println("Shipping order to: " + street);
    }
}




/*
STEP 2: WHY THIS CODE IS BAD
----------------------------------
1. **Tight Coupling:**
   - `OrderService` directly depends on how `Customer` and `Address` are structured.
   - If `Address` changes (e.g., splitting street into streetName and houseNumber), `OrderService` will break.
   - `OrderService` shouldn't need to know how `Customer` manages its address.

2. **Violates Encapsulation:**
   - Exposes internal details (`getAddress().getStreet()`).
   - Breaks object-oriented principles.

3. **Hard to Maintain and Test:**
   - Difficult to mock/stub in unit tests.
   - Fragile when requirements change.
*/

// STEP 3: REFACTORED CODE - Follows the Law of Demeter

 /*
 The Law of Demeter (LoD), also known as the principle of least knowledge, is a design guideline
  for developing software, particularly in object-oriented programming.
   It suggests that an object should only interact with its immediate "friends" and not communicate with
 objects that it does not directly know.
  This principle promotes loose coupling and increases modularity in software design.
  */


/*

WHY THE REFACTORED CODE IS BETTER
-------------------------------------
1. **Low Coupling:**
   - `OrderService` no longer depends on `Address`.
   - Internal changes to `Customer` or `Address` won’t break `OrderService`.

2. **Better Encapsulation:**
   - `Customer` exposes only the required data.

3. **Easier to Test and Maintain:**
   - `getShippingAddress()` can be mocked in tests.
   - Cleaner and more maintainable code.
*/
