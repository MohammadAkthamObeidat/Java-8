package com.company.mapsession;


public class Student {

    private String name;
    private int number;
    private int score;

    public static final int MIN_SCORE = 0;
    public static final int MAX_SCORE = 100;

    public Student(String name, int number, int score) {

        setName(name);
        setNumber(number);
        setScore(score);
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
            this.number = number;
    }

    public void setScore(int score) {
            this.score = score;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "\t" + "Number: " + this.number + "\t" + "Score: " + this.score + "\t";
    }
}
