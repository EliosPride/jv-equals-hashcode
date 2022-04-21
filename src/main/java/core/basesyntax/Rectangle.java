package core.basesyntax;

import java.util.Objects;

/**
 * <p>Дан класс Rectangle. Переопределите в нем методы equals() и hashCode() так, чтобы equals()
 * сравнивал экземпляры Rectangle по содержимому полей color, width и length,
 * а hashCode() был бы согласованным с реализацией equals().</p>
 */
public class Rectangle {
    private Integer width;
    private Integer length;
    private String color;

    public Rectangle(Integer width, Integer length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null) return false;
        if (this.getClass() != other.getClass()) return false;
        Rectangle rectangle = (Rectangle) other;
        if (!((this.width == rectangle.width) || (this.width != null && this.width.equals(rectangle.width)))) return false;
        if (!((this.length == rectangle.length) || (this.length != null && this.length.equals(rectangle.length)))) return false;
        if (!((this.color == rectangle.color) || (this.color != null && this.color.equals(rectangle.color)))) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash * 31 + (this.width == null ? 0 : this.width);
        hash = hash * 31 + (this.length == null ? 0 : this.length);
        hash = hash * 31 + (this.color == null ? 0 : this.color.hashCode());
        return hash;
    }
}
