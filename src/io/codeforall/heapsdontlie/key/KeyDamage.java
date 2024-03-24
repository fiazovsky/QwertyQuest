package io.codeforall.heapsdontlie.key;

import io.codeforall.heapsdontlie.player.Player;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class KeyDamage extends Key{
    private Picture picture;

    public KeyDamage(int x,int y, char letter) {
        super(x,y, letter);
        this.picture = new Picture(((x * CELL_SIZE)+OFFSETX), ((y * CELL_SIZE)+OFFSETY), ("/KeyDamage/key-red-" + letter + ".png"));
    }

    @Override
    public void delete(Player player) {
        if(status) {
            player.reduceHealth(2);
            picture.delete();
            status = false;
        }
    }

    @Override
    public void timesUP(Player player){
        if(status) {
            picture.delete();
            new Thread(player::setScore).start();
            status = false;
        }
    }
    @Override
    public Picture getPicture() {
        return picture;
    }
}
