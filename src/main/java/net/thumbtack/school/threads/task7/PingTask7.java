package net.thumbtack.school.threads.task7;

import net.thumbtack.school.threads.task7.PingPongTask7;

public class PingTask7 extends Thread {

    private PingPongTask7 pingPongTask7;

    public PingTask7(PingPongTask7 pingPongTask7) {
        this.pingPongTask7 = pingPongTask7;
    }

    public void run() {
        int i = 0;
        while (i < 10) {
            pingPongTask7.ping();
            i++;
        }
    }

}
