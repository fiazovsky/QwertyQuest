package io.codeforall.heapsdontlie;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class NamePlayer implements KeyboardHandler {

    private int counter;
    private String name;

    private Picture[] pictures = new Picture[3];

    public NamePlayer() {
        counter = 0;
        name= "";
        init();
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

        KeyboardEvent pressedEnter = new KeyboardEvent();
        pressedEnter.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedEnter.setKey(KeyboardEvent.KEY_ENTER);
        keyboard.addEventListener(pressedEnter);


    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        Picture picture;
        if (isFinish()) {
            switch (keyboardEvent.getKey()) {
                case KeyboardEvent.KEY_Q:
                    keyChosen('q');
                    break;
                case KeyboardEvent.KEY_W:
                    keyChosen('w');
                    break;
                case KeyboardEvent.KEY_E:
                    keyChosen('e');
                    break;
                case KeyboardEvent.KEY_R:
                    keyChosen('r');
                    break;
                case KeyboardEvent.KEY_T:
                    keyChosen('t');
                    counter++;
                    break;
                case KeyboardEvent.KEY_Y:
                    keyChosen('y');
                    break;
                case KeyboardEvent.KEY_U:
                    keyChosen('u');
                    break;
                case KeyboardEvent.KEY_I:
                    keyChosen('i');
                    break;
                case KeyboardEvent.KEY_O:
                    keyChosen('o');
                    break;
                case KeyboardEvent.KEY_P:
                    keyChosen('p');
                    break;
                case KeyboardEvent.KEY_A:
                    keyChosen('a');
                    break;
                case KeyboardEvent.KEY_S:
                    keyChosen('s');
                    break;
                case KeyboardEvent.KEY_D:
                    keyChosen('d');
                    break;
                case KeyboardEvent.KEY_F:
                    keyChosen('f');
                    break;
                case KeyboardEvent.KEY_G:
                    keyChosen('g');
                    break;
                case KeyboardEvent.KEY_H:
                    keyChosen('h');
                    break;
                case KeyboardEvent.KEY_J:
                    keyChosen('j');
                    break;
                case KeyboardEvent.KEY_K:
                    keyChosen('k');
                    break;
                case KeyboardEvent.KEY_L:
                    keyChosen('l');
                    break;
                case KeyboardEvent.KEY_Z:
                    keyChosen('z');
                    break;
                case KeyboardEvent.KEY_X:
                    keyChosen('x');
                    break;
                case KeyboardEvent.KEY_C:
                    keyChosen('c');
                    break;
                case KeyboardEvent.KEY_V:
                    keyChosen('v');
                    break;
                case KeyboardEvent.KEY_B:
                    keyChosen('b');
                    break;
                case KeyboardEvent.KEY_N:
                    keyChosen('n');
                    break;
                case KeyboardEvent.KEY_M:
                    keyChosen('m');
                    break;

                case KeyboardEvent.KEY_ENTER:
                    if(name.equals(""))
                        name = "aaa";
                    counter = counter + 10;
                    break;
            }
        }
    }

    private void keyChosen(char c) {
        this.name = (name + c);
        Picture picture = new Picture((250+(counter*50)),300, ("/KeyHealth/key-green-" + c + ".png"));
        picture.draw();
        pictures[counter] = picture;
        counter++;
    }

    public void delete(){
        for (int i = 0; i < pictures.length; i++) {
            pictures[i].delete();
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    public String getName() {
        return name;
    }


    public boolean isFinish(){
        return counter < 3;
    }
}

