package com.spartaglobal.RabbitExplosion;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RabbitManager{

    private int alive;
    private int dead;
    private int numMaleRabbit = 1;
    private int numFemaleRabbit = 1;
    int r = 0;
    private Random random = new Random();

    public int numOfNewRabbits(){
        r = (int)(Math.random() * (14 - 1)) + 1;
        return r;
    }

    public Rabbit createRabbits (int gender, boolean mature, boolean alive){
        Rabbit rabbit = new Rabbit();

        rabbit.setAlive(alive);
        rabbit.setGender(gender);
        rabbit.setMature(mature);

        return rabbit;
    }

    List<IRabbits> RabbitList = new ArrayList<>();
    List<IRabbits> FemaleRabbitList = new ArrayList<>();
    List<IRabbits> MaleRabbitList = new ArrayList<>();

    public void addToRabbitArray(int gender, boolean mature, boolean alive){
        for (int i = 0; i < r;i++ ) {
            gender = (int)(Math.random()*(10 - 0));

            if (gender <= 5){
                FemaleRabbitList.add(createRabbits(gender,mature,alive));
            }
            else{
                MaleRabbitList.add(createRabbits(gender,mature,alive));
            }

            RabbitList.add(createRabbits(gender, mature, alive));
            System.out.println("Rabbit List = " + RabbitList.size());
            System.out.println("Female Rabbit List = "+ FemaleRabbitList.size());
            System.out.println("Male Rabbit List = " + MaleRabbitList.size());
        }
    }
    public void Birth(){
        int b = 80;
        for(int i=0;i<b;i++) {
            numOfNewRabbits();
            addToRabbitArray(1, true, true);
        }
    }



}
