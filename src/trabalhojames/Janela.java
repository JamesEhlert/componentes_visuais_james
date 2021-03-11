/*
NOME: JAMES RAFAEL EHLERT REINARD
TURMA: TADS 3N
TRABALHO: CALCULADORA DE IMC
 */
package trabalhojames;

public class Janela extends javax.swing.JFrame {

    public Janela() {
        initComponents();
    }
    
    float peso, altura, imc;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JCalcular = new javax.swing.JButton();
        JPeso = new javax.swing.JTextField();
        JAltura = new javax.swing.JTextField();
        JResultado = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JCalcular.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JCalcular.setText("CALCULAR");
        JCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(JCalcular);
        JCalcular.setBounds(150, 340, 140, 50);

        JPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPesoActionPerformed(evt);
            }
        });
        getContentPane().add(JPeso);
        JPeso.setBounds(150, 140, 150, 50);

        JAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JAlturaActionPerformed(evt);
            }
        });
        getContentPane().add(JAltura);
        JAltura.setBounds(150, 250, 150, 50);

        JResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JResultadoActionPerformed(evt);
            }
        });
        getContentPane().add(JResultado);
        JResultado.setBounds(150, 440, 390, 70);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(570, 450, 130, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("PESO:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 140, 60, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("ALTURA (CM):");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 260, 130, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setText("CALCULADORA DE IMC");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 10, 670, 90);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("RESULTADO:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 440, 140, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCalcularActionPerformed
        peso = Float.parseFloat(JPeso.getText());
        altura = Float.parseFloat(JAltura.getText());
        altura = altura/100;
        imc = peso / (altura * altura);
        //imc = ("%.2f \n",imc);
        JResultado.setText(String.valueOf(imc));
        
        if(imc < 18){
        JResultado.setText("Seu IMC e: "+imc+", Voce está abaixo do pesso ideal.");
    }
        else if(imc >= 18 && imc <= 25){
        JResultado.setText("Seu IMC e: "+imc+", Voce está dentro do pesso ideal.");
    }
         else if(imc > 25){
        JResultado.setText("Seu IMC e: "+imc+", Voce está acima do pesso ideal.");
    }
        
    }//GEN-LAST:event_JCalcularActionPerformed

    private void JPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JPesoActionPerformed

    private void JAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JAlturaActionPerformed

    private void JResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JResultadoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JPeso.setText("");
        JAltura.setText("");
        JResultado.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JAltura;
    private javax.swing.JButton JCalcular;
    private javax.swing.JTextField JPeso;
    private javax.swing.JTextField JResultado;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
