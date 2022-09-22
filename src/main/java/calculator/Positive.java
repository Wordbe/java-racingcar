package calculator;

import java.util.Objects;

public class Positive {
    private final Integer number;

    public Positive(Integer number) {
        this.number = number;
    }

    public Positive(String number) {
        int parsedNumber = Integer.parseInt(number);
        if (parsedNumber < 0) {
            throw new IllegalArgumentException("음수일 수 없습니다.");
        }

        this.number = parsedNumber;
    }

    public Integer getNumber() {
        return number;
    }

    public Positive plus(Integer number) {
        return new Positive(this.number + number);
    }

    public Positive plus(Positive positive) {
        return new Positive(this.number + positive.number);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Positive positive = (Positive) o;
        return Objects.equals(number, positive.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
