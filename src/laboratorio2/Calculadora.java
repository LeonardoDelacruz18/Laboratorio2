package laboratorio2;

public class Calculadora extends javax.swing.JFrame {

    
    public Calculadora() {
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
        jLabel2 = new javax.swing.JLabel();
        Txt_Numero1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Txt_Numero2 = new javax.swing.JTextField();
        BTN_Sumar = new javax.swing.JButton();
        BTN_Restar = new javax.swing.JButton();
        BTN_Multiplicar = new javax.swing.JButton();
        BTN_Dividir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Lbl_Resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("CALCULADORA!!!");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("NÚMERO 1:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("NÚMERO 2:");

        BTN_Sumar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BTN_Sumar.setText("+");
        BTN_Sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SumarActionPerformed(evt);
            }
        });

        BTN_Restar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BTN_Restar.setText("-");
        BTN_Restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_RestarActionPerformed(evt);
            }
        });

        BTN_Multiplicar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BTN_Multiplicar.setText("*");
        BTN_Multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_MultiplicarActionPerformed(evt);
            }
        });

        BTN_Dividir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BTN_Dividir.setText("/");
        BTN_Dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_DividirActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("RESULTADO: ");

        Lbl_Resultado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Lbl_Resultado.setText("00.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_Numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_Numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Lbl_Resultado))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTN_Sumar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_Restar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_Multiplicar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_Dividir)))))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Txt_Numero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Txt_Numero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Sumar)
                    .addComponent(BTN_Restar)
                    .addComponent(BTN_Multiplicar)
                    .addComponent(BTN_Dividir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Lbl_Resultado))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public Operaciones Oper(){
        float num1 = Float.parseFloat(Txt_Numero1.getText());
        float num2 = Float.parseFloat(Txt_Numero2.getText());
        
        Operaciones oper = new Operaciones(num1, num2);
         
        return oper;
    }   
    
    private void BTN_SumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SumarActionPerformed
        Operaciones oper = Oper();
        Lbl_Resultado.setText(oper.Sumar() + "");
    }//GEN-LAST:event_BTN_SumarActionPerformed

    private void BTN_RestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RestarActionPerformed
        Operaciones oper = Oper();
        Lbl_Resultado.setText(oper.Restar() + "");
    }//GEN-LAST:event_BTN_RestarActionPerformed

    private void BTN_MultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_MultiplicarActionPerformed
        Operaciones oper = Oper();
        Lbl_Resultado.setText(oper.Multiplicar() + "");
    }//GEN-LAST:event_BTN_MultiplicarActionPerformed

    private void BTN_DividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_DividirActionPerformed
        Operaciones oper = Oper();
        Lbl_Resultado.setText(oper.Dividir() + "");
    }//GEN-LAST:event_BTN_DividirActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });       
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Dividir;
    private javax.swing.JButton BTN_Multiplicar;
    private javax.swing.JButton BTN_Restar;
    private javax.swing.JButton BTN_Sumar;
    private javax.swing.JLabel Lbl_Resultado;
    private javax.swing.JTextField Txt_Numero1;
    private javax.swing.JTextField Txt_Numero2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
