package chapter03.item10;

import java.awt.*;

/**
 * 구성을 이용한 equals 구현
 */
public class ColorPointByComposition {

    private final Point point;
    private final Color color;

    public ColorPointByComposition(int y, int x, Color color) {
        point = new Point(y, x);
        this.color = color;
    }

    public ColorPointByComposition(Point point, Color color) {
        this.point = point;
        this.color = color;
    }

    public Point asPoint() {
        return point;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this)
            return true;

        if (!(obj instanceof ColorPointByComposition))
            return false;

        ColorPointByComposition another = (ColorPointByComposition) obj;

        return another.color.equals(this.color) && another.equals(this.point);
    }
}
