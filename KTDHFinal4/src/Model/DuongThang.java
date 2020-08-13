/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Admin
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
public class DuongThang {
    private int x0; // toa do diem 1
    private int y0; // toa do diem 1
    private int x1; // toa do diem 2
    private int y1; // toa do diem 2

    public int getX0() {
        return x0;
    }

    public void setX0(int x0) {
        this.x0 = x0;
    }

    public int getY0() {
        return y0;
    }

    public void setY0(int y0) {
        this.y0 = y0;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

   

    public DuongThang() {
    }

    public DuongThang(int x0, int y0, int x1, int y1) {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
    }


    

   

public void Veduongthang(Graphics g){
             int dx,dy;
            float  x, y, Xinc, Yinc,steps;
            int tamx,tamy; 
            
            if(x0>x1||y0>y1){
            tamx=x0;
            x0=x1;
            x1=tamx;       
            tamy=y0;
            y0=y1;
            y1=tamy;          
           }            
            
            dy=y1-y0;
            dx=x1-x0;
         
            g.fillOval(x0,y0,5,5);
            if(dy>dx){
                steps=Math.abs(dy);
            }
            else{
                steps=Math.abs(dx);
            }
            x=x0;
            y=y0;
            Yinc=dy/steps;
            Xinc=dx/steps;         
            while(steps!=0){          
                  for(int i=0;i<5;i++){
                    steps--;
                    x=x+Xinc;
                    y=y+Yinc;
                    
                    g.fillOval(Math.round(x),Math.round(y),5,5);  
                    }
}
}
}
