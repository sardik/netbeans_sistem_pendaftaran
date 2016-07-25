/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sis_pendaftaran;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TOSHIBA
 */
public class Petugas extends javax.swing.JFrame {
    private Connection conec;

    /**
     * Creates new form Petugas
     */
    
    private void tabs(){
        String sql="select * from tblpetugas";
        DefaultTableModel ax=new DefaultTableModel();
        ax.addColumn("ID_Petugas");
        ax.addColumn("Nama_Petugas");
        ax.addColumn("Tempat_Lahir");
        ax.addColumn("Tanggal_Lahir");
        ax.addColumn("Jenis_Kelamin");
        ax.addColumn("Jabatan");
        ax.addColumn("Alamat");
        ax.addColumn("No_telp");

        tblpetugas.setModel(ax);
        try{
            Statement stat=conec.createStatement();
            ResultSet rs=stat.executeQuery(sql);
            while(rs.next()){
                
                ax.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)});
                System.out.println("koneksi sukses");

        }

        }
        catch(Exception e){
            System.out.println("Err koneksi gagal");
        }   
        }
    public Petugas() {
        initComponents();
        koneksiDatabase();
        tabs();
        nomoran();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tblsearch = new javax.swing.JButton();
        tfnotelp = new javax.swing.JTextField();
        cbjabatan = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfalamat = new javax.swing.JTextArea();
        tfidpetugas = new javax.swing.JTextField();
        tfnamapetugas = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tbledit = new javax.swing.JButton();
        tblsave = new javax.swing.JButton();
        tbldelete = new javax.swing.JButton();
        tblcancel = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cbjenkel = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tftempatlahir = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tftanggal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblpetugas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/searchtext.png"))); // NOI18N
        tblsearch.setText("Search");
        tblsearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblsearchActionPerformed(evt);
            }
        });

        cbjabatan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ":: Pilih Jabatan ::", "Petugas", "Guru" }));
        cbjabatan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tfalamat.setColumns(20);
        tfalamat.setRows(5);
        jScrollPane1.setViewportView(tfalamat);

        jLabel10.setText(":");

        jLabel11.setText(":");

        tbledit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit.png"))); // NOI18N
        tbledit.setText("Edit");
        tbledit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbledit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbleditActionPerformed(evt);
            }
        });

        tblsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/SAVE.jpg"))); // NOI18N
        tblsave.setText("Save");
        tblsave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblsaveActionPerformed(evt);
            }
        });

        tbldelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete16.gif"))); // NOI18N
        tbldelete.setText("Delete");
        tbldelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbldelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbldeleteActionPerformed(evt);
            }
        });

        tblcancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Close.jpg"))); // NOI18N
        tblcancel.setText("Cancel");
        tblcancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblcancelActionPerformed(evt);
            }
        });

        jLabel12.setText("Tempat_Lahir");

        jLabel13.setText("Tanggal_Lahir");

        cbjenkel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ":: Pilih Jenis Kelamin ::", "Laki-laki", "Perempuan" }));
        cbjenkel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel15.setText(":");

        jLabel14.setText("Jenis_Kelamin");

        jLabel2.setText("ID_Petugas");

        jLabel1.setBackground(new java.awt.Color(153, 180, 209));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ENTRY DATA PETUGAS");

        jLabel9.setText(":");

        jLabel16.setText(":");

        jLabel6.setText("No_telp");

        jLabel5.setText("Alamat");

        jLabel4.setText("Jabatan");

        jLabel17.setText(":");

        jLabel3.setText("Nama_Petugas");

        jLabel8.setText(":");

        jLabel7.setText(":");

        tblpetugas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblpetugas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfidpetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tblsearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(cbjabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tftanggal))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfnamapetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfnotelp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(102, 102, 102))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tblsave)
                                .addGap(18, 18, 18)
                                .addComponent(tbledit)
                                .addGap(18, 18, 18)
                                .addComponent(tbldelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tblcancel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tftempatlahir, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbjenkel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(19, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(tfidpetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tblsearch)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(tfnamapetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel16)
                    .addComponent(tftanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel17)
                    .addComponent(tftempatlahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(cbjenkel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(cbjabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel10))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11)
                            .addComponent(tfnotelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tblsave)
                            .addComponent(tbledit)
                            .addComponent(tblcancel)
                            .addComponent(tbldelete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-817)/2, (screenSize.height-634)/2, 817, 634);
    }// </editor-fold>//GEN-END:initComponents

    private void tblsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblsearchActionPerformed
        // TODO add your handling code here:
        String sql = "SELECT * FROM tblpetugas WHERE ID_Petugas='"+tfidpetugas.getText()+"'";
        try{
            Statement stat=conec.createStatement();
            ResultSet rs=stat.executeQuery(sql);
            if(rs.next())
            {
                tfnamapetugas.setText(rs.getString(2));
                tftempatlahir.setText(rs.getString(3));
                tftanggal.setText(rs.getString(4));
                cbjenkel.setSelectedItem(rs.getString(5));
                cbjabatan.setSelectedItem(rs.getString(6));
                tfalamat.setText(rs.getString(7));
                tfnotelp.setText(rs.getString(8));
            }
            else
            {
                JOptionPane.showMessageDialog(null, "kode tidak ada","PERHATIAN",JOptionPane.WARNING_MESSAGE);
                tfidpetugas.requestFocus();
            }
            stat.close();
        }
        catch(Exception exc){
            System.err.println("Terjadi kesalahan : "+exc);
        }
        tabs();
    }//GEN-LAST:event_tblsearchActionPerformed

    private void tbleditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbleditActionPerformed
        // TODO add your handling code here:
        String sql="update tblpetugas set Nama_Petugas='"+tfnamapetugas.getText()+"',Tempat_Lahir='"+tftempatlahir.getText()+"',Tanggal_Lahir='"+tftanggal.getText()+"',Jenis_Kelamin='"+cbjenkel.getSelectedItem()+"',Jabatan='"+cbjabatan.getSelectedItem()+"',Alamat='"+tfalamat.getText()+"',No_telp='"+tfnotelp.getText()+"'where ID_Petugas='"+tfidpetugas.getText().trim()+"'";
        if(tfidpetugas.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Data masih kosong !","Edit Data",JOptionPane.WARNING_MESSAGE);
            tfidpetugas.requestFocus();
        }
        else {
            try {
                Statement stat=conec.createStatement();
                stat.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data sudah di edit","Edit Data",JOptionPane.WARNING_MESSAGE);

                //conec.close();
                tfidpetugas.setText("");
                tfnamapetugas.setText("");
                tftempatlahir.setText("");
                tftanggal.setText("");
                cbjenkel.setSelectedIndex(0);
                cbjabatan.setSelectedIndex(0);
                tfalamat.setText("");
                tfnotelp.setText("");
                tfidpetugas.requestFocus();

                nomoran();
                stat.close();
            }
            catch (Exception exc) {
                System.err.println("Error : "+exc);
            }
        }
        tabs();
    }//GEN-LAST:event_tbleditActionPerformed

    private void tblsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblsaveActionPerformed
        // TODO add your handling code here:
        String vid       = tfidpetugas.getText();
        String vnama     = tfnamapetugas.getText();
        String vtempat   = tftempatlahir.getText();
        String vtanggal  = tftanggal.getText();
        String vjenkel   = cbjenkel.getSelectedItem().toString();
        //if (vjenkel=="Laki-laki"){
            //} else if (vjenkel=="Perempuan"){}
        String vjabatan  = cbjabatan.getSelectedItem().toString();
        //if (vjabatan=="Admin"){
            //} else if (vjabatan=="Instruktur"){
            //} else if (vjabatan=="Direktur"){}
        String valamat   = tfalamat.getText();
        String vtelp     = tfnotelp.getText();
        if (tfidpetugas.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Data Masih Kosong",
                "PERHATIAN", JOptionPane.WARNING_MESSAGE);
        }
        else {
            try {
                java.sql.Statement stat=conec.createStatement();
                ResultSet data=stat.executeQuery("SELECT * FROM tblpetugas WHERE ID_Petugas='"+tfidpetugas.getText()+"'");
                if (data.next()){
                    JOptionPane.showMessageDialog(null,"ID Petugas sudah dimasukkan");
                    tfidpetugas.requestFocus();
                }
                else {
                    String sql = "INSERT INTO tblpetugas VALUES('"+vid+"','"+vnama+"','"+vtempat+"','"+vtanggal+"','"+vjenkel+"','"+vjabatan+"','"+valamat+"','"+vtelp+"')";
                    stat.executeUpdate(sql);
                    tfidpetugas.setText("");
                    tfnamapetugas.setText("");
                    tftempatlahir.setText("");
                    tftanggal.setText("");
                    cbjenkel.setSelectedIndex(0);
                    cbjabatan.setSelectedIndex(0);
                    tfalamat.setText("");
                    tfnotelp.setText("");
                    tfidpetugas.requestFocus();
                }
                nomoran();
                stat.close();
            }
            catch (Exception exc){
                System.err.println("Terjadi Kesalahan :"+exc);
            }
        }
        tabs();
    }//GEN-LAST:event_tblsaveActionPerformed

    private void tbldeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbldeleteActionPerformed
        // TODO add your handling code here:
        String sql="delete from tblpetugas where ID_Petugas='"+tfidpetugas.getText().trim()+"'";
        if(tfidpetugas.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "kode masih kosong !","Hapus Data",JOptionPane.WARNING_MESSAGE);
            tfidpetugas.requestFocus();
        }
        else
        {
            try
            {
                Statement stat=conec.createStatement();
                stat.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data sudah dihapus","Hapus Data",JOptionPane.WARNING_MESSAGE);
                stat.close();
                tfidpetugas.setText("");
                tfnamapetugas.setText("");
                tftempatlahir.setText("");
                tftanggal.setText("");
                cbjenkel.setSelectedIndex(0);
                cbjabatan.setSelectedIndex(0);
                tfalamat.setText("");
                tfnotelp.setText("");
                tfidpetugas.requestFocus();

                nomoran();
            }
            catch(Exception exc)
            {
                System.err.println(sql);
                System.err.println("Error : "+exc);
            }
        }
        tabs();
    }//GEN-LAST:event_tbldeleteActionPerformed

    private void tblcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblcancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_tblcancelActionPerformed

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
            java.util.logging.Logger.getLogger(Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Petugas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbjabatan;
    private javax.swing.JComboBox cbjenkel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton tblcancel;
    private javax.swing.JButton tbldelete;
    private javax.swing.JButton tbledit;
    private javax.swing.JTable tblpetugas;
    private javax.swing.JButton tblsave;
    private javax.swing.JButton tblsearch;
    private javax.swing.JTextArea tfalamat;
    private javax.swing.JTextField tfidpetugas;
    private javax.swing.JTextField tfnamapetugas;
    private javax.swing.JTextField tfnotelp;
    private javax.swing.JTextField tftanggal;
    private javax.swing.JTextField tftempatlahir;
    // End of variables declaration//GEN-END:variables
    private void koneksiDatabase() {
        //throw new UnsupportedOperationException("Not yet implemented");
              try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException cnf){}
        try {conec = DriverManager.getConnection("jdbc:mysql://localhost/sistempendaftaran","root","");
        System.out.println("Koneksi Sukses");
                }
        catch(SQLException se){
            System.out.println("Koneksi Gagal : "+se);
        }
        catch(Exception e){}
  
    }

    private void nomoran() {
       // throw new UnsupportedOperationException("Not yet implemented");
        String sql = "select right (ID_Petugas,3) as no from tblpetugas order by ID_Petugas asc";
        
        try {
            Statement pst = conec.prepareStatement(sql);
            Statement stat = conec.createStatement();
            ResultSet rs = pst.executeQuery(sql);
            if (rs.first()==false)
            {
                tfidpetugas.setText("P001");
            }
            else {
                rs.last();
                int no = rs.getInt(1)+1;
                String kbinasi = String.valueOf(no);
                int p_kmbinasi = kbinasi.length();
                String zero = "";
                for(int i=0; i<3-p_kmbinasi;i++){
                   // kbinasi = "0"+kbinasi;
                    zero = zero+"0";
                }
                tfidpetugas.setText("P"+zero+kbinasi);
            }
            rs.close();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan:"+e);
            
        }

    }
}