import java.awt.*;

public class Machine {
    private Robot robot;
    private boolean is_local;
    public Machine(boolean il)
    {
        this.is_local=il;
        try {
            this.robot=new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }

    public Robot getRobot() {
        return robot;
    }
}