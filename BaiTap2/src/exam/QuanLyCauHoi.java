/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author tranduykhanh
 */
public class QuanLyCauHoi {
    private List<CauHoi> ds;
    
    public QuanLyCauHoi() {
        this.ds = new ArrayList<>();
    }
    
    public void themCauHoi(CauHoi ch) {
        this.ds.add(ch);
    }

    /**
     * @return the ds
     */
    public List<CauHoi> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<CauHoi> ds) {
        this.ds = ds;
    }
}
