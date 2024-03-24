package io.codeforall.heapsdontlie.key;

import io.codeforall.heapsdontlie.player.Player;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class KeyNormal extends Key{
    private Picture picture;

    public KeyNormal(int x,int y, char letter) {
        super(x,y, letter);
        this.picture = new Picture(((x * CELL_SIZE)+OFFSETX), ((y * CELL_SIZE)+OFFSETY), ("/KeyNormal/key-normal-" + letter + ".png"));
    }

    @Override
    public void delete(Player player) {
        if(status) {
            picture.delete();
            new Thread(player::setScore).start();
            status = false;
        }
    }

    @Override
    public void timesUP(Player player){
        if (status) {
            player.reduceHealth();
            picture.delete();
            status = false;
        }
    }

    @Override
    public Picture getPicture() {
        return picture;
    }


}
