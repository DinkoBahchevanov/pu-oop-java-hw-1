package com.company.warriors;

import java.awt.*;

public class YellowFrog extends Frog {

    public YellowFrog( int x, int y) {
        super(x, y);
    }

    @Override
    public void render(Graphics g) {
        //if x coordinate is 400, we draw yellow leader
        if (getX() == 400) {
            g.drawRect(425, 30, 50,50);
            g.setColor(Color.YELLOW);
            g.fillRect(425, 55, 49, 49);
        } else {
            //if x coordinate is not 400, we draw yellow guards
            g.drawOval(getX() + 30, getY() + 58, 42,42);
            g.setColor(Color.GREEN);
            g.fillOval(getX() + 30, getY() + 58, 42,42);

            g.drawOval(getX() + 33, getY() + 60, 37,37);
            g.setColor(Color.YELLOW);
            g.fillOval(getX() + 33, getY() + 60, 37, 37);
        }
    }
}
