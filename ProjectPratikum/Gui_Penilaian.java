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
public class Gui_Penilaian extends javax.swing.JFrame {

    /**
     * Creates new form Gui_Penilaian
     */
    public Gui_Penilaian() {
        initComponents();
//        KeaktivanMahasiswa nilai = new KeaktivanMahasiswa();
//        txtKeaktifan.setText (Integer.toString(nilai.nilai_keaktifan));
//        txtKeaktifan.setEnabled(false);
     // Mengambil model data dari tabel dan menyimpannya dalam objek DefaultTableModel dataModel
    DefaultTableModel dataModel = (DefaultTableModel) table_penilaian_matakuliah.getModel();
    // Mendapatkan jumlah baris yang ada dalam model data saat ini
    int rowCount = dataModel.getRowCount();
    while (rowCount > 0) {
    // Menghapus baris terakhir dari model data
    dataModel.removeRow(rowCount - 1);
    // Memperbarui nilai rowCount setelah penghapusan baris terakhir
    rowCount = dataModel.getRowCount(); // Update rowCount after removal
    }
    KeaktivanMahasiswa nilai = new KeaktivanMahasiswa();
        txtKeaktifan.setText(Integer.toString(nilai.nilai_keaktifan));
        txtKeaktifan.setEnabled(false);
    }
    public void clear() {
    txtNIM.setText("");
    txtNama.setText("");
    txtKodeMK.setText("");
    txtNP1.setText("");
    txtNP2.setText("");
    txtNP3.setText("");
    txtPraktikum.setText("");
    txtUts.setText("");
    txtUas.setText("");
    txtKeaktifan.setText("0");
}
    public void batal(){
    txtNP1.setText("");
    txtNP2.setText("");
    txtNP3.setText("");
    txtPraktikum.setText("");
    txtUas.setText("");
    txtUts.setText("");
    txtKeaktifan.setText("");
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNIM = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtNP2 = new javax.swing.JTextField();
        txtKodeMK = new javax.swing.JTextField();
        txtNP1 = new javax.swing.JTextField();
        txtNP3 = new javax.swing.JTextField();
        txtKeaktifan = new javax.swing.JTextField();
        txtPraktikum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtUts = new javax.swing.JTextField();
        txtUas = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnNA = new javax.swing.JButton();
        checkBox = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_penilaian_matakuliah = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        txtNA = new javax.swing.JTextField();
        btnProses = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNP2ActionPerformed(evt);
            }
        });

        txtKodeMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeMKActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("PENILAIAN KULIAH");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("NIM");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("NAMA");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("KODE MATAKULIAH");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("NP 2");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("NP 1");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("NP 3");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("NILAI KEAKTIFAN");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("UTS");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("PRAKTIKUM");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("UAS");

        btnNA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNA.setText("SIMPAN");
        btnNA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNAActionPerformed(evt);
            }
        });

        checkBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        checkBox.setText("Tambahkan Nilai Keaktifan");
        checkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxActionPerformed(evt);
            }
        });

        table_penilaian_matakuliah.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIM", "KD MK", "NP 1", "NP 2", "NP 3", "UTS", "PRAK", "UAS", "NA"
            }
        ));
        jScrollPane2.setViewportView(table_penilaian_matakuliah);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Nilai Akhir");

        btnProses.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnProses.setText("PROSES");
        btnProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesActionPerformed(evt);
            }
        });

        btnUbah.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnUbah.setText("UPDATE");

        btnHapus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnHapus.setText("DELETE");

        btnBatal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBatal.setText("BATAL");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtKodeMK, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNP3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNP2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNP1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUas, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPraktikum, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUts, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtKeaktifan)
                                .addGap(18, 18, 18)
                                .addComponent(checkBox)
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(52, 52, 52)
                                .addComponent(txtNA, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(277, 277, 277))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnUbah)
                        .addGap(40, 40, 40)
                        .addComponent(btnBatal)
                        .addGap(55, 55, 55)
                        .addComponent(btnHapus)
                        .addGap(291, 291, 291))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtUts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtPraktikum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtKodeMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(txtUas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(12, 12, 12)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKeaktifan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkBox))
                        .addComponent(btnProses)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtNA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnNA)
                        .addGap(135, 135, 135))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBatal)
                            .addComponent(btnHapus)
                            .addComponent(btnUbah))
                        .addContainerGap(338, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtKodeMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeMKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeMKActionPerformed

    private void txtNP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNP2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNP2ActionPerformed

    private void btnNAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNAActionPerformed
        // TODO add your handling code here:
//        memoNilai.setText("");
//        KeaktivanMahasiswa nilai = new KeaktivanMahasiswa();
//        nilai.NIM = txtNIM.getText();
//        nilai.nama = txtNama.getText();
//        nilai.kode_mk = txtKodeMK.getText();
//        nilai.NP1 = Integer.parseInt(txtNP1.getText());
//        nilai.NP2 = Integer.parseInt(txtNP2.getText());
//        nilai.NP3 = Integer.parseInt(txtNP3.getText());
//        nilai.NilaiPrak = Integer.parseInt(txtPraktikum.getText());
//        nilai.UTS = Integer.parseInt(txtUts.getText());
//        nilai.UAS = Integer.parseInt(txtUas.getText());
//        
//        nilai.nilai_keaktifan = Integer.parseInt(txtKeaktifan.getText());
//        if(checkBox.isSelected()){
//            memoNilai.append(  "Nilai Akhir Mata Kuliah \n");
//            memoNilai.append("  ------------------------------------\n");
//            memoNilai.append("NIM\t: "+nilai.NIM +"\n");
//            memoNilai.append("Nama\t: "+nilai.nama +"\n");
//            memoNilai.append("Kode MK\t: "+nilai.kode_mk +"\n");
//            memoNilai.append("Nilai NP1\t: "+nilai.NP1 +"\n");
//            memoNilai.append("Nilai NP2\t: "+nilai.NP2 +"\n");
//            memoNilai.append("Nilai NP3\t: "+nilai.NP3 +"\n");
//            memoNilai.append("Nilai Praktikum\t: "+nilai.NilaiPrak +"\n");
//            memoNilai.append("Nilai UTS\t: "+nilai.UTS +"\n");
//            memoNilai.append("Nilai UAS\t: "+nilai.UAS +"\n");
//            memoNilai.append(  "===========================================\n");
//            memoNilai.append("Nilai Akhir\t: "+nilai.nilaiKeaktifan());
//        }
//        else{
//            memoNilai.append(  "Nilai Akhir Mata Kuliah \n");
//            memoNilai.append("  ------------------------------------\n");
//            memoNilai.append("NIM\t: "+nilai.NIM +"\n");
//            memoNilai.append("Nama\t: "+nilai.nama +"\n");
//            memoNilai.append("Kode MK\t: "+nilai.kode_mk +"\n");
//            memoNilai.append("Nilai NP1\t: "+nilai.NP1 +"\n");
//            memoNilai.append("Nilai NP2\t: "+nilai.NP2 +"\n");
//            memoNilai.append("Nilai NP3\t: "+nilai.NP3 +"\n");
//            memoNilai.append("Nilai Praktikum\t: "+nilai.NilaiPrak +"\n");
//            memoNilai.append("Nilai UTS\t: "+nilai.UTS +"\n");
//            memoNilai.append("Nilai UAS\t: "+nilai.UAS +"\n");
//            memoNilai.append(  "===========================================\n");
//            memoNilai.append("Nilai Akhir\t: "+nilai.tampilNA());
//        }
//             memoNilai.setText("");
//        KeaktivanMahasiswa nilai = new KeaktivanMahasiswa();
//        nilai.NIM = txtNIM.getText();
//        nilai.nama = txtNama.getText();
//        nilai.kode_mk = txtKodeMK.getText();
//        nilai.setNP1(Integer.parseInt(txtNP1.getText()));
//        nilai.setNP2(Integer.parseInt(txtNP2.getText()));
//        nilai.setNP3(Integer.parseInt(txtNP3.getText()));
//        nilai.setNilaiPrak(Integer.parseInt(txtPraktikum.getText()));
//        nilai.setUTS(Integer.parseInt(txtUts.getText()));
//        nilai.setUAS(Integer.parseInt(txtUas.getText()));
//        
//        nilai.nilai_keaktifan = Integer.parseInt(txtKeaktifan.getText());
//        if(checkBox.isSelected()){
//            memoNilai.append(  "Nilai Akhir Mata Kuliah \n");
//            memoNilai.append("  ------------------------------------\n");
//            memoNilai.append("NIM\t: "+nilai.NIM +"\n");
//            memoNilai.append("Nama\t: "+nilai.nama +"\n");
//            memoNilai.append("Kode MK\t: "+nilai.kode_mk +"\n");
//            memoNilai.append("Nilai NP\t: "+nilai.getNP1() +"\n");
//            memoNilai.append("Nilai NP2\t: "+nilai.getNP2() +"\n");
//            memoNilai.append("Nilai NP3\t: "+nilai.getNP3() +"\n");
//            memoNilai.append("Nilai Praktikum\t: "+nilai.getNilaiPrak() +"\n");
//            memoNilai.append("Nilai UTS\t: "+nilai.getUTS() +"\n");
//            memoNilai.append("Nilai UAS\t: "+nilai.getUAS() +"\n");
//            memoNilai.append(  "===========================================\n");
//            memoNilai.append("Nilai Akhir\t: "+nilai.nilaiKeaktifan());
//        }
//        else{
//            memoNilai.append(  "Nilai Akhir Mata Kuliah \n");
//            memoNilai.append("  ------------------------------------\n");
//            memoNilai.append("NIM\t: "+nilai.NIM +"\n");
//            memoNilai.append("Nama\t: "+nilai.nama +"\n");
//            memoNilai.append("Kode MK\t: "+nilai.kode_mk +"\n");
//            memoNilai.append("Nilai NP1\t: "+nilai.getNP1() +"\n");
//            memoNilai.append("Nilai NP2\t: "+nilai.getNP2() +"\n");
//            memoNilai.append("Nilai NP3\t: "+nilai.getNP3() +"\n");
//            memoNilai.append("Nilai Praktikum\t: "+nilai.getNilaiPrak() +"\n");
//            memoNilai.append("Nilai UTS\t: "+nilai.getUTS() +"\n");
//            memoNilai.append("Nilai UAS\t: "+nilai.getUAS() +"\n");
//            memoNilai.append(  "===========================================\n");
//            memoNilai.append("Nilai Akhir\t: "+nilai.tampilNA());
//        }
        try{
        double keaktifan;
        JOptionPane.showMessageDialog(null, "Data anda Ditambahkan Ke tabel");
        // Mengambil model data dari tabel
        DefaultTableModel dataModel = (DefaultTableModel) table_penilaian_matakuliah.getModel();
        // Inisialisasi sebuah ArrayList bernama 'list'
        List list = new ArrayList<>();
        KeaktivanMahasiswa nilai = new KeaktivanMahasiswa();
            nilai.NIM = txtNIM.getText();
            nilai.nama = txtNama.getText();
            nilai.kode_mk = txtKodeMK.getText();
            nilai.setNP1(Integer.parseInt(txtNP1.getText()));
            nilai.setNP2(Integer.parseInt(txtNP2.getText()));
            nilai.setNP3(Integer.parseInt(txtNP3.getText()));
            nilai.setNilaiPrak(Integer.parseInt(txtPraktikum.getText()));
            nilai.setUTS(Integer.parseInt(txtUts.getText()));
            nilai.setUAS(Integer.parseInt(txtUas.getText()));
            nilai.nilai_keaktifan =
            Integer.parseInt(txtKeaktifan.getText());
                if (checkBox.isSelected()) {
                    keaktifan = nilai.nilaiKeaktifan();
                } else {
                    keaktifan = nilai.tampilNA();
                }
            
            // Mengatur tabel untuk membuat kolom dari model secara otomatis
            table_penilaian_matakuliah.setAutoCreateColumnsFromModel(true);
            list.add(nilai.NIM);
            list.add(nilai.kode_mk);
            list.add(nilai.getNP1());
            list.add(nilai.getNP2());
            list.add(nilai.getNP3());
            list.add(nilai.getNilaiPrak());
            list.add(nilai.getUTS());
            list.add(nilai.getUAS());
            list.add(keaktifan);
            // Menambahkan baris baru ke model tabel menggunakan data dari ArrayList 'list'
            dataModel.addRow(list.toArray());
            // Memanggil fungsi 'clear' untuk membersihkan nilai dari komponen
            clear();
    } catch(NumberFormatException e){
        //benahi exception jika input tidak sesuai atau tidak valid(bukan angka)
        JOptionPane.showMessageDialog(null, "Teliti Kembali inputan Anda"," Peringatan " , 2);
                }
    catch(ArithmeticException f){
        JOptionPane.showMessageDialog(null, "Teliti Kembali inputan Anda", "Peringatan" , 2);
    }
    }//GEN-LAST:event_btnNAActionPerformed

    private void checkBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxActionPerformed
        // TODO add your handling code here:
        if (checkBox.isSelected()){
            txtKeaktifan.setEnabled(true);
        }
        else{
            txtKeaktifan.setEnabled(false);
        }

    }//GEN-LAST:event_checkBoxActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        batal();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProsesActionPerformed

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
            java.util.logging.Logger.getLogger(Gui_Penilaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui_Penilaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui_Penilaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui_Penilaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui_Penilaian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnNA;
    private javax.swing.JButton btnProses;
    private javax.swing.JButton btnUbah;
    private javax.swing.JCheckBox checkBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table_penilaian_matakuliah;
    private javax.swing.JTextField txtKeaktifan;
    private javax.swing.JTextField txtKodeMK;
    private javax.swing.JTextField txtNA;
    private javax.swing.JTextField txtNIM;
    private javax.swing.JTextField txtNP1;
    private javax.swing.JTextField txtNP2;
    private javax.swing.JTextField txtNP3;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtPraktikum;
    private javax.swing.JTextField txtUas;
    private javax.swing.JTextField txtUts;
    // End of variables declaration//GEN-END:variables
}
