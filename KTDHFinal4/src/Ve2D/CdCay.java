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
public class CdCay {

    public void veCay(Graphics g, Point1 p24, Color c) {
        g.setColor(c);

        Point1 p25 = new Point1(p24.getREALX(), p24.getREALY() + 6);
        Point1 p26 = new Point1(p24.getREALX() + 2, p24.getREALY());
        Point1 p27 = new Point1(p24.getREALX() + 2, p24.getREALY() + 6);
        Point1 p28 = new Point1(p24.getREALX() - 4, p24.getREALY() + 6);
        Point1 p29 = new Point1(p24.getREALX() + 6, p24.getREALY() + 6);
        Point1 p30 = new Point1(p24.getREALX() - 1, p24.getREALY() + 9);
        Point1 p31 = new Point1(p24.getREALX() - 3, p24.getREALY() + 9);
        Point1 p32 = new Point1(p24.getREALX() - 1, p24.getREALY() + 11);
        Point1 p33 = new Point1(p24.getREALX() + 1, p24.getREALY() + 13);
        Point1 p34 = new Point1(p24.getREALX() + 3, p24.getREALY() + 9);
        Point1 p35 = new Point1(p24.getREALX() + 5, p24.getREALY() + 9);

        DuongThang d20 = new DuongThang(p24.getX(), p24.getY(), p25.getX(), p25.getY());//vẽ cây
        DuongThang d21 = new DuongThang(p26.getX(), p26.getY(), p27.getX(), p27.getY());
        DuongThang d22 = new DuongThang(p25.getX(), p25.getY(), p28.getX(), p28.getY());
        DuongThang d23 = new DuongThang(p27.getX(), p27.getY(), p29.getX(), p29.getY());
        DuongThang d24 = new DuongThang(p28.getX(), p28.getY(), p30.getX(), p30.getY());
        DuongThang d25 = new DuongThang(p30.getX(), p30.getY(), p31.getX(), p31.getY());
        DuongThang d26 = new DuongThang(p31.getX(), p31.getY(), p32.getX(), p32.getY());
        DuongThang d27 = new DuongThang(p32.getX(), p32.getY(), p33.getX(), p33.getY());
        DuongThang d28 = new DuongThang(p29.getX(), p29.getY(), p34.getX(), p34.getY());
        DuongThang d29 = new DuongThang(p34.getX(), p34.getY(), p35.getX(), p35.getY());
        DuongThang d30 = new DuongThang(p33.getX(), p33.getY(), p35.getX(), p35.getY());

        d20.Veduongthang(g);
        d21.Veduongthang(g);
        d22.Veduongthang(g);
        d23.Veduongthang(g);
        d24.Veduongthang(g);
        d25.Veduongthang(g);
        d26.Veduongthang(g);
        d27.Veduongthang(g);
        d28.Veduongthang(g);
        d29.Veduongthang(g);
        d30.Veduongthang(g);

        Color c1 = new Color(148, 83, 5);
        g.setColor(c1);
        g.fillRect(p25.getX() + 4, p25.getY(), 28, 92);
        Color c2 = new Color(80, 166, 37);
        g.setColor(c2);

        int x1[] = {p28.getX() + 3, p29.getX(), p34.getX(), p35.getX(), p33.getX() + 3, p31.getX() + 3, p30.getX() + 3};
        int y1[] = {p28.getY() + 1, p29.getY() + 1, p34.getY() + 1, p35.getY() + 1, p33.getY() + 1, p31.getY() + 1, p30.getY() + 1};
        int n1 = 7;
        g.fillPolygon(x1, y1, n1);

    }
}
