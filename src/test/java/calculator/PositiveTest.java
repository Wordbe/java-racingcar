package calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PositiveTest {

    @Test
    void string_to_positive() {
        assertThat(new Positive("1")).isEqualTo(new Positive(1));
    }

    @Test
    void negative_string_to_positive_fail() {
        assertThatThrownBy(() -> new Positive("-1"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("음수");
    }

    @Test
    void plus_integer() {
        Positive result = new Positive(1).plus(2);

        assertThat(result).isEqualTo(new Positive(3));
    }

    @Test
    void plus_positive() {
        Positive result = new Positive(1).plus(new Positive(2));

        assertThat(result).isEqualTo(new Positive(3));
    }
}