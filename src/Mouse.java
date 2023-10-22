import java.awt.*;
public class Mouse extends InputDevice{
    public Mouse(Machine m)
    {
        super(m);
    }

    public int  getX() {
        return MouseInfo.getPointerInfo().getLocation().x;
    }

    public int  getY() {
        return MouseInfo.getPointerInfo().getLocation().y;
    }
    public void setPosition(int x, int y) {
        getActiveMachine().getRobot().mouseMove(x, y);
    }
}
