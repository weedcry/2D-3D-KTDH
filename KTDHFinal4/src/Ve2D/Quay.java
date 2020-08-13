/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ve2D;

import Model.DuongThang;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

/**
 *
 * @author Admin
 */
public class Quay { 
    public void Xoayxe(Graphics g, Point1 p22, int x) {

        p22 = new Point1(p22.getREALX() + 17, p22.getREALY());//ve banh
        Point1 p23 = new Point1(p22.getREALX() + 1, p22.getREALY());//ve banh
        Point1 p24 = new Point1(p22.getREALX() - 1, p22.getREALY());//ve banh
        Point1 p25 = new Point1(p22.getREALX(), p22.getREALY() + 1);//ve banh
        Point1 p26 = new Point1(p22.getREALX(), p22.getREALY() - 1);//ve banh

        Point1 p11 = new Point1(p22.getREALX() + 6, p22.getREALY());//ve banh
        Point1 p27 = new Point1(p22.getREALX() + 7, p22.getREALY());//ve banh
        Point1 p28 = new Point1(p22.getREALX() + 5, p22.getREALY());//ve banh
        Point1 p29 = new Point1(p22.getREALX() + 6, p22.getREALY() + 1);//ve banh
        Point1 p30 = new Point1(p22.getREALX() + 6, p22.getREALY() - 1);//ve banh
        double s, c;
        double angle = 1000 * x;
        Graphics2D g2d = (Graphics2D) g;
        double degrees = angle * 3.14 / 180;
        c = Math.cos(Math.toRadians(degrees));
        s = Math.sin(Math.toRadians(degrees));
        int x1 = (int) Math.floor((p23.getX() - 238) * c - p23.getY() * s + (p22.getX() - 255) * (1 - c) + p22.getY() * s);
        int y1 = (int) Math.floor((p23.getX() - 238) * s + p23.getY() * c - (p22.getX() - 255) * s + p22.getY() * (1 - c));
        int x2 = (int) Math.floor((p24.getX() - 270) * c - p24.getY() * s + (p22.getX() - 255) * (1 - c) + p22.getY() * s);
        int y2 = (int) Math.floor((p24.getX() - 270) * s + p24.getY() * c - (p22.getX() - 255) * s + p22.getY() * (1 - c));
        int x3 = (int) Math.floor((p25.getX() - 252) * c - (p25.getY() - 12) * s + (p22.getX() - 252) * (1 - c) + p22.getY() * s);
        int y3 = (int) Math.floor((p25.getX() - 252) * s + (p25.getY() - 12) * c - (p22.getX() - 252) * s + p22.getY() * (1 - c));
        int x4 = (int) Math.floor((p26.getX() - 252) * c - (p26.getY() + 17) * s + (p22.getX() - 252) * (1 - c) + p22.getY() * s);
        int y4 = (int) Math.floor((p26.getX() - 252) * s + (p26.getY() + 17) * c - (p22.getX() - 252) * s + p22.getY() * (1 - c));
        //banh sau
        int x5 = (int) Math.floor((p27.getX() - 493) * c - (p27.getY()) * s + (p11.getX() - 510) * (1 - c) + p11.getY() * s);
        int y5 = (int) Math.floor((p27.getX() - 493) * s + (p27.getY()) * c - (p11.getX() - 510) * s + p11.getY() * (1 - c));
        int x6 = (int) Math.floor((p28.getX() - 525) * c - (p28.getY()) * s + (p11.getX() - 510) * (1 - c) + p11.getY() * s);
        int y6 = (int) Math.floor((p28.getX() - 525) * s + (p28.getY()) * c - (p11.getX() - 510) * s + p11.getY() * (1 - c));
        int x7 = (int) Math.floor((p29.getX() - 507) * c - (p29.getY() - 12) * s + (p11.getX() - 507) * (1 - c) + p11.getY() * s);
        int y7 = (int) Math.floor((p29.getX() - 507) * s + (p29.getY() - 12) * c - (p11.getX() - 507) * s + p11.getY() * (1 - c));
        int x8 = (int) Math.floor((p30.getX() - 507) * c - (p30.getY() + 17) * s + (p11.getX() - 507) * (1 - c) + p11.getY() * s);
        int y8 = (int) Math.floor((p30.getX() - 507) * s + (p30.getY() + 17) * c - (p11.getX() - 507) * s + p11.getY() * (1 - c));

        g2d.setStroke(new BasicStroke(5f));
        Color c1 = new Color(54, 54, 54);
        g.setColor(Color.WHITE);
        
        //banh trc
        g2d.drawLine(p22.getX() - 255, p22.getY(), x1, y1);
        g2d.drawLine(p22.getX() - 255, p22.getY(), x2, y2);
        g2d.drawLine(p22.getX() - 252, p22.getY(), x3, y3);
        g2d.drawLine(p22.getX() - 252, p22.getY(), x4, y4);
        g.setColor(Color.WHITE);
        //banh sau
        g2d.drawLine(p11.getX() - 510, p11.getY(), x5, y5);
        g2d.drawLine(p11.getX() - 510, p11.getY(), x6, y6);
        g2d.drawLine(p11.getX() - 507, p11.getY(), x7, y7);
        g2d.drawLine(p11.getX() - 507, p11.getY(), x8, y8);

    }

}
