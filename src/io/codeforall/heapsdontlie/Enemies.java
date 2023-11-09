<<<<<<< HEAD
package io.codeforall.heapsdontlie;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Enemies {

    private final int CELL_SIZE = 50;

    private int OFFSETX = 61;

    private int OFFSETY = 77;
    private int x;
    private int y;
    private Picture picture;

    public Enemies(int x, int y, int enemie) {
        this.x = x;
        this.y = y;
       enemyPicture(enemie);
    }
     private void enemyPicture(int enemie){
        switch (enemie){
            case 1:
                this.picture = new Picture(((x * CELL_SIZE)+OFFSETX), ((y * CELL_SIZE)+OFFSETY), ("/foe/foe"+enemie+".png"));
                break;
            case 2:
                this.picture = new Picture(((x * CELL_SIZE)+OFFSETX), ((y * CELL_SIZE)+OFFSETY), ("/foe/foe"+enemie+".png"));
                break;

            case 3:
                this.picture = new Picture(((x * CELL_SIZE)+OFFSETX), ((y * CELL_SIZE)+OFFSETY), ("/foe/foe"+enemie+".png"));
                break;

            case 4:
                this.picture = new Picture(((x * CELL_SIZE)+OFFSETX), ((y * CELL_SIZE)+OFFSETY), ("/foe/foe"+enemie+".png"));
                    break;
        }
     }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Picture getPicture(){
        return picture;
    }
}

=======
package io.codeforall.heapsdontlie;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Enemies {

    private final int CELL_SIZE = 50;

    private int OFFSETX = 61;

    private int OFFSETY = 77;
    private int x;
    private int y;
    private Picture picture;

    public Enemies(int x, int y, int enemie) {
        this.x = x;
        this.y = y;
       enemyPicture(enemie);
    }
     private void enemyPicture(int enemie){
        switch (enemie){
            case 1:
                this.picture = new Picture(((x * CELL_SIZE)+OFFSETX), ((y * CELL_SIZE)+OFFSETY), ("/foe/foe"+enemie+".png"));
                break;
            case 2:
                this.picture = new Picture(((x * CELL_SIZE)+OFFSETX), ((y * CELL_SIZE)+OFFSETY), ("/foe/foe"+enemie+".png"));
                break;

            case 3:
                this.picture = new Picture(((x * CELL_SIZE)+OFFSETX), ((y * CELL_SIZE)+OFFSETY), ("/foe/foe"+enemie+".png"));
                break;

            case 4:
                this.picture = new Picture(((x * CELL_SIZE)+OFFSETX), ((y * CELL_SIZE)+OFFSETY), ("/foe/foe"+enemie+".png"));
                    break;
        }
     }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Picture getPicture(){
        return picture;
    }
}

>>>>>>> cb4acbfd159f4e53918b65ff13367474b671b6e0
