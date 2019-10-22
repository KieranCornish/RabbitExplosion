package com.spartaglobal.RabbitExplosion;

public class App 
{
    public static void main( String[] args )
    {
        GlobalTimer globalTimer = new GlobalTimer(0);
        IRabbits.RabbitLife rabbitLife = new IRabbits.RabbitLife(60);
    }
}
