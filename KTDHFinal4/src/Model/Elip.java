/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author Admin
 */
public class Elip {
   private int x; // toa do tam
    private int y; // toa do tam
    private int r1; // ban kinh truc ngang
    private int r2; // ban kinh truc doc

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getR1() {
        return r1;
    }
    
      public int getR2() {
        return r2;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setR1(int r1) {
        this.r1 = r1;
    }

     public void setR2(int r2) {
        this.r2 = r2;
    }

    public Elip() {
    }

    public Elip(int x, int y, int r1, int r2) {
        this.x = x;
        this.y = y;
        this.r1 = r1*15;
        this.r2 = r2*15;
    }
   public void Elip(Graphics2D g)
   {
                  float p,a2,b2;
                  int xc,yc;
                  a2=r1*r1;
                  b2=r2*r2;
                  xc=0;
                  yc=r2;
                  p=2*((float)b2/a2)-(2*r2)+1;
                  
                  // ve net lien
                   xc=0;
                   yc=r2;
                   p=2*((float)b2/a2)-(r2<<1)+1;
                    //ve nhanh tu tren xuong
                    while(((float)b2/a2)*xc<=yc)
                    {
                        Ve4duong(g,xc,yc);
                        if(p<0)
                        {
                            p=p+2*((float)b2/a2)*((xc<<1)+3);
                        }
                        else{
                            p= p- (yc<<2) + 2*((float)b2/a2)*((xc<<1)+3);
                            yc--;
                        }
                        xc++;
                    }
                     //ve nhanh dưới lên         
                    yc=0;
                    xc=r1;
                    p=2*((float)a2/b2)-(r1<<1)+1;
                    while(((float)a2/b2)*yc<=xc)
                    {
                        Ve4duong(g,xc,yc);
                        if(p<0)
                        {
                            p=p +2*((float)a2/b2)*((yc<<1)+3);
                        }
                        else
                        {
                           // p=p- 4*xc + 2*((float)a2/b2)*(2*yc+3);
                            p=p- (xc<<2) + 2*((float)a2/b2)*((yc<<1)+3);
                            xc=xc-1;
                        }
                        yc=yc+1;
                    } 
                  
      }        

  private void Ve4duong(Graphics2D g,int xc,int yc){
             g.fillOval(x+xc, y+yc,5,5); //dưới phải
             g.fillOval(x-xc, y+yc,5,5); //dưới trái
             g.fillOval(x-xc, y-yc,5,5);//trên trái
             g.fillOval(x+xc, y-yc,5,5);//trên phải
            
       }
}
