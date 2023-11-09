package io.codeforall.heapsdontlie.menu;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Credits extends Menu{

    public Credits(){
        Picture picture = new Picture(10,10,"/credits.png");
        picture.draw();
        waitClose();
    }

    private void waitClose() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.exit(0);
    }
}
