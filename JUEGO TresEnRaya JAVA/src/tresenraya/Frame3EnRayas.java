/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresenraya;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.applet.AudioClip;

/**
 *
 * @author navag
 */
public class Frame3EnRayas extends javax.swing.JFrame {

    /**
     * Creates new form Frame3EnRayas
     */
    JuegoMetodos comprobar = new JuegoMetodos();
    TresEnRaya tr = new TresEnRaya();

    FondoPanel fondo = new FondoPanel();

    public Frame3EnRayas() {
        this.setContentPane(fondo);
        setResizable(false);
        initComponents();
        botonTrasparente();
        this.setLocationRelativeTo(null);
        jturno.setText(comprobar.turnoDe().toUpperCase());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel1();
        j1 = new javax.swing.JButton();
        j2 = new javax.swing.JButton();
        j3 = new javax.swing.JButton();
        j4 = new javax.swing.JButton();
        j5 = new javax.swing.JButton();
        j6 = new javax.swing.JButton();
        j7 = new javax.swing.JButton();
        j8 = new javax.swing.JButton();
        j9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jturno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        j1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        j1.setForeground(new java.awt.Color(204, 0, 0));
        j1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1ActionPerformed(evt);
            }
        });

        j2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        j2.setForeground(new java.awt.Color(204, 0, 0));
        j2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2ActionPerformed(evt);
            }
        });

        j3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        j3.setForeground(new java.awt.Color(204, 0, 0));
        j3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j3ActionPerformed(evt);
            }
        });

        j4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        j4.setForeground(new java.awt.Color(204, 0, 0));
        j4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j4ActionPerformed(evt);
            }
        });

        j5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        j5.setForeground(new java.awt.Color(204, 0, 0));
        j5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j5ActionPerformed(evt);
            }
        });

        j6.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        j6.setForeground(new java.awt.Color(204, 0, 0));
        j6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j6ActionPerformed(evt);
            }
        });

        j7.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        j7.setForeground(new java.awt.Color(204, 0, 0));
        j7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j7ActionPerformed(evt);
            }
        });

        j8.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        j8.setForeground(new java.awt.Color(204, 0, 0));
        j8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j8ActionPerformed(evt);
            }
        });

        j9.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        j9.setForeground(new java.awt.Color(204, 0, 0));
        j9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(j7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(j2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(j5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(j8, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(j3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(j6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(j9, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(j4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(j5, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(j6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(255, 0, 51));
        jLabel1.setFont(new java.awt.Font("Han Solo 3D", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("TURNO DE:");

        jturno.setBackground(new java.awt.Color(204, 0, 0));
        jturno.setFont(new java.awt.Font("Han Solo 3D", 1, 48)); // NOI18N
        jturno.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jturno, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jturno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void j1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1ActionPerformed

        //mete en la variable ganador el nombre de la persona que esta en su turno.
        
        String ganador = comprobar.turnoDe().toUpperCase();
        if(tr.isTurno())
            //si es el turno del jugador 1 pinta de rojo su letra
            j1.setForeground(Color.RED);
        else
            j1.setForeground(Color.BLACK); ////si es el turno del jugador 2 pinta de negro su letra
        j1.setText(comprobar.insertarPosicionJugador(0, 0)); //envia la posicion que ha pulsado el jugador
        ganadorEmpate(ganador);//comprueba si ha ganado o empatado alguien.
        jturno.setText(comprobar.turnoDe().toUpperCase());  //cambia el nombre del turno del jugador.
        j1.setEnabled(false); // hace que el boton no se pueda pulsar


    }//GEN-LAST:event_j1ActionPerformed

    private void j2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2ActionPerformed
        // TODO add your handling code here:

        String ganador = comprobar.turnoDe().toUpperCase();
        if(tr.isTurno())
            j2.setForeground(Color.RED);
        else
            j2.setForeground(Color.BLACK);
        j2.setText(comprobar.insertarPosicionJugador(0, 1));
        ganadorEmpate(ganador);
        jturno.setText(comprobar.turnoDe().toUpperCase());
        j2.setEnabled(false);
    }//GEN-LAST:event_j2ActionPerformed

    private void j3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j3ActionPerformed
        // TODO add your handling code here:

        String ganador = comprobar.turnoDe().toUpperCase();
        if(tr.isTurno())
            j3.setForeground(Color.RED);
        else
            j3.setForeground(Color.BLACK);
        j3.setText(comprobar.insertarPosicionJugador(0, 2));
        ganadorEmpate(ganador);
        jturno.setText(comprobar.turnoDe().toUpperCase());
        j3.setEnabled(false);
    }//GEN-LAST:event_j3ActionPerformed

    private void j4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j4ActionPerformed
        // TODO add your handling code here:

        String ganador = comprobar.turnoDe().toUpperCase();
        if(tr.isTurno())
            j4.setForeground(Color.RED);
        else
            j4.setForeground(Color.BLACK);
        j4.setText(comprobar.insertarPosicionJugador(1, 0));
        ganadorEmpate(ganador);
        jturno.setText(comprobar.turnoDe().toUpperCase());
        j4.setEnabled(false);
    }//GEN-LAST:event_j4ActionPerformed

    private void j5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j5ActionPerformed
        // TODO add your handling code here:

        String ganador = comprobar.turnoDe().toUpperCase();
        if(tr.isTurno())
            j5.setForeground(Color.RED);
        else
            j5.setForeground(Color.BLACK);
        j5.setText(comprobar.insertarPosicionJugador(1, 1));
        ganadorEmpate(ganador);
        jturno.setText(comprobar.turnoDe().toUpperCase());
        j5.setEnabled(false);
    }//GEN-LAST:event_j5ActionPerformed

    private void j6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j6ActionPerformed
        // TODO add your handling code here:

        String ganador = comprobar.turnoDe().toUpperCase();
        if(tr.isTurno())
            j6.setForeground(Color.RED);
        else
            j6.setForeground(Color.BLACK);
        j6.setText(comprobar.insertarPosicionJugador(1, 2));
        ganadorEmpate(ganador);
        jturno.setText(comprobar.turnoDe().toUpperCase());
        j6.setEnabled(false);
    }//GEN-LAST:event_j6ActionPerformed

    private void j7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j7ActionPerformed
        // TODO add your handling code here:

        String ganador = comprobar.turnoDe().toUpperCase();
        if(tr.isTurno())
            j7.setForeground(Color.RED);
        else
            j7.setForeground(Color.BLACK);
        j7.setText(comprobar.insertarPosicionJugador(2, 0));
        ganadorEmpate(ganador);
        jturno.setText(comprobar.turnoDe().toUpperCase());
        j7.setEnabled(false);
    }//GEN-LAST:event_j7ActionPerformed

    private void j8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j8ActionPerformed
        // TODO add your handling code here:

        String ganador = comprobar.turnoDe().toUpperCase();
        if(tr.isTurno())
            j8.setForeground(Color.RED);
        else
            j8.setForeground(Color.BLACK);
        j8.setText(comprobar.insertarPosicionJugador(2, 1));
        ganadorEmpate(ganador);
        jturno.setText(comprobar.turnoDe().toUpperCase());
        j8.setEnabled(false);
    }//GEN-LAST:event_j8ActionPerformed

    private void j9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j9ActionPerformed
        // TODO add your handling code here:

        String ganador = comprobar.turnoDe().toUpperCase();
        if(tr.isTurno())
            j9.setForeground(Color.RED);
        else
            j9.setForeground(Color.BLACK);
        j9.setText(comprobar.insertarPosicionJugador(2, 2));
        ganadorEmpate(ganador);
        jturno.setText(comprobar.turnoDe().toUpperCase());
        j9.setEnabled(false);
    }//GEN-LAST:event_j9ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame3EnRayas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame3EnRayas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame3EnRayas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame3EnRayas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame3EnRayas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton j1;
    private javax.swing.JButton j2;
    private javax.swing.JButton j3;
    private javax.swing.JButton j4;
    private javax.swing.JButton j5;
    private javax.swing.JButton j6;
    private javax.swing.JButton j7;
    private javax.swing.JButton j8;
    private javax.swing.JButton j9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jturno;
    // End of variables declaration//GEN-END:variables
class FondoPanel1 extends JPanel {
    //imagen de fondo del jpanel
        private Image imagen;

        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/foto1.jpg")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);
        }
    }

    class FondoPanel extends JPanel {
        // imagen de fondo del jframe
        private Image imagen;

        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/2.gif")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);
        }
    }

    public void botonTrasparente() {
        //hago todos los botones invisibles, opacos,sin borde.
        j1.setOpaque(false);
        j1.setContentAreaFilled(false);
        j1.setBorderPainted(false);
        j2.setOpaque(false);
        j2.setContentAreaFilled(false);
        j2.setBorderPainted(false);
        j3.setOpaque(false);
        j3.setContentAreaFilled(false);
        j3.setBorderPainted(false);
        j4.setOpaque(false);
        j4.setContentAreaFilled(false);
        j4.setBorderPainted(false);
        j5.setOpaque(false);
        j5.setContentAreaFilled(false);
        j5.setBorderPainted(false);
        j6.setOpaque(false);
        j6.setContentAreaFilled(false);
        j6.setBorderPainted(false);
        j7.setOpaque(false);
        j7.setContentAreaFilled(false);
        j7.setBorderPainted(false);
        j8.setOpaque(false);
        j8.setContentAreaFilled(false);
        j8.setBorderPainted(false);
        j9.setOpaque(false);
        j9.setContentAreaFilled(false);
        j9.setBorderPainted(false);
    }

    private void pantallaInicio() {
        // cambia a la pantalla de inicio y esta la oculta
        FrameInicio obj = new FrameInicio();
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
        this.dispose();
    }

    private void ganadorEmpate(String ganador) {

        if (comprobar.ganador()) { //comprueba si alguien ha ganado
            JOptionPane.showMessageDialog(null, "HAS GANADO: " + ganador, "MAQUINA", JOptionPane.WARNING_MESSAGE);
            pantallaInicio(); // si alguien ha ganado volvemos a la pantalla de inicio
        } else if (comprobar.empate() > 8) { //comprueba si han empatado.
            JOptionPane.showMessageDialog(null, "EMPATE TECNICO!!!", "MAQUINA", JOptionPane.WARNING_MESSAGE);
            pantallaInicio();
        }
        
        

    }

}