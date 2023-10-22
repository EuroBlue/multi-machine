import java.awt.*;

public class InputDevice {
    private Machine activeMachine;

    public InputDevice(Machine m)
    {
        this.activeMachine=m;
    }

    public void setActiveMachine(Machine m) {
        this.activeMachine = m;
    }

    public Machine getActiveMachine() {
        return activeMachine;
    }
}
