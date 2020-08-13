/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ve2D;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author weedc
 */
public class fillrect {

    Boom boom = new Boom();
    BufferedImage Buferr = new BufferedImage(800, 800, BufferedImage.TYPE_INT_ARGB);
    Graphics BufGraphics = Buferr.getGraphics();

//    public void fillrect(Graphics g,Point1 tructhangtt,Point1 xett){   
//        
//        g.setColor(Color.cyan);    
//        g.fillRect(tructhangtt.getX() - 18 * 15,tructhangtt.getY() - 10 * 15, 390, 260); // truc thang
//        g.fillRect(xett.getX() , xett.getY() - 15 * 7, 400, 150);//che xe    
//        g.fillRect(xett.getX()-1*15 ,xett.getY(),35, 10); // che bô xe
//            
//    }
    public void fillTT(Graphics g, Point1 tructhangtt) {

        g.setColor(Color.cyan);
        g.fillRect(tructhangtt.getX() - 20 * 15, tructhangtt.getY() - 16 * 15, 430, 550); // truc thang

    }

    public void fillkhoixe(Graphics g, Point1 khoitt) {
        g.setColor(Color.GRAY);
        g.fillRect(khoitt.getX() - 25, khoitt.getY() - 20, 120, 50);
    }

    public void fillnha(Graphics g, Point1 nhatt) {
        g.setColor(Color.cyan);
        g.fillRect(nhatt.getX() - 15, nhatt.getY() - 15 * 20, 250, 301);//che nha
    }

    public void fillden(Graphics g, Point1 dentt) {
        g.setColor(Color.cyan);
        g.fillRect(dentt.getX() - 15 * 3, dentt.getY() - 15 * 14, 150, 211);//che den gt
    }

    public void fillgachduong(Graphics g, Point1 gachduongtt) {
        g.setColor(Color.gray);
        g.fillRect(gachduongtt.getX(), gachduongtt.getY(), 120, 30);
    }

    public void fillcay(Graphics g, Point1 cay1tt) {
        g.setColor(Color.cyan);
        g.fillRect(cay1tt.getX() - 4 * 15, cay1tt.getY() - 15 * 13, 170, 196);//che cay  
    }

    public void fillBomNo(Graphics g, Point1 nobom) {
        g.setColor(Color.GRAY);
        g.fillRect(nobom.getX() - 3 * 15, nobom.getY() - 6 * 15, 150, 50);

    }

    public void fillXe(Graphics g, Point1 xe) {
        g.setColor(Color.CYAN);
        g.fillRect(xe.getX() + 4 * 15, xe.getY() - 8 * 15, 220, 70);

    }

    public void fillDuong(Graphics g, Point1 duong) {
        g.setColor(Color.gray);
        g.fillRect(duong.getX(), duong.getY(), 900, 265);
    }

}
