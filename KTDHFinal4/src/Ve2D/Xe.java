/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ve2D;

import Model.DuongThang;
import Model.DuongTron;
import View.Forrm;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.text.Normalizer;

/**
 *
 * @author Admin
 */
public class Xe {

    public void Vexe(Graphics g, Point1 p22, Color c, Color c1, Color c2, Color c3, Color c4) {
        Graphics2D a = (Graphics2D) g;
        Forrm fm = new Forrm();

        g.setColor(c);
        Point1 p1 = new Point1(p22.getREALX() + 4, p22.getREALY());
        Point1 p2 = new Point1(p22.getREALX(), p22.getREALY() + 3);
        Point1 p3 = new Point1(p22.getREALX() + 4, p22.getREALY() + 3);
        Point1 p4 = new Point1(p22.getREALX() + 5, p22.getREALY() + 7);
        Point1 p5 = new Point1(p22.getREALX() + 17, p22.getREALY() + 7);
        Point1 p6 = new Point1(p22.getREALX() + 19, p22.getREALY() + 3);
        Point1 p7 = new Point1(p22.getREALX() + 26, p22.getREALY() + 3);
        Point1 p8 = new Point1(p22.getREALX() + 26, p22.getREALY());
        Point1 p9 = new Point1(p22.getREALX() + 19, p22.getREALY());
        Point1 p10 = new Point1(p22.getREALX() + 17, p22.getREALY());//ve banh
        Point1 p11 = new Point1(p22.getREALX() + 6, p22.getREALY());//ve banh
        Point1 p12 = new Point1(p22.getREALX() + 8, p22.getREALY());
        Point1 p13 = new Point1(p22.getREALX() + 15, p22.getREALY());
        Point1 p14 = new Point1(p22.getREALX() + 10, p22.getREALY() + 3);
        Point1 p15 = new Point1(p22.getREALX() + 10, p22.getREALY() + 6);
        Point1 p16 = new Point1(p22.getREALX() + 6, p22.getREALY() + 6);
        Point1 p17 = new Point1(p22.getREALX() + 5, p22.getREALY() + 3);
        Point1 p18 = new Point1(p22.getREALX() + 12, p22.getREALY() + 3);
        Point1 p19 = new Point1(p22.getREALX() + 12, p22.getREALY() + 6);
        Point1 p20 = new Point1(p22.getREALX() + 16, p22.getREALY() + 6);
        Point1 p21 = new Point1(p22.getREALX() + 17, p22.getREALY() + 3);

        //bô xe
        Point1 p25 = new Point1(p22.getREALX() - 1, p22.getREALY());
        g.fillRect(p25.getX(), p25.getY(), 35, 10);

        DuongThang d = new DuongThang(p22.getX(), p22.getY(), p1.getX(), p1.getY());
        DuongThang d1 = new DuongThang(p22.getX(), p22.getY(), p2.getX(), p2.getY());
        DuongThang d2 = new DuongThang(p2.getX(), p2.getY(), p3.getX(), p3.getY());
        DuongThang d3 = new DuongThang(p3.getX(), p3.getY(), p4.getX(), p4.getY());
        DuongThang d4 = new DuongThang(p4.getX(), p4.getY(), p5.getX(), p5.getY());
        DuongThang d5 = new DuongThang(p5.getX(), p5.getY(), p6.getX(), p6.getY());
        DuongThang d6 = new DuongThang(p6.getX(), p6.getY(), p7.getX(), p7.getY());
        DuongThang d7 = new DuongThang(p7.getX(), p7.getY(), p8.getX(), p8.getY());
        DuongThang d8 = new DuongThang(p8.getX(), p8.getY(), p9.getX(), p9.getY());
        DuongThang d11 = new DuongThang(p12.getX(), p12.getY(), p13.getX(), p13.getY());
        DuongThang d12 = new DuongThang(p14.getX(), p14.getY(), p15.getX(), p15.getY());
        DuongThang d13 = new DuongThang(p15.getX(), p15.getY(), p16.getX(), p16.getY());
        DuongThang d14 = new DuongThang(p16.getX(), p16.getY(), p17.getX(), p17.getY());
        DuongThang d15 = new DuongThang(p18.getX(), p18.getY(), p19.getX(), p19.getY());
        DuongThang d16 = new DuongThang(p19.getX(), p19.getY(), p20.getX(), p20.getY());
        DuongThang d17 = new DuongThang(p20.getX(), p20.getY(), p21.getX(), p21.getY());
        DuongThang d18 = new DuongThang(p3.getX(), p3.getY(), p6.getX(), p6.getY());
        DuongTron t = new DuongTron(p10.getX(), p10.getY(), 2);
        DuongTron t1 = new DuongTron(p10.getX(), p10.getY(), 1);
        DuongTron t2 = new DuongTron(p11.getX(), p11.getY(), 2);
        DuongTron t3 = new DuongTron(p11.getX(), p11.getY(), 1);
        d.Veduongthang(g);
        d1.Veduongthang(g);
        d2.Veduongthang(g);
        d3.Veduongthang(g);
        d4.Veduongthang(g);
        d5.Veduongthang(g);
        d6.Veduongthang(g);
        d7.Veduongthang(g);
        d8.Veduongthang(g);
        d11.Veduongthang(g);
        d12.Veduongthang(g);
        d13.Veduongthang(g);
        d14.Veduongthang(g);
        d15.Veduongthang(g);
        d16.Veduongthang(g);
        d17.Veduongthang(g);
        d18.Veduongthang(g);
        t.Veduongtron(a);
        t1.Veduongtron(a);
        t2.Veduongtron(a);
        t3.Veduongtron(a);
        //than xe
//        Color c1 = new Color(255,215,0);
        g.setColor(c1);
        g.fillRect(p22.getX() + 5, p22.getY() - 2 * 20, 387, 43);
        //banh xe lon
//        Color c5 = new Color(105, 105,105);
        g.setColor(c2);
        g.fillOval(p11.getX() - 2 * 15, p11.getY() - 2 * 15, 65, 65);
        //banh xe nho
//          Color c6 = new Color(255,255,255);
        g.setColor(c3);
        g.fillOval(p11.getX() - 12, p11.getY() - 13, 30, 30);

        g.setColor(c2);
        g.fillOval(p10.getX() - 2 * 15, p10.getY() - 2 * 15, 65, 65);

        g.setColor(c3);
        g.fillOval(p10.getX() - 12, p10.getY() - 13, 30, 30);
//         Color c2 = new Color(255,215,0);
        g.setColor(c1);
        int x1[] = {p3.getX() + 2, p4.getX() + 2, p5.getX() + 2, p6.getX() + 2, p21.getX() + 2, p20.getX() + 2, p19.getX() + 2, p18.getX() + 2, p14.getX() + 4, p15.getX() + 4, p16.getX() + 2, p17.getX() + 2};
        int y1[] = {p3.getY() + 2, p4.getY() + 4, p5.getY() + 4, p6.getY() + 2, p21.getY() + 2, p20.getY() + 2, p19.getY() + 2, p18.getY() + 2, p14.getY() + 2, p15.getY() + 2, p16.getY() + 2, p17.getY() + 2};
        int n1 = 12;
        g.fillPolygon(x1, y1, n1);
        //kinh 1

        g.setColor(c3);
        int x2[] = {p14.getX() + 4, p15.getX() + 4, p16.getX() + 2, p17.getX() + 2};
        int y2[] = {p14.getY() + 2, p15.getY() + 2, p16.getY() + 2, p17.getY() + 2};
        int n2 = 4;
        g.fillPolygon(x2, y2, n2);
        //kinh 2
        int x3[] = {p21.getX() + 2, p20.getX() + 2, p19.getX() + 2, p18.getX() + 2};
        int y3[] = {p21.getY() + 2, p20.getY() + 2, p19.getY() + 2, p18.getY() + 2};
        int n3 = 4;
        g.fillPolygon(x3, y3, n3);

    }

}
