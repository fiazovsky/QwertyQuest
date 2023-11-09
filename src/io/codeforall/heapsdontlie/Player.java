package io.codeforall.heapsdontlie;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Player {

    private int health;
    private Picture[] healthPicture;

    private Picture currentHealth;

    private boolean alive;

    private int score;
    public Player() {
        this.health = 10;
        this.alive = true;
        healthPicture = new Picture[10];
        for (int i = 0; i < health; i++) {
            int current = i + 1;
            Picture picture = new Picture(65, 645, "/hp/hp" + current + ".png");
            healthPicture[i] = picture;
        }
        currentHealth = healthPicture[health - 1];
        currentHealth.draw();
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return alive;
    }
    public int getScore(){
        return score*12;
    }
    public void setScore(){
        score++;
    }
    public void reduceHealth() {
        currentHealth.delete();
        health--;
        if(health == 0){
            alive = false;
            return;
        }
        currentHealth = healthPicture[health - 1];
        currentHealth.draw();
    }

    public void heal(int number) {
        if (health == 10) {
            return;
        }
        if (health == 9) {
            currentHealth.delete();
            health++;
            currentHealth = healthPicture[health - 1];
            currentHealth.draw();
            return;
        }
        currentHealth.delete();
        health = health + number;
        currentHealth = healthPicture[health - 1];
        currentHealth.draw();
    }


    public void reduceHealth(int amount) {
        currentHealth.delete();
        health -= amount;
        if(health <= 0){
            alive = false;
            return;
        }
        currentHealth = healthPicture[health - 1];
        currentHealth.draw();
    }

}
