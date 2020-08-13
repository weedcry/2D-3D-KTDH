/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ve2D;

import static Ve2D.Tructhang.pt1;
import View.Forrm;
import com.sun.corba.se.impl.oa.toa.TOA;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.text.AttributedCharacterIterator;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class chuyendong {

    static int b[];
    final int tong = 160;
    Thread th = new Thread();
    CdCay cay = new CdCay();
    CdVach cv = new CdVach();
    Vachduong vd = new Vachduong();
    Tructhang tt = new Tructhang();
    May may = new May();
    Xe xe = new Xe();
    Boom boom = new Boom();
    CdDen den = new CdDen();
    CdNha nha = new CdNha();
    Khoi khoi = new Khoi();
    Vatcan vatcan = new Vatcan();
    fillrect fr = new fillrect();
    Point1 ttPoint = new Point1(10, 33); // trực thăng
    Point1 xePoint = new Point1(1, 1); // xe oto
    Point1 mayPoint = new Point1(58, 46); // may 1
    Point1 mayPoint2 = new Point1(88, 46); // may 2
    Point1 boomPoint1 = new Point1(36, 29); // boom 1
    Point1 boomPoint2 = new Point1(36, 29); // boom 2
    Point1 boomPoint3 = new Point1(36, 29); // boom 3
    Point1 boomPoint4 = new Point1(32, 29); // boom 4
    Point1 noboomPoint1 = new Point1(34, 1); // no boom 1
    Point1 noboomPoint2 = new Point1(34, 5); // no boom 2
    Point1 noboomPoint3 = new Point1(34, 4); // no boom 3
    Point1 noboomPoint4 = new Point1(30, 4); // no boom 4
    Point1 cay1Point = new Point1(30, 11);
    Point1 khoiPoint1 = new Point1(18, 3); // khoi xe
    Point1 khoiPoint2 = new Point1(18, 3); // khoi xe
    Point1 gachduong = new Point1(3, -2);
    Point1 gachduong1 = new Point1(23, -2);
    Point1 gachduong2 = new Point1(43, -2);
    Point1 denPoint = new Point1(10, 11);
    Point1 nhaPoint = new Point1(50, 11);
    Point1 duong = new Point1(-5, 11);
    Point1 banh = new Point1(18, 1); // trực thăng
    Point1 vatcanpoint = new Point1(54,3);
    Point1 khoivatcan1 = new Point1(vatcanpoint.getREALX(), 0); // khoi xe
    Point1 khoivatcan2 = new Point1(vatcanpoint.getREALX()+4, -2); // khoi xe
    Quay q = new Quay();
    
   

    public void CD1(Graphics g, int n, Forrm fm) {

        try {
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                BufferedImage Buferr = new BufferedImage(850, 850, BufferedImage.TYPE_INT_ARGB);
                Graphics BufGraphics = Buferr.getGraphics();
                ttPoint = new Point1(ttPoint.getREALX(), ttPoint.getREALY());
                xePoint = new Point1(xePoint.getREALX(), xePoint.getREALY());
                mayPoint = new Point1(mayPoint.getREALX(), mayPoint.getREALY());
                boomPoint1 = new Point1(boomPoint1.getREALX(), boomPoint1.getREALY());
                boomPoint2 = new Point1(boomPoint2.getREALX(), boomPoint2.getREALY());
                boomPoint3 = new Point1(boomPoint3.getREALX(), boomPoint3.getREALY());
                boomPoint4 = new Point1(boomPoint4.getREALX(), boomPoint4.getREALY());
                
                while (flag) {

                    //mây
                    may.Vemay((Graphics2D) BufGraphics, mayPoint, Color.CYAN, Color.cyan);
                    may.Vemay((Graphics2D) BufGraphics, new Point1(mayPoint.getREALX() + 10, mayPoint.getREALY() - 3), Color.CYAN, Color.cyan);
                    may.Vemay((Graphics2D) BufGraphics, mayPoint2, Color.cyan, Color.cyan);
                    may.Vemay((Graphics2D) BufGraphics, new Point1(mayPoint2.getREALX() + 10, mayPoint2.getREALY() - 3), Color.cyan, Color.cyan);
                    //bom roi lan 1

                    if (i > 35 && i <= 48) {
                        boom.boom((Graphics2D) BufGraphics, boomPoint1, Color.CYAN, Color.CYAN, Color.CYAN);
                    }
                    //bom roi lan 2
                    if (i > 55 && i <= 64) {
                        boom.boom((Graphics2D) BufGraphics, boomPoint2, Color.CYAN, Color.CYAN, Color.CYAN);
                    }
                    //bom roi lan 3
                    if (i > 62 && i <= 73) {
                        boom.boom((Graphics2D) BufGraphics, boomPoint3, Color.CYAN, Color.CYAN, Color.CYAN);
                    }
                    //bomroi lan 4
                    if (i >= 125 && i < 136) {
                        boom.boom((Graphics2D) BufGraphics, boomPoint4, Color.CYAN, Color.CYAN, Color.CYAN);
                    }
                    //no obm di chuyen 1
                    if (i >= 65 && i <= 90) {
                        boom.noboom(BufGraphics, noboomPoint2, Color.GRAY, Color.GRAY, 0);
                    }

                    //no bom di chuyen 2
                    if (i >= 65 && i <= 90) {
                        boom.noboom(BufGraphics, noboomPoint2, Color.CYAN, Color.cyan, 0);

                    }
                    //no bom di chuyen 3
                    if (i >= 74 && i <= 100) {
                        boom.noboom(BufGraphics, noboomPoint3, Color.GRAY, Color.GRAY, 0);
                    }
                    //no bom di chuyen 4
                    if (i >= 136 && i <= 160) {
                        boom.noboom(BufGraphics, noboomPoint4, Color.GRAY, Color.GRAY, 0);
                    }
                    if (i < 43 && i > 58) {
                        xe.Vexe(BufGraphics, xePoint, Color.GRAY, Color.GRAY, Color.GRAY, Color.GRAY, Color.GRAY);
//                     xe.Vexe(BufGraphics, xePoint,  Color.cyan, Color.cyan, Color.cyan,  Color.cyan,  Color.cyan);     
                    }
                    if (i >= 58 && i <= 64) {
                        xe.Vexe(BufGraphics, xePoint, Color.cyan, Color.cyan, Color.cyan, Color.cyan, Color.cyan);
                    }
                    if(i>63&&i<90){
                        vatcan.vevatcan(BufGraphics,vatcanpoint, Color.GRAY);
                    }
                    
                    flag = false;

                }
                while (!flag) {

                    ttPoint = new Point1(ttPoint.getREALX(), ttPoint.getREALY());
                    if (i >= 43 && i <= 58) {
                        fr.fillXe(BufGraphics, xePoint);

                    }
                    //duong
                    fr.fillDuong(BufGraphics, duong);
                    vd.vevach(BufGraphics);

                    //fillrect 
                    fr.fillTT(BufGraphics, ttPoint);
                    //gach ke duong             
                    fr.fillgachduong(BufGraphics, gachduong);
                    fr.fillgachduong(BufGraphics, gachduong1);
                    fr.fillgachduong(BufGraphics, gachduong2);

                    cv.Vevach(BufGraphics, gachduong, Color.red);
                    cv.Vevach(BufGraphics, gachduong1, Color.red);
                    cv.Vevach(BufGraphics, gachduong2, Color.red);

                    gachduong.setX(gachduong.getREALX() - 1);
                    gachduong1.setX(gachduong1.getREALX() - 1);
                    gachduong2.setX(gachduong2.getREALX() - 1);

                    if (gachduong.getREALX() < -7) {
                        gachduong.setX(53);
                    }
                    if (gachduong1.getREALX() < -7) {
                        gachduong1.setX(53);
                    }
                    if (gachduong2.getREALX() < -7) {
                        gachduong2.setX(53);
                    }

                    // may chuyen dong
                    mayPoint.setX(mayPoint.getREALX() - 1);
                    may.Vemay((Graphics2D) BufGraphics, mayPoint, Color.white, Color.blue);
                    may.Vemay((Graphics2D) BufGraphics, new Point1(mayPoint.getREALX() + 10, mayPoint.getREALY() - 3), Color.white, Color.blue);
                    mayPoint2.setX(mayPoint2.getREALX() - 1);
                    may.Vemay((Graphics2D) BufGraphics, mayPoint2, Color.white, Color.blue);
                    may.Vemay((Graphics2D) BufGraphics, new Point1(mayPoint2.getREALX() + 10, mayPoint2.getREALY() - 3), Color.white, Color.blue);

                    if (mayPoint.getREALX() < -16) {
                        mayPoint.setX(53);
                    }
                    if (mayPoint2.getREALX() < -16) {
                        mayPoint2.setX(53);
                    }
                    // cay chuyen dong    

                    fr.fillcay(BufGraphics, cay1Point);
                    cay1Point.setX(cay1Point.getREALX() - 1);
                    cay.veCay(BufGraphics, cay1Point, Color.black);
                    if (cay1Point.getREALX() < -10) {
                        cay1Point.setX(53);
                    }
                    // den giao thong
                    fr.fillden(BufGraphics, denPoint);
                    den.veDen(BufGraphics, denPoint, Color.black);
                    denPoint.setX(denPoint.getREALX() - 1);
                    if (denPoint.getREALX() < -50) {
                        denPoint.setX(53);
                    }
                    // nha
                    fr.fillnha(BufGraphics, nhaPoint);
                    nha.veNha(BufGraphics, nhaPoint, Color.black);
                    nhaPoint.setX(nhaPoint.getREALX() - 1);
                    if (nhaPoint.getREALX() < -80) {
                        nhaPoint.setX(53);
                    }

                    // xe di chuyen thang 
                    if (i < 20) {
                        //  fr.fillxe(BufGraphics, xePoint);
                        Color c1 = new Color(255, 215, 0);
                        xePoint.setX(xePoint.getREALX() + 1);
                        banh.setX(banh.getREALX() + 1);
                        xe.Vexe(BufGraphics, xePoint, Color.black, c1, Color.GRAY, Color.WHITE, Color.WHITE);
                    }
                    // truc thang di thẳng
                    if (i > 5 && i < 34) {
                        ttPoint.setX(ttPoint.getREALX() + 1);

                        tt.vetructhang((Graphics2D) BufGraphics, ttPoint, Color.black);

                    }
                    //xe di chuyen len 22-27
                    if (i >= 36 && i < 43) {
                        //   fr.fillxe(BufGraphics, xePoint);

                        Color c1 = new Color(255, 215, 0);
                        xePoint.setY(xePoint.getREALY() + 1);
                        banh.setY(banh.getREALY() + 1);
                        xe.Vexe(BufGraphics, xePoint, Color.black, c1, Color.GRAY, Color.WHITE, Color.WHITE);
                        vd.vevach(BufGraphics);
                    }

                    //xe di chuyen xuong lần 1
                    if (i >= 58 && i < 65) {

                        Color c1 = new Color(255, 215, 0);
                        xePoint.setY(xePoint.getREALY() - 1);
                        banh.setY(banh.getREALY() - 1);
                        xe.Vexe(BufGraphics, xePoint, Color.black, c1, Color.GRAY, Color.WHITE, Color.WHITE);
                        vd.vevach(BufGraphics);
                    }
                    
                    // khoi cua vat can

                    if(i>69&&i<75){
                       if(i==75||i==83||i==93||i==103||i==113||i==123){
                        khoivatcan1.setY(0);
                        khoivatcan2.setY(-2);
                       }
                        khoivatcan1.setX(khoivatcan1.getREALX()-1);
                        khoivatcan1.setY(khoivatcan1.getREALY()+1);
                        khoivatcan2.setX(khoivatcan2.getREALX()-1);
                        khoivatcan2.setY(khoivatcan2.getREALY()+1);                        
                        khoi.vekhoi((Graphics2D) BufGraphics, khoivatcan1);
                        khoi.vekhoi((Graphics2D) BufGraphics, khoivatcan2);                        
                    }
                    if(i>=98&&i<130){
                       if(i==75||i==83||i==93||i==103||i==113||i==123){
                        khoivatcan1.setY(0);
                        khoivatcan2.setY(-2);
                       }
                        khoivatcan1.setX(khoivatcan1.getREALX()-1);
                        khoivatcan1.setY(khoivatcan1.getREALY()+1);
                        khoivatcan2.setX(khoivatcan2.getREALX()-1);
                        khoivatcan2.setY(khoivatcan2.getREALY()+1);                        
                        khoi.vekhoi((Graphics2D) BufGraphics, khoivatcan1);
                        khoi.vekhoi((Graphics2D) BufGraphics, khoivatcan2);                        
                    }
                    if(i>=75&&i<98){
                       if(i==75||i==83||i==93||i==103||i==113||i==123){
                        khoivatcan1.setY(0);
                        khoivatcan2.setY(-2);
                       }
                        khoivatcan1.setX(khoivatcan1.getREALX()-2);
                        khoivatcan1.setY(khoivatcan1.getREALY()+1);
                        khoivatcan2.setX(khoivatcan2.getREALX()-2);
                        khoivatcan2.setY(khoivatcan2.getREALY()+1);                        
                        khoi.vekhoi((Graphics2D) BufGraphics, khoivatcan1);
                        khoi.vekhoi((Graphics2D) BufGraphics, khoivatcan2);                        
                    }
                    
                    //vat can xuat hien
                    if(i>63&&i<75){
                        vatcanpoint.setX(vatcanpoint.getREALX()-1);
                        vatcan.vevatcan(BufGraphics,vatcanpoint, Color.red);
                    }
                    if(i>=98&&i<130){
                        vatcanpoint.setX(vatcanpoint.getREALX()-1);
                        vatcan.vevatcan(BufGraphics,vatcanpoint, Color.red);
                    }
                    if(i>=75&&i<98){
                        vatcanpoint.setX(vatcanpoint.getREALX()-2);
                        vatcan.vevatcan(BufGraphics,vatcanpoint, Color.red);
                    }

                    //xe di chuyen lui 60-67
                    if (i >= 65 && i <= 77) {
                        // fr.fillxe(BufGraphics, xePoint);
                        Color c1 = new Color(255, 215, 0);
                        xePoint.setX(xePoint.getREALX() - 2);
                        banh.setX(banh.getREALX() - 2);
                        xe.Vexe(BufGraphics, xePoint, Color.black, c1, Color.GRAY, Color.WHITE, Color.WHITE);
                    }
                    // truc thang di lùi
                    if (i > 73 && i < 98) {
                        ttPoint.setX(ttPoint.getREALX() - 1);

                        tt.vetructhang((Graphics2D) BufGraphics, ttPoint, Color.black);
                    }

                    //no bom di chuyen 2
                    if (i >= 65 && i <= 90) {

                        cay.veCay(BufGraphics, cay1Point, Color.black);
                        vd.vevach(BufGraphics);
                        noboomPoint2.setX(noboomPoint2.getREALX() - 2);
                        boom.noboom(BufGraphics, noboomPoint2, Color.black, Color.RED, 65 - i);

                    }

                    //xe di chuyen xuong lần 2
                    if (i >= 78 && i < 83) {
                        Color c1 = new Color(255, 215, 0);
                        xePoint.setX(xePoint.getREALX() - 1);
                        xePoint.setY(xePoint.getREALY() - 1);
                        banh.setX(banh.getREALX() - 1);
                        banh.setY(banh.getREALY() - 1);
                        xe.Vexe(BufGraphics, xePoint, Color.black, c1, Color.GRAY, Color.WHITE, Color.WHITE);
                    }
                    // xe di chuyen thang 2
                    if (i >= 83 && i < 108) {
                        Color c1 = new Color(255, 215, 0);
                        //  fr.fillxe(BufGraphics, xePoint);
                        xePoint.setX(xePoint.getREALX() + 1);
                        banh.setX(banh.getREALX() + 1);
                        xe.Vexe(BufGraphics, xePoint, Color.black, c1, Color.GRAY, Color.WHITE, Color.WHITE);
                    }
                    // truc thang di thẳng
                    if (i >= 115 && i < 125) {
                        ttPoint.setX(ttPoint.getREALX() + 2);
                        tt.vetructhang((Graphics2D) BufGraphics, ttPoint, Color.black);
                    }
                    //xe đi thẳng lên 
                    if (i > 108 && i < 116) {
                        xePoint.setX(xePoint.getREALX() + 1);
                        xePoint.setY(xePoint.getREALY() + 1);
                        Color c1 = new Color(255, 215, 0);
                        banh.setX(banh.getREALX() + 1);
                        banh.setY(banh.getREALY() + 1);
                        xe.Vexe(BufGraphics, xePoint, Color.black, c1, Color.GRAY, Color.WHITE, Color.WHITE);
                    }
                    //xe đi thẳng 3
                    if (i > 126 && i < 160) {
                        Color c1 = new Color(255, 215, 0);
                        fr.fillkhoixe(BufGraphics, khoiPoint1);
                        khoi.vekhoi((Graphics2D) BufGraphics, khoiPoint1);
                        khoiPoint1.setX(khoiPoint1.getREALX() - 1);
                        if (i > 128) {
                            khoi.vekhoi((Graphics2D) BufGraphics, khoiPoint2);
                            khoiPoint2.setX(khoiPoint2.getREALX() - 1);;
                        }
                        xePoint.setX(xePoint.getREALX() + 2);
                        banh.setX(banh.getREALX() + 2);
                        xe.Vexe(BufGraphics, xePoint, Color.black, c1, Color.GRAY, Color.WHITE, Color.WHITE);
                    }

                    // truc thang di lùi 2
                    if (i >= 131 && i < 160) {
                        ttPoint.setX(ttPoint.getREALX() - 2);
                        tt.vetructhang((Graphics2D) BufGraphics, ttPoint, Color.black);
                    }

                    

                    //no bom di chuyen 1
                    if (i >= 49 && i <= 85) {
                        noboomPoint1.setX(noboomPoint1.getREALX() - 2);
                        boom.noboom(BufGraphics, noboomPoint1, Color.black, Color.RED, 49 - i);
                        //  
                    }

                    //bom roi lan 2
                    if (i > 55 && i <= 63) {

                        boomPoint2.setY(boomPoint2.getREALY() - 2);
                        boom.boom((Graphics2D) BufGraphics, boomPoint2, Color.BLACK, Color.red, Color.yellow);
                    }
                    //hieu ung boom no lan 2
//                    if (i == 64) {
//                        boom.hieuungnoboom(BufGraphics, noboomPoint2, Color.black);
//                    }

                    //bom roi lan 3
                    if (i > 62 && i <= 73) {

                        boomPoint3.setY(boomPoint3.getREALY() - 2);
                        boom.boom((Graphics2D) BufGraphics, boomPoint3, Color.BLACK, Color.red, Color.yellow);
                    }
                    
                    //no bom di chuyen 3
                    if (i >= 74 && i <= 100) {
                        noboomPoint3.setX(noboomPoint3.getREALX() - 2);
                        boom.noboom(BufGraphics, noboomPoint3, Color.black, Color.RED, 74 - i);
                        vd.vevach(BufGraphics);
                    }
                    //bom roi lan 4
                    if (i >= 125 && i < 136) {
                        boomPoint4.setY(boomPoint4.getREALY() - 2);
                        boom.boom((Graphics2D) BufGraphics, boomPoint4, Color.BLACK, Color.red, Color.yellow);
                    }
                    //hieu ung boom no lan 4
                  
                    //no bom di chuyen 4
                    if (i >= 136 && i <= 160) {
                        noboomPoint4.setX(noboomPoint4.getREALX() - 2);
                        boom.noboom(BufGraphics, noboomPoint4, Color.black, Color.RED, 136 - i);
                    }

                    Color c1 = new Color(255, 215, 0);

                    tt.vetructhang((Graphics2D) BufGraphics, ttPoint, Color.black);
                    xe.Vexe(BufGraphics, new Point1(xePoint.getREALX(), xePoint.getREALY()), Color.black, c1, Color.BLACK, Color.WHITE, Color.WHITE);
                    //bom roi xuong lan 1
                    if (i > 35 && i <= 48) {

                        boomPoint1.setY(boomPoint1.getREALY() - 2);
                        boom.boom((Graphics2D) BufGraphics, boomPoint1, Color.BLACK, Color.red, Color.yellow);

                    }
                    q.Xoayxe(BufGraphics, banh, i);

                    g.drawImage(Buferr, 0, 0, null);
                    flag = true;
                    Thread.sleep(70);
                    Graphics p = fm.JToaDo.getGraphics();
                    VeToaDo(p, fm);

                }

            }
        } catch (InterruptedException e) {
        }

    }

    public void VeToaDo(Graphics p, Forrm fm) {
        p = fm.JToaDo.getGraphics();
        Point1 p10 = new Point1(xePoint.getREALX() + 17, xePoint.getREALY());//ve banh trc
        Point1 p2 = new Point1(xePoint.getREALX(), xePoint.getREALY() + 3);//duoi xe 2
        Point1 p11 = new Point1(xePoint.getREALX() + 6, xePoint.getREALY());//ve banh sau
        Point1 p7 = new Point1(xePoint.getREALX() + 26, xePoint.getREALY() + 3);//dau xe
        Point1 p8 = new Point1(xePoint.getREALX() + 26, xePoint.getREALY());//dau xe
        Point1 pt1 = new Point1(ttPoint.getREALX(), ttPoint.getREALY() + 8);//canh trươc
        Point1 pt7 = new Point1(ttPoint.getREALX() - 16, ttPoint.getREALY() - 1);//canh sau
        Point1 p33 = new Point1(cay1Point.getREALX() + 1, cay1Point.getREALY() + 13);//dỉnh cây
        Point1 p26 = new Point1(cay1Point.getREALX() + 2, cay1Point.getREALY());//gốc cây
        Point1 p53 = new Point1(nhaPoint.getREALX() + 7, nhaPoint.getREALY() + 19);//goc nhà1
        Point1 p46 = new Point1(nhaPoint.getREALX() + 14, nhaPoint.getREALY());//gocnha2

        BufferedImage Buf = new BufferedImage(400, 600, BufferedImage.TYPE_INT_ARGB);
        Graphics BufG = Buf.getGraphics();

        Color c10 = new Color(183, 183, 183);
        BufG.setColor(c10);
        //che
        BufG.fillRect(100, 70, 110, 20);//duoi xe1
        BufG.fillRect(250, 70, 110, 20);//duoi xe2
        BufG.fillRect(175, 100, 150, 20);//banh xe truoc
        BufG.fillRect(175, 130, 150, 20);//banh xe sau
        BufG.fillRect(100, 160, 110, 20);//đàu xe1
        BufG.fillRect(250, 160, 110, 20);//đàu xe2

        BufG.fillRect(175, 235, 190, 20);//thân tt
        BufG.fillRect(175, 265, 190, 20);//canh trc
        BufG.fillRect(175, 295, 155, 20);//canh sau

        BufG.fillRect(100, 365, 110, 20);//đỉnh cây
        BufG.fillRect(100, 395, 110, 20);//gốc cây1
        BufG.fillRect(250, 395, 110, 20);//gốc cây2

        BufG.fillRect(100, 465, 110, 20);//nóc nhà
        BufG.fillRect(100, 495, 110, 20);//nóc nhà
        BufG.fillRect(250, 495, 110, 20);//nóc nhà
        //vẽ tọa độ
        BufG.setColor(Color.BLACK);
        BufG.setFont(new Font("", 100, 25));
        BufG.drawString("THÔNG TIN TỌA ĐỘ", 100, 25);
        BufG.drawString("Xe hơi", 170, 55);
        BufG.drawString("Trực Thăng", 150, 220);
        BufG.drawString("Cây", 150, 350);
        BufG.drawString("Nhà", 150, 450);

        BufG.setColor(Color.BLACK);
        BufG.setFont(new Font("", 100, 18));
        BufG.drawString("Đuôi xe:", 20, 85);
        BufG.drawString("Bánh xe trước:", 20, 115);
        BufG.drawString("Bánh xe sau:", 20, 145);
        BufG.drawString("Đầu xe:", 20, 175);

        BufG.drawString("Thân trực thăng:", 20, 250);
        BufG.drawString("Cánh trước:", 20, 285);
        BufG.drawString("Cánh sau:", 20, 315);

        BufG.drawString("Đỉnh cây:", 20, 380);
        BufG.drawString("Gốc cây:", 20, 410);

        BufG.drawString("Nóc nhà:", 20, 480);
        BufG.drawString("Gốc nhà:", 20, 510);
        //Xe
        BufG.drawString("(X=" + xePoint.getREALX() + ",Y=" + xePoint.getREALY() + ")", 100, 85);//duoi xe
        BufG.drawString("(X=" + p2.getREALX() + ",Y=" + p2.getREALY() + ")", 250, 85);//duoi xe
        BufG.drawString("(X=" + p10.getREALX() + ",Y=" + p10.getREALY() + ",R=2)", 175, 115);//banh xe trc
        BufG.drawString("(X=" + p11.getREALX() + ",Y=" + p11.getREALY() + ",R=1)", 175, 145);//banh sau
        BufG.drawString("(X=" + p7.getREALX() + ",Y=" + p7.getREALY() + ")", 100, 175);//dau xe1
        BufG.drawString("(X=" + p8.getREALX() + ",Y=" + p8.getREALY() + ")", 250, 175);//dau xe2
        //Trực thăng
        BufG.drawString("(X=" + ttPoint.getREALX() + ",Y=" + ttPoint.getREALY() + ",W=6,H=4)", 175, 250);//than tt
        BufG.drawString("(X=" + pt1.getREALX() + ",Y=" + pt1.getREALY() + ",W=4,H=2)", 175, 280);//canh trước
        BufG.drawString("(X=" + pt7.getREALX() + ",Y=" + pt7.getREALY() + ",R=2)", 175, 310);//canh sau
        //cây
        BufG.drawString("(X=" + p33.getREALX() + ",Y=" + p33.getREALY() + ")", 100, 380);//đỉnh cây
        BufG.drawString("(X=" + cay1Point.getREALX() + ",Y=" + cay1Point.getREALY() + ")", 100, 410);//gốc cây1
        BufG.drawString("(X=" + p26.getREALX() + ",Y=" + p26.getREALY() + ")", 250, 410);//gốc cây2
        //nhà
        BufG.drawString("(X=" + p53.getREALX() + ",Y=" + p53.getREALY() + ")", 100, 480);//nóc nhà
        BufG.drawString("(X=" + nhaPoint.getREALX() + ",Y=" + nhaPoint.getREALY() + ")", 100, 510);//gốc nhà
        BufG.drawString("(X=" + nhaPoint.getREALX() + ",Y=" + nhaPoint.getREALY() + ")", 250, 510);//gốc nhà
        p.drawImage(Buf, 0, 0, null);
    }

}
