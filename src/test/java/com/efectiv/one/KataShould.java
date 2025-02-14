package com.efectiv.one;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class KataShould {

    @Test
    void throw_exception_when_add_value() {
        var kata = new Kata();
        Assertions.assertThatThrownBy(kata::add)
                .isInstanceOf(UnsupportedOperationException.class);
    }

    @Test
    void remove_value_to_view() {
        var kata = new Kata();
        Map<String, Long> resultMap = kata.removeKey();
        assertFalse(resultMap.containsKey("A"));
        assertTrue(resultMap.containsKey("B"));
    }
}

/*
UnsupportedOperationException
is an exception in Java that indicates that the method
being called is not supported by the object.
This often occurs when you try to modify a collection that is read-only
or backed by another collection that doesn't support certain operations.
 */


/*
Why Does This Happen?
When you get a Set view of the keys in a Map using the keySet() method, you're getting a view that reflects
the keys in the Map. This view is backed by the Map,
 which means that any changes in the Map will be reflected in the Set, and vice versa.

However, not all operations are supported by this view. Specifically, you cannot add new elements
 to this Set directly because the Map doesn't support adding keys without corresponding values. Hence
 , trying to add an element directly to the Set will throw an UnsupportedOperationException.

Set View Backed by Map
View Only: Yes, the Set view allows you to see and interact with the keys in the Map.

Modification: You can remove keys from the Set, which will remove the corresponding key-value
pair from the Map. However, you cannot add
new keys directly to the Set view because it does not have a corresponding value, which is required by the Map.
 */