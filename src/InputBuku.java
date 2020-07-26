import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author nilam
 */
public class InputBuku extends javax.swing.JFrame {
    public InputBuku(){
        initComponents();
        setKategori();
    
    /*    try {
           BufferedImage beam = ImageIO.read(getClass().getResource("library.jpg"));
             setIconImage(beam); 
        } catch (IOException ex) {
            Logger.getLogger(splashscreen.class.getName()).log(Level.SEVERE, null, ex);
        }
       this.setTitle("Input Data Buku");
    */
        }
    private void setKategori(){
        cbKategori.addItem("Kategori");
        cbKategori.addItem("Ilmu Kesehatan");
        cbKategori.addItem("Ilmu Sains dan Teknologi");
        cbKategori.addItem("Ilmu Sosial dan Humaniora");
        cbKategori.addItem("Jurnal");
        cbKategori.addItem("Tesis");

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtPengarang = new javax.swing.JTextField();
        txtPenerbit = new javax.swing.JTextField();
        txtJudul = new javax.swing.JTextField();
        cbKategori = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDeskripsi = new javax.swing.JTextArea();
        btnSubmit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtStok = new javax.swing.JTextField();
        btnKembali = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPengarang.setText("Pengarang");
        txtPengarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPengarangMouseClicked(evt);
            }
        });
        jPanel2.add(txtPengarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 474, 46));

        txtPenerbit.setText("Penerbit");
        txtPenerbit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPenerbitMouseClicked(evt);
            }
        });
        jPanel2.add(txtPenerbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 474, 46));

        txtJudul.setText("Judul");
        txtJudul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtJudulMouseClicked(evt);
            }
        });
        jPanel2.add(txtJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 474, 46));

        jPanel2.add(cbKategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 95, -1));

        txtDeskripsi.setColumns(20);
        txtDeskripsi.setRows(5);
        txtDeskripsi.setText("\n\n   Deskripsi");
        txtDeskripsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDeskripsiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtDeskripsi);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 505, -1));

        btnSubmit.setBackground(new java.awt.Color(0, 102, 204));
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel2.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, -1, -1));

        btnCancel.setBackground(new java.awt.Color(0, 102, 204));
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, -1, -1));

        txtStok.setText("Stok");
        txtStok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtStokMouseClicked(evt);
            }
        });
        txtStok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStokKeyTyped(evt);
            }
        });
        jPanel2.add(txtStok, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 65, 25));

        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        btnKembali.setContentAreaFilled(false);
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        jPanel2.add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 130, 110));

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));

        jLabel3.setBackground(new java.awt.Color(0, 102, 204));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FORM INPUT DATA BUKU");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 570, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    Connection conn =Koneksi.connectDB();
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        String kategori     = (String) cbKategori.getSelectedItem();
        String judul        = (String) txtJudul.getText();
        String pengarang    = (String) txtPengarang.getText();
        String penerbit     = (String) txtPenerbit.getText();
        String deskripsi    = (String) txtDeskripsi.getText();
        String stok         = (String) txtStok.getText();

    if(kategori.equals("Kategori")){
        JOptionPane.showMessageDialog(null, "Pilih Kategori!");
     } else if(judul.equals("")||pengarang.equals("")||penerbit.equals("")||deskripsi.equals("")||stok.equals("")){
         JOptionPane.showMessageDialog(null, "Semua Kolom Harus Terisi!");     
     } else{
         try{
             String sql="SELECT * FROM buku order by id_buku desc";
             Connection conn = Koneksi.connectDB();
             Statement stm = conn.createStatement();
             ResultSet res = stm.executeQuery(sql);
             String no_id;
             
             if(res.next()){
                 String no=res.getString("id_buku").substring(1);
                 String id = ""+(Integer.parseInt(no)+1);
                 String nol=null;
                 
                 if(id.length()==1){
                    nol="000";
                } else if(id.length()==2){
                    nol="00";
                } else if(id.length()==3){
                    nol="0";
                } else if(id.length()==4){
                    nol="";
                } no_id = "B"+nol+id; 
              } else{
                 no_id = "B0001"; 
              }
            try {
                String query = "INSERT INTO buku VALUES "
                        + "('" + no_id+"','"+txtJudul.getText() + "','" + txtPengarang.getText() 
                        + "','" + txtPenerbit.getText() + "','" + cbKategori.getSelectedItem()  
                        + "','" + txtDeskripsi.getText()+ "','" + txtStok.getText() + "')";

                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.execute();
                JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
            } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            }
        } catch(Exception b){
        JOptionPane.showMessageDialog(null,b.getMessage());
        } 
         new DataBuku().setVisible(true);
         dispose();
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtJudulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJudulMouseClicked
        txtJudul.setText(null);
    }//GEN-LAST:event_txtJudulMouseClicked

    private void txtPengarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPengarangMouseClicked
        txtPengarang.setText(null);
    }//GEN-LAST:event_txtPengarangMouseClicked

    private void txtPenerbitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPenerbitMouseClicked
        txtPenerbit.setText(null);
    }//GEN-LAST:event_txtPenerbitMouseClicked

    private void txtDeskripsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDeskripsiMouseClicked
        txtDeskripsi.setText(null);
    }//GEN-LAST:event_txtDeskripsiMouseClicked

    private void txtStokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtStokMouseClicked
        txtStok.setText(null);
    }//GEN-LAST:event_txtStokMouseClicked

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        new DataBuku().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void txtStokKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStokKeyTyped
        char c = evt.getKeyChar();
        if (! ((Character.isDigit(c) ||
                (c == KeyEvent.VK_BACK_SPACE) ||
                (c == KeyEvent.VK_DELETE))
                )
            )
        {
            evt.consume();
        }       
    }//GEN-LAST:event_txtStokKeyTyped

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        new DataBuku().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cbKategori;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDeskripsi;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtPenerbit;
    private javax.swing.JTextField txtPengarang;
    private javax.swing.JTextField txtStok;
    // End of variables declaration//GEN-END:variables
}
