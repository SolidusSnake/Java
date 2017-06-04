/*
	* File:   Office.java
	* Desc:   'Office' class; professor's office
	* Author: Wesley Tomlinson
	* Class:  IT360 / M3A1
*/

import java.util.concurrent.*;

public class Office {
    public static void main(String[] args) {
        // ArrayBlock size=5 (number of office chairs)
        BlockingQueue<Student> sharedQueue = new ArrayBlockingQueue<>(5);

        // Professor and StudentScheduler instance creation
        StudentScheduler studentScheduler = new StudentScheduler(sharedQueue);
        Professor professor = new Professor(sharedQueue);

        // set thread priority
        studentScheduler.setPriority(Thread.MAX_PRIORITY);
        professor.setPriority(Thread.MAX_PRIORITY);

        // start threads
        studentScheduler.start();
        professor.start();

        try
        {
            // studentScheduler thread completion standby
            studentScheduler.join();

            // professor thread completion standby
            professor.join();

            // if studentScheduler thread not active, print exit message
            if (!studentScheduler.isAlive()) {
                System.out.println("Professor has locked up and left the building...");
            }
        }
        catch (InterruptedException err) {
            err.printStackTrace();
        }
    }
}

