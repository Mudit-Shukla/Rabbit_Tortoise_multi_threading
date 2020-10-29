/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 29-10-2020
 *   Time: 21:07
 *   File: Tortoise.java
 */

import javax.swing.*;

public class Tortoise implements Runnable{

    private final static int NO_OF_MILESTONES = 5;
    private final Thread tortoise;

    public Tortoise(){
        this.tortoise =  new Thread(this, "Tortoise");
    }

    public Thread getTortoise(){
        return tortoise;
    }

    @Override
    public void run() {
        for(int index = 0; index < NO_OF_MILESTONES; index++){
            Milestones[] milestones = Milestones.values();
            Milestones currentMilestone = milestones[index];

            switch (currentMilestone){
                case START_LINE:
                    System.out.println("The tortoise has started from the start line!");
                    break;
                case COOL_RIVER:
                    System.out.println("The tortoise has crossed Cool-River!");
                    break;
                case MOUNTAIN_HILL:
                    System.out.println("The tortoise has crossed Mountain-Hill!");
                    break;
                case BIG_OAK_TREE:
                    System.out.println("The tortoise has crossed Big oak tree.");
                    break;
                case FINISH_LINE:
                    System.out.println("The tortoise has reached Finish line!");
                    break;
            }
            try{
                Thread.sleep(1500);
            }catch (InterruptedException e){
                System.out.println("Tortoise has lost its path");
            }
        }

        JOptionPane.showConfirmDialog(
                null,
                "The Tortoise has completed the race!",
                "Tortoise",
                JOptionPane.YES_NO_CANCEL_OPTION
        );
    }
}
