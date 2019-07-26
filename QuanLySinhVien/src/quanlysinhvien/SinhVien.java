/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;

/**
 *
 * @author yumil
 */
public class SinhVien {
    private String MSSV;
    private String hoTen;
    private int gioiTinh; 
    private String CMND;    
    
    public SinhVien(){
        this.MSSV = "";
        this.hoTen = "";
        this.gioiTinh = -1;
        this.CMND = "";
    }
    
    public SinhVien(String _MSSV, String _hoTen, int _gioiTinh, String _CMND){
        this.MSSV = _MSSV;
        this.hoTen = _hoTen;
        this.gioiTinh = _gioiTinh;
        this.CMND = _CMND;
    }
    
    public String getMSSV(){
        return this.MSSV;
    }
    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }
    
    
    public String getTen(){
        return this.hoTen;
    }
    public void setTen(String fullname) {
        this.hoTen = fullname;
    }
    
    public int getGioiTinh(){
        return this.gioiTinh;
    }
    public void setGioiTinh(int sex) {
        this.gioiTinh = sex;
    }
    
    public String getCMND() {
        return CMND;
    }
    public void setCMND(String cmnd) {
        this.CMND = cmnd;
    }
}

