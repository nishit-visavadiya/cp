package random;

public class Box {

    private int length, breadth, height;

    void setDimension(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    void showDimension() {
        System.out.println("L :" + length);
        System.out.println("B :" + breadth);
        System.out.println("H :" + height);
    }
}

class Example {
    public static void main(String[] args) {
        Box box = new Box();
        box.setDimension(10, 15, 12);
        box.showDimension();
    }
}
