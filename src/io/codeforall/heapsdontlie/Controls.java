package io.codeforall.heapsdontlie;

import io.codeforall.heapsdontlie.key.Key;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Controls implements KeyboardHandler {

    Key key;
    Player player;

    public Controls(Key key, Player player) {
        this.key = key;
        this.player = player;
    }

    public void init() {

        Keyboard keyboard = new Keyboard(this);

        KeyboardEvent pressedQ = new KeyboardEvent();
        pressedQ.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedQ.setKey(KeyboardEvent.KEY_Q);
        keyboard.addEventListener(pressedQ);

        KeyboardEvent pressedW = new KeyboardEvent();
        pressedW.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedW.setKey(KeyboardEvent.KEY_W);
        keyboard.addEventListener(pressedW);

        KeyboardEvent pressedE = new KeyboardEvent();
        pressedE.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedE.setKey(KeyboardEvent.KEY_E);
        keyboard.addEventListener(pressedE);

        KeyboardEvent pressedR = new KeyboardEvent();
        pressedR.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedR.setKey(KeyboardEvent.KEY_R);
        keyboard.addEventListener(pressedR);

        KeyboardEvent pressedT = new KeyboardEvent();
        pressedT.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedT.setKey(KeyboardEvent.KEY_T);
        keyboard.addEventListener(pressedT);

        KeyboardEvent pressedY = new KeyboardEvent();
        pressedY.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedY.setKey(KeyboardEvent.KEY_Y);
        keyboard.addEventListener(pressedY);

        KeyboardEvent pressedU = new KeyboardEvent();
        pressedU.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedU.setKey(KeyboardEvent.KEY_U);
        keyboard.addEventListener(pressedU);

        KeyboardEvent pressedI = new KeyboardEvent();
        pressedI.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedI.setKey(KeyboardEvent.KEY_I);
        keyboard.addEventListener(pressedI);

        KeyboardEvent pressedO = new KeyboardEvent();
        pressedO.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedO.setKey(KeyboardEvent.KEY_O);
        keyboard.addEventListener(pressedO);

        KeyboardEvent pressedP = new KeyboardEvent();
        pressedP.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedP.setKey(KeyboardEvent.KEY_P);
        keyboard.addEventListener(pressedP);

        KeyboardEvent pressedA = new KeyboardEvent();
        pressedA.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedA.setKey(KeyboardEvent.KEY_A);
        keyboard.addEventListener(pressedA);

        KeyboardEvent pressedS = new KeyboardEvent();
        pressedS.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedS.setKey(KeyboardEvent.KEY_S);
        keyboard.addEventListener(pressedS);

        KeyboardEvent pressedD = new KeyboardEvent();
        pressedD.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedD.setKey(KeyboardEvent.KEY_D);
        keyboard.addEventListener(pressedD);

        KeyboardEvent pressedF = new KeyboardEvent();
        pressedF.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedF.setKey(KeyboardEvent.KEY_F);
        keyboard.addEventListener(pressedF);

        KeyboardEvent pressedG = new KeyboardEvent();
        pressedG.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedG.setKey(KeyboardEvent.KEY_G);
        keyboard.addEventListener(pressedG);

        KeyboardEvent pressedH = new KeyboardEvent();
        pressedH.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedH.setKey(KeyboardEvent.KEY_H);
        keyboard.addEventListener(pressedH);

        KeyboardEvent pressedJ = new KeyboardEvent();
        pressedJ.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedJ.setKey(KeyboardEvent.KEY_J);
        keyboard.addEventListener(pressedJ);

        KeyboardEvent pressedK = new KeyboardEvent();
        pressedK.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedK.setKey(KeyboardEvent.KEY_K);
        keyboard.addEventListener(pressedK);

        KeyboardEvent pressedL = new KeyboardEvent();
        pressedL.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedL.setKey(KeyboardEvent.KEY_L);
        keyboard.addEventListener(pressedL);

        KeyboardEvent pressedZ = new KeyboardEvent();
        pressedZ.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedZ.setKey(KeyboardEvent.KEY_Z);
        keyboard.addEventListener(pressedZ);

        KeyboardEvent pressedX = new KeyboardEvent();
        pressedX.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedX.setKey(KeyboardEvent.KEY_X);
        keyboard.addEventListener(pressedX);

        KeyboardEvent pressedC = new KeyboardEvent();
        pressedC.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedC.setKey(KeyboardEvent.KEY_C);
        keyboard.addEventListener(pressedC);

        KeyboardEvent pressedV = new KeyboardEvent();
        pressedV.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedV.setKey(KeyboardEvent.KEY_V);
        keyboard.addEventListener(pressedV);

        KeyboardEvent pressedB = new KeyboardEvent();
        pressedB.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedB.setKey(KeyboardEvent.KEY_B);
        keyboard.addEventListener(pressedB);

        KeyboardEvent pressedN = new KeyboardEvent();
        pressedN.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedN.setKey(KeyboardEvent.KEY_N);
        keyboard.addEventListener(pressedN);

        KeyboardEvent pressedM = new KeyboardEvent();
        pressedM.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedM.setKey(KeyboardEvent.KEY_M);
        keyboard.addEventListener(pressedM);

    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_Q:
                if (key.getLetter() == 'q') {
                    key.delete(player);
                }
                break;
            case KeyboardEvent.KEY_W:
                if (key.getLetter() == 'w') {
                    key.delete(player);
                }
                break;
            case KeyboardEvent.KEY_E:
                if (key.getLetter() == 'e') {
                    key.delete(player);
                }
                break;
            case KeyboardEvent.KEY_R:
                if (key.getLetter() == 'r') {
                    key.delete(player);
                }
                break;
            case KeyboardEvent.KEY_T:
                if (key.getLetter() == 't') {
                    key.delete(player);
                }
                break;
            case KeyboardEvent.KEY_Y:
                if (key.getLetter() == 'y') {
                    key.delete(player);
                }
                break;
            case KeyboardEvent.KEY_U:
                if (key.getLetter() == 'u') {
                    key.delete(player);
                }
                break;
            case KeyboardEvent.KEY_I:
                if (key.getLetter() == 'i') {
                    key.delete(player);
                }
                break;
            case KeyboardEvent.KEY_O:
                if (key.getLetter() == 'o') {
                    key.delete(player);
                }
                break;
            case KeyboardEvent.KEY_P:
                if (key.getLetter() == 'p') {
                    key.delete(player);
                }
                break;
            case KeyboardEvent.KEY_A:
                if (key.getLetter() == 'a') {
                    key.delete(player);
                }
                break;
            case KeyboardEvent.KEY_S:
                if (key.getLetter() == 's') {
                    key.delete(player);
                }
                break;
            case KeyboardEvent.KEY_D:
                if (key.getLetter() == 'd') {
                    key.delete(player);
                }
                break;
            case KeyboardEvent.KEY_F:
                if (key.getLetter() == 'f') {
                    key.delete(player);
                }
                break;
            case KeyboardEvent.KEY_G:
                if (key.getLetter() == 'g') {
                    key.delete(player);
                }
                break;
            case KeyboardEvent.KEY_H:
                if (key.getLetter() == 'h') {
                    key.delete(player);
                }
                break;
            case KeyboardEvent.KEY_J:
                if (key.getLetter() == 'j') {
                    key.delete(player);
                }
                break;
            case KeyboardEvent.KEY_K:
                if (key.getLetter() == 'k') {
                    key.delete(player);
                }
                break;
            case KeyboardEvent.KEY_L:
                if (key.getLetter() == 'l') {
                    key.delete(player);
                }
                break;
            case KeyboardEvent.KEY_Z:
                if (key.getLetter() == 'z') {
                    key.delete(player);
                }
                break;
            case KeyboardEvent.KEY_X:
                if (key.getLetter() == 'x') {
                    key.delete(player);
                }
                break;
            case KeyboardEvent.KEY_C:
                if (key.getLetter() == 'c') {
                    key.delete(player);
                }
                break;
            case KeyboardEvent.KEY_V:
                if (key.getLetter() == 'v') {
                    key.delete(player);
                }
                break;
            case KeyboardEvent.KEY_B:
                if (key.getLetter() == 'b') {
                    key.delete(player);
                }
                break;
            case KeyboardEvent.KEY_N:
                if (key.getLetter() == 'n') {
                    key.delete(player);
                }
                break;
            case KeyboardEvent.KEY_M:
                if (key.getLetter() == 'm') {
                    key.delete(player);
                }
                break;
        }
        try {
            this.finalize();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}

