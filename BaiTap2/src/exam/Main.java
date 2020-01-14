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
        List<CauHoi> ds = new ArrayList<>();;
        
        PhuongAn pa1 = new PhuongAn("An", true, "Ghi chu 1");
        PhuongAn pa2 = new PhuongAn("Duy", false, "Ghi chu 2");
        PhuongAn pa3 = new PhuongAn("Thanh", false, "Ghi chu 3");
        List<PhuongAn> phuongAnMultipleChoice1 = new ArrayList<PhuongAn>();
        phuongAnMultipleChoice1.add(pa1);
        phuongAnMultipleChoice1.add(pa2);
        phuongAnMultipleChoice1.add(pa3);
        CauHoi cauHoi1 = new MultipleChoice("Ban tên là gì?", phuongAnMultipleChoice1, MucDo.DE, "Muc 1");
        
        ds.add(cauHoi1);
        
        
        cauHoi1.luyenTap(ds, scanner);
    }
}
