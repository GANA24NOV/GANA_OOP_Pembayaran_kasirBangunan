/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectPratikum;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author USER
 */
public class GUI_Matkul extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Matkul
     */
    public GUI_Matkul() {
        initComponents();
        DefaultTableModel dataModel = (DefaultTableModel)table_data_matakuliah.getModel();
    int rowCount = dataModel.getRowCount();
    while (rowCount > 0) {
      dataModel.removeRow(rowCount - 1);
      rowCount = dataModel.getRowCount(); //
    }
    Data_matkul dtMatkul = new Data_matkul();
    txtKdMatakuliah.setText(dtMatkul.kode_mk);
    txtMatakuliah.setText(dtMatkul.nama_mk);

    txtDosenPengajar.setText(dtMatkul.dosen_pengampu);

    txtJmlSks.setText(Integer.toString(dtMatkul.jumlah_sks));  

   }
    public void clear(){
   txtKdMatakuliah.setText("");
   txtMatakuliah.setText("");
   txtDosenPengajar.setText("");
   txtJmlSks.setText("");
  }
  
    

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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtKdMatakuliah = new javax.swing.JTextField();
        txtMatakuliah = new javax.swing.JTextField();
        txtDosenPengajar = new javax.swing.JTextField();
        txtJmlSks = new javax.swing.JTextField();
        btnSIMPAN = new javax.swing.JButton();
        btnUBAH = new javax.swing.JButton();
        btnHAPUS = new javax.swing.JButton();
        btnBATAL = new javax.swing.JButton();
        btnFORM_NILAI = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_data_matakuliah = new javax.swing.JTable();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Data Mahakuliah");

        jLabel2.setText("Kode Matakuliah");

        jLabel3.setText("Mata Kuliah");

        jLabel4.setText("Data Pengajar");

        jLabel5.setText("Jumlah SKS");

        btnSIMPAN.setText("SIMPAN");
        btnSIMPAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSIMPANActionPerformed(evt);
            }
        });

        btnUBAH.setText("UBAH");

        btnHAPUS.setText("HAPUS");
        btnHAPUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHAPUSActionPerformed(evt);
            }
        });

        btnBATAL.setText("BATAL");
        btnBATAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBATALActionPerformed(evt);
            }
        });

        btnFORM_NILAI.setText("FORM NILAI");

        table_data_matakuliah.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode MataKuliah", "Mata Kuliah", "Data Penagajar", "Jumlah SKS"
            }
        ));
        jScrollPane1.setViewportView(table_data_matakuliah);

        btnCari.setText("CARI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSIMPAN)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(77, 77, 77)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtKdMatakuliah, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtMatakuliah, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtDosenPengajar)
                                .addComponent(txtJmlSks, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(173, 173, 173)
                            .addComponent(jLabel1))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnFORM_NILAI)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUBAH)
                                .addGap(18, 18, 18)
                                .addComponent(btnHAPUS)
                                .addGap(18, 18, 18)
                                .addComponent(btnBATAL)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnCari)))
                        .addGap(147, 147, 147))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCari)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtKdMatakuliah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMatakuliah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDosenPengajar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtJmlSks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnSIMPAN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(btnFORM_NILAI)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBATAL)
                            .addComponent(btnHAPUS)
                            .addComponent(btnUBAH))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSIMPANActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        // TODO add your handling code here:
    JOptionPane.showMessageDialog(null, "Data anda Ditambahkan Ke tabel");
   // Mengambil model data dari tabel
   DefaultTableModel dataModel = (DefaultTableModel)table_data_matakuliah.getModel();
   // Inisialisasi sebuah ArrayList bernama 'list'
   List list = new ArrayList<>();

  table_data_matakuliah.setAutoCreateColumnsFromModel(true);
   Data_matkul dtMatkul = new Data_matkul();
   
   dtMatkul.kode_mk = txtKdMatakuliah.getText();
   dtMatkul.dosen_pengampu = txtDosenPengajar.getText();
   dtMatkul.kode_mk = txtKdMatakuliah.getText();
   dtMatkul.nama_mk = txtMatakuliah.getText();
   dtMatkul.jumlah_sks = Integer.parseInt(txtJmlSks.getText());
   
   list.add(dtMatkul.kode_mk);
   list.add(dtMatkul.nama_mk);
   list.add(dtMatkul.dosen_pengampu);
   list.add(dtMatkul.jumlah_sks);
   dataModel.addRow(list.toArray());
   clear();
                                          
    }                                         

    private void btnHAPUSActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    DefaultTableModel dataModel = (DefaultTableModel)
    table_data_matakuliah.getModel();
    int rowCount = dataModel.getRowCount();
    while (rowCount > 0) {
    dataModel.removeRow(rowCount - 1);
    rowCount = dataModel.getRowCount(); // Update
    }                                    
    }                                        

    private void btnBATALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBATALActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnBATALActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Matkul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Matkul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Matkul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Matkul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Matkul().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBATAL;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnFORM_NILAI;
    private javax.swing.JButton btnHAPUS;
    private javax.swing.JButton btnSIMPAN;
    private javax.swing.JButton btnUBAH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_data_matakuliah;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtDosenPengajar;
    private javax.swing.JTextField txtJmlSks;
    private javax.swing.JTextField txtKdMatakuliah;
    private javax.swing.JTextField txtMatakuliah;
    // End of variables declaration//GEN-END:variables
}
