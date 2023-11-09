package io.codeforall.heapsdontlie;

import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Score {
    private int score;

    private Deque<Integer> list = new LinkedList<Integer>();

    private Picture[] pictures = new Picture[10];

    private Picture scoreImg;

    private List<Picture> writtenNumbers = new ArrayList<>();

    private String gameMode;

    public Score(int score, int x, int y, String image) {
        this.score = score;
        colorSelection(Game.zenMode);
        scoreImg = new Picture(x, y, "/score/" + image + ".png");
        scoreImg.draw();
        //  fillPictures();
    }

    public void scorePrint() {
        while (score > 0) {
            int result = score % 10;
            list.add(result);
            score = score / 10;
        }
    }

    private void fillPictures(int x, int y) {
        for (int i = 0; i < pictures.length; i++) {
            pictures[i] = new Picture(x, y, "/score/transition-"+ gameMode + "-"+  i + ".png");
        }
    }

    public void print(int x, int y) {
        int move = 0;
        while (list.size() != 0) {
            int number = list.pollLast();
            fillPictures(x, y);
            pictures[number].translate((move * 50), 0);
            pictures[number].draw();
            writtenNumbers.add(pictures[number]);
            move++;
        }
    }
    public void setScore(int score){
        this.score = score;
    }

    public void delete() {
        for (Picture pics: writtenNumbers) {
            pics.delete();
        }
    }
    public void setScoreImg(Picture picture){
        scoreImg.delete();
        scoreImg = picture;
    }

    public void colorSelection(boolean gameMode){
        if(gameMode){
            this.gameMode = "zen";
            return;
        }
        this.gameMode = "score";

    }


}
