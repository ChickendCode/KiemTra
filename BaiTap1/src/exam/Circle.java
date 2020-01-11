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
public class Circle extends Shape {
    private double banKinh;

    public Circle(double banKinh, Point point) {
        super(point);
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double dienTich() {
        double s = Math.PI * this.banKinh * this.banKinh;
        return s;
    }

    @Override
    public double chuVi() {
        double c = 2*Math.PI*this.banKinh;
        return c;
    }

    @Override
    public String toString() {
        return String.format("Dien tich va chu vi Circle la %s, %s", this.dienTich(), this.chuVi());
    }
}
