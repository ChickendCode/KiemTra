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

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public List<PhuongAn> getPhuongAn() {
        return phuongAn;
    }

    public void setPhuongAn(List<PhuongAn> phuongAn) {
        this.phuongAn = phuongAn;
    }

    public MucDo getMucDo() {
        return mucDo;
    }

    public void setMucDo(MucDo mucDo) {
        this.mucDo = mucDo;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }
    
    public abstract void luyenTap(List<CauHoi> ds, Scanner scanner);
    
    public CauHoi timCauHoi(List<CauHoi> ds, String noiDung) {
        CauHoi cauHoi = null;
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getNoiDung().contains(noiDung)) {
                cauHoi = ds.get(i);
                break;
            }
        }

        return cauHoi;
    }
    
    public boolean ktDapAn(String da) {
        da = da.toUpperCase();
        for (int i = 0; i < this.phuongAn.size(); i++) {
            if (this.phuongAn.get(i).isPhuongAnDung() == true &&
                    NHAN[i].equals(da) == true)
                return true;
        }
        
        return false;
    }
    
    @Override
    public String toString() {
        String s = String.format("%s\n", this.noiDung);
        
        for (int i = 0; i < this.phuongAn.size(); i++)
            s += String.format("%s. %s", NHAN[i], this.phuongAn.get(i));
        
        return s;
    }
}
