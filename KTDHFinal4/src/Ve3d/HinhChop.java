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
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Font;

/**
 *
 * @author Administrator
 */
public class HinhChop {

    private int dai;
    private int rong;
    private int cao;

    public HinhChop(int dai, int rong, int cao) {
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

    public void VeHinhC(Graphics2D p, int x, int y, int z, Forrm fm, int i) {

        Graphics2D o = (Graphics2D) p;

        Point3d a = new Point3d(0 + x, 0 + y, 0 + z);
        Point3d b = new Point3d(dai + x, 0 + y, 0 + z);
        Point3d d = new Point3d(0 + x, rong + y, 0 + z);
        Point3d c = new Point3d(dai + x, rong + y, 0 + z);

        Point3d f = new Point3d((dai / 2) + x, (rong / 2) + y, z);
        Point3d e = new Point3d((dai / 2) + x, (rong / 2) + y, cao + z);

        Cabinet cb1 = new Cabinet(a.getX(), a.getY(), a.getZ());
        Point2d A = cb1.ChuyenSang2d();
        Cabinet cb2 = new Cabinet(b.getX(), b.getY(), b.getZ());
        Point2d B = cb2.ChuyenSang2d();
        Cabinet cb3 = new Cabinet(c.getX(), c.getY(), c.getZ());
        Point2d C = cb3.ChuyenSang2d();
        Cabinet cb4 = new Cabinet(d.getX(), d.getY(), d.getZ());
        Point2d D = cb4.ChuyenSang2d();
        Cabinet cb5 = new Cabinet(e.getX(), e.getY(), e.getZ());
        Point2d E = cb5.ChuyenSang2d();
        Cabinet cb6 = new Cabinet(f.getX(), f.getY(), f.getZ());
        Point2d F = cb6.ChuyenSang2d();

        //Ve AB
        NetDuc AB = new NetDuc(A.getX(), A.getY(), B.getX(), B.getY());
        AB.Netdut(p);
        //Ve AD
        NetDuc AD = new NetDuc(A.getX(), A.getY(), D.getX(), D.getY());
        AD.Netdut(p);
        //Ve AE
        NetDuc AE = new NetDuc(A.getX(), A.getY(), E.getX(), E.getY());
        AE.Netdut(p);
        //Ve AC
        NetDuc AC = new NetDuc(A.getX(), A.getY(), C.getX(), C.getY());
        AC.Netdut(p);
        //Ve BD
        NetDuc BD = new NetDuc(B.getX(), B.getY(), D.getX(), D.getY());
        BD.Netdut(p);
        //Ve FE
        NetDuc FE = new NetDuc(F.getX(), F.getY(), E.getX(), E.getY());
        FE.Netdut(p);
        //Ve BC
        DuongThang BC = new DuongThang(B.getX(), B.getY(), C.getX(), C.getY());
        BC.Veduongthang(p);
        //Ve CD
        DuongThang CD = new DuongThang(C.getX(), C.getY(), D.getX(), D.getY());
        CD.Veduongthang(p);
        //Ve BE
        DuongThang BE = new DuongThang(B.getX(), B.getY(), E.getX(), E.getY());
        BE.Veduongthang(p);
        //Ve CE
        DuongThang CE = new DuongThang(C.getX(), C.getY(), E.getX(), E.getY());
        CE.Veduongthang(p);
        //Ve DE
        DuongThang DE = new DuongThang(D.getX(), D.getY(), E.getX(), E.getY());
        DE.Veduongthang(p);

        //Dinh
        o.setColor(Color.black);
        o.setFont(new java.awt.Font("", 1, 15));
        o.drawString("A" + i, A.getX() - 15, A.getY());
        o.drawString("B" + i, B.getX() + 15, B.getY());
        o.drawString("C" + i, C.getX() + 15, C.getY() + 15);
        o.drawString("D" + i, D.getX() - 15, D.getY() + 15);
        o.drawString("O" + i, E.getX(), E.getY() - 10);
        o.drawString("F" + i, F.getX() + 5, F.getY());
        // o.drawString("Hinh Chop Co Dy La Hinh Chu Nhat", F.getX(), B.getY()+150);

        fm.jToaDo1.append("                             THÔNG TIN TỌA ĐỘ HÌNH CHÓP THỨ " + i + "\n");
        fm.jToaDo1.append(" TỌA ĐỘ THỰC                                                     TỌA ĐỘ ẢO     \n");
        fm.jToaDo1.append("A" + i + "(" + A.getX() + ";" + A.getY() + ")                                            A" + i + "(" + a.getX() + ";" + a.getY() + ";" + a.getZ() + ")\n");
        fm.jToaDo1.append("B" + i + "(" + B.getX() + ";" + B.getY() + ")                                            B" + i + "(" + b.getX() + ";" + b.getY() + ";" + b.getZ() + ")\n");
        fm.jToaDo1.append("C" + i + "(" + C.getX() + ";" + C.getY() + ")                                            C" + i + "(" + c.getX() + ";" + c.getY() + ";" + c.getZ() + ")\n");
        fm.jToaDo1.append("D" + i + "(" + D.getX() + ";" + D.getY() + ")                                            D" + i + "(" + d.getX() + ";" + d.getY() + ";" + d.getZ() + ")\n");
        fm.jToaDo1.append("O" + i + "(" + E.getX() + ";" + E.getY() + ")                                            O" + i + "(" + e.getX() + ";" + e.getY() + ";" + e.getZ() + ")\n");
        fm.jToaDo1.append("F'" + i + "(" + F.getX() + ";" + F.getY() + ")                                           F" + i + "(" + f.getX() + ";" + f.getY() + ";" + f.getZ() + ")\n");

    }

}
