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
public abstract class CauHoi {
    protected String noiDung;
    protected final String[] NHAN = {"A", "B", "C", "D"};
    protected List<PhuongAn> phuongAn;
    protected MucDo mucDo;
    protected String danhMuc;

    public CauHoi(String noiDung, List<PhuongAn> phuongAn, MucDo mucDo, String danhMuc) {
        this.noiDung = noiDung;
        this.phuongAn = phuongAn;
        this.mucDo = mucDo;
        this.danhMuc = danhMuc;
    }
    
    public abstract CauHoi timCauHoi(String noiDung);
    public abstract void luyenTap();
}
