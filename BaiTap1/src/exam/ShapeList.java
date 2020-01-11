/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tranduykhanh
 */
public class ShapeList {
    private List<Shape> ds;

    public ShapeList() {
        this.ds = new ArrayList<>();
    }

    public List<Shape> getDs() {
        return ds;
    }

    public void setDs(List<Shape> ds) {
        this.ds = ds;
    }
    
    
    public void themShape(Shape shape) {
        this.ds.add(shape);
    }
    
    public static void hienThiThongTin(List<Shape> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
    
    public static List<Shape> sapSepTangDan(List<Shape> list) {
        Collections.sort(list, new Comparator<Shape>(){
            public int compare(Shape s1, Shape s2){
                if(s1.dienTich() == s2.dienTich())
                    return 0;
                return s1.dienTich() < s2.dienTich() ? -1 : 1;
            }
       });
        
       return list;
    }
    
    public static List<Shape> sapSepGiamDan(List<Shape> list) {
        Collections.sort(list, new Comparator<Shape>(){
            public int compare(Shape s1, Shape s2){
                if(s1.chuVi() == s2.chuVi())
                    return 0;
                return s1.chuVi() > s2.chuVi() ? -1 : 1;
            }
       });
        
       return list;
    }
}
