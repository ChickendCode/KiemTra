/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exam;

import java.util.List;

/**
 *
 * @author tranduykhanh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShapeList list = new ShapeList();
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(5, 5);
        Shape ellipse = new Ellipse(4, 4);
        Shape square = new Square(4);
        
        list.themShape(circle);
        list.themShape(rectangle);
        list.themShape(ellipse);
        list.themShape(square);
        
        list.hienThiThongTin(list.getDs());
        
        List<Shape> listTang = list.sapSepTangDan(list.getDs());
        System.out.println("Dien tich tang dan");
        for (int i = 0; i < listTang.size(); i++) {
            System.out.println(listTang.get(i).dienTich());
        }
        
        List<Shape> listGiam = list.sapSepGiamDan(list.getDs());
        System.out.println("Chu vi giam dan");
        for (int i = 0; i < listTang.size(); i++) {
            System.out.println(listGiam.get(i).chuVi());
        }
    }
}
