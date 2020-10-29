/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 29-10-2020
 *   Time: 20:39
 *   File: Rabbit.java
 */


import javax.swing.*;

class Rabbit extends Thread{
    private static final int NO_OF_MILESTONES = 5;
    private final Thread rabbit;

    public Rabbit(){
        this.rabbit = new Thread(this, "Rabbit");
    }

    public Thread getRabbit(){
        return rabbit;
    }
    @Override
    public void run() {
        for(int index = 0; index < NO_OF_MILESTONES; index++){
            Milestones[] milestones = Milestones.values();
            Milestones currentMilestone = milestones[index];

            switch (currentMilestone){
                case START_LINE:
                    System.out.println("The rabbit has started from the start line!");
                    break;
                case COOL_RIVER:
                    System.out.println("The rabbit has crossed Cool-River!");
                    break;
                case MOUNTAIN_HILL:
                    System.out.println("The rabbit has crossed Mountain-Hill!");
                    break;
                case BIG_OAK_TREE:
                    System.out.println("The rabbit has crossed Big oak tree.");
                    System.out.println("Since, it is leading, it is going to sleep.");
                    try{
                        Thread.sleep(3000);
                    }catch (InterruptedException e){
                        System.err.println(e.getMessage());
                    }
                    break;
                case FINISH_LINE:
                    System.out.println("The rabbit has reached Finish line!");
                    break;
            }
            try {
                Thread.sleep(1500);
            }catch (InterruptedException e){
                System.out.println("The rabbit has lost his path.");
            }
        }

        JOptionPane.showConfirmDialog(
                null,
                "The rabbit has completed the race!",
                "Rabbit",
                JOptionPane.YES_NO_CANCEL_OPTION
        );
    }
}
