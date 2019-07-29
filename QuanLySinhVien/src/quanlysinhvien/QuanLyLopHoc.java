/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yumil
 */
public class QuanLyLopHoc extends javax.swing.JFrame {
    private final int IMPORT_FILE = 1;
    private final int EXPORT_FILE = 2;
   
    static TruongHoc th = new TruongHoc();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnImport = new javax.swing.JButton();
        cbLop = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jsvTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản lý lớp học");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Danh sách lớp");

        btnImport.setText("Import");
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });

        cbLop.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbLop.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--" }));
        cbLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLopActionPerformed(evt);
            }
        });

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

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Thêm Sinh Viên");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnExport.setText("Export");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        jButton2.setText("Quản lý TKB");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbLop, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnImport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExport)
                        .addGap(53, 53, 53))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnImport)
                        .addComponent(btnExport))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbLop)
                        .addGap(2, 2, 2)))
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        sv = new themSinhVien();
        sv.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        // TODO add your handling code here:
        importExportFile("Export File", EXPORT_FILE);
    }//GEN-LAST:event_btnExportActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         new QuanLyTKB().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
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
                    
//                    System.out.println(sv.getMSSV() + " " + sv.getName());
                    
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
            try (FileReader reader = new FileReader(file)) {
                BufferedReader buffer = new BufferedReader(reader);

                String line;
                line = buffer.readLine();

                String[] tenLop = line.split(",");
                LopHoc lh = this.th.getLopHoc(tenLop[0]);
                
                boolean checkLopHoc = true;
                if (lh.getTenLop().equals("")) {
                    checkLopHoc = false;
                    lh.setTenLop(tenLop[0]);
                }
                
                if (checkLopHoc == true) {
                    this.th.setLopHoc(lh, line);
                    JOptionPane.showMessageDialog(null, "!!! Lớp đã tồn tại");                    
                } else {
                    this.th.setSoLop(this.th.getsoLop() + 1);
                    this.th.themLop(lh);
                    
                    // get info SV
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
                    }
                }
                buffer.close();
            }
                   initLayout();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error to open file: " + e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JComboBox cbLop;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jsvTable;
    // End of variables declaration//GEN-END:variables
}
