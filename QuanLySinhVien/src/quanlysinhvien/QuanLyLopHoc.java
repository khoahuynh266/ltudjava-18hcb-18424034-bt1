/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static quanlysinhvien.Login.taiKhoan;
import static quanlysinhvien.GiaoVu.th;
/**
 *
 * @author yumil
 */
public class QuanLyLopHoc extends javax.swing.JFrame {
    private final int IMPORT_FILE = 1;
    private final int EXPORT_FILE = 2;
   
    themSinhVien sv;
    private String[] columName = {
        "STT", "MSSV", "Họ Tên", "Giới Tính", "CMND"
    };
    /**
     * Creates new form QuanLyLopHoc
     */
    public QuanLyLopHoc() {
        initComponents();
         initLayout();
    }
private void initLayout() {        
        jsvTable.setVisible(false);
        if (th.getsoLop() > 0) {
            addDataForComboBoxClass();
        } }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jsvTable = new javax.swing.JTable();
        jbtnThoat = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnQLMH = new javax.swing.JButton();
        btnQLTKB = new javax.swing.JButton();
        btnImport = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        cbLop = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý lớp học");

        jScrollPane1.setAutoscrolls(true);

        jsvTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jsvTable.setAutoscrolls(false);
        jsvTable.setColumnSelectionAllowed(true);
        jsvTable.setFocusable(false);
        jScrollPane1.setViewportView(jsvTable);
        jsvTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jbtnThoat.setText("Thoát");
        jbtnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnThoatActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 51)));

        btnQLMH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnQLMH.setText("Quản Lý Môn Học");
        btnQLMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLMHActionPerformed(evt);
            }
        });

        btnQLTKB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnQLTKB.setText("Quản Lý TKB");
        btnQLTKB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLTKBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQLMH, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(btnQLTKB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(btnQLTKB, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQLMH, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnImport.setText("Import");
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });

        btnExport.setText("Export");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        cbLop.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbLop.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--" }));
        cbLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLopActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Thêm Sinh Viên");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Danh sách lớp");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(cbLop, 0, 1, Short.MAX_VALUE)
                        .addGap(39, 39, 39)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnImport)
                        .addGap(18, 18, 18)
                        .addComponent(btnExport)))
                .addGap(61, 61, 61)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnImport)
                            .addComponent(btnExport))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(cbLop, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản lý lớp học");

        jButton3.setText("Load");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 29, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(0, 0, 0))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(160, 160, 160)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(204, 204, 204)
                                .addComponent(jbtnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
        // TODO add your handling code here:
           importExportFile("Choose file import", IMPORT_FILE);
    }//GEN-LAST:event_btnImportActionPerformed

    private void cbLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLopActionPerformed
        // TODO add your handling code here: 
        if(cbLop.getSelectedItem().toString().equals("--")){
            JOptionPane.showMessageDialog(null, "!!! Chưa Có Danh Sách Lớp");
        } else{
            addDataForTableListSV();
        }
        
    }//GEN-LAST:event_cbLopActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String lop = String.valueOf(cbLop.getItemAt(cbLop.getSelectedIndex()));
        if (cbLop.getSelectedIndex() < 0){
            JOptionPane.showMessageDialog(null, "!!! Vui Lòng Chọn Môn Học");
        } else {
                sv = new themSinhVien(lop);
                sv.setVisible(true);
        }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        // TODO add your handling code here:
        importExportFile("Export File", EXPORT_FILE);
    }//GEN-LAST:event_btnExportActionPerformed

    private void jbtnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnThoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new GiaoVu().setVisible(true);
    }//GEN-LAST:event_jbtnThoatActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         readListFile();
         addDataForTableListSV();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnQLTKBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLTKBActionPerformed
        // TODO add your handling code here:
        new QuanLyTKB().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQLTKBActionPerformed

    private void btnQLMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLMHActionPerformed
        // TODO add your handling code here:
        new QuanLyMonHoc().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQLMHActionPerformed
      private void importExportFile(String title, int key) {
        JFileChooser j = new JFileChooser();
        j.setDialogTitle(title);
        int choose = -1;
        switch (key) {
            case IMPORT_FILE:
                choose = j.showOpenDialog(null);
                break;
            case EXPORT_FILE:
                choose = j.showSaveDialog(null);
                break;
        }

        if (choose == JFileChooser.APPROVE_OPTION) {
            File f = j.getSelectedFile();
            switch (key) {
                case IMPORT_FILE:
                    readFile(f);
                    break;
                case EXPORT_FILE:
                    writeFile(f);
                    break;
            }
        }
    }
 private void addDataForComboBoxClass(){
        ArrayList<LopHoc> listLH = th.getList();
        DefaultComboBoxModel cbModel = new DefaultComboBoxModel();
            
        for (LopHoc i : listLH) {
            String name = i.getTenLop();
            cbModel.addElement(name);   
        }          
        cbLop.setModel(cbModel);
    }
  private void addDataForTableListSV(){
        
        String select = getClassNameInComboBox();
//        System.out.println("Select: " + select);
          
        ArrayList<LopHoc> listLH = th.getList(); 
        DefaultTableModel tbModel = new DefaultTableModel();
        
        int stt = 1;
        
        for (LopHoc i : listLH) {
            if(select.equalsIgnoreCase(i.getTenLop())){
                jsvTable.setVisible(true);
                tbModel.setColumnIdentifiers(columName);
                                                
                // get danh sách sinh viên và hiển thị lên table    
                ArrayList<SinhVien> listSV = new ArrayList<SinhVien>();
                listSV = i.getListSinhVien();
                for (SinhVien sv : listSV) {
                    
                    String[] info = new String[5];
                    info[0] = String.valueOf(stt);
                    info[1] = sv.getMSSV();
                    info[2] = sv.getTen();
                    if (sv.getGioiTinh() == 0) {
                        info[3] = "Nữ";
                    } else {
                        info[3] = "Nam";
                    }
                    info[4] = sv.getCMND();

                    tbModel.addRow(info);
                    stt++;
                }
                jsvTable.setModel(tbModel);
            } 
            else{
                tbModel.setColumnIdentifiers(columName);
                jsvTable.setModel(tbModel);
            }            
        }
    }
 private void readFile(File file) {
        try {
           try( FileInputStream fileInPutStream = new FileInputStream(file)){
            Reader reader = new java.io.InputStreamReader(fileInPutStream, "utf8");
            BufferedReader buffer = new BufferedReader(reader);
                String line;
                line = buffer.readLine();

                String[] tenLop = line.split(",");
                LopHoc lh = th.getLopHoc(tenLop[0]);
                
                boolean checkLopHoc = true;
                if (lh.getTenLop().equals("")) {
                    checkLopHoc = false;
                    lh.setTenLop(tenLop[0]);
                }
                
                if (checkLopHoc == true) {
                    th.setLopHoc(lh, line);
                    JOptionPane.showMessageDialog(null, "!!! Class Already Exists");                    
                } else {
                    th.setSoLop(th.getsoLop() + 1);
                    th.themLop(lh);
                    while ((line = buffer.readLine()) != null) {
                        String[] info = line.split(",");
                        
                        SinhVien sv = new SinhVien();
                        sv.setMSSV(info[1]);
                        sv.setTen(info[2]);
                        sv.setCMND(info[4]);
                        int gt = -1;

                        if (info[3].equalsIgnoreCase("Nam")) {
                            gt = 1;
                        }
                        if (info[3].equalsIgnoreCase("Nữ")) {
                            gt = 0;
                        }

                        sv.setGioiTinh(gt);
                        lh.themSinhVien(sv);
                        
                        if(!th.isExistedsAccount(info[1])){
                            TaiKhoan a = new TaiKhoan(info[1], info[1], tenLop[0], 0);
                            th.getListTaiKhoan().add(a);
                             }
                    }
                }
                buffer.close();
            }
                   initLayout();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error to open file: " + e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
 
 private void readListFile() {
     String filePath = new File("").getAbsolutePath(); 
            File dir = new File(filePath +"\\src\\data\\Lop");
            File[] txtFiles = dir.listFiles(new docDSfile());
 
             for (File f : txtFiles) {
                 readFile(f);
    }
 }

    private void writeFile(File file) {
        try{            
            file.createNewFile();
            FileOutputStream fos = new FileOutputStream(file);
            
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos, StandardCharsets.UTF_8));
                        
            String tenLop = getClassNameInComboBox();
            LopHoc lop = th.getLopHoc(tenLop);
            
            writer.append(tenLop);
            writer.append('\n');
            
            writer.append("STT,");
            writer.append(columName[1]);
            writer.append(",");
            writer.append(columName[2]);
            writer.append(",");
            writer.append(columName[3]);
            writer.append(",");
            writer.append(columName[4]);
            writer.append('\n');
            ArrayList<SinhVien> dsSV = new ArrayList<SinhVien>();
            dsSV = lop.getListSinhVien();
            
            if (dsSV.size() > 0) {
                int stt = 1;
                // Lấy danh sách học sinh trong lớp
                for (SinhVien sv : dsSV) {
                    writer.append(Integer.toString(stt) + ',');                    
                    writer.append(sv.getMSSV());
                    writer.append(',');
                    writer.append(sv.getTen());
                    writer.append(',');
                    if (sv.getGioiTinh() == 1) {
                        writer.append("Nam");
                    } else {
                        writer.append("Nữ");
                    }
                    writer.append(',');
                    writer.append(sv.getCMND());
                    writer.append('\n');
                    stt++;
                }
            }
            writer.close();
             JOptionPane.showMessageDialog(null, "Export File!", "Success", JOptionPane.INFORMATION_MESSAGE);
   
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error to export file: " + e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private String getClassNameInComboBox(){
        String result = cbLop.getSelectedItem().toString();
        return result;
    }
    
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
            java.util.logging.Logger.getLogger(QuanLyLopHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyLopHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyLopHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyLopHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyLopHoc().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnQLMH;
    private javax.swing.JButton btnQLTKB;
    private javax.swing.JComboBox cbLop;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnThoat;
    private javax.swing.JTable jsvTable;
    // End of variables declaration//GEN-END:variables
}
