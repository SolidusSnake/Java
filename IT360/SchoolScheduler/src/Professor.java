/*
	* File:   Professor.java
	* Desc:   'Professor' class; sets actions based on queue status
	* Author: Wesley Tomlinson
	* Class:  IT360 / M3A1
*/

import java.util.concurrent.*;

public class Professor extends Thread {
    // ArrayBlocking instance creation
    private BlockingQueue<Student> sharedQueue;

    // shared queue creation
    public Professor(BlockingQueue<Student> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    // run() method
    public void run() {
        try {
            // declare variables
            Student student;
            Boolean flag = Boolean.TRUE;
            int recObject = 0;

            // shared queue message consumption
            while (true) {
                // if Student queue empty and bool=true, professor plays Halo...
                // even though Battlefield is more fun
                if (sharedQueue.isEmpty() && flag == Boolean.TRUE) {
                    System.out.println("Professor starts playing Halo... ");
                    flag = Boolean.FALSE;
                }
                else
                {
                    // remove Student from queue; add to receiving object
                    student = sharedQueue.take();
                    recObject++;
                    System.out.println("Professor starts meeting with " + student.getStudName());
                    sleep(student.getTimerAmt());
                    flag = Boolean.TRUE;
                }
                if (recObject == 301) {
                    break;
                }
            }
        }
        catch (InterruptedException err) {
            err.printStackTrace();
        }
    }
}
