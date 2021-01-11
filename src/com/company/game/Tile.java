package com.company.game;

import java.awt.*;

public class Tile {

    private int x;
    private int y;

    public Tile(int row, int col) {
        this.x = row;
        this.y = col;
    }

    /**
     * Depending coordinates, we draw the tiles(battlefield)
     * @param g - graphics param
     */
    public void render(Graphics g) {
        if (((x == 0 || x == 400) && y == 30) || ((x == 100 || x == 300) && y == 430)) {
            g.setColor(Color.red);
        } else if((y == 30 && (x == 100 || x == 300)) ||(y == 430 && (x == 0 || x == 400))) {
            g.setColor(Color.darkGray);
        } else if ((y == 130 && (x == 0 || x == 100 || x == 300 || x == 400)) || (y == 330 && (x == 0 || x == 100 || x == 300 || x == 400))) {
            g.setColor(Color.gray);
        } else {
            g.setColor(Color.white);
        }

        g.drawRect(x, y, 100, 100);
        g.fillRect(x, y, 100-1, 100-1);

    }
}
