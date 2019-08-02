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
import static quanlysinhvien.QuanLyLopHoc.th;

/**
 *
 * @author yumil
 */
public class QuanLyTKB extends javax.swing.JFrame {
    private final int IMPORT_FILE = 1;
    private final int EXPORT_FILE = 2;

    private String className = "";
    private String[] columName = {
        "STT", "Mã môn", "Tên môn", "Phòng học"
    };
    private QuanLyLopHoc qlLH;
    /**
     * Creates new form QuanLyLopHoc
     */
    public QuanLyTKB() {
        initComponents();
         initLayout();
        
    }
private void initLayout() {        
        jtableTKB.setVisible(false);
       
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
        jtableTKB = new javax.swing.JTable();
        jlableNotify = new javax.swing.JLabel();
        jbtnThoat = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý TKB");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản lý thời khóa biểu");

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

        jtableTKB.setModel(new javax.swing.table.DefaultTableModel(
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
        jtableTKB.setAutoscrolls(false);
        jtableTKB.setColumnSelectionAllowed(true);
        jtableTKB.setFocusable(false);
        jScrollPane1.setViewportView(jtableTKB);
        jtableTKB.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jlableNotify.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlableNotify.setForeground(new java.awt.Color(255, 0, 0));

        jbtnThoat.setText("Thoát");
        jbtnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnThoatActionPerformed(evt);
            }
        });

        jButton1.setText("load");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlableNotify, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213))))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(127, 127, 127)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnThoat)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbLop, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnImport)
                        .addGap(128, 128, 128))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnThoat)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnImport))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbLop)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jlableNotify)
                .addGap(18, 18, 18)
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
            JOptionPane.showMessageDialog(null, "!!! Chua có danh sách lớp");
        } else{
            addDataForTableTKB();
        }
        
    }//GEN-LAST:event_cbLopActionPerformed

    private void jbtnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnThoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new GiaoVu().setVisible(true);
    }//GEN-LAST:event_jbtnThoatActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        readListFile();
    }//GEN-LAST:event_jButton1ActionPerformed
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
                 //   writeFile(f);
                    break;
            }
        }
    }
 private void addDataForComboBoxClass(){ // add data cho cbb 
        ArrayList<LopHoc> listLH = th.getList();
        DefaultComboBoxModel cbModel = new DefaultComboBoxModel();
            
        for (LopHoc i : listLH) {
            String name = i.getTenLop();
            cbModel.addElement(name);   
        }          
        cbLop.setModel(cbModel);
    }
 
    private void addDataForTableTKB(){
        
        String select = getClassNameInComboBox();
          
        ArrayList<LopHoc> listLH = th.getList(); 
        DefaultTableModel tblTKB = new DefaultTableModel();
        
        for (LopHoc i : listLH) {                   
                jtableTKB.setVisible(true);
                tblTKB.setColumnIdentifiers(columName);
                
                int stt = 1;
                ArrayList<ThoiKhoaBieu> listSchedule = i.getTKB();
                if(listSchedule.size() > 0 && select.equalsIgnoreCase(i.getTenLop())){
                System.out.println(listSchedule.size());
                for(ThoiKhoaBieu item : listSchedule){
                    
                    String[] info = new String[4];
                    info[0] = String.valueOf(stt);
                    info[1] = item.getMH().getMaMH();
                    info[2] = item.getMH().getTenMH();
                    info[3] = item.getPH();
                    
                    tblTKB.addRow(info);
                    stt++;
                }                
                jtableTKB.setModel(tblTKB);
                 jlableNotify.setText("");
            } else {
                if(listSchedule.size() <= 0){
                jlableNotify.setText("Chưa Có Thời Khóa Biểu!!!!");
                tblTKB.setColumnIdentifiers(columName);
                jtableTKB.setModel(tblTKB);
                    }            
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
                LopHoc lh = th.getLopHoc(tenLop[0]);
                
                ArrayList<Lop_MonHoc> class_subject = new ArrayList<Lop_MonHoc>();
            
                System.out.println("tenLop[0]: " + tenLop[0]);
               
                if(tenLop[0]!=null)
                        {                       
                    while ((line = buffer.readLine()) != null) {
                        String[] info = line.split(",");
                        
                        MonHoc monHoc = new MonHoc(info[1], info[2]);
                        ThoiKhoaBieu TKB = new ThoiKhoaBieu(monHoc, info[3]);
                        
                        lh.themTKB(TKB);
                        className = tenLop[0] + "-" + info[1];
                        Lop_MonHoc Lop_MH = new Lop_MonHoc();
                        Lop_MH.setTenLopMH(className);
                        Lop_MH.setMaMonHoc(info[1]);
                        Lop_MH.setListSV(lh.getListSinhVien());
                        
                        class_subject.add(Lop_MH);
                        System.out.println("list " + class_subject.size());
                    }
                    th.ThemListLopMH(class_subject);
                buffer.close();
                } else {
                    JOptionPane.showMessageDialog(null, "!!! Thời Khóa Biểu Sai Lớp");
                }
                
                System.out.println(th.getListLopMH().size());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error to open file: " + e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
    private void readListFile() {
     String filePath = new File("").getAbsolutePath(); 
            File dir = new File(filePath +"\\src\\data\\TKB");
            File[] txtFiles = dir.listFiles(new docDSfile());
             for (File f : txtFiles) {
                 readFile(f);
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
    private javax.swing.JButton btnImport;
    private javax.swing.JComboBox cbLop;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnThoat;
    private javax.swing.JLabel jlableNotify;
    private javax.swing.JTable jtableTKB;
    // End of variables declaration//GEN-END:variables
}
