package bglib.util;

public class RectType {
    private Vector2d pos, size;

    public RectType(double widthHeight) {
        this(0, 0, widthHeight, widthHeight);
    }
    public RectType(double xPos, double yPos, double sizeX, double sizeY) {
        this(new Vector2d(xPos, yPos), new Vector2d(sizeX, sizeY));
    }
    public RectType(Vector2i pos, Vector2i size) {
        this(pos.asVector2d(), size.asVector2d());
    }
    public RectType(Vector2d pos, Vector2d size)  {
        this.pos = pos;
        this.size = size;
    }

    public Vector2d getPos() {
        return pos;
    }

    public Vector2d getSize() {
        return size;
    }

    public void setPos(Vector2d pos) {
        this.pos = new Vector2d(pos);
    }

    public void setSize(Vector2d size) {
        this.size = new Vector2d(size);
    }
}