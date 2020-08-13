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
public class Vatcan {
    public void vevatcan(Graphics g, Point1 x,Color c){
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(x.getX()+5, x.getY()+5, 16*15, 6*15);
        
        g.setColor(c);

        Point1 x1 = new Point1(x.getREALX()+3,x.getREALY());
        Point1 x2 = new Point1(x.getREALX()+3,x.getREALY()-1);
        Point1 x3 = new Point1(x.getREALX()+6,x.getREALY()-1);
        Point1 x4 = new Point1(x.getREALX()+6,x.getREALY());
        Point1 x5 = new Point1(x.getREALX()+10,x.getREALY());
        Point1 x6 = new Point1(x.getREALX()+10,x.getREALY()-1);
        Point1 x7 = new Point1(x.getREALX()+13,x.getREALY()-1);
        Point1 x8 = new Point1(x.getREALX()+13,x.getREALY());
        Point1 x9 = new Point1(x.getREALX()+16,x.getREALY());
        
        // điểm đối xứng 
        Point1 y = new Point1((x.getREALX()),-x.getREALY());
        Point1 y1 = new Point1(x1.getREALX(),-x1.getREALY());
        Point1 y2 = new Point1(x2.getREALX(),-x2.getREALY());
        Point1 y3 = new Point1(x3.getREALX(),-x3.getREALY());
        Point1 y4 = new Point1(x4.getREALX(),-x4.getREALY());
        Point1 y5 = new Point1(x5.getREALX(),-x5.getREALY());
        Point1 y6 = new Point1(x6.getREALX(),-x6.getREALY());
        Point1 y7 = new Point1(x7.getREALX(),-x7.getREALY());
        Point1 y8 = new Point1(x8.getREALX(),-x8.getREALY());
        Point1 y9 = new Point1((x9.getREALX()),-x9.getREALY());
    

        DuongThang dt = new DuongThang(x.getX(),x.getY(),x9.getX(),x9.getY());
        DuongThang dt1 = new DuongThang(x1.getX(),x1.getY(),x2.getX(),x2.getY());
        DuongThang dt2 = new DuongThang(x2.getX(),x2.getY(),x3.getX(),x3.getY());
        DuongThang dt3 = new DuongThang(x3.getX(),x3.getY(),x4.getX(),x4.getY());
        DuongThang dt4 = new DuongThang(x5.getX(),x5.getY(),x6.getX(),x6.getY());
        DuongThang dt5 = new DuongThang(x6.getX(),x6.getY(),x7.getX(),x7.getY());
        DuongThang dt6 = new DuongThang(x7.getX(),x7.getY(),x8.getX(),x8.getY());
        g.setColor(Color.BLACK);
        dt.Veduongthang(g);
        dt1.Veduongthang(g);
        dt2.Veduongthang(g);
        dt3.Veduongthang(g);
        dt4.Veduongthang(g);
        dt5.Veduongthang(g);
        dt6.Veduongthang(g);
        
        // ve duong thang doi xung

        DuongThang dtdx = new DuongThang(y.getX(),y.getY(),y9.getX(),y9.getY());
        DuongThang dtdx1 = new DuongThang(y1.getX(),y1.getY(),y2.getX(),y2.getY());
        DuongThang dtdx2 = new DuongThang(y2.getX(),y2.getY(),y3.getX(),y3.getY());
        DuongThang dtdx3 = new DuongThang(y3.getX(),y3.getY(),y4.getX(),y4.getY());
        DuongThang dtdx4 = new DuongThang(y5.getX(),y5.getY(),y6.getX(),y6.getY());
        DuongThang dtdx5 = new DuongThang(y6.getX(),y6.getY(),y7.getX(),y7.getY());
        DuongThang dtdx6 = new DuongThang(y7.getX(),y7.getY(),y8.getX(),y8.getY());
        g.setColor(Color.BLACK);
        dtdx.Veduongthang(g);
        dtdx1.Veduongthang(g);
        dtdx2.Veduongthang(g);
        dtdx3.Veduongthang(g);
        dtdx4.Veduongthang(g);
        dtdx5.Veduongthang(g);
        dtdx6.Veduongthang(g);
        g.setColor(Color.BLACK);
        DuongThang noid = new DuongThang(x.getX(),x.getY(),y.getX(),y.getY());
        DuongThang  noid1 = new DuongThang(x9.getX(),x9.getY(),y9.getX(),y9.getY());
        noid.Veduongthang(g);
        noid1.Veduongthang(g);
        
        g.setColor(Color.BLACK);
        g.fillRect(x1.getX()+5, x.getY()+2, 3*15, 1*15);
        g.fillRect(x5.getX()+5, x5.getY()+2, 3*15, 1*15);
        g.fillRect(y2.getX()+5, y2.getY()+2, 3*15, 1*15);
        g.fillRect(y6.getX()+5, y6.getY()+2, 3*15, 1*15);
        
        
    }
    
}
