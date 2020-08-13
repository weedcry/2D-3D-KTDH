/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ve2D;

import Model.DuongTron;
import Model.Netvongtron;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author weedc
 */
public class Khoi {

    public void vekhoi(Graphics2D g, Point1 p) {
        g.setColor(Color.WHITE);
        Netvongtron nvt = new Netvongtron(p.getX() + 22, p.getY(), 1, 1);
        Netvongtron nvt2 = new Netvongtron(p.getX() + 22, p.getY(), 1, 2);
        Netvongtron nvt3 = new Netvongtron(p.getX() + 22, p.getY(), 1, 3);
        nvt.VeNetvongtron(g);
        nvt2.VeNetvongtron(g);
        nvt3.VeNetvongtron(g);
//        
        Netvongtron nvt4 = new Netvongtron(p.getX() + 10, p.getY(), 1, 3);
        Netvongtron nvt5 = new Netvongtron(p.getX() + 10, p.getY() - 5, 1, 1);
        nvt4.VeNetvongtron(g);
        nvt5.VeNetvongtron(g);

        Netvongtron nvt6 = new Netvongtron(p.getX(), p.getY() - 5, 1, 1);
        Netvongtron nvt7 = new Netvongtron(p.getX() - 2, p.getY(), 1, 4);
        Netvongtron nvt8 = new Netvongtron(p.getX(), p.getY() + 5, 1, 3);
        nvt6.VeNetvongtron(g);
        nvt7.VeNetvongtron(g);
        nvt8.VeNetvongtron(g);
        g.setColor(Color.WHITE);
        g.fillOval(p.getX() - 13, p.getY() - 14, 35, 35);
        g.fillOval(p.getX() - 3, p.getY() - 16, 40, 40);
    }

}
