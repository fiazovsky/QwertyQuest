package io.codeforall.heapsdontlie;

import io.codeforall.heapsdontlie.key.Key;
import io.codeforall.heapsdontlie.menu.Credits;
import io.codeforall.heapsdontlie.menu.Menu;
import io.codeforall.heapsdontlie.menu.MenuGameOver;
import io.codeforall.heapsdontlie.menu.StartMenu;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
        NamePlayer namePlayer = new NamePlayer();
        while(namePlayer.getCounter() < 3){
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(namePlayer.getName());
            player = new Player(namePlayer.getName(), zenMode);
            for (int i = 0; i < namePlayer.getName().length() ; i++){
                Picture letterName = new Picture((270+(i*50)),30, ("/KeyHealth/key-green-" + namePlayer.getName().charAt(i) + ".png"));
                letterName.draw();
            }


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
                    int dificulty = lvl;
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
                        if(lvl >= 20)
                            dificulty = 20;
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


    private void gameOver() {
        keysDelete();
        removeEnemies();
        int score = player.getScore();
        Score highscore = new Score(player.getScore(), 420,330, "scoreBIG");
        highscore.scorePrint();
        highscore.print(440, 430);
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

    private void removeEnemies() {
        for (Enemies e: removeList) {
            e.getPicture().delete();
        }

    }

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
                countdown = new Picture(395, 320, "/transition/countdown-" + i + ".png");
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

    public void isEnd(){
        end = true;
    }

}
