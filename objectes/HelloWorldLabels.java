package objectes;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import java.awt.Color;

public class HelloWorldLabels extends GraphicsProgram {
    public double TIMEOUT = 1000.0;

    public void run() {
        GLabel label = new GLabel("hello, world", 100.0, 75.0);
        add(label);
        pause(TIMEOUT);
        label.move(-50.0, 50.0);
        pause(TIMEOUT);
        label.setColor(Color.BLUE);
        pause(TIMEOUT);
        label.setVisible(false);
        pause(TIMEOUT);
        label.setVisible(true);
        pause(TIMEOUT);
        GRect rect = new GRect(100.0, 75.0, 30.0, 50.0);
        rect.setColor(Color.YELLOW);
        add(rect);
        pause(TIMEOUT);
        rect.setFilled(true);
        rect.setFillColor(Color.RED);
        rect.setLocation(300.0, 75.0);
    }
}
