package by.teachmeskills.robot;

public interface IRobot {

    void action();
    void dance();

    /**
     * Get the cost of a robot
     * @return int
     */
    int getPrice();
}
