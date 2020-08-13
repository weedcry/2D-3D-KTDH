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
public class CdNha {

    public void veNha(Graphics g, Point1 p45, Color c) {
        g.setColor(c);
        Point1 p46 = new Point1(p45.getREALX() + 14, p45.getREALY());
        Point1 p47 = new Point1(p45.getREALX() + 5, p45.getREALY());
        Point1 p48 = new Point1(p45.getREALX() + 9, p45.getREALY());
        Point1 p49 = new Point1(p45.getREALX() + 5, p45.getREALY() + 6);
        Point1 p50 = new Point1(p45.getREALX() + 9, p45.getREALY() + 6);
        Point1 p51 = new Point1(p45.getREALX(), p45.getREALY() + 13);
        Point1 p52 = new Point1(p45.getREALX() + 14, p45.getREALY() + 13);
        Point1 p53 = new Point1(p45.getREALX() + 7, p45.getREALY() + 19);

        DuongThang d32 = new DuongThang(p45.getX(), p45.getY(), p51.getX(), p51.getY());
        DuongThang d33 = new DuongThang(p46.getX(), p46.getY(), p52.getX(), p52.getY());
        DuongThang d34 = new DuongThang(p51.getX(), p51.getY(), p52.getX(), p52.getY());
        DuongThang d35 = new DuongThang(p51.getX(), p51.getY(), p53.getX(), p53.getY());
        DuongThang d36 = new DuongThang(p52.getX(), p52.getY(), p53.getX(), p53.getY());
        DuongThang d37 = new DuongThang(p47.getX(), p47.getY(), p49.getX(), p49.getY());
        DuongThang d38 = new DuongThang(p48.getX(), p48.getY(), p50.getX(), p50.getY());
        DuongThang d39 = new DuongThang(p49.getX(), p49.getY(), p50.getX(), p50.getY());

        d32.Veduongthang(g);
        d33.Veduongthang(g);
        d34.Veduongthang(g);
        d35.Veduongthang(g);
        d36.Veduongthang(g);
        d37.Veduongthang(g);
        d38.Veduongthang(g);
        d39.Veduongthang(g);

        Color c3 = new Color(137, 137, 137);
        g.setColor(c3);
        int x[] = {p53.getX() + 3, p51.getX() + 2, p52.getX() - 2};
        int y[] = {p53.getY() + 3, p51.getY() + 3, p52.getY() + 1};
        int n = 3;
        g.fillPolygon(x, y, n);
        Color c1 = new Color(236, 236, 236);
        g.setColor(c1);
        g.fillRect(p51.getX() + 5, p51.getY() + 1, 206, 195);
        Color c2 = new Color(189, 107, 9);
        g.setColor(c2);
        g.fillRect(p49.getX(), p49.getY(), 60, 90);
    }

}
