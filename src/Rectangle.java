public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    //1st constructor
    public Rectangle() {
        this(0,0); /// call constructor 2
    }

    //2st constructor
    public Rectangle(int x, int y) {
        this(x, y, 0, 0); /// call constructor 3
    }

    //3st constructor
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
