package com.spartaglobal.RabbitExplosion;

import java.util.Timer;
import java.util.TimerTask;

public class RabbitLife {

        private int seconds;
        private Timer timer = new Timer();

        public RabbitLife(int seconds) {
            this.seconds = seconds;
            timer.schedule(new RabbitLife.LifeTask(), 0, 1000);
        }

        class LifeTask extends TimerTask {
            @Override
            public void run() {
                if (seconds > 0) {
                    System.out.println(seconds);
                    seconds--;
                } else {
                    timer.cancel();
                }
            }
        }

    }

