/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exam;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tranduykhanh
 */
public class Incomplete extends CauHoi {

    public Incomplete() {
    }

    public Incomplete(String noiDung, MucDo mucDo, String danhMuc) {
        super(noiDung, mucDo, danhMuc);
    }

    @Override
    public void luyenTap(List<CauHoi> ds, Scanner scanner) {
        System.out.println("---- Dạng câu hỏi Incomplete ---");
        System.out.println("Chọn mức độ cho câu hỏi : ");
        System.out.println("Khó (K) :  ");
        System.out.println("Trung Bình (TB) : ");
        System.out.println("Dễ (D) : ");
        String mucDo = scanner.next();
        MucDo mucDoEnum = getMucDo(mucDo);
        
        for (CauHoi c: ds) {
            
            if (c instanceof MultipleChoice || !c.getMucDo().equals(mucDoEnum)) {
                continue;
            }
            
            System.out.println(c);
            System.out.print("Trả lời của bạn: ");
            String da = scanner.next();
            
            if (c.ktDapAn(da) == true)
                System.out.println("CHÍNH XÁC!!!");
            else
                System.out.println("SAI RỒI!!!");
        }
    }
    
    public MucDo getMucDo(String mucDo) {
        mucDo = mucDo.toUpperCase();
        MucDo mucDoEnum = null;
        switch(mucDo) {
            case "K":
                mucDoEnum = MucDo.KHO;
                break;
            case "TB":
                mucDoEnum = MucDo.TRUNGBINH;
            break;
            case "D":
                mucDoEnum = MucDo.DE;
            break;
            default:
        }
        return mucDoEnum;
    }
}
