package io.codeforall.heapsdontlie.game;

import io.codeforall.heapsdontlie.key.controls.PossibleKeys;
import io.codeforall.heapsdontlie.key.Key;
import io.codeforall.heapsdontlie.key.KeyDamage;
import io.codeforall.heapsdontlie.key.KeyHealth;
import io.codeforall.heapsdontlie.key.KeyNormal;

import java.util.*;

public class GameFactory {

    public static ArrayList<Key> create(int maxRange) {

        PossibleKeys[] allKeys = PossibleKeys.values();

        ArrayList<PossibleKeys> possibleKeys = new ArrayList<>();

        possibleKeys.addAll(Arrays.asList(allKeys));

        Collections.shuffle(possibleKeys);

        ArrayList<Key> result = new ArrayList<>();


        for (int i = 0; i < maxRange; i++) {
            PossibleKeys letter = possibleKeys.get(i);
            int xRandom = (int) Math.ceil((Math.random() * 15));
            int yRandom = (int) Math.ceil((Math.random() * 10));
            double random = Math.random();
            if (!collision(xRandom,yRandom,result)) {
                if (random < 0.7) {
                    Key keyNormal = new KeyNormal(xRandom, yRandom, possibleKeys.get(i).getKey());
                    result.add(keyNormal);
                    continue;
                }
                if (random < 0.9) {
                    Key keyDamage = new KeyDamage(xRandom, yRandom, possibleKeys.get(i).getKey());
                    result.add(keyDamage);
                    continue;
                }
                Key keyHealth = new KeyHealth(xRandom, yRandom, possibleKeys.get(i).getKey());
                result.add(keyHealth);
                continue;
            }
            i--;
        }
        return result;
    }

    public static LinkedList<Enemies> createEnemies(int maxRange) {

        LinkedList<Enemies> result = new LinkedList<>();

        for (int i = 0; i < maxRange; i++) {

            int xRandom = (int) Math.ceil((Math.random() * 15));
            int yRandom = (int) Math.ceil((Math.random() * 10));
            int random = (int) Math.ceil((Math.random() * 4));
            if(!collisionEnemies(xRandom,yRandom,result)){
            Enemies enemies = new Enemies(xRandom,yRandom,random);
            result.add(enemies);
                }
            }
        return result;
    }

    public static boolean collision(int x, int y, ArrayList<Key> result) {
        for (Key element : result) {
            if (element.getX() == x && element.getY() == y) {
                return true;
            }
        }
        return false;
    }
    public static boolean collisionEnemies(int x, int y, LinkedList<Enemies> result) {
        for (Enemies element : result) {
            if (element.getX() == x && element.getY() == y) {
                return true;
            }
        }
        return false;
    }
}
