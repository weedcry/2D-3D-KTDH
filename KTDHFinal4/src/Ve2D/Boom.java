/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ve2D;

import Model.DuongThang;
import Model.Elip;
import Model.Netvongtron;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author weedc
 */
public class Boom extends Thread {

    public void boom(Graphics2D g, Point1 p1, Color c, Color c1, Color c2) {
        // x = 19 , y = 24

        // than boom
        g.setColor(c);

        Elip elip = new Elip(p1.getX(), p1.getY(), 1, 2);
        elip.Elip(g);

        // duoi boom
        Point1 p2 = new Point1(p1.getREALX() - 1, p1.getREALY() + 2);
        Point1 p3 = new Point1(p1.getREALX() + 1, p1.getREALY() + 2);

        DuongThang dt = new DuongThang(p2.getX(), p2.getY(), p3.getX(), p3.getY());
        g.setColor(c1);
        dt.Veduongthang(g);

        //Point1 p4 = new 
        Netvongtron nvt2 = new Netvongtron(p1.getX(), p1.getY(), 1, 3);

        g.setColor(c2);
        g.fillOval(p1.getX() - 13, p1.getY() - 25, 30, 58);
        g.setColor(c1);
        nvt2.VeNetvongtron(g);

    }

    public void thaboom(Graphics g, Point1 p1, int tocdo) {

        Point1 p2 = new Point1(p1.getREALX() - 1, p1.getREALY() + 2);
        try {
            for (int i = 0; i < 15; i++) {
                g.setColor(Color.BLACK);
                g.fillRect(p2.getX(), p2.getY(), 40, 70);
                p1.setY(p1.getREALY() - tocdo);
                p2.setY(p2.getREALY() - tocdo);
                boom((Graphics2D) g, new Point1(p1.getREALX(), p1.getREALY()), Color.RED, Color.red, Color.ORANGE);
                Thread.sleep(100);
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(Boom.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void hieuungnoboom(Graphics g, Point1 p1, Color c) {
        // new Point1(15,2)
        Thread th = new Thread();
        Point1 p2 = new Point1(p1.getREALX() + 1, p1.getREALY() + 2);
        Point1 p3 = new Point1(p2.getREALX() + 3, p2.getREALY() + 2);

        try {

            g.setColor(c);

            for (int i = 0; i < 3; i++) {

                Netvongtron nvt = new Netvongtron(p1.getX() + 55 * i, p1.getY(), 2, 1);
                nvt.VeNetvongtron((Graphics2D) g);
                Netvongtron nvt1 = new Netvongtron(p1.getX() + 55 * i, p1.getY(), 2, 2);
                nvt1.VeNetvongtron((Graphics2D) g);
                Netvongtron nvt2 = new Netvongtron(p1.getX() + 55 * i, p1.getY(), 2, 4);
                nvt2.VeNetvongtron((Graphics2D) g);

            }
            th.sleep(100);

            for (int i = 0; i < 2; i++) {
                Netvongtron nvt = new Netvongtron(p2.getX() + 55 * i, p2.getY(), 2, 1);
                nvt.VeNetvongtron((Graphics2D) g);
                Netvongtron nvt1 = new Netvongtron(p2.getX() + 55 * i, p2.getY(), 2, 2);
                nvt1.VeNetvongtron((Graphics2D) g);
                Netvongtron nvt2 = new Netvongtron(p2.getX() + 55 * i, p2.getY(), 2, 4);
                nvt2.VeNetvongtron((Graphics2D) g);

            }

            th.sleep(100);
            for (int i = 0; i < 1; i++) {
                Netvongtron nvt = new Netvongtron(p3.getX() + 55 * i, p3.getY(), 2, 1);
                nvt.VeNetvongtron((Graphics2D) g);
                Netvongtron nvt1 = new Netvongtron(p3.getX() + 55 * i, p3.getY(), 2, 2);
                nvt1.VeNetvongtron((Graphics2D) g);
                Netvongtron nvt2 = new Netvongtron(p3.getX() + 55 * i, p3.getY(), 2, 4);
                nvt2.VeNetvongtron((Graphics2D) g);

            }

        } catch (InterruptedException ex) {
            Logger.getLogger(Boom.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void noboom(Graphics g, Point1 p1, Color c, Color c1,int x) {
        Point1 p2 = new Point1(p1.getREALX() + 1, p1.getREALY() + 2);
        Point1 p3 = new Point1(p2.getREALX() + 3, p2.getREALY() + 2);

        g.setColor(c);
        for (int i = 0; i < 3; i++) {
            Netvongtron nvt = new Netvongtron(p1.getX() + 55 * i, p1.getY(), x, 1);
            nvt.VeNetvongtron((Graphics2D) g);
            Netvongtron nvt1 = new Netvongtron(p1.getX() + 55 * i, p1.getY(), x, 2);
            nvt1.VeNetvongtron((Graphics2D) g);
            Netvongtron nvt2 = new Netvongtron(p1.getX() + 55 * i, p1.getY(), x, 4);
            nvt2.VeNetvongtron((Graphics2D) g);
        }
        for (int i = 0; i < 2; i++) {
            Netvongtron nvt = new Netvongtron(p2.getX() + 55 * i, p2.getY(), x, 1);
            nvt.VeNetvongtron((Graphics2D) g);
            Netvongtron nvt1 = new Netvongtron(p2.getX() + 55 * i, p2.getY(), x, 2);
            nvt1.VeNetvongtron((Graphics2D) g);
            Netvongtron nvt2 = new Netvongtron(p2.getX() + 55 * i, p2.getY(), x, 4);
            nvt2.VeNetvongtron((Graphics2D) g);
        }
        for (int i = 0; i < 1; i++) {
            Netvongtron nvt = new Netvongtron(p3.getX() + 55 * i, p3.getY(), x, 1);
            nvt.VeNetvongtron((Graphics2D) g);
            Netvongtron nvt1 = new Netvongtron(p3.getX() + 55 * i, p3.getY(), x, 2);
            nvt1.VeNetvongtron((Graphics2D) g);
            Netvongtron nvt2 = new Netvongtron(p3.getX() + 55 * i, p3.getY(), x, 4);
            nvt2.VeNetvongtron((Graphics2D) g);
        }
        g.setColor(c1);
        g.fillOval(p1.getX() - 27, p1.getY() - 27, 63+3*x, 56+3*x);
        g.fillOval(p1.getX() + 28, p1.getY() - 27, 63+3*x, 56+3*x);
        g.fillOval(p1.getX() + 83, p1.getY() - 27, 63+3*x, 56+3*x);
        g.fillOval(p2.getX() + 28, p2.getY() - 27, 63+3*x, 56+3*x);
        g.fillOval(p2.getX() - 27, p2.getY() - 27, 63+3*x, 56+3*x);
        g.fillOval(p3.getX() - 27, p3.getY() - 27, 63+3*x, 56+3*x);
      
        
    }

}
