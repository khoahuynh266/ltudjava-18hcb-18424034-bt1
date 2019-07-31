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
public class Lop_MonHoc {
    private String tenLopMH;
    private String maMonHoc;
    private ArrayList<SinhVien> listSV = new ArrayList<SinhVien>();
    
    public Lop_MonHoc(){
        this.tenLopMH = "";
    }
    public String getTenLopMH(){
        return this.tenLopMH;
    }
    
    public void setTenLopMH(String name){
        this.tenLopMH = name;
    }
    
    public String getMaMonHoc(){
        return this.maMonHoc;
    }
    
    public void setMaMonHoc(String id){
        this.maMonHoc = id;
    }
    
    public ArrayList<SinhVien> getListSV() {
        return listSV;
    }

    public void setListSV(ArrayList<SinhVien> list) {
        this.listSV = (ArrayList<SinhVien>) list.clone();
    }
    
    public boolean isExists(String name, String id) {
        if (this.tenLopMH.equalsIgnoreCase(name) && this.maMonHoc.equalsIgnoreCase(id)) {
            return true;
        }
        return false;
    }
    
    public void themSV(SinhVien sv){
        this.listSV.add(sv);
    }   
    public void xoaSV(SinhVien sv){
        this.listSV.remove(sv);
    }
}
