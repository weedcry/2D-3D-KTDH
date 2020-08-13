/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ve2D;

import Model.Netvongtron;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author weedc
 */
public class May {

    public void Vemay(Graphics2D g, Point1 ptmay, Color c, Color c1) {
        g.setColor(c);
        // Point1 ptmay1 = new Point1(46,44);
        Point1 ptmay1 = new Point1(ptmay.getREALX() + 2, ptmay.getREALY());
        Point1 ptmay2 = new Point1(ptmay.getREALX() + 4, ptmay.getREALY());

        Netvongtron may = new Netvongtron(ptmay.getX(), ptmay.getY(), 2, 1);
        may.VeNetvongtron(g);
        Netvongtron may1 = new Netvongtron(ptmay.getX(), ptmay.getY(), 2, 3);
        may1.VeNetvongtron(g);
        Netvongtron may2 = new Netvongtron(ptmay.getX(), ptmay.getY(), 2, 4);
        may2.VeNetvongtron(g);

        Netvongtron may3 = new Netvongtron(ptmay1.getX(), ptmay1.getY(), 3, 1);
        may3.VeNetvongtron(g);
        Netvongtron may4 = new Netvongtron(ptmay1.getX(), ptmay1.getY(), 2, 3);
        may4.VeNetvongtron(g);

        Netvongtron may5 = new Netvongtron(ptmay2.getX(), ptmay2.getY(), 2, 1);
        may5.VeNetvongtron(g);
        Netvongtron may6 = new Netvongtron(ptmay2.getX(), ptmay2.getY(), 2, 3);
        may6.VeNetvongtron(g);
        Netvongtron may7 = new Netvongtron(ptmay2.getX(), ptmay2.getY(), 2, 2);
        may7.VeNetvongtron(g);

        g.setColor(c1);
        g.fillOval(ptmay.getX() - 4, ptmay.getY() - 41, 73, 72);
        g.fillOval(ptmay1.getX() + 1, ptmay1.getY() - 29, 60, 60);
        g.fillOval(ptmay.getX() - 26, ptmay.getY() - 29, 60, 60);

    }

}
