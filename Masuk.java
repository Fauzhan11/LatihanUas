/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parkingmanagement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DateFormatter;



public class Masuk extends javax.swing.JFrame implements parkiran {

    
    public static String harga="";
        
    public Masuk() {
        initComponents();
        setLocationRelativeTo(null);
        
        
        
    }
    public String addData(String Nomor, String Masuk, String Harga){
        int i= 0, j=0;
        String result=""; 
        if(Nomor.isEmpty() || Harga.isEmpty() || Masuk.isEmpty()){
            JOptionPane.showMessageDialog(null, "Masukan Data");
            result = "Gagal";
        }else{
         
            data.add(j,Nomor);
            j++;
        
            data.add(i,Masuk);
            i++;
        JOptionPane.showMessageDialog(this,"your data success input");
        result = "Berhasil";
        }return result;
    }
    
    public void enterdata(){
        String Masuk = txtMasuk.getText();
        String Nomor = txtNomor.getText();
        String Harga = txtHarga.getText();
        addData(Nomor, Masuk, Harga);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jFrame1 = new javax.swing.JFrame();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNomor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMasuk = new javax.swing.JTextField();
        btnProses = new javax.swing.JButton();
        btnStruk = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        txtJenis = new javax.swing.JComboBox<String>();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        jMenu4.setText("jMenu4");

        jMenu5.setText("jMenu5");

        jLabel6.setText("jLabel6");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("jButton1");

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setForeground(new java.awt.Color(255, 204, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel2.setFont(new java.awt.Font("Leelawadee", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("No. Kendaraan ");

        jLabel3.setFont(new java.awt.Font("Leelawadee", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Jenis Kendaraan");

        txtNomor.setBackground(new java.awt.Color(204, 204, 204));
        txtNomor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomorActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Leelawadee", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Harga Parkir");

        txtHarga.setBackground(new java.awt.Color(204, 204, 204));
        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Leelawadee", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Jam Masuk");

        txtMasuk.setBackground(new java.awt.Color(204, 204, 204));
        txtMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMasukActionPerformed(evt);
            }
        });

        btnProses.setBackground(new java.awt.Color(255, 255, 153));
        btnProses.setFont(new java.awt.Font("Leelawadee", 0, 13)); // NOI18N
        btnProses.setText("Proses");
        btnProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesActionPerformed(evt);
            }
        });

        btnStruk.setBackground(new java.awt.Color(153, 255, 153));
        btnStruk.setFont(new java.awt.Font("Leelawadee", 0, 13)); // NOI18N
        btnStruk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recources/print.png"))); // NOI18N
        btnStruk.setText("Struk");
        btnStruk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStrukActionPerformed(evt);
            }
        });

        btnhapus.setBackground(new java.awt.Color(153, 153, 255));
        btnhapus.setFont(new java.awt.Font("Leelawadee", 0, 13)); // NOI18N
        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recources/x-button.png"))); // NOI18N
        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        keluar.setBackground(new java.awt.Color(255, 153, 153));
        keluar.setFont(new java.awt.Font("Leelawadee", 0, 13)); // NOI18N
        keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recources/parking.png"))); // NOI18N
        keluar.setText("Keluar Parkiran");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        txtJenis.setFont(new java.awt.Font("Leelawadee", 0, 13)); // NOI18N
        txtJenis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mobil", "Motor" }));
        txtJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJenisActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel1.setText("PARKIR KENDARAAN UMUM");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recources/motorcycle.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recources/car-garage (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addComponent(btnhapus))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHarga)
                                    .addComponent(txtNomor, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnProses))
                                            .addComponent(txtJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnStruk))
                                        .addGap(0, 19, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(keluar)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProses))
                .addGap(8, 8, 8)
                .addComponent(btnStruk)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnhapus)
                    .addComponent(keluar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesActionPerformed
    /*
       int a = ArrayData.i;
       int b = ArrayData.j;
        
        for(a=a;a<b;a++){
            ArrayData.data_kendaraan[a] = txtNomor.getText();
            ArrayData.data_kendaraan[a+=1] = txtHarga.getText();
            ArrayData.data_kendaraan[a+=1] = txtMasuk.getText();
       
        } 
        ArrayData.j+=3;
        JOptionPane.showMessageDialog(this, ArrayData.data_kendaraan[0] + "\n" +ArrayData.data_kendaraan[1] +"\n" + ArrayData.data_kendaraan[2]);
        String judul[]={"No.Kendaraan","Jenis Kendaraan","Jam Masuk"};
        DefaultTableModel tbl_model = new DefaultTableModel(null,judul);
        JTable abc = DetailData.jTable1;
        abc.setModel(tbl_model);
        String[][]nilai ={{ArrayData.data_kendaraan[0],ArrayData.data_kendaraan[1],ArrayData.data_kendaraan[2]}};
        System.out.println(nilai[0][0]);
        
        for(int x=0;x<1;x++){
            tbl_model.addRow(nilai[x]);
        }
    */    
    /*
    Scanner data_kend = new Scanner(System.in);
    parkiran pr = new parkiran() {}; 
            
    pr.no_kend = txtNomor.getText();
    pr.harga_parkir = txtHarga.getText();
    pr.jm_masuk = txtMasuk.getText();
    JOptionPane.showMessageDialog(null,"Berhasil");
      */
        enterdata();
        
    }//GEN-LAST:event_btnProsesActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed

        txtHarga.setText("");
        txtNomor.setText("");
        txtMasuk.setText("");
    }//GEN-LAST:event_btnhapusActionPerformed

    private void txtNomorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomorActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtNomorActionPerformed

    private void txtMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMasukActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtMasukActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        
        Keluar kl = new Keluar();
        
        this.setVisible(false);
        kl.setVisible(true);
        
    }//GEN-LAST:event_keluarActionPerformed

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed

    }//GEN-LAST:event_txtHargaActionPerformed

    private void btnStrukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStrukActionPerformed
        
        struk stk = new struk();
        
        this.setVisible(false);
        stk.setVisible(true);
    }//GEN-LAST:event_btnStrukActionPerformed

    private void txtJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJenisActionPerformed
        // TODO add your handling code here:
        Object Jenis =txtJenis.getSelectedItem();
        jenis(Jenis);
        txtHarga.setText(harga);  
    }//GEN-LAST:event_txtJenisActionPerformed

   
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
            java.util.logging.Logger.getLogger(Masuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Masuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Masuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Masuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Masuk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProses;
    private javax.swing.JButton btnStruk;
    private javax.swing.JButton btnhapus;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton keluar;
    public static javax.swing.JTextField txtHarga;
    public static javax.swing.JComboBox<String> txtJenis;
    public static javax.swing.JTextField txtMasuk;
    public static javax.swing.JTextField txtNomor;
    // End of variables declaration//GEN-END:variables

/* 
    public static void enterdata(){
        parkiran obj = new parkiran() {};
        
        int i=0;
        do {
            parkiran.data_kendaraan[i][0] = txtNomor.getText();  
            i++;
        } while(i<100);
        int j=0;
        do {
            parkiran.data_kendaraan[0][j] = txtMasuk.getText();
            j++;
        }while(j<100);        
    }*/

    @Override
    public void keluar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void masuk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
public String jenis( Object Jenis){
         String flag ;
       if (Jenis == "Mobil"){
            harga= "5000";
            flag="5000";
            
        }
        else{
             harga= "2000";
             flag="2000";
        }
    return flag;
}
}