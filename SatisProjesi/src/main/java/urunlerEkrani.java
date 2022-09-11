
import com.lesson.hibernate.entity.Calisan;
import com.lesson.hibernate.entity.Tedarikci;
import com.lesson.hibernate.entity.Urun;
import com.lesson.hibernate.util.HibernateUtil;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.hibernate.Session;
import org.hibernate.Transaction;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tako
 */
public class urunlerEkrani extends javax.swing.JFrame {

    DefaultTableModel model;

    public urunlerEkrani() {
        initComponents();
        model = (DefaultTableModel) urunTablo.getModel();
    }

    public ArrayList<Urun> getUrunArrayList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        ArrayList<Urun> urunler = null;

        try {
            transaction = session.beginTransaction();
            urunler = (ArrayList<Urun>) session.createQuery("from Urun", Urun.class).list();

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return urunler;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        urunTablo = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        ekleButon = new javax.swing.JButton();
        SilButon = new javax.swing.JButton();
        duzenleButon = new javax.swing.JButton();
        urunNotxt = new javax.swing.JTextField();
        urunAditext = new javax.swing.JTextField();
        skokMiktaritxt = new javax.swing.JTextField();
        urunNo1 = new javax.swing.JLabel();
        urunFiyat1 = new javax.swing.JLabel();
        urunAdi1 = new javax.swing.JLabel();
        urunSiltext = new javax.swing.JLabel();
        urunSiltxt = new javax.swing.JTextField();
        stok1 = new javax.swing.JLabel();
        urunFiyatText = new javax.swing.JTextField();
        aramaCubugu = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        urunListele = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        urunTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ürün No", "Ürün Adı", "Stok", "Fiyat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(urunTablo);

        ekleButon.setText("Ekle");
        ekleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleButonActionPerformed(evt);
            }
        });

        SilButon.setText("Sil");
        SilButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SilButonActionPerformed(evt);
            }
        });

        duzenleButon.setText("Düzenle");
        duzenleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duzenleButonActionPerformed(evt);
            }
        });

        urunNotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunNotxtActionPerformed(evt);
            }
        });

        urunAditext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunAditextActionPerformed(evt);
            }
        });

        skokMiktaritxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skokMiktaritxtActionPerformed(evt);
            }
        });

        urunNo1.setText("Ürün No:");

        urunFiyat1.setText("Fiyat:");

        urunAdi1.setText("Ürün Adı:");

        urunSiltext.setText("Silinmesi İstenen Ürün Id");

        stok1.setText("Stok Miktarı:");

        urunFiyatText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunFiyatTextActionPerformed(evt);
            }
        });

        aramaCubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                aramaCubuguKeyReleased(evt);
            }
        });

        jTextField1.setText("Ara:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(urunNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(urunAdi1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stok1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(urunFiyat1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(urunAditext, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(urunNotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(skokMiktaritxt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(urunFiyatText, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(duzenleButon)
                                    .addComponent(ekleButon, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(aramaCubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(urunSiltext, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(urunSiltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(SilButon, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(445, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urunNotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(urunNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(urunAditext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(urunAdi1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(ekleButon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(duzenleButon)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(skokMiktaritxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stok1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urunFiyat1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(urunFiyatText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aramaCubugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urunSiltext)
                    .addComponent(urunSiltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SilButon))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        urunListele.setText("Ürünleri Listele");
        urunListele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunListeleActionPerformed(evt);
            }
        });

        jLabel2.setText("İşlem yaptırdıktan sonra listele butonuna basınız.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(urunListele, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(urunListele, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ekleButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleButonActionPerformed
        //ürün eklemek için gerekli özel hibernate fonksiyonları ile veri tabanına veri eklenmesi

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        transaction = session.beginTransaction();

        Urun urun = new Urun();

        urun.setUrunAdi(urunAditext.getText());
        urun.setStokMiktari(Integer.parseInt(skokMiktaritxt.getText()));
        urun.setFiyat(Double.parseDouble(urunFiyatText.getText()));

        session.save(urun);
        transaction.commit();
        session.close();
    }//GEN-LAST:event_ekleButonActionPerformed

    private void SilButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SilButonActionPerformed
        //ürün silmek için gerekli özel hibernate fonksiyonları ile veri tabanına veri eklenmesi

        Transaction transaction = null;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Urun urunler = new Urun();

            urunler.setUrunNo(Integer.parseInt(urunSiltxt.getText()));
            if (urunler.getUrunNo() == Integer.parseInt(urunSiltxt.getText())) {
                session.delete(urunler);
                transaction.commit();

            } else {
                JOptionPane.showMessageDialog(null, "Ürün Mevcut değil");
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }//GEN-LAST:event_SilButonActionPerformed

    private void duzenleButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duzenleButonActionPerformed
        //kullanıcının jTable dan mouse ile seçtiği değerin güncellenmesi
        DefaultTableModel model = (DefaultTableModel) urunTablo.getModel();
        int index = urunTablo.getSelectedRow();
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            Urun urunler = (Urun) session.get(Urun.class, index + 1);

            String YeniUrun = JOptionPane.showInputDialog(null, "Yeni Ürün ADI:", urunler.getUrunAdi());
            String YeniStok = JOptionPane.showInputDialog(null, "Yeni Stok :", urunler.getStokMiktari());
            String YeniFiyat = JOptionPane.showInputDialog(null, "Yeni Fiyat :", urunler.getFiyat());
            model.setValueAt(YeniUrun, index, 1);
            model.setValueAt(Integer.parseInt(YeniStok), index, 2);
            model.setValueAt(Double.parseDouble(YeniFiyat), index, 3);

            urunler.setUrunAdi(YeniUrun);

            transaction.commit();

            JOptionPane.showMessageDialog(null, "Urun Başarıyla Değiştirildi");
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();

        }
    }//GEN-LAST:event_duzenleButonActionPerformed

    private void urunNotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urunNotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urunNotxtActionPerformed

    private void urunAditextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urunAditextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urunAditextActionPerformed

    private void skokMiktaritxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skokMiktaritxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_skokMiktaritxtActionPerformed

    private void urunFiyatTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urunFiyatTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urunFiyatTextActionPerformed

    private void urunListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urunListeleActionPerformed
        // TODO add your handling code here:
        try {
            ArrayList<Urun> urunler = getUrunArrayList();

            while (model.getRowCount() > 0) {// Satır sayısı 0 lanana kadar 0. sıradaki satırı sileceğiz. Böylece tablo boşaltılacak.
                model.removeRow(0);
            }

            for (Urun urun : urunler) {
                Object[] row = {urun.getUrunNo(), urun.getUrunAdi(),
                    urun.getStokMiktari(), urun.getFiyat()};
                model.addRow(row);
            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_urunListeleActionPerformed
    public void dinamikAra(String ara) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        urunTablo.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(ara));

    }
    private void aramaCubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aramaCubuguKeyReleased
        String ara = aramaCubugu.getText();
        dinamikAra(ara);
    }//GEN-LAST:event_aramaCubuguKeyReleased

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
            java.util.logging.Logger.getLogger(urunlerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(urunlerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(urunlerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(urunlerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new urunlerEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SilButon;
    private javax.swing.JTextField aramaCubugu;
    private javax.swing.JButton duzenleButon;
    private javax.swing.JButton ekleButon;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField skokMiktaritxt;
    private javax.swing.JLabel stok1;
    private javax.swing.JLabel urunAdi1;
    private javax.swing.JTextField urunAditext;
    private javax.swing.JLabel urunFiyat1;
    private javax.swing.JTextField urunFiyatText;
    private javax.swing.JButton urunListele;
    private javax.swing.JLabel urunNo1;
    private javax.swing.JTextField urunNotxt;
    private javax.swing.JLabel urunSiltext;
    private javax.swing.JTextField urunSiltxt;
    private javax.swing.JTable urunTablo;
    // End of variables declaration//GEN-END:variables
}