package com.company.warriors;

import java.awt.*;

public class GreenFrog extends Frog {

    public GreenFrog(int x, int y) {
        super(x, y);
    }

    /**
     * Drawing the circles and square. (frogs, depending on coordinates)
     * @param g - graphics param
     */
    @Override
    public void render(Graphics g) {
        //if x coordinate is 0, we draw a rectangle (green leader)
        if (getX() == 0) {
            g.drawRect(25, 455, 50,60);
            g.setColor(Color.GREEN);
            g.fillRect(25, 455, 50, 50);
        } else {
            //if x coordinate is not 0, we draw green guards
            g.drawOval(getX() + 27, getY() + 58, 42,42);
            g.setColor(Color.YELLOW);
            g.fillOval(getX() + 27, getY() + 58, 42,42);

            g.drawOval(getX() + 30, getY() + 60, 37,37);
            g.setColor(Color.GREEN);
            g.fillOval(getX() + 30, getY() + 60, 37, 37);
        }
    }
}
