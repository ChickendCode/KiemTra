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
        CauHoi multi = new MultipleChoice();
        CauHoi imcom = new Incomplete();
       
        CauHoi c1 = new MultipleChoice("Ban tên là gì?", MucDo.DE, "Muc 1");
        PhuongAn c1Pa1 = new PhuongAn("An", true, "Ghi chu 1");
        PhuongAn c1Pa2 = new PhuongAn("Duy", false, "Ghi chu 2");
        PhuongAn c1Pa3 = new PhuongAn("Thanh", false, "Ghi chu 3");
        c1.themPhuongAn(c1Pa1);
        c1.themPhuongAn(c1Pa2);
        c1.themPhuongAn(c1Pa3);
        
        CauHoi c2 = new Incomplete("This ...  a book", MucDo.KHO, "Muc 1");
        PhuongAn c2Pa1 = new PhuongAn("am", false, "Ghi chu 1");
        PhuongAn c2Pa2 = new PhuongAn("are", false, "Ghi chu 2");
        PhuongAn c2Pa3 = new PhuongAn("is", true, "Ghi chu 3");
        PhuongAn c2Pa4 = new PhuongAn("were", false, "Ghi chu 4");
        
        c2.themPhuongAn(c2Pa1);
        c2.themPhuongAn(c2Pa2);
        c2.themPhuongAn(c2Pa3);
        c2.themPhuongAn(c2Pa4);
        
        
        CauHoi c3 = new Incomplete("This ...  a car", MucDo.TRUNGBINH, "Muc 1");
        PhuongAn c3Pa1 = new PhuongAn("am", false, "Ghi chu 1");
        PhuongAn c3Pa2 = new PhuongAn("are", false, "Ghi chu 2");
        PhuongAn c3Pa3 = new PhuongAn("is", true, "Ghi chu 3");
        PhuongAn c3Pa4 = new PhuongAn("were", false, "Ghi chu 4");
        
        c3.themPhuongAn(c3Pa1);
        c3.themPhuongAn(c3Pa2);
        c3.themPhuongAn(c3Pa3);
        c3.themPhuongAn(c3Pa4);
        
        CauHoi c4 = new Incomplete("This ...  a cat", MucDo.DE, "Muc 1");
        PhuongAn c4Pa1 = new PhuongAn("am", false, "Ghi chu 1");
        PhuongAn c4Pa2 = new PhuongAn("are", false, "Ghi chu 2");
        PhuongAn c4Pa3 = new PhuongAn("is", true, "Ghi chu 3");
        PhuongAn c4Pa4 = new PhuongAn("were", false, "Ghi chu 4");
        
        c4.themPhuongAn(c4Pa1);
        c4.themPhuongAn(c4Pa2);
        c4.themPhuongAn(c4Pa3);
        c4.themPhuongAn(c4Pa4);
        
        
        ds.add(c1);
        ds.add(c2);
        ds.add(c3);
        ds.add(c4);
        
        // Tim cau hoi
        System.out.println("--- Tim cau hoi ---------");
        CauHoi timCauhoi = multi.timCauHoi(ds, "Ban tên là gì?");
        System.out.println(timCauhoi);
        System.out.println("--- Tim cau hoi ---------");
        
        // Luyen tap
        multi.luyenTap(ds, scanner);
        imcom.luyenTap(ds, scanner);
    }
}
