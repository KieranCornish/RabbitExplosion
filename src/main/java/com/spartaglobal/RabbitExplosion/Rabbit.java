package com.spartaglobal.RabbitExplosion;

public class Rabbit implements IRabbits{

    public int gender;
    public boolean mature;
    public int alive;

    @Override
    public int getGender() {

        return gender;
    }

    @Override
    public void setGender(int gender) {
        this.gender = gender;
    }

    @Override
    public boolean getMature() {
        return false;
    }

    @Override
    public void setMature(boolean mature) {
        this.mature = mature;
    }

    @Override
    public int getAlive() {

        return alive;
    }

    @Override
    public void setAlive(int alive) {
        this.alive = alive;
    }
}
