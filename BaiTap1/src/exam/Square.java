/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exam;

/**
 *
 * @author tranduykhanh
 */
public class Square extends Shape {
    
    private double chieuDaiCanh;

    public Square(double chieuDaiCanh) {
        this.chieuDaiCanh = chieuDaiCanh;
    }
    
    public Square(double chieuDaiCanh, Point point) {
        super(point);
        this.chieuDaiCanh = chieuDaiCanh;
    }

    public double getChieuDaiCanh() {
        return chieuDaiCanh;
    }

    public void setChieuDaiCanh(double chieuDaiCanh) {
        this.chieuDaiCanh = chieuDaiCanh;
    }
    
    @Override
    public double dienTich() {
        double s = this.chieuDaiCanh * this.chieuDaiCanh;
        return s;
    }

    @Override
    public double chuVi() {
        double c = this.chieuDaiCanh * 4;
        return c;
    }
    
    @Override
    public String toString() {
        return String.format("Dien tich va chu vi Square la %s, %s", this.dienTich(), this.chuVi());
    }
}
