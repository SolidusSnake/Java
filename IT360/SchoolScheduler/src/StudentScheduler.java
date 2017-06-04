/*
	* File:   StudentScheduler.java
	* Desc:   'StudentScheduler' class; insert method and object synchronization
	* Author: Wesley Tomlinson
	* Class:  IT360 / M3A1
*/

import java.util.concurrent.*;

class InsObject {
    // insert Student object into queue
    public void insert(BlockingQueue<Student> sharedQueue) {
        for (int i=0; i <= 300; i++) {
            // random value between 1 and 5000 for timer
            int randomNum = ThreadLocalRandom.current().nextInt(1, 5000 + 1);

            // create Student object, set name, and set timer;
            Student student = new Student();
            student.setStudName("Student_" +i);
            student.setTimerAmt(i + randomNum);

            try
            {
                Thread.sleep(15);
                // put Student into queue
                sharedQueue.put(student);
                System.out.println("Meanwhile, Student_" +i + " sits down in the waiting area...");
            }
            catch (InterruptedException err)
            {
                err.printStackTrace();
            }
        }
    }
}

public class StudentScheduler extends Thread {
    // ArrayBlocking queue object
    private final BlockingQueue<Student> sharedQueue;

    // InsObject class object
    InsObject insObject = new InsObject();

    // StudentScheduler constructor
    public StudentScheduler(BlockingQueue<Student> sharedQueue) {
        super();
        this.sharedQueue = sharedQueue;
    }

    // run() method at start of thread
    public void run() {
        // synchronize insObject with synchronized block
        synchronized (insObject) {
            insObject.insert(sharedQueue);
        }
    }
}