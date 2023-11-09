package io.codeforall.heapsdontlie.menu;

import io.codeforall.heapsdontlie.Game;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class StartMenu extends Menu implements KeyboardHandler {
    Picture picture = new Picture(10, 10, "/startMenu.png");
    Game game;
    private boolean status;

    public StartMenu(Game game) {
        picture.draw();
        this.game = game;
        status = true;
        init();
    }

    public void init() {

        Keyboard keyboard = new Keyboard(this);

        KeyboardEvent pressedS = new KeyboardEvent();
        pressedS.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedS.setKey(KeyboardEvent.KEY_S);
        keyboard.addEventListener(pressedS);

        KeyboardEvent pressedE = new KeyboardEvent();
        pressedE.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedE.setKey(KeyboardEvent.KEY_E);
        keyboard.addEventListener(pressedE);

        KeyboardEvent pressedZ = new KeyboardEvent();
        pressedZ.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedZ.setKey(KeyboardEvent.KEY_Z);
        keyboard.addEventListener(pressedZ);
    }

    @Override
     public void keyPressed(KeyboardEvent keyboardEvent) {
        if (status){
            switch (keyboardEvent.getKey()) {
                case KeyboardEvent.KEY_S:
                  game.setStart();
                    status = false;
                    break;
                case KeyboardEvent.KEY_Z:
                    game.zenMode();
                    game.setStart();
                    status = false;
                    break;
                case KeyboardEvent.KEY_E:
                   game.isEnd();
                    game.setStart();
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