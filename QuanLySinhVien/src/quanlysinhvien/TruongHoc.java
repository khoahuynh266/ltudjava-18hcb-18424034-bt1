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
    private ArrayList<Lop_MonHoc> listLop_MonHoc = new ArrayList<Lop_MonHoc>();
        
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

// Lop_MH

        
    public ArrayList<Lop_MonHoc> getListLopMH(){
        return this.listLop_MonHoc;
    }
    public void setLopMH(ArrayList<Lop_MonHoc> target){
        this.listLop_MonHoc = target;
    }
    
    public void setListLopMH(ArrayList<Lop_MonHoc> list) {
        this.listLop_MonHoc = (ArrayList<Lop_MonHoc>) list.clone();
    }
    
    public Lop_MonHoc getLopMH(String tenLop, String maMH){
        Lop_MonHoc result = new Lop_MonHoc();
        
        if(this.listLop_MonHoc.size() > 0){
            for(Lop_MonHoc item : this.listLop_MonHoc){
                if(item.isExists(tenLop, maMH))
                    result = item;
            }
        }
        return result;
    }
    
    public void themSV_MonHoc(String lop, String idMH ,SinhVien sv) {
        for (Lop_MonHoc lop_mh : this.listLop_MonHoc) {
            if (lop_mh.isExists(lop, idMH)) {
                lop_mh.themSV(sv);
            }
        }
    }
    
    public void themLopMH(Lop_MonHoc lh){
        this.listLop_MonHoc.add(lh);
    }
    public void setLopMH(String tenLop, String maMH, Lop_MonHoc _target){
        for(Lop_MonHoc item : this.listLop_MonHoc){
            if(item.isExists(tenLop, maMH)){
                int index = this.listLop_MonHoc.indexOf(item);
                this.listLop_MonHoc.set(index, _target);
            }
        }
    }
    public void xoaLopMH(Lop_MonHoc lh){
        this.listLop_MonHoc.remove(lh);
    }
}

