import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author nilam
 */
public class UpdateMahasiswa extends javax.swing.JFrame {
    public UpdateMahasiswa(){
        initComponents();      
        loadTampil();
        setFakultas();
        
        try {
            BufferedImage beam = ImageIO.read(getClass().getResource("library.png"));
            setIconImage(beam); 
        } catch (IOException ex) {
            Logger.getLogger(splashscreen.class.getName()).log(Level.SEVERE, null, ex);
        }
       this.setTitle("Aplikasi Perpustakaan");
    }
    
    private void setFakultas(){
        cbProdi.setEnabled(false);
        cbFakultas.addItem("Kedokteran");
        cbFakultas.addItem("Kedokteran Gigi");
        cbFakultas.addItem("Kesehatan Masyarakat");
        cbFakultas.addItem("Ilmu Keperawatan");
        cbFakultas.addItem("Farmasi");
        cbFakultas.addItem("MIPA");
        cbFakultas.addItem("Teknik");
        cbFakultas.addItem("Ilmu Komputer");
        cbFakultas.addItem("Hukum");
        cbFakultas.addItem("Ekonomi & Bisnis");
        cbFakultas.addItem("Ilmu Pengetahuan Budaya");
        cbFakultas.addItem("Psikologi");
        cbFakultas.addItem("Ilmu Sosial dan Ilmu Politik");
        cbFakultas.addItem("Ilmu Administrasi");
}
    Connection conn = Koneksi.connectDB();
    private void loadTampil(){
        try {
            String id = session.getid();           
            String query ="SELECT * FROM mahasiswa where npm = '"+ id +"'";
            
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            
            while (res.next()) {
                txtNPM.setText(res.getString(1));
                txtNama.setText(res.getString(2));
                cbFakultas.getModel().setSelectedItem(res.getString(3));
                cbProdi.getModel().setSelectedItem(res.getString(4));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNama = new javax.swing.JTextField();
        txtNPM = new javax.swing.JTextField();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        cbFakultas = new javax.swing.JComboBox<>();
        cbProdi = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNama.setText("Nama");
        txtNama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNamaMouseClicked(evt);
            }
        });
        jPanel1.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 410, 40));

        txtNPM.setText("NPM");
        txtNPM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNPMMouseClicked(evt);
            }
        });
        txtNPM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNPMKeyTyped(evt);
            }
        });
        jPanel1.add(txtNPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 410, 40));

        btnUbah.setBackground(new java.awt.Color(0, 102, 204));
        btnUbah.setForeground(new java.awt.Color(255, 255, 255));
        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        jPanel1.add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        btnHapus.setBackground(new java.awt.Color(0, 102, 204));
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jPanel1.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, -1));

        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        btnKembali.setBorderPainted(false);
        btnKembali.setContentAreaFilled(false);
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        jPanel1.add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, -1, -1));

        cbFakultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fakultas" }));
        cbFakultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFakultasActionPerformed(evt);
            }
        });
        jPanel1.add(cbFakultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 140, 30));

        cbProdi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prodi" }));
        jPanel1.add(cbProdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 140, 30));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FORM UBAH DATA MAHASISWA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNamaMouseClicked
        txtNama.setText(null);
    }//GEN-LAST:event_txtNamaMouseClicked

    private void txtNPMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNPMMouseClicked
        txtNPM.setText(null);
    }//GEN-LAST:event_txtNPMMouseClicked

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        String npm      = (String) txtNPM.getText();
        String nama     = (String) txtNama.getText();
        String fakultas = (String) cbFakultas.getSelectedItem();
        String prodi    = (String) cbProdi.getSelectedItem();
        
        if (npm.equals("")) {
            JOptionPane.showMessageDialog(null, "Isi Kolom NPM!");
        } else if (nama.equals("")) {
            JOptionPane.showMessageDialog(null, "Isi Kolom Nama!");
        } else if (fakultas.equals("Fakultas")) {
            JOptionPane.showMessageDialog(null, "Pilih Fakultas!");
        } else if (prodi.equals("Prodi")) {
            JOptionPane.showMessageDialog(null, "Pilih Prodi!");
        } else{
        try {
            String query ="UPDATE mahasiswa SET npm = '"+txtNPM.getText()
                    +"',nama = '"+txtNama.getText()
                    +"', fakultas = '"+cbFakultas.getSelectedItem()
                    +"',jurusan = '"+cbProdi.getSelectedItem()
                    +"' WHERE npm = '"+txtNPM.getText()+"'";
            
            PreparedStatement pdt = conn.prepareStatement(query);
            pdt.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal" + e.getMessage());
        }
        new DataMahasiswa().setVisible(true);
        dispose();
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        new DataMahasiswa().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try {
            String sql ="DELETE FROM mahasiswa where npm='"+txtNPM.getText()+"'";
           
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        new DataMahasiswa().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void cbFakultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFakultasActionPerformed
        if(cbFakultas.getSelectedItem().equals("Fakultas")){
            cbProdi.setSelectedItem("Prodi");
            cbProdi.setEnabled(false);
            } else if(cbFakultas.getSelectedItem().equals("Kedokteran")) {
                cbProdi.setEnabled(true);
                cbProdi.removeAllItems();
                cbProdi.addItem("Kedokteran");
            } else if(cbFakultas.getSelectedItem().equals("Kedokteran Gigi")) {
                cbProdi.setEnabled(true);
                cbProdi.removeAllItems();
                cbProdi.addItem("Kedokteran Gigi");
            } else if(cbFakultas.getSelectedItem().equals("Kesehatan Masyarakat")) {
                cbProdi.setEnabled(true);
                cbProdi.removeAllItems();
                cbProdi.addItem("Kesehatan Masyarakat");
                cbProdi.addItem("Kesehatan Lingkungan");
                cbProdi.addItem("Studi Gizi");
                cbProdi.addItem("Keselamatan & Kesehatan Kerja");
                cbProdi.addItem("Ilmu Keperawatan");
            } else if(cbFakultas.getSelectedItem().equals("Farmasi")) {
                cbProdi.setEnabled(true);
                cbProdi.removeAllItems();
                cbProdi.addItem("Farmasi");
            } else if(cbFakultas.getSelectedItem().equals("MIPA")){
                cbProdi.setEnabled(true);
                cbProdi.removeAllItems();
                cbProdi.addItem("Matematika");
                cbProdi.addItem("Fisika");
                cbProdi.addItem("Biologi");
                cbProdi.addItem("Kimia");
                cbProdi.addItem("Geografi");
            } else if(cbFakultas.getSelectedItem().equals("Teknik")){
                cbProdi.setEnabled(true);
                cbProdi.removeAllItems();
                cbProdi.addItem("Teknik Sipil");
                cbProdi.addItem("Teknik Mesin");
                cbProdi.addItem("Teknik Elektro");
                cbProdi.addItem("Teknik Metalurgi dan Material");
                cbProdi.addItem("Arsitektur");
                cbProdi.addItem("Arsitektur Interior");
                cbProdi.addItem("Teknik Kimia");
                cbProdi.addItem("Teknik Industri");
                cbProdi.addItem("Teknik Perkapalan");
                cbProdi.addItem("Teknik Lingkungan");
                cbProdi.addItem("Teknik Komputer");
                cbProdi.addItem("Teknologi Bioproses");
            } else if(cbFakultas.getSelectedItem().equals("Ilmu Komputer")) {
                cbProdi.setEnabled(true);
                cbProdi.removeAllItems();
                cbProdi.addItem("Ilmu Komputer");
                cbProdi.addItem("Sistem Informasi");
            } else if(cbFakultas.getSelectedItem().equals("Hukum")){
                cbProdi.setEnabled(true);
                cbProdi.removeAllItems();
                cbProdi.addItem("Ilmu Hukum");
            } else if(cbFakultas.getSelectedItem().equals("Ekonomi & Bisnis")){
                cbProdi.setEnabled(true);
                cbProdi.removeAllItems();
                cbProdi.addItem("Ilmu Ekonomi");
                cbProdi.addItem("Ekonomi Islam dan Bisnis Islam");
                cbProdi.addItem("Akutansi");
                cbProdi.addItem("Management");
            } else if(cbFakultas.getSelectedItem().equals("Ilmu Pengetahuan Budaya")){
                cbProdi.setEnabled(true);
                cbProdi.removeAllItems();
                cbProdi.addItem("Bahasa dan Kebudayaan Korea");
                cbProdi.addItem("Bahasa dan Sastra Belanda");
                cbProdi.addItem("Arkeologi");
                cbProdi.addItem("Ilmu Filsafat");
                cbProdi.addItem("Ilmu Perpustakaan");
                cbProdi.addItem("Ilmu Sejarah");
                cbProdi.addItem("Sastra Arab");
                cbProdi.addItem("Sastra Cina");
                cbProdi.addItem("Sastra Daerah/Jawa");
                cbProdi.addItem("Sastra Indonesia");
                cbProdi.addItem("Sastra Inggris");
                cbProdi.addItem("Sastra Jepang");
                cbProdi.addItem("Sastra Jerman");
                cbProdi.addItem("Sastra Prancis");
                cbProdi.addItem("Sastra Slavia");
            } else if(cbFakultas.getSelectedItem().equals("Psikologi")){
                cbProdi.setEnabled(true);
                cbProdi.removeAllItems();
                cbProdi.addItem("Psikologi");
            } else if(cbFakultas.getSelectedItem().equals("Ilmu Sosial dan Ilmu Politik")){
                cbProdi.setEnabled(true);
                cbProdi.removeAllItems();
                cbProdi.addItem("Ilmu Politik");
                cbProdi.addItem("Ilmu Komunikasi");
                cbProdi.addItem("Sosiologi");
                cbProdi.addItem("Antropologi Sosial");
                cbProdi.addItem("Kriminologi");
                cbProdi.addItem("Ilmu Hubungan Internasional");
                cbProdi.addItem("Ilmu Kesejahteraan Sosial");
            } else if(cbFakultas.getSelectedItem().equals("Ilmu Administrasi")){
                cbProdi.setEnabled(true);
                cbProdi.removeAllItems();
                cbProdi.addItem("Niaga");
                cbProdi.addItem("Negara");
                cbProdi.addItem("Fiskal");
            }
    }//GEN-LAST:event_cbFakultasActionPerformed

    private void txtNPMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNPMKeyTyped
        char c = evt.getKeyChar();
        if (! ((Character.isDigit(c) ||
                (c == KeyEvent.VK_BACK_SPACE) ||
                (c == KeyEvent.VK_DELETE))
                )
            )
        {
            evt.consume();
        } 
    }//GEN-LAST:event_txtNPMKeyTyped

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cbFakultas;
    private javax.swing.JComboBox<String> cbProdi;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtNPM;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
