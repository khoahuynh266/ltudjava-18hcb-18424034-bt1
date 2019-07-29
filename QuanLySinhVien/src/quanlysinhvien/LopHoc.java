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
public class LopHoc {
    private String tenLop;
    private ArrayList<SinhVien> listSinhVien = new ArrayList<SinhVien>();
    private ArrayList<ThoiKhoaBieu> tkb = new ArrayList<ThoiKhoaBieu>();
    
    public LopHoc(){
        this.tenLop = "";
    }
    
    public String getTenLop(){
        return this.tenLop;
    }
    public void setTenLop(String className){
        this.tenLop = className;
    }
    
    public void themSinhVien(SinhVien sv){
        listSinhVien.add(sv);
    }
    public ArrayList<SinhVien> getListSinhVien(){
        return listSinhVien;
    }
    
    public boolean kiemTraTenLop(String name){
        if(this.tenLop.equalsIgnoreCase(name))
            return true;
        return false;
    }
    public ArrayList<ThoiKhoaBieu> getTKB(){
        return this.tkb;
    }
    
    public void setTKB(ArrayList<ThoiKhoaBieu> listTKB){
        this.tkb = listTKB;
    }
    
    public void themTKB(ThoiKhoaBieu _tkb){
        this.tkb.add(_tkb);
    }
}
