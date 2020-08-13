
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ve3d;

import Model.DuongThang;
import Model.NetDuc;
import View.Forrm;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

/**
 *
 * @author KHIEM PC
 */
public class HinhHop {

    private int dai;
    private int rong;
    private int cao;

    public HinhHop(int dai, int rong, int cao) {
        this.dai = dai;
        this.rong = rong;
        this.cao = cao;
    }

    public void setDai(int dai) {
        this.dai = dai;
    }

    public void setRong(int rong) {
        this.rong = rong;
    }

    public void setCao(int cao) {
        this.cao = cao;
    }

    public int getDai() {
        return dai;
    }

    public int getRong() {
        return rong;
    }

    public int getCao() {
        return cao;
    }

    public void VeHinh(Graphics2D p, int x, int y, int z, Forrm fm, int i) {
        p.setColor(Color.black);
        p.setFont(new java.awt.Font("", 1, 15));
        Point3d a1 = new Point3d(0 + x, 0 + y, 0 + z);
        Point3d b1 = new Point3d(dai + x, 0 + y, 0 + z);
        Point3d d1 = new Point3d(0 + x, rong + y, 0 + z);
        Point3d c1 = new Point3d(dai + x, rong + y, 0 + z);

        Point3d a2 = new Point3d(0 + x, 0 + y, cao + z);
        Point3d b2 = new Point3d(dai + x, 0 + y, cao + z);
        Point3d d2 = new Point3d(0 + x, rong + y, cao + z);
        Point3d c2 = new Point3d(dai + x, rong + y, cao + z);

        Cabinet cb1 = new Cabinet(a1.getX(), a1.getY(), a1.getZ());
        Point2d A1 = cb1.ChuyenSang2d();

        p.drawString("A" + i, A1.getX() + 3, A1.getY() - 3);

        Cabinet cb2 = new Cabinet(b1.getX(), b1.getY(), b1.getZ());
        Point2d B1 = cb2.ChuyenSang2d();
        p.drawString("B" + i, B1.getX() + 10, B1.getY() - 3);

        Cabinet cb3 = new Cabinet(c1.getX(), c1.getY(), c1.getZ());
        Point2d C1 = cb3.ChuyenSang2d();
        p.drawString("C" + i, C1.getX() - 10, C1.getY() + 15);

        Cabinet cb4 = new Cabinet(d1.getX(), d1.getY(), d1.getZ());
        Point2d D1 = cb4.ChuyenSang2d();
        p.drawString("D" + i, D1.getX() - 10, D1.getY() + 15);

        Cabinet cb5 = new Cabinet(a2.getX(), a2.getY(), a2.getZ());
        Point2d A2 = cb5.ChuyenSang2d();
        p.drawString("A'" + i, A2.getX() + 3, A2.getY() - 3);

        Cabinet cb6 = new Cabinet(b2.getX(), b2.getY(), c2.getZ());
        Point2d B2 = cb6.ChuyenSang2d();
        p.drawString("B'" + i, B2.getX() + 3, B2.getY() - 3);

        Cabinet cb7 = new Cabinet(c2.getX(), c2.getY(), c2.getZ());
        Point2d C2 = cb7.ChuyenSang2d();
        p.drawString("C'" + i, C2.getX() - 10, C2.getY() - 3);

        Cabinet cb8 = new Cabinet(d2.getX(), d2.getY(), d2.getZ());
        Point2d D2 = cb8.ChuyenSang2d();
        p.drawString("D'" + i, D2.getX() - 10, D2.getY() - 3);
        // VE A1B1;
        NetDuc A1B1 = new NetDuc(A1.getX(), A1.getY(), B1.getX(), B1.getY());
        A1B1.Netdut(p);
        // V3 B1C1;
        DuongThang B1C1 = new DuongThang(B1.getX(), B1.getY(), C1.getX(), C1.getY());
        B1C1.Veduongthang(p);
        // VE C1D1;
        DuongThang D1C1 = new DuongThang(D1.getX(), D1.getY(), C1.getX(), C1.getY());
        D1C1.Veduongthang(p);
        // VE D1A1 
        NetDuc D1A1 = new NetDuc(D1.getX(), D1.getY(), A1.getX(), A1.getY());
        D1A1.Netdut(p);
        // VE A2B2;
        DuongThang A2B2 = new DuongThang(A2.getX(), A2.getY(), B2.getX(), B2.getY());
        A2B2.Veduongthang(p);
        // V3 B2C2;
        DuongThang B2C2 = new DuongThang(B2.getX(), B2.getY(), C2.getX(), C2.getY());
        B2C2.Veduongthang(p);
        // VE C2D2;
        DuongThang D2C2 = new DuongThang(D2.getX(), D2.getY(), C2.getX(), C2.getY());
        D2C2.Veduongthang(p);
        // VE D1A1 
        DuongThang D2A2 = new DuongThang(D2.getX(), D2.getY(), A2.getX(), A2.getY());
        D2A2.Veduongthang(p);

        // VE A2A2;
        NetDuc A1A2 = new NetDuc(A1.getX(), A1.getY(), A2.getX(), A2.getY());
        A1A2.Netdut(p);
        // V3 B2C2;
        DuongThang B2B1 = new DuongThang(B2.getX(), B2.getY(), B1.getX(), B1.getY());
        B2B1.Veduongthang(p);
        // VE C2C1;
        DuongThang C2C1 = new DuongThang(C1.getX(), C1.getY(), C2.getX(), C2.getY());
        C2C1.Veduongthang(p);
        // VE D1A1 
        DuongThang D2D1 = new DuongThang(D2.getX(), D2.getY(), D1.getX(), D1.getY());
        D2D1.Veduongthang(p);

        fm.jToaDo1.append("                             THÔNG TIN TỌA ĐỘ HÌNH HỘP THỨ " + i + "\n");
        fm.jToaDo1.append(" TỌA ĐỘ THỰC                                                     TỌA ĐỘ ẢO     \n");
        fm.jToaDo1.append("A" + i + "(" + A1.getX() + ";" + A1.getY() + ")                                            A" + i + "(" + a1.getX() + ";" + a1.getY() + ";" + a1.getZ() + ")\n");
        fm.jToaDo1.append("B" + i + "(" + B1.getX() + ";" + B1.getY() + ")                                            B" + i + "(" + b1.getX() + ";" + b1.getY() + ";" + b1.getZ() + ")\n");
        fm.jToaDo1.append("C" + i + "(" + C1.getX() + ";" + C1.getY() + ")                                            C" + i + "(" + c1.getX() + ";" + c1.getY() + ";" + c1.getZ() + ")\n");
        fm.jToaDo1.append("D" + i + "(" + A1.getX() + ";" + A1.getY() + ")                                            D" + i + "(" + d1.getX() + ";" + d1.getY() + ";" + d1.getZ() + ")\n");

        fm.jToaDo1.append("A'" + i + "(" + A2.getX() + ";" + A2.getY() + ")                                           A'" + i + "(" + a2.getX() + ";" + a2.getY() + ";" + a2.getZ() + ")\n");
        fm.jToaDo1.append("B'" + i + "(" + B2.getX() + ";" + B2.getY() + ")                                           B'" + i + "(" + b2.getX() + ";" + b2.getY() + ";" + b2.getZ() + ")\n");
        fm.jToaDo1.append("C'" + i + "(" + C2.getX() + ";" + C2.getY() + ")                                           C'" + i + "(" + c2.getX() + ";" + c2.getY() + ";" + c2.getZ() + ")\n");
        fm.jToaDo1.append("D'" + i + "(" + D2.getX() + ";" + D2.getY() + ")                                           D'" + i + "(" + d2.getX() + ";" + d2.getY() + ";" + d2.getZ() + ")\n");
    }
}
