package io.codeforall.heapsdontlie.key;

import io.codeforall.heapsdontlie.Player;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class KeyHealth extends Key {
    private Picture picture;

    public KeyHealth(int x,int y, char letter) {
        super(x,y, letter);
        this.picture = new Picture(((x * CELL_SIZE)+OFFSETX), ((y * CELL_SIZE)+OFFSETY), ("/KeyHealth/key-green-" + letter + ".png"));
    }

    @Override
    public void delete(Player player) {
        if(status) {
            player.heal(2);
            picture.delete();
            new Thread(player::setScore).start();
            status = false;
        }
    }

    @Override
    public void timesUP(Player player){
        if(status) {
            picture.delete();
            status = false;
        }
    }
    @Override
    public Picture getPicture() {
        return picture;
    }

}
