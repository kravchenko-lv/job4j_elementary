package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import ru.job4j.calculator.Fit;

class FitTest {

    @Test
    public void whenHeightMan187ThenWeight100Dot05() {
        int heightMan = 187;
        double expected = 100.05;
        double actual = Fit.manWeight(heightMan);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenHeightWoman170ThenWeight69Dot0() {
        int heightWoman = 170;
        double expected = 69.0;
        double actual = Fit.womanWeight(heightWoman);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenHeightNegativeThenThrowException() {
        int negativeHeight = -170;
        assertThatThrownBy(() -> Fit.womanWeight(negativeHeight))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Height must be positive");
    }

    @Test
    public void whenHeightZeroThenThrowException() {
        int zeroHeight = 0;
        assertThatThrownBy(() -> Fit.womanWeight(zeroHeight))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Height must be positive");
    }
}