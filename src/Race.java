/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 29-10-2020
 *   Time: 19:45
 *   File: Race.java
 */

public class Race {

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Tortoise tortoise = new Tortoise();
        rabbit.getRabbit().start();
        tortoise.getTortoise().start();
    }
}
