package com.example.android.inclassassignment06;

import java.io.Serializable;

/**
 * Created by katie on 3/6/17.
 */

public class Meal implements Serializable {
    private String name;
    private int calories;
    private boolean tasty;

    public Meal(String name, int calories, boolean tasty) {
        this.name = name;
        this.calories = calories;
        this.tasty = tasty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public boolean isTasty() {
        return tasty;
    }

    public void setTasty(boolean tasty) {
        this.tasty = tasty;
    }

    @Override
    public String toString() {
        return "Meal: " + name + '\n' +
                "Calories: " + calories + "\n" +
                "Tasty: " + tasty + "\n" + "\n";
    }
}
