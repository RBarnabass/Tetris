public class Field {

    private int width;
    private int height;
    private int[][] matrix;

    public Field(int width, int height) {
        this.width = width;
        this.height = height;
        matrix = new int[height][width];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void print() {
    }

    public void removeFullLines() {
    }

    public Integer getValue(int x, int y) {
        return 1;
    }

    public void setValue(int x, int y, int value) {
    }
}

