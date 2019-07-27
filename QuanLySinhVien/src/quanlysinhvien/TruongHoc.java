/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;

import java.util.ArrayList;

/**
 *
 * @author yumil
 */
public class TruongHoc {
    private int soLop;
    private ArrayList<LopHoc> listLopHoc = new ArrayList<LopHoc>();
        
    public TruongHoc() {
        this.soLop = 0;
    }
    
    public int getsoLop(){
        return this.soLop;
    }

    public void setSoLop(int soLop) {
        this.soLop = soLop;
    }
   
    public void themLop(LopHoc lh){
        this.listLopHoc.add(lh);
    }
    
    public void themSv_Lop(String lopHoc, SinhVien sv) {
        for(LopHoc lh : listLopHoc){
            if(lh.kiemTraTenLop(lopHoc))
                lh.themSinhVien(sv);
        }        
    }
    
    public ArrayList<LopHoc> getList(){
        return listLopHoc;
    }
    
    public LopHoc getLop(int index) {
        if ((index >= 0) && (index < listLopHoc.size() - 1)) {
            return listLopHoc.get(index);
        }
        return null;
    }

    public LopHoc getLopHoc(String tenLop){
        LopHoc rs = new LopHoc();
        if(!tenLop.equals("")){
            for(LopHoc lh : this.listLopHoc){
                boolean checkName = lh.kiemTraTenLop(tenLop);
                if (checkName) {
                    rs = lh;
                }
            }
        }
        return rs;
    }
    
    public void setLopHoc(LopHoc lh, String tenLop) {
        for (LopHoc l : this.listLopHoc) {
            if (l.kiemTraTenLop(tenLop)) {
                int _index = this.listLopHoc.indexOf(l);
                this.listLopHoc.set(_index, lh);
            }
        }
    }    
}
