/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ve2D;

import Model.DuongThang;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Admin
 */
public class CdDen {

    public void veDen(Graphics g, Point1 p111, Color c) {
        g.setColor(c);

        Point1 p112 = new Point1(p111.getREALX(), p111.getREALY() + 6);
        Point1 p113 = new Point1(p111.getREALX() + 2, p111.getREALY());
        Point1 p114 = new Point1(p111.getREALX() + 2, p111.getREALY() + 6);
        Point1 p115 = new Point1(p111.getREALX() - 1, p111.getREALY() + 6);
        Point1 p116 = new Point1(p111.getREALX() + 3, p111.getREALY() + 6);
        Point1 p117 = new Point1(p111.getREALX() - 1, p111.getREALY() + 13);
        Point1 p118 = new Point1(p111.getREALX() + 3, p111.getREALY() + 13);
        Point1 p119 = new Point1(p111.getREALX(), p111.getREALY() + 8);
        Point1 p120 = new Point1(p111.getREALX(), p111.getREALY() + 10);
        Point1 p121 = new Point1(p111.getREALX(), p111.getREALY() + 12);

        DuongThang d44 = new DuongThang(p111.getX(), p111.getY(), p112.getX(), p112.getY());//den giao thong
        DuongThang d45 = new DuongThang(p113.getX(), p113.getY(), p114.getX(), p114.getY());
        DuongThang d46 = new DuongThang(p112.getX(), p112.getY(), p115.getX(), p115.getY());
        DuongThang d47 = new DuongThang(p114.getX(), p114.getY(), p116.getX(), p116.getY());
        DuongThang d48 = new DuongThang(p115.getX(), p115.getY(), p117.getX(), p117.getY());
        DuongThang d49 = new DuongThang(p116.getX(), p116.getY(), p118.getX(), p118.getY());
        DuongThang d50 = new DuongThang(p117.getX(), p117.getY(), p118.getX(), p118.getY());

        d44.Veduongthang(g);
        d45.Veduongthang(g);
        d46.Veduongthang(g);
        d47.Veduongthang(g);
        d48.Veduongthang(g);
        d49.Veduongthang(g);
        d50.Veduongthang(g);
        Color c1 = new Color(105, 105, 105);
        g.setColor(Color.BLACK);
        int x1[] = {p111.getX() + 4, p113.getX() + 1, p114.getX() + 2, p116.getX() + 1, p118.getX() + 1, p117.getX() + 4, p115.getX() + 4, p112.getX() + 4};
        int y1[] = {p111.getY() + 2, p113.getY() + 2, p114.getY() + 2, p116.getY() + 2, p118.getY() + 4, p117.getY() + 4, p115.getY() + 2, p112.getY() + 1};
        int n1 = 8;
        g.fillPolygon(x1, y1, n1);
        g.setColor(Color.GREEN);
        g.fillOval(p119.getX(), p119.getY(), 30, 30);
        g.setColor(Color.ORANGE);
        g.drawOval(p120.getX(), p120.getY(), 30, 30);
        g.setColor(Color.RED);
        g.drawOval(p121.getX(), p121.getY(), 30, 30);

    }

}
