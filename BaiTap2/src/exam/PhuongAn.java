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
public class PhuongAn {
    private String noiDung;
    private boolean phuongAnDung;
    private String ghiChu;

    public PhuongAn(String noiDung, boolean phuongAnDung, String ghiChu) {
        this.noiDung = noiDung;
        this.phuongAnDung = phuongAnDung;
        this.ghiChu = ghiChu;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public boolean isPhuongAnDung() {
        return phuongAnDung;
    }

    public void setPhuongAnDung(boolean phuongAnDung) {
        this.phuongAnDung = phuongAnDung;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
