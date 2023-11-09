<<<<<<< HEAD
package io.codeforall.heapsdontlie.menu;

import io.codeforall.heapsdontlie.Game;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class MenuGameOver extends Menu implements KeyboardHandler {
    Picture picture = new Picture(10, 10, "/gameOverMenu.png");
    Game game;
    private boolean status;

    public MenuGameOver(Game game) {
        picture.draw();
        this.game = game;
        status = true;
        init();
    }

    public void init() {

        Keyboard keyboard = new Keyboard(this);

        KeyboardEvent pressedY = new KeyboardEvent();
        pressedY.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedY.setKey(KeyboardEvent.KEY_Y);
        keyboard.addEventListener(pressedY);

        KeyboardEvent pressedN = new KeyboardEvent();
        pressedN.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedN.setKey(KeyboardEvent.KEY_N);
        keyboard.addEventListener(pressedN);

        KeyboardEvent pressedS = new KeyboardEvent();
        pressedS.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedS.setKey(KeyboardEvent.KEY_S);
        keyboard.addEventListener(pressedS);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if (status){
            switch (keyboardEvent.getKey()) {
                case KeyboardEvent.KEY_Y:
                    game.setClose();
                    status = false;
                    break;
                case KeyboardEvent.KEY_N:
                    game.setClose();
                    game.isEnd();
                    break;
                case KeyboardEvent.KEY_S:
                    game.switchMode();
                    game.setClose();
                    status = false;
                    break;
            }
            try {
                this.finalize();
            }   catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
=======
package io.codeforall.heapsdontlie.menu;

import io.codeforall.heapsdontlie.Game;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class MenuGameOver extends Menu implements KeyboardHandler {
    Picture picture = new Picture(10, 10, "/gameOverMenu.png");
    Game game;
    private boolean status;

    public MenuGameOver(Game game) {
        picture.draw();
        this.game = game;
        status = true;
        init();
    }

    public void init() {

        Keyboard keyboard = new Keyboard(this);

        KeyboardEvent pressedY = new KeyboardEvent();
        pressedY.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedY.setKey(KeyboardEvent.KEY_Y);
        keyboard.addEventListener(pressedY);

        KeyboardEvent pressedN = new KeyboardEvent();
        pressedN.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedN.setKey(KeyboardEvent.KEY_N);
        keyboard.addEventListener(pressedN);

        KeyboardEvent pressedS = new KeyboardEvent();
        pressedS.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedS.setKey(KeyboardEvent.KEY_S);
        keyboard.addEventListener(pressedS);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if (status){
            switch (keyboardEvent.getKey()) {
                case KeyboardEvent.KEY_Y:
                    game.setClose();
                    status = false;
                    break;
                case KeyboardEvent.KEY_N:
                    game.setClose();
                    game.isEnd();
                    break;
                case KeyboardEvent.KEY_S:
                    game.switchMode();
                    game.setClose();
                    status = false;
                    break;
            }
            try {
                this.finalize();
            }   catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
>>>>>>> cb4acbfd159f4e53918b65ff13367474b671b6e0
