package io.codeforall.heapsdontlie.key;

import io.codeforall.heapsdontlie.Player;
import org.academiadecodigo.simplegraphics.pictures.Picture;
public abstract class Key {

    protected char letter;

    protected boolean status;

    protected final int CELL_SIZE = 50;

    protected int OFFSETX = 61;

    protected int OFFSETY = 77;
    private int x;
    private int y;

    public Key(int x, int y, char letter) {
        this.letter = letter;
        status = true;
        this.x = x;
        this.y = y;
    }

    public char getLetter() {
        return letter;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public abstract void delete(Player player);

    public boolean getStatus() {
        return status;
    }


    public abstract void timesUP(Player player);
    public abstract Picture getPicture();
}