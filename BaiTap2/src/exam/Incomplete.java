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

    public Incomplete(String noiDung, List<PhuongAn> phuongAn, MucDo mucDo, String danhMuc) {
        super(noiDung, phuongAn, mucDo, danhMuc);
    }

    @Override
    public void luyenTap(List<CauHoi> ds, Scanner scanner) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
