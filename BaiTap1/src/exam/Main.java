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
        
        list.themShape(square);
    }
}
