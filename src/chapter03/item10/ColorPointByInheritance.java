package chapter03.item10;

import java.awt.*;

/**
 * 상속을 이용한 equals 오버라이딩
 */
public class ColorPointByInheritance extends Point {

    private final Color color;

    public ColorPointByInheritance(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this)
            return true;

        if (!(obj instanceof ColorPointByInheritance))
            return false;

        ColorPointByInheritance another = (ColorPointByInheritance) obj;

        return (another.color.equals(this.color)) && super.equals(obj);
    }
}
