/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sis_pendaftaran;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author TOSHIBA
 */
public class DataPetugas extends javax.swing.JFrame {
    private Connection conec;
    private JasperDesign Jasper_Design;
    private JasperReport Jasper_Report;
    private Map<String, Object> Parameter = new HashMap<String, Object>();
    private JasperPrint Jasper_Print;
    /**
     * Creates new form DataPetugas
     */
    public DataPetugas() {
        initComponents();
        koneksiDatabase();
    }

    private void koneksiDatabase() {
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        tblcetak = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1370, 735));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblcetak.setText("Cetak");
        tblcetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblcetakActionPerformed(evt);
            }
        });
        getContentPane().add(tblcetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 138, -1, -1));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-416)/2, (screenSize.height-338)/2, 416, 338);
    }// </editor-fold>//GEN-END:initComponents

    private void tblcetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblcetakActionPerformed
        // TODO add your handling code here:
             try {
            File report = new File("src/report/reportpetugas.jrxml");
            Jasper_Design = JRXmlLoader.load(report);
            Parameter.clear();
            Jasper_Report = JasperCompileManager.compileReport(Jasper_Design);
            Jasper_Print = JasperFillManager.fillReport(Jasper_Report, Parameter, conec);
            JasperViewer.viewReport(Jasper_Print,false);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_tblcetakActionPerformed

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
            java.util.logging.Logger.getLogger(DataPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataPetugas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton tblcetak;
    // End of variables declaration//GEN-END:variables
}