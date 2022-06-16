
public class Calculadora extends javax.swing.JFrame {
    int numeroUno;
    int numeroDos;
    String simbolo;

    public Calculadora() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton11 = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        BtnC = new javax.swing.JButton();
        BtnBorrar = new javax.swing.JButton();
        BtnDivision = new javax.swing.JButton();
        BtnCuatro = new javax.swing.JButton();
        BtnUno = new javax.swing.JButton();
        BtnSiete = new javax.swing.JButton();
        BtnOcho = new javax.swing.JButton();
        BtnNueve = new javax.swing.JButton();
        BtnCinco = new javax.swing.JButton();
        BtnSeis = new javax.swing.JButton();
        BtnResta = new javax.swing.JButton();
        BtnDos = new javax.swing.JButton();
        BtnMultiplicacion = new javax.swing.JButton();
        BtnTres = new javax.swing.JButton();
        BtnSuma = new javax.swing.JButton();
        BtnCero = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        BtnResultado = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        pantalla = new javax.swing.JLabel();

        jButton11.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        btnCE.setText("CE");
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });

        BtnC.setText("C");
        BtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCActionPerformed(evt);
            }
        });

        BtnBorrar.setText("⌫");
        BtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarActionPerformed(evt);
            }
        });

        BtnDivision.setText("÷");
        BtnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDivisionActionPerformed(evt);
            }
        });

        BtnCuatro.setText("4");
        BtnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCuatroActionPerformed(evt);
            }
        });

        BtnUno.setText("1");
        BtnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUnoActionPerformed(evt);
            }
        });

        BtnSiete.setText("7");
        BtnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSieteActionPerformed(evt);
            }
        });

        BtnOcho.setText("8");
        BtnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOchoActionPerformed(evt);
            }
        });

        BtnNueve.setText("9");
        BtnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNueveActionPerformed(evt);
            }
        });

        BtnCinco.setText("5");
        BtnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCincoActionPerformed(evt);
            }
        });

        BtnSeis.setText("6");
        BtnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeisActionPerformed(evt);
            }
        });

        BtnResta.setText("-");
        BtnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRestaActionPerformed(evt);
            }
        });

        BtnDos.setText("2");
        BtnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDosActionPerformed(evt);
            }
        });

        BtnMultiplicacion.setText("x");
        BtnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMultiplicacionActionPerformed(evt);
            }
        });

        BtnTres.setText("3");
        BtnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTresActionPerformed(evt);
            }
        });

        BtnSuma.setText("+");
        BtnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSumaActionPerformed(evt);
            }
        });

        BtnCero.setText("0");
        BtnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCeroActionPerformed(evt);
            }
        });

        jButton19.setText(",");

        jButton20.setText("000");

        BtnResultado.setText("=");
        BtnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResultadoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));

        pantalla.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        pantalla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pantalla.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(BtnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(BtnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(BtnCero, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnC, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCeroActionPerformed
        this.printNumber("0");
    }//GEN-LAST:event_BtnCeroActionPerformed

    private void BtnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUnoActionPerformed
        this.printNumber("1");
    }//GEN-LAST:event_BtnUnoActionPerformed

    private void BtnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDosActionPerformed
        this.printNumber("2");
    }//GEN-LAST:event_BtnDosActionPerformed

    private void BtnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTresActionPerformed
        this.printNumber("3");
    }//GEN-LAST:event_BtnTresActionPerformed

    private void BtnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCuatroActionPerformed
        this.printNumber("4");
    }//GEN-LAST:event_BtnCuatroActionPerformed

    private void BtnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCincoActionPerformed
        this.printNumber("5");
    }//GEN-LAST:event_BtnCincoActionPerformed

    private void BtnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeisActionPerformed
        this.printNumber("6");
    }//GEN-LAST:event_BtnSeisActionPerformed

    private void BtnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSieteActionPerformed
        this.printNumber("7");
    }//GEN-LAST:event_BtnSieteActionPerformed

    private void BtnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOchoActionPerformed
        this.printNumber("8");
    }//GEN-LAST:event_BtnOchoActionPerformed

    private void BtnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNueveActionPerformed
        this.printNumber("9");
    }//GEN-LAST:event_BtnNueveActionPerformed

    private void BtnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSumaActionPerformed
        numeroUno=Integer.parseInt(this.pantalla.getText());
        System.out.println(numeroUno);
        this.pantalla.setText("");
        simbolo="+";
    }//GEN-LAST:event_BtnSumaActionPerformed

    private void BtnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResultadoActionPerformed
        numeroDos=Integer.parseInt(this.pantalla.getText());
        switch (simbolo){
            case "+":int suma=numeroUno+numeroDos;
                     this.pantalla.setText(Integer.toString(suma));
                     break;
            case "-":int resta=numeroUno-numeroDos;
                     this.pantalla.setText(Integer.toString(resta));
                     break;
            case "*":int multiplicacion=numeroUno*numeroDos;
                    this.pantalla.setText(Integer.toString(multiplicacion));
                    break;
            case "/":int division=numeroUno/numeroDos;
                    this.pantalla.setText(Integer.toString(division));
                    break;
        }
    }//GEN-LAST:event_BtnResultadoActionPerformed

    private void BtnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMultiplicacionActionPerformed
        numeroUno=Integer.parseInt(this.pantalla.getText());
        System.out.println(numeroUno);
        this.pantalla.setText("");
        simbolo="*";
    }//GEN-LAST:event_BtnMultiplicacionActionPerformed

    private void BtnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRestaActionPerformed
        numeroUno=Integer.parseInt(this.pantalla.getText());
        System.out.println(numeroUno);
        this.pantalla.setText("");
        simbolo="-";
    }//GEN-LAST:event_BtnRestaActionPerformed

    private void BtnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDivisionActionPerformed
        numeroUno=Integer.parseInt(this.pantalla.getText());
        System.out.println(numeroUno);
        this.pantalla.setText("");
        simbolo="/";
    }//GEN-LAST:event_BtnDivisionActionPerformed

    private void BtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarActionPerformed
        String pantalla;
        pantalla=this.pantalla.getText();
        if(pantalla.length()>0){
        pantalla=pantalla.substring(0,pantalla.length()-1);}
        this.pantalla.setText(pantalla);
    }//GEN-LAST:event_BtnBorrarActionPerformed

    private void BtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCActionPerformed
        this.pantalla.setText("");
    }//GEN-LAST:event_BtnCActionPerformed

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        
    }//GEN-LAST:event_btnCEActionPerformed
    private void printNumber(String buttonText){
        String pantalla = this.pantalla.getText();
        if(pantalla.length() < 8){
            if(buttonText.equals(".")){
                if(!pantalla.contains(".")){
                    pantalla += ".";
                } 
            } else {
                if(pantalla.equals("0")){
                    pantalla = buttonText;
                } else {
                    pantalla += buttonText;            
                }   
            }            
            this.pantalla.setText(pantalla);
        }    
    }

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBorrar;
    private javax.swing.JButton BtnC;
    private javax.swing.JButton BtnCero;
    private javax.swing.JButton BtnCinco;
    private javax.swing.JButton BtnCuatro;
    private javax.swing.JButton BtnDivision;
    private javax.swing.JButton BtnDos;
    private javax.swing.JButton BtnMultiplicacion;
    private javax.swing.JButton BtnNueve;
    private javax.swing.JButton BtnOcho;
    private javax.swing.JButton BtnResta;
    private javax.swing.JButton BtnResultado;
    private javax.swing.JButton BtnSeis;
    private javax.swing.JButton BtnSiete;
    private javax.swing.JButton BtnSuma;
    private javax.swing.JButton BtnTres;
    private javax.swing.JButton BtnUno;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel pantalla;
    // End of variables declaration//GEN-END:variables
}
