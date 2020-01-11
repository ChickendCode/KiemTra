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
public class Ellipse extends Shape {
    
    private double chieuDaiTrucA;
    private double chieuDaiTrucB;

    public Ellipse(double chieuDaiTrucA, double chieuDaiTrucB) {
        this.chieuDaiTrucA = chieuDaiTrucA;
        this.chieuDaiTrucB = chieuDaiTrucB;
    }

    public double getChieuDaiTrucA() {
        return chieuDaiTrucA;
    }

    public double getChieuDaiTrucB() {
        return chieuDaiTrucB;
    }

    @Override
    public double dienTich() {
        double s = Math.PI * this.chieuDaiTrucA / 2 * this.chieuDaiTrucB/2;
        return s;
    }

    @Override
    public double chuVi() {
        return 2;
    }
    
    @Override
    public String toString() {
        return String.format("Dien tich va chu vi Ellipse la %s, %s", this.dienTich(), this.chuVi());
    }
}
