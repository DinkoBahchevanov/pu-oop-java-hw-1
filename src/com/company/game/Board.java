package com.company.game;

import com.company.warriors.Frog;
import com.company.warriors.GreenFrog;
import com.company.warriors.YellowFrog;

import javax.swing.*;
import java.awt.*;

public class Board extends JFrame {

    public Board() {
        //initializing the battlefield
        this.setVisible(true);
        this.setSize(500, 530);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.BLACK);
    }
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);

        //painting the battlefield(tiles and warriors)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                //creating every tile
                Tile tile = new Tile(j * 100, i * 100 + 30);
                tile.render(g);

                //creating every warrior(GREEN or YELLOW frog)
                if (i == 0) {
                    Frog yellowFrog = new YellowFrog(j * 100, 0);
                    yellowFrog.render(g);
                } else if (i == 4) {
                    Frog greenFrog = new GreenFrog(j * 100, i * 100);
                    greenFrog.render(g);
                }
            }
        }
        //drawing the oval in the center of the battlefield
            g.drawOval(234, 264, 30, 30);
            g.setColor(Color.BLACK);
            g.fillOval(234, 264, 30, 30);

            g.drawOval(236, 266, 26, 26);
            g.setColor(Color.gray);
            g.fillOval(236, 266, 26, 26);
    }
}
