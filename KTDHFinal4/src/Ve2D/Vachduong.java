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
 * @author weedc
 */
public class Vachduong {
    public void vevach(Graphics g){
        g.setColor(Color.WHITE);
        Point1 p36 = new Point1(-5, 11);//ve duong
        Point1 p37 = new Point1(60,11);
        DuongThang d31 = new DuongThang(p36.getX(), p36.getY(), p37.getX(), p37.getY());
        d31.Veduongthang(g);  
    }
}

