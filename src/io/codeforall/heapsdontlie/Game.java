package io.codeforall.heapsdontlie;

import io.codeforall.heapsdontlie.key.Key;
import io.codeforall.heapsdontlie.menu.Credits;
import io.codeforall.heapsdontlie.menu.Menu;
import io.codeforall.heapsdontlie.menu.MenuGameOver;
import io.codeforall.heapsdontlie.menu.StartMenu;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Game {
    private int numberOfKeysPerRound = 6;
    private ArrayList<Key> keys;

    private LinkedList<Enemies> enemies = new LinkedList<Enemies>();

    ArrayList<Enemies> removeList = new ArrayList<Enemies>();
    private boolean gameOver;
    private int lvl;

    private Player player;

    private boolean start;

    private boolean close;

    private boolean end;

    private boolean zenMode;

    private Picture currentRound;


    public Game() {
        Menu first = new StartMenu(this);
        while (!start) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if(end)
            new Credits();
        start();

    }

    public void start() {
        start = false;
        close = false;
        gameOver = false;
        Picture background;
        lvl = 1;
        if(zenMode)
            background = new Picture(10, 10, "/zenMode.png");
        else
            background = new Picture(10, 10, "/gameBG.png");
        background.draw();
        player = new Player();
        firstRound();
        while (!gameOver) {
            init();
            play();
        }
        gameOver();
    }

    private void init() {

        keys = GameFactory.create(numberOfKeysPerRound);
        if(lvl > 2){
            if(numberOfKeysPerRound < 24)
                numberOfKeysPerRound += 2;
            enemies = GameFactory.createEnemies(8);
        }
    }

    public void play() {
        try {
            boolean roundOver = false;
            int counter = 0;
                for (int i = 0; i < keys.size(); i++) {
                    double random = Math.random();
                    int dificulty;
                    keys.get(i).getPicture().draw();
                    Controls controls = new Controls(keys.get(i), player);
                    controls.init();
                    if(random > 0.6 && !(enemies.isEmpty())) {
                        Enemies enemies1 = enemies.poll();
                        enemies1.getPicture().draw();
                        removeList.add(enemies1);
                    }
                        if (zenMode && lvl > 6)
                            dificulty = 6;
                        else
                        dificulty = lvl;
                    Thread.sleep(1000 - (dificulty * 50));
                    if(counter >= 3){
                        counter = 0;
                        removeEnemies();
                    }
                    if (!player.isAlive()) {
                        gameOver = true;
                        return;
                    }
                    counter++;
                }
                while (!roundOver) {
                    Thread.sleep(200);
                    if (!player.isAlive()) {
                        gameOver = true;
                        return;
                }
                    Key destroy = timesUp();
                    if (destroy != null) {
                        destroy.timesUP(player);
                        if (!player.isAlive()) {
                            gameOver = true;
                            return;
                    }
                }
                if (roundComplete()) {
                    removeEnemies();
                    this.lvl++;
                    if (!zenMode) {
                        currentRound.delete();
                        Picture round = new Picture(420, 320, "/transition/transition-round" + lvl + ".png");
                        round.draw();
                        roundOver = true;
                        Thread.sleep(1400);
                        round.delete();
                        currentRound = new Picture(65, 40, "/round/round" + lvl + ".png");
                        currentRound.draw();
                    }
                    else{
                        roundOver = true;
                    }
                    countDown();
                }
            }

        } catch (InterruptedException e) {
            System.out.println("Error");
        }
    }

<<<<<<< HEAD
    private void removeEnemies() {
        for (Enemies e: removeList) {
            e.getPicture().delete();
        }

    }
=======

>>>>>>> cb4acbfd159f4e53918b65ff13367474b671b6e0
    private void gameOver() {
        keysDelete();
        removeEnemies();
        int score = player.getScore();
        Highscore highscore = new Highscore(player.getScore());
        highscore.scorePrint();
        highscore.print();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Menu gameOver = new MenuGameOver(this);
        while (!close) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if(end)
            new Credits();
        start();
    }

    private boolean roundComplete() {
        for (Key element : keys) {
            if (element.getStatus()) {
                return false;
            }
        }
        return true;
    }

<<<<<<< HEAD
=======
    private void removeEnemies() {
        for (Enemies e: removeList) {
            e.getPicture().delete();
        }

    }

>>>>>>> cb4acbfd159f4e53918b65ff13367474b671b6e0
    private Key timesUp() {
        for (Key element : keys) {
            if (element.getStatus())
                return element;
        }
        return null;
    }

    private void keysDelete(){
       for (Key element : keys){
            element.getPicture().delete();
        }
    }

    public void setStart() {
        this.start = true;
    }

    public void setClose() {
        this.close = true;
    }

    public void zenMode() {
        zenMode = true;
    }
    public void switchMode(){
        zenMode = !zenMode;
    }
    private void countDown() {
        try {
            Picture countdown;
            for (int i = 3; i > 0; i--) {
                countdown = new Picture(420, 320, "/transition/countdown-" + i + ".png");
                countdown.draw();
                Thread.sleep(1000);
                countdown.delete();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    private void firstRound(){
        try {
            Picture round;
            if(!zenMode) {
                round = new Picture(420, 320, "/transition/transition-round" + lvl + ".png");
                currentRound = new Picture(65, 40, "/round/round" + lvl + ".png");
                round.draw();
                currentRound.draw();
                Thread.sleep(1420);
                // round.delete();
            }
            else{
                round = new Picture(420, 320, "/transition/transition-infinite.png");
                round.draw();
                currentRound = new Picture(65, 40, "/round/round infinite.png");
                currentRound.draw();
                Thread.sleep(1420);
            }
            round.delete();
            countDown();
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private class Highscore {
        private int score;

        private Deque<Integer> list = new LinkedList<Integer>();

        private Picture[] pictures = new Picture[10];

        private Picture scoreImg;

        Highscore(int score) {
            this.score = score;
            scoreImg = new Picture(420,330,"/score/score.png");
            scoreImg.draw();
          //  fillPictures();
        }

        private void scorePrint() {
            while (score > 0) {
                int result = score % 10;
                list.add(result);
                score = score / 10;
            }
        }

        private void fillPictures() {
            for (int i = 0; i < pictures.length; i++) {
                    pictures[i] = new Picture(440,430,"/score/transition-highscore-"+i+".png");
                    continue;
            }
        }

        private void print() {
            int move = 0;
<<<<<<< HEAD
=======
            fillPictures();
            if(list.size() == 0) {
                pictures[0].draw();
                return;
            }
>>>>>>> cb4acbfd159f4e53918b65ff13367474b671b6e0
            while (list.size() != 0) {
                int number = list.pollLast();
                fillPictures();
                pictures[number].translate((move*50),0);
                pictures[number].draw();
                move++;
            }
        }
    }

    public void isEnd(){
        end = true;
    }

}
