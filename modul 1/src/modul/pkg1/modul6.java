/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package modul.pkg1;

/**
 *
 * @author PC RPL - R1
 */
public class modul6 extends javax.swing.JFrame {

    /**
     * Creates new form modul6
     */
    public modul6() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        ListMakanan = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListMinuman = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListOlahraga = new javax.swing.JList<>();
        bProses = new javax.swing.JButton();
        bBersih = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        MemoResume = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Makanan");

        ListMakanan.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Mie Hot", "Mie Ramen", "Mie Seafood", "Mie Kari", "Ayam Pop" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListMakanan);

        jLabel2.setText("Minuman");

        ListMinuman.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Jus Alpukat", "Jus Mangga", "Jus Wortel", "Jus Nanas", "Es Serut" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(ListMinuman);

        jLabel3.setText("Olahraga");

        ListOlahraga.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Bulu Tangkis", "Sepak Takraw", "Bersepeda", "Futsal", "Basket" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(ListOlahraga);

        bProses.setText("Proses");
        bProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProsesActionPerformed(evt);
            }
        });

        bBersih.setText("Bersih");

        MemoResume.setColumns(20);
        MemoResume.setRows(5);
        jScrollPane4.setViewportView(MemoResume);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel2)
                                .addGap(125, 125, 125)
                                .addComponent(jLabel3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bBersih)
                            .addComponent(bProses))
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(bProses)
                        .addGap(18, 18, 18)
                        .addComponent(bBersih))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProsesActionPerformed
        // Mendapatkan index yang dipilih dari ListMakanan
    int indexMakanan = ListMakanan.getSelectedIndex();
    
    // Mendapatkan index minimal dan maksimal dari ListMinuman
    int indexMinMinuman = ListMinuman.getMinSelectionIndex();
    int indexMaxMinuman = ListMinuman.getMaxSelectionIndex();

    // Membuat string hasil yang akan ditampilkan di MemoResume
    StringBuilder kalimat = new StringBuilder();
    
    // Menambahkan daftar makanan yang dipilih
    kalimat.append("Daftar Makanan yang dipilih : \n");
    if (indexMakanan != -1) {
        kalimat.append(ListMakanan.getModel().getElementAt(indexMakanan).toString()).append("\n");
    } else {
        kalimat.append("Tidak ada makanan yang dipilih.\n");
    }
    
    // Menambahkan daftar minuman yang dipilih
    kalimat.append("Daftar Minuman yang dipilih : \n");
    if (indexMinMinuman != -1) {
        for (int i = indexMinMinuman; i <= indexMaxMinuman; i++) {
            kalimat.append(ListMinuman.getModel().getElementAt(i).toString()).append("\n");
        }
    } else {
        kalimat.append("Tidak ada minuman yang dipilih.\n");
    }
    
    // Menambahkan daftar olahraga yang dipilih
    kalimat.append("Daftar Olahraga yang dipilih : \n");
    int[] selectedIndicesOlahraga = ListOlahraga.getSelectedIndices();
    if (selectedIndicesOlahraga.length > 0) {
        for (int index : selectedIndicesOlahraga) {
            kalimat.append(ListOlahraga.getModel().getElementAt(index).toString()).append("\n");
        }
    } else {
        kalimat.append("Tidak ada olahraga yang dipilih.\n");
    }
    
    // Mengupdate text di MemoResume dengan hasil
    MemoResume.setText(kalimat.toString());

    }//GEN-LAST:event_bProsesActionPerformed

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
            java.util.logging.Logger.getLogger(modul6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modul6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modul6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modul6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modul6().setVisible(true);
}
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListMakanan;
    private javax.swing.JList<String> ListMinuman;
    private javax.swing.JList<String> ListOlahraga;
    private javax.swing.JTextArea MemoResume;
    private javax.swing.JButton bBersih;
    private javax.swing.JButton bProses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
