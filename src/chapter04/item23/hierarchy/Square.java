package chapter04.item23.hierarchy;

/**
 * 직사각형 Rectangle Class를 이용하여 정사각형 Square Class를 쉽게 만들수 있다.
 */
class Square extends Rectangle {
    Square(double side) {
        super(side, side);
    }
}
