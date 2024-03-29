/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static quanlysinhvien.GiaoVu.th;
import static quanlysinhvien.Login.taiKhoan;
/**
 *
 * @author yumil
 */
public class SinhVien_Diem extends javax.swing.JFrame {

    /**
     * Creates new form SinhVien_Diem
     */
    public SinhVien_Diem() {
        initComponents();
        initLayout();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        panelDoiMK = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textMKCu = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textAgain = new javax.swing.JTextField();
        btnLuu = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        textMKMoi = new javax.swing.JTextField();
        jCbBoxMonHoc = new javax.swing.JComboBox<String>();
        btnChangePass1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jsvTableDiem = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        notifyDSDiem = new javax.swing.JLabel();
        jTextMSSV = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Môn Học:");

        btnLogout.setBackground(new java.awt.Color(204, 204, 204));
        btnLogout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        panelDoiMK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Đổi Mật Khẩu");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Mật Khẩu Cũ:");

        textMKCu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nhập Lại MK:");

        textAgain.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnLuu.setBackground(new java.awt.Color(0, 153, 153));
        btnLuu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Mật Khẩu Mới:");

        textMKMoi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout panelDoiMKLayout = new javax.swing.GroupLayout(panelDoiMK);
        panelDoiMK.setLayout(panelDoiMKLayout);
        panelDoiMKLayout.setHorizontalGroup(
            panelDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDoiMKLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(panelDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textMKCu, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(textAgain))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textMKMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDoiMKLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDoiMKLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(263, 263, 263))
        );
        panelDoiMKLayout.setVerticalGroup(
            panelDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDoiMKLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(14, 14, 14)
                .addGroup(panelDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textMKCu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMKMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLuu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addContainerGap())
        );

        jCbBoxMonHoc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCbBoxMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbBoxMonHocActionPerformed(evt);
            }
        });

        btnChangePass1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnChangePass1.setText("Đổi MK");
        btnChangePass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePass1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Sinh Viên:");

        jScrollPane2.setAutoscrolls(true);

        jsvTableDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jsvTableDiem.setAutoscrolls(false);
        jsvTableDiem.setFocusable(false);
        jsvTableDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jsvTableDiemMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jsvTableDiem);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Bảng điểm");

        notifyDSDiem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        notifyDSDiem.setForeground(new java.awt.Color(255, 0, 0));
        notifyDSDiem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notifyDSDiem.setText("notify");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(notifyDSDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notifyDSDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        jTextMSSV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextMSSV.setEnabled(false);
        jTextMSSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMSSVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jCbBoxMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(275, 275, 275))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(panelDoiMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogout)
                    .addComponent(btnChangePass1))
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnChangePass1)
                        .addGap(12, 12, 12)
                        .addComponent(btnLogout))
                    .addComponent(panelDoiMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCbBoxMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    LopHoc lh = th.getLopHoc(taiKhoan.getTenLop());
    SinhVien sv = lh.getSinhVien(taiKhoan.getTenTaiKhoan());
    private final String[] columnNamesScore = {
        "STT", "MSSV", "Họ Tên", "Điểm GK", "Điểm CK", "Điểm Khác", "Điểm Tổng", "Kết Quả"
    };    
    
    private void initLayout(){
        panelDoiMK.setVisible(false);
        notifyDSDiem.setVisible(false);
        jTextMSSV.setText(taiKhoan.getTenTaiKhoan());
        addComboBox();
    }
    
    private void addTableScore(String _idSubject){

        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(columnNamesScore);
        ArrayList<Lop_MonHoc> listClass_idMH = th.getListLopMonHoc(lh.getTenLop());
        
        if(listClass_idMH.size() > 0){
            Lop_MonHoc lop_idMH = th.getLopMH(lh.getTenLop(), _idSubject); 
            ArrayList<Diem> listDiem = lop_idMH.getListDiem();
            int stt = 1;
            if(listDiem.size() > 0) {
                for(Diem diem : listDiem){
                    if(diem.getSV().getMSSV().equals(taiKhoan.getTenTaiKhoan())){
                        System.out.println("value: " + _idSubject);                    
                        String[] rows = new String[8];
                        rows[0] = String.valueOf(stt);
                        rows[1] = diem.getSV().getMSSV();
                        rows[2] = diem.getSV().getTen();
                        rows[3] = String.valueOf(diem.getDiemGK());
                        rows[4] = String.valueOf(diem.getDiemCK());
                        rows[5] = String.valueOf(diem.getDiemKhac());
                        rows[6] = String.valueOf(diem.getDiemTong());
                        rows[7] = diem.xepLoai();
                        tableModel.addRow(rows);
                        stt++;
                    } 
                } 
                jsvTableDiem.setModel(tableModel);            
            } else{

                notifyDSDiem.setVisible(true);

                notifyDSDiem.setText("Chưa Có Điểm !!");

                tableModel.setColumnIdentifiers(columnNamesScore);

                jsvTableDiem.setModel(tableModel);

                JOptionPane.showMessageDialog(null, "Giáo Vụ Chưa Cập Nhật Điểm!!!", "Notify", JOptionPane.ERROR_MESSAGE);

            }           

        } 

    }

    

    private void addComboBox(){
        ArrayList<Lop_MonHoc> listClass_idMH = th.getListLopMonHoc(lh.getTenLop());
        DefaultComboBoxModel cbModel = new DefaultComboBoxModel();
        if(listClass_idMH.size() > 0) {
            for(Lop_MonHoc item : listClass_idMH){
                cbModel.addElement(item.getMaMonHoc());
            }
            jCbBoxMonHoc.setModel(cbModel);
        } else {
            JOptionPane.showMessageDialog(null, "Giáo Vụ Chưa Cập Nhật Điểm!!!", "Notify", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    private boolean kiemTraDoiMK(){
        boolean valid = false;
        String oldPass = textMKCu.getText();
        String newPass = textMKMoi.getText();
        String passAgain = textAgain.getText();
        
        if(oldPass.equals("") || newPass.equals("") || passAgain.equals("")){
            JOptionPane.showMessageDialog(null, "Vui Lòng Nhập Mật Khẩu Đầy Đủ !!!", "Error", JOptionPane.ERROR_MESSAGE);
            valid = true;
        } else {
            if(!taiKhoan.getMatKhau().equals(oldPass)){
                JOptionPane.showMessageDialog(null, "Mật Khẩu Cũ Không Chính Xác!!!", "Error", JOptionPane.ERROR_MESSAGE);
                valid = true;
            } else if(!passAgain.equals(newPass)){
                JOptionPane.showMessageDialog(null, "Mật Khẩu Xác Nhận Không Chính Xác!!!", "Error", JOptionPane.ERROR_MESSAGE);
                valid = true;
            } else{
                valid = false;
            }            
        }
        return valid;
    }
    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        boolean checked = kiemTraDoiMK();
        if(!checked){
            String username = taiKhoan.getTenTaiKhoan();
            String password = taiKhoan.getMatKhau();
            
            for(TaiKhoan i : th.getListTaiKhoan()){
                if(i.getTenTaiKhoan().equals(username) && i.getMatKhau().equals(password)){
                    taiKhoan.setMatKhau(textMKMoi.getText());
                    th.getListTaiKhoan().set(th.getListTaiKhoan().indexOf(i), i);
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "Đổi mật khẩu thành công.", "Notify", JOptionPane.INFORMATION_MESSAGE);
            new Login().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void jCbBoxMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbBoxMonHocActionPerformed
        // TODO add your handling code here:
        String value = jCbBoxMonHoc.getSelectedItem().toString();
        if(!value.equals("")){
            addTableScore(value);
            System.out.println("value: " + value);
        } else{
            JOptionPane.showMessageDialog(null, "Môn Học Chưa Cập Nhật!!!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jCbBoxMonHocActionPerformed

    private void btnChangePass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePass1ActionPerformed
        // TODO add your handling code here:
        panelDoiMK.setVisible(true);
    }//GEN-LAST:event_btnChangePass1ActionPerformed

    private void jsvTableDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsvTableDiemMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jsvTableDiemMouseClicked

    private void jTextMSSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMSSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMSSVActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SinhVien_Diem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SinhVien_Diem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SinhVien_Diem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SinhVien_Diem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SinhVien_Diem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePass1;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnLuu;
    private javax.swing.JComboBox<String> jCbBoxMonHoc;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTextField jTextMSSV;
    private javax.swing.JTable jsvTableDiem;
    private javax.swing.JLabel notifyDSDiem;
    private javax.swing.JPanel panelDoiMK;
    private javax.swing.JTextField textAgain;
    private javax.swing.JTextField textMKCu;
    private javax.swing.JTextField textMKMoi;
    // End of variables declaration//GEN-END:variables
}
