/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ve2D;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Admin
 */
public class CdVach {

    public void Vevach(Graphics g, Point1 p1, Color c) {
        g.setColor(c);
        Point1 p38 = new Point1(p1.getREALX() + 6, p1.getREALY());
        Point1 p39 = new Point1(p1.getREALX() + 4, p1.getREALY() - 1);
        Point1 p40 = new Point1(p1.getREALX() - 2, p1.getREALY() - 1);
        g.setColor(Color.WHITE);
        int x[] = {p40.getX(), p39.getX(), p38.getX(), p1.getX()};
        int y[] = {p40.getY(), p39.getY(), p38.getY(), p1.getY()};
        int n = 4;
        g.fillPolygon(x, y, n);
    }

}
