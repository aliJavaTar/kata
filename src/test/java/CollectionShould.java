import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toUnmodifiableSet;
import static org.assertj.core.api.Assertions.assertThat;

public class CollectionShould {
    @Test
    void be_copy() {
        List<Integer> integers = List.of(1, 2, 3);
        List<Integer> newNumber = List.copyOf(integers);
        assertThat(integers).isEqualTo(newNumber);
    }

    @Test
    void test() {
        List<Integer> integers = List.of(1, 2, 3);
        Set<Integer> collect = integers.stream()
                .filter(number -> number > 1)
                .collect(toUnmodifiableSet());

        assertThat(integers).contains(2, 3);
    }
}
