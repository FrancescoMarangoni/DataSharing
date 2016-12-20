package newpackage;


/**
 *
 * @author Francesco
 */

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClientGUI extends javax.swing.JFrame {
    private Client client;

    /**
     * Creates new form ClientGUI
     */
    public ClientGUI(Client cl) {
        initComponents();
        client = cl;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnConnetti = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        nomeSe = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnMostraRis = new javax.swing.JButton();
        btnOttieni = new javax.swing.JButton();
        nRis = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnAddRis = new javax.swing.JButton();
        nNewRis = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnConnetti.setText("connetti");
        BtnConnetti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConnettiActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        nomeSe.setText("jTextField1");

        jLabel1.setText("nome Server");

        btnMostraRis.setText("Lista Risorse");
        btnMostraRis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostraRisActionPerformed(evt);
            }
        });

        btnOttieni.setText("OttieniRisorsa");
        btnOttieni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOttieniActionPerformed(evt);
            }
        });

        nRis.setText("jTextField1");

        jLabel2.setText("nome risorsa");

        btnAddRis.setText("addRis");
        btnAddRis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRisActionPerformed(evt);
            }
        });

        nNewRis.setText("jTextField1");

        jLabel3.setText("nuova Risorsa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nRis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nNewRis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeSe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnConnetti)
                            .addComponent(btnOttieni)
                            .addComponent(btnAddRis))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnMostraRis)
                        .addContainerGap(61, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nNewRis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAddRis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnConnetti)
                            .addComponent(nomeSe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOttieni)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nRis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnMostraRis))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnConnettiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConnettiActionPerformed
        boolean ctrl;
        String s = nomeSe.getText();
        ctrl=client.connetti(s);
        if(ctrl)
            textArea.setText("connesso a server: "+s);
        else
            textArea.setText("fallita connessione a: "+s);
    }//GEN-LAST:event_BtnConnettiActionPerformed

    private void btnMostraRisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostraRisActionPerformed
        String s;
        s=Arrays.toString((String[])client.nomiRisorse());
        textArea.setText(s);
    }//GEN-LAST:event_btnMostraRisActionPerformed

    private void btnOttieniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOttieniActionPerformed
        String s=nRis.getText();
        Boolean ctrl = false;
        for(String temp :client.nomiRisorse()){
            if(s.equals(temp)){
                
                ctrl=true;
                break;
            }
            
        }
        if(ctrl==true)
            textArea.setText("Possiedi già la risorsa desiderata");
        else
            try {
                client.ottieniRisorsa(s);
        } catch (RemoteException ex) {
            Logger.getLogger(ClientGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnOttieniActionPerformed

    private void btnAddRisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRisActionPerformed
        client.addRis(new Risorsa(nNewRis.getText()));
    }//GEN-LAST:event_btnAddRisActionPerformed

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
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if(args.length<1){
                    System.exit(-1);
                    System.out.println("argomeni: nomeClient(obbligatorio) risorsa1 risorsa 2 ...");
                }
                Client cl= new Client(args[0]);
                /*if(args.length>1){
                    for(int i = 1;i<args.length;i++)
                        cl.addRis(new Risorsa(args[i]));
                }*/
                    
                new ClientGUI(cl).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConnetti;
    private javax.swing.JButton btnAddRis;
    private javax.swing.JButton btnMostraRis;
    private javax.swing.JButton btnOttieni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nNewRis;
    private javax.swing.JTextField nRis;
    private javax.swing.JTextField nomeSe;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}