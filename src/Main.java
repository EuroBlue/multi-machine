import javax.crypto.Mac;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Machine mach=new Machine(true);
        Mouse m=new Mouse(mach);
        System.out.println("X: "+ m.getX() + " Y: "+ m.getY());
        m.setPosition(605,177);
        System.out.println("X: "+ m.getX() + " Y: "+ m.getY());
    }
}
