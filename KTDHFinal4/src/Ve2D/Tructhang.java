/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ve2D;

import Model.DuongThang;
import Model.DuongTron;
import Model.Elip;
import Model.Netvongtron;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author weedc
 */
public class Tructhang {

    static Point1 pt1;

    public void vetructhang(Graphics2D g, Point1 pt, Color k) {
        g.setColor(k);
        Point1 pt1 = new Point1(pt.getREALX(), pt.getREALY() + 8);
        Point1 pt2 = new Point1(pt.getREALX(), pt.getREALY() + 4);
        Point1 pt20 = new Point1(pt.getREALX() + 2, pt.getREALY() + 4);
        Point1 pt21 = new Point1(pt.getREALX() + 2, pt.getREALY());
        Point1 pt22 = new Point1(pt.getREALX() + 6, pt.getREALY());
        Point1 pt3 = new Point1(pt.getREALX() - 5, pt.getREALY() + 2);
        Point1 pt4 = new Point1(pt.getREALX() - 14, pt.getREALY());
        Point1 pt5 = new Point1(pt.getREALX() - 5, pt.getREALY() - 2);
        Point1 pt6 = new Point1(pt.getREALX() - 14, pt.getREALY() - 2);
        Point1 pt7 = new Point1(pt.getREALX() - 16, pt.getREALY() - 1);
        Point1 pt8 = new Point1(pt.getREALX() - 2, pt.getREALY() - 4);
        Point1 pt9 = new Point1(pt.getREALX() - 2, pt.getREALY() - 7);
        Point1 pt10 = new Point1(pt.getREALX() + 1, pt.getREALY() - 4);
        Point1 pt11 = new Point1(pt.getREALX() + 1, pt.getREALY() - 7);
        Point1 pt12 = new Point1(pt.getREALX() - 4, pt.getREALY() - 7);
        Point1 pt13 = new Point1(pt.getREALX() + 3, pt.getREALY() - 7);
        Point1 pt14 = new Point1(pt.getREALX() - 3, pt.getREALY() - 3);
        Point1 pt15 = new Point1(pt.getREALX() - 3, pt.getREALY() - 6);
        Point1 pt16 = new Point1(pt.getREALX(), pt.getREALY() - 4);
        Point1 pt17 = new Point1(pt.getREALX(), pt.getREALY() - 6);
        Point1 pt18 = new Point1(pt.getREALX() - 4, pt.getREALY() - 6);
        Point1 pt19 = new Point1(pt.getREALX() + 3, pt.getREALY() - 6);
      
         //than + canh quay 
        Elip elip = new Elip(pt.getX(), pt.getY(), 6, 4);
        elip.Elip(g);
      Elip elip1 = new Elip(pt1.getX(), pt1.getY(), 4, 2);
       elip1.Elip(g);

        //duong thang than + canh quay
        DuongThang dt = new DuongThang(pt2.getX(), pt2.getY(), pt1.getX(), pt1.getY());
        dt.Veduongthang(g);

        DuongThang dt9 = new DuongThang(pt20.getX(), pt20.getY(), pt21.getX(), pt21.getY());
        dt9.Veduongthang(g);
        DuongThang dt10 = new DuongThang(pt21.getX(), pt21.getY(), pt22.getX(), pt22.getY());
        dt10.Veduongthang(g);

        //duong thang sau than + canh sau
        DuongThang dt1 = new DuongThang(pt3.getX(), pt3.getY(), pt4.getX(), pt4.getY());
        dt1.Veduongthang(g);

        DuongThang dt2 = new DuongThang(pt5.getX(), pt5.getY(), pt6.getX(), pt6.getY());
        dt2.Veduongthang(g);

        // canh sau
        g.fillOval(pt7.getX(), pt7.getY(), 5, 5);
        DuongTron dtron = new DuongTron(pt7.getX(), pt7.getY(), 2);
        dtron.Veduongtron(g);
        Netvongtron nvt = new Netvongtron(pt7.getX(), pt7.getY(), 1, 2);
        nvt.VeNetvongtron(g);
        Netvongtron nvt1 = new Netvongtron(pt7.getX(), pt7.getY(), 1, 4);
        nvt1.VeNetvongtron(g);

        //gia do
        DuongThang dt3 = new DuongThang(pt8.getX(), pt8.getY(), pt9.getX(), pt9.getY());
        dt3.Veduongthang(g);
        DuongThang dt4 = new DuongThang(pt10.getX(), pt10.getY(), pt11.getX(), pt11.getY());
        dt4.Veduongthang(g);
        DuongThang dt5 = new DuongThang(pt12.getX(), pt12.getY(), pt13.getX(), pt13.getY());
        dt5.Veduongthang(g);

        DuongThang dt6 = new DuongThang(pt14.getX(), pt14.getY(), pt15.getX(), pt15.getY());
        dt6.Veduongthang(g);
        DuongThang dt7 = new DuongThang(pt16.getX(), pt16.getY(), pt17.getX(), pt17.getY());
        dt7.Veduongthang(g);
        DuongThang dt8 = new DuongThang(pt18.getX(), pt18.getY(), pt19.getX(), pt19.getY());
        dt8.Veduongthang(g);
        Color c1 = new Color(142, 30, 32);
        g.setColor(c1);
        g.fillOval(pt.getX() - 88, pt.getY() - 57, 179, 119);//than tt
        Color c2 = new Color(255, 215, 0);
        g.setColor(Color.GRAY);
       g.fillOval(pt1.getX() - 57, pt1.getY() - 28, 120, 60);//canh tt
        g.setColor(Color.GRAY);//cua so tt
        g.fillArc(pt20.getX() - 80, pt20.getY() + 5, 145, 125, 0, 90);

        //dduoi tt
        g.setColor(c1);
        int x1[] = {pt3.getX() - 7, pt4.getX(), pt4.getX() + 5, pt6.getX() + 2, pt5.getX() - 5, pt5.getX() - 14};
        int y1[] = {pt3.getY() + 7, pt4.getY() + 5, pt4.getY() + 15, pt6.getY() + 2, pt5.getY() + 2, pt5.getY() - 24};
        int n1 = 6;
        g.fillPolygon(x1, y1, n1);
        //canh sau
        g.setColor(Color.GRAY);
        g.fillOval(pt7.getX() - 26, pt7.getY() - 26, 57, 57);//
        g.setColor(Color.BLACK);
        g.fillOval(pt7.getX()-3, pt7.getY()-3, 10, 10);
        nvt.VeNetvongtron(g);
        nvt1.VeNetvongtron(g);
        g.fillOval(pt1.getX(), pt1.getY(), 5, 5);
       
                     
                 
    }

}
