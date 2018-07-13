import java.io.File;

public class Tetris {

    private Figure figure;
    private Field field;

    public static Tetris game;

    public static void main(String[] args) {

        game = new Tetris();
        game.run();

    }

    public void run() {

    }

    public void step() {

    }

    public Figure getFigure() {
        return figure;
    }

    public Field getField() {
        return field;
    }
}
