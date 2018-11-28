package chapter03.item11;

import java.util.Objects;

public class PhoneNumber {

    private int number1;
    private int number2;
    private int number3;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumber3() {
        return number3;
    }

    public void setNumber3(int number3) {
        this.number3 = number3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return number1 == that.number1 &&
                number2 == that.number2 &&
                number3 == that.number3;
    }

    @Override
    public int hashCode() {
        super.hashCode();
        return Objects.hash(number1, number2, number3);
    }
}
