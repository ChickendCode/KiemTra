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
public class Rectangle extends Shape{
    private double chieuDai;
    private double chieuRong;

    public Rectangle(double chieuDai, double chieuRong, Point point) {
        super(point);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    @Override
    public double dienTich() {
        double s = this.chieuDai * this.chieuRong;
        return s;
    }

    @Override
    public double chuVi() {
        double c = (this.chieuDai + this.chieuRong) * 2;
        return c;
    }
    
    @Override
    public String toString() {
        return String.format("Dien tich va chu vi Rectangle la %s, %s", this.dienTich(), this.chuVi());
    }
}
