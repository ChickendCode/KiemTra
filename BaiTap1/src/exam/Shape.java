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
public abstract class Shape {
    protected Point point;

    public Shape() {
    }

    public Shape(Point point) {
        this.point = point;
    }

    public abstract double dienTich();
    public abstract double chuVi();
}
