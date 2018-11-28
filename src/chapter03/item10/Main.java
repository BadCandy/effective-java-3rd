package chapter03.item10;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Point point = new Point(1, 2);

        /**
         * 상속을 이용한 Point 비교
         */
        ColorPointByInheritance colorPointByInheritance = new ColorPointByInheritance(1, 2, Color.BLUE);
        Point colorPoint2Point = (Point) colorPointByInheritance;
        System.out.println("By inheritance : " + colorPoint2Point.equals(point));

        /**
         * 구성을 이용한 Point 비교
         */
        ColorPointByComposition colorPointByComposition = new ColorPointByComposition(1, 2, Color.BLUE);
        colorPoint2Point = colorPointByComposition.asPoint();
        System.out.println("By composition : " + colorPoint2Point.equals(point));
    }
}

