/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tranduykhanh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<CauHoi> ds = new ArrayList<>();
        CauHoi ch = new MultipleChoice();
        
        PhuongAn pa1 = new PhuongAn("An", true, "Ghi chu 1");
        PhuongAn pa2 = new PhuongAn("Duy", false, "Ghi chu 2");
        PhuongAn pa3 = new PhuongAn("Thanh", false, "Ghi chu 3");
       
        CauHoi cauHoi1 = new MultipleChoice("Ban tên là gì?", MucDo.DE, "Muc 1");
        cauHoi1.themPhuongAn(pa1);
        cauHoi1.themPhuongAn(pa2);
        cauHoi1.themPhuongAn(pa3);
        
        
        ds.add(cauHoi1);
        ch.luyenTap(ds, scanner);
    }
}
