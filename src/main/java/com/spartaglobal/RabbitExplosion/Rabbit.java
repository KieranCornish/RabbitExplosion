package com.spartaglobal.RabbitExplosion;

public class Rabbit implements IRabbits{

    public int gender;
    public boolean mature;
    public boolean alive = true;

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
    public boolean getAlive() {

        return false;
    }

    @Override
    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}
