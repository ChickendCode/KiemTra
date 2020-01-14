/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author tranduykhanh
 */
public class MultipleChoice extends CauHoi {

    public MultipleChoice() {
    }

    public MultipleChoice(String noiDung, MucDo mucDo, String danhMuc) {
        super(noiDung, mucDo, danhMuc);
    }

    @Override
    public void luyenTap(List<CauHoi> ds, Scanner scanner) {
        System.out.println("---- Dạng câu hỏi MultipleChoice ---");
        System.out.print("Nhập số câu hỏi muốn luyện tập : ");
        int soCauHoi = scanner.nextInt();
        
        if (soCauHoi > demMultiChoice(ds)) {
            System.out.println("Số câu hỏi vượt quá danh sách câu hỏi của MultipleChoice");
            return;
        }
        List<CauHoi> dsMulti = getMultiChoices(ds);
        for (int i = 0; i < soCauHoi; i++) {
            int index = getRandomIndex(dsMulti);
            CauHoi c = dsMulti.get(index);
            System.out.println(c);
            System.out.print("Trả lời của bạn: ");
            String da = scanner.next();
            
            if (c.ktDapAn(da) == true)
                System.out.println("CHÍNH XÁC!!!");
            else
                System.out.println("SAI RỒI!!!");
        }
    }
    
    private int demMultiChoice(List<CauHoi> ds) {
        int dem = 0;
        
        for (CauHoi c: ds) {
            if (c instanceof MultipleChoice) {
                dem++;
            }
        }
        return dem;
    }
    
    private List<CauHoi> getMultiChoices(List<CauHoi> ds) {
        List<CauHoi> cauHoi = new ArrayList<>();
        
        for (CauHoi c: ds) {
            if (c instanceof MultipleChoice) {
                cauHoi.add(c);
            }
        }
        return cauHoi;
    }
    
    private int getRandomIndex(List<CauHoi> ds) {
        int index = ThreadLocalRandom.current().nextInt(ds.size());		
	return index;
    }
}
