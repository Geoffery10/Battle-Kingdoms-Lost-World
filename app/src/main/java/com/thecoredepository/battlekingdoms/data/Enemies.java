package com.thecoredepository.battlekingdoms.data;

import com.thecoredepository.battlekingdoms.backend.Enemy;

import java.util.ArrayList;

public class Enemies {
    private ArrayList<Enemy> enemies = new ArrayList<Enemy>();
    private Enemy Bandit = new Enemy("Bandit","Human",50,0,6.0,2.0,2, 6);


    public void intializeEnemies() {
        enemies.add(Bandit);
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public Enemy getEnemy(int index) {
        return enemies.get(index);
    }

    public int getEnemyCount() {
        return enemies.size();
    }
}
