package com.codeforces;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class StringExpansionMust {
    @Test
    void expansion_of_letters_by_specific_pattern() {
        var expansion = new StringExpansion("(a)");
        var result = expansion.expandedLetter();
        var expected = "a";
        Assertions.assertThat(result).isEqualTo(expected);

        expansion = new StringExpansion("(a2(c))");
        result = expansion.expandedLetter();
        expected = "acc";
        Assertions.assertThat(result).isEqualTo(expected);

        expansion = new StringExpansion("k(a3(b(a2(c))))");
        result = expansion.expandedLetter();
        expected = "kabaccbaccbacc";
        Assertions.assertThat(result).isEqualTo(expected);

        expansion = new StringExpansion("2y4(cd)");
        result = expansion.expandedLetter();
        expected = "yycdcdcdcd";
        Assertions.assertThat(result).isEqualTo(expected);
    }

}