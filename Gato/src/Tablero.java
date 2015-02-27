


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Tablero extends javax.swing.JFrame {

    private boolean ganador;//cuando hay un ganador sera verdadero
    private int empate;//cuenta los empates
    private boolean turno;//esta lleva el flujo de los turnos true = jugador1 ; false = jugador2
    private JButton btnNumero[];
    private Jugador jugador1;
    private Jugador jugador2;
    private Timer tiempo;

    @SuppressWarnings("empty-statement")
    public Tablero() {

        this.initComponents();
        this.inicializarAtributos();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        this.pedirNombre();

        tiempo = new Timer(120, new ClaseTimer());
        tiempo.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jScrollBar1 = new javax.swing.JScrollBar();
        pnlPrincipal = new javax.swing.JPanel();
        pnlResultado1 = new javax.swing.JPanel();
        lblNombre1 = new javax.swing.JLabel();
        lblResultado1 = new javax.swing.JLabel();
        pnlResultado2 = new javax.swing.JPanel();
        lblResultado2 = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        t = new javax.swing.JLabel();
        tg = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton8.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gato");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusable(false);
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setMaximumSize(new java.awt.Dimension(2000, 2000));

        pnlResultado1.setBackground(new java.awt.Color(255, 51, 51));

        lblNombre1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre1.setText("Jugador 1:");

        lblResultado1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblResultado1.setForeground(new java.awt.Color(255, 255, 255));
        lblResultado1.setText("0");

        javax.swing.GroupLayout pnlResultado1Layout = new javax.swing.GroupLayout(pnlResultado1);
        pnlResultado1.setLayout(pnlResultado1Layout);
        pnlResultado1Layout.setHorizontalGroup(
            pnlResultado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultado1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblResultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlResultado1Layout.setVerticalGroup(
            pnlResultado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultado1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlResultado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblResultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlResultado2.setBackground(new java.awt.Color(51, 204, 255));

        lblResultado2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblResultado2.setForeground(new java.awt.Color(255, 255, 255));
        lblResultado2.setText("0");

        lblNombre2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblNombre2.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre2.setText("Jugador 2: ");

        javax.swing.GroupLayout pnlResultado2Layout = new javax.swing.GroupLayout(pnlResultado2);
        pnlResultado2.setLayout(pnlResultado2Layout);
        pnlResultado2Layout.setHorizontalGroup(
            pnlResultado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultado2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(lblResultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlResultado2Layout.setVerticalGroup(
            pnlResultado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblResultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        t.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        tg.setBackground(new java.awt.Color(255, 255, 255));
        tg.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

        btn1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(255, 255, 255));
        btn3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(255, 255, 255));
        btn4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(255, 255, 255));
        btn5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(255, 255, 255));
        btn7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn7.setMaximumSize(new java.awt.Dimension(80, 80));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(255, 255, 255));
        btn9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(255, 255, 255));
        btn8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(255, 255, 255));
        btn6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnSalir.setForeground(new java.awt.Color(255, 0, 0));
        btnSalir.setText("X");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pnlResultado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pnlResultado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSalir)
                                    .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlResultado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlResultado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tg, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Inicializa los atributos para empezar el juego
     */
    private void inicializarAtributos() {

        this.ganador = false;
        this.empate = 1;
        this.turno = true;

        this.jugador1 = new Jugador();
        this.jugador2 = new Jugador();

        this.btnNumero = new JButton[9];
        this.btnNumero[0] = this.btn1;
        this.btnNumero[1] = this.btn2;
        this.btnNumero[2] = this.btn3;
        this.btnNumero[3] = this.btn4;
        this.btnNumero[4] = this.btn5;
        this.btnNumero[5] = this.btn6;
        this.btnNumero[6] = this.btn7;
        this.btnNumero[7] = this.btn8;
        this.btnNumero[8] = this.btn9;

        for (int x = 0; x < btnNumero.length; x++) {
            this.btnNumero[x].setName(Integer.toString(x + 1));
        }

    }

    /**
     * Salir del juego
     */
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        /*int seleccion = JOptionPane.showConfirmDialog(null, "quiere abandordar el juego", "mensaje",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);*/

        //if (seleccion == 0) 
        {
            JOptionPane.showMessageDialog(null, "Muchas gracias por jugar");
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        byte numero = 5;
        this.numeroClikeado(numero);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        byte numero = 7;
        this.numeroClikeado(numero);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        byte numero = 8;
        this.numeroClikeado(numero);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        byte numero = 6;
        this.numeroClikeado(numero);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        byte numero = 4;
        this.numeroClikeado(numero);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        byte numero = 3;
        this.numeroClikeado(numero);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        byte numero = 2;
        this.numeroClikeado(numero);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        byte numero = 1;
        this.numeroClikeado(numero);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        byte numero = 0;
        this.numeroClikeado(numero);
    }//GEN-LAST:event_btn1ActionPerformed

    /**
     * Simpre que se clikee un numero del tablero vamos a comprar las posiciones
     * verticales, horizontales y diagonales principales y secundarias de la
     * 'matriz', para ver si hay un ganador
     */
    private void hayGanador() {

        //------COMPARACIONES HORIZONTALES----\\
        if (this.btn1.getName().equals(this.btn2.getName()) && this.btn1.getName().equals(this.btn3.getName())) {
            
            this.ganador = true;
        }
        if (this.btn4.getName().equals(this.btn5.getName()) && this.btn4.getName().equals(this.btn6.getName())) {
            
            this.ganador = true;
        }
        if (this.btn7.getName().equals(this.btn8.getName()) && this.btn7.getName().equals(this.btn9.getName())) {
         
            this.ganador = true;
        }

        //------COMPARACIONES VERTICALES----\\
        if (this.btn1.getName().equals(this.btn4.getName()) && this.btn1.getName().equals(this.btn7.getName())) {
           
            this.ganador = true;
        }
        if (this.btn2.getName().equals(this.btn5.getName()) && this.btn2.getName().equals(this.btn8.getName())) {
           
            this.ganador = true;
        }
        if (this.btn3.getName().equals(this.btn6.getName()) && this.btn3.getName().equals(this.btn9.getName())) {
           
            this.ganador = true;
        }

        //------COMPARACIONES DIAGONALES----\\
        if (this.btn1.getName().equals(this.btn5.getName()) && this.btn1.getName().equals(this.btn9.getName())) {
           
            this.ganador = true;
        }
        if (this.btn7.getName().equals(this.btn5.getName()) && this.btn7.getName().equals(this.btn3.getName())) {
         
            this.ganador = true;
        }

        if (this.ganador) {
            ganador();
        }

        if (this.empate == 9 && ganador == false) {

            tg.setText("Hay empate!!!");

            //Se empieza una nueva partida
            if (turno) {
                turno = false;
            } else {
                turno = true;
            }

            int seleccion = JOptionPane.showConfirmDialog(null, "Quieren jugar otra partida", "mensaje", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
            if (seleccion == 0) {

                LimpiarTablero();
            } else {

                this.mostrarResultadoFinal();
                System.exit(0);
            }
        }
    }

    /**
     * Mostramos el resultado cada ves que sea necesario el resultado se muestra
     * en un JPane
     */
    private void mostrarResultadoFinal() {
        if (turno && !validarEmpate()) {
            JOptionPane.showMessageDialog(null, "Resultado final."
                    + "\n" + this.jugador1.getNombre() + ": " + this.jugador1.getPuntos()
                    + "\n" + this.jugador2.getNombre() + ": " + this.jugador2.getPuntos()
                    + "\nFelicitaciones!! " + this.jugador1.getNombre()
                    + "\neres el ganador");
        } else {
            if (!turno && !validarEmpate()) {
                JOptionPane.showMessageDialog(null, "Resultado final."
                        + "\n" + this.jugador1.getNombre() + ": " + this.jugador1.getPuntos()
                        + "\n" + this.jugador2.getNombre() + ": " + this.jugador2.getPuntos()
                        + "\nFelicitaciones !! " + this.jugador2.getNombre()
                        + "\neres el ganador");
            } else {
                JOptionPane.showMessageDialog(null, "Resultado final."
                        + "\n" + this.jugador1.getNombre() + ": " + this.jugador1.getPuntos()
                        + "\n" + this.jugador2.getNombre() + ": " + this.jugador2.getPuntos()
                        + "\nEmpate !! ");
            }
        }
    }

    /**
     * Cuando hay un ganador
     */
    private void ganador() {
        int seleccion = 2; // para el JOptionPane.showConfirmDialog

        this.tiempo.restart();
        this.ganador = true;

        if (turno) {

           
            tg.setText(this.jugador1.getNombre() + " Has ganado felicidades");
            this.jugador1.setPuntos(this.jugador1.getPuntos() + 1);

            lblResultado1.setText(Integer.toString(this.jugador1.getPuntos()));

            seleccion = JOptionPane.showConfirmDialog(null, "Quieren jugar otra partida", "Mensaje", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);

        } else {

           
            tg.setText(this.jugador2.getNombre() + " Has ganado felicidades!");
            this.jugador2.setPuntos(this.jugador2.getPuntos() + 1);

            lblResultado2.setText(Integer.toString(this.jugador2.getPuntos()));

            seleccion = JOptionPane.showConfirmDialog(null, "Quieren jugar otra partida", "mensaje", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
        }

        if (seleccion == 0) {

            this.ganador = false;

            this.LimpiarTablero();

            tiempo.restart();
        } else {

            this.mostrarResultadoFinal();
            System.exit(0);
        }
    }

    /**
     * Limpiamos el tablero
     */
    public void LimpiarTablero() {

        tg.setText("");
        
        t.setText("");

        tiempo.restart();

        empate = 0;


        if (turno) {
            t.setText("tu turno " + this.jugador1.getNombre());
          
        } else {
            t.setText("tu turno " + this.jugador2.getNombre());
          
        }

    }

    /**
     * verificar si hay empate general de puntos entre los jugadores
     *
     * @return : true si no hay empate, false si hay empate
     */
    private boolean validarEmpate() {

        if (this.jugador1.getPuntos() == this.jugador2.getPuntos()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Muestra en el tablero el jugador que debe tirar o jugar una partida
     */
    private void validarTurno() {

        if (turno) {

            t.setText("tu turno " + this.jugador1.getNombre());
           
        } else {

            t.setText("tu turno " + this.jugador2.getNombre());
           
        }
    }

    /**
     * coloca la 'X' o el 'O' dependiendo el numero dode se de clik
     *
     * @param numeroLbl
    // * @param numeroLabel: 'numero' unico de cada numero cuando es clikeado
     */
    public void numeroClikeado(byte numeroLbl) {

        byte numeroAuxiliar = (byte) (numeroLbl + 1);//Numero auxiliar para comparar el Numero string del 'name' de los botones

        if (this.btnNumero[numeroLbl].getName().equals(Byte.toString(numeroAuxiliar))) {

            if (turno) {
                this.btnNumero[numeroLbl].setName("x");
                this.btnNumero[numeroLbl].setText("");
                this.btnNumero[numeroLbl].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x.png")));

                hayGanador();

                empate++;

                turno = false;

            } else {

                this.btnNumero[numeroLbl].setName("o");
                this.btnNumero[numeroLbl].setText("");
                this.btnNumero[numeroLbl].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/o.png")));

                hayGanador();

                empate++;

                turno = true;
            }

            validarTurno();

        } else {
            JOptionPane.showMessageDialog(null, "La casilla esta ocupada\nintente con otra");
        }
    }

    /**
     * pedir nombre de los jugadores antes de empesar a jugar o cada ves que se
     * juegue una nueva partida si no lo ingresan no se dejan seguir
     */
    private void pedirNombre() {

        this.jugador1.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del jugador 1"));
        lblNombre1.setText(this.jugador1.getNombre());
        while (lblNombre1.getText().equals("")) {
            this.jugador1.setNombre(JOptionPane.showInputDialog("Debe ingresar un nombre\ningrese el nombre del\njugador 1"));
            lblNombre1.setText(this.jugador1.getNombre());
        }

        this.jugador2.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del jugador 2"));
        lblNombre2.setText(this.jugador2.getNombre());
        while (lblNombre2.getText().equals("")) {
            this.jugador2.setNombre(JOptionPane.showInputDialog("Debe ingresar un nombre\ningrese el nombre del\njugador 2"));
            lblNombre2.setText(this.jugador2.getNombre());
        }

        JOptionPane.showMessageDialog(null, "A jugar"
                + "\nmucha suerte"
                + "\ny que gane el mejor");

        // cada ves q se abre un juego nuevo, empiesa el jugador 1
        t.setText("tu turno " + this.jugador1.getNombre());
      
    }

    /**
     * Clase interna que se encarga de limpiar los botones y hacer efectos de
     * barrido en los botones
     *
     * @author :caros mario montaño lopera 04/10/2012
     */
    public class ClaseTimer implements ActionListener {

        byte posicion = 0;
        boolean recorrido = false;
        boolean recorridoRojo = false;
        boolean recorridoAzul = true;
        boolean efecto1 = true;

        @Override
        public void actionPerformed(ActionEvent e) {

            if (ganador) {
                //efectoGanador();
            }

            if (!ganador) {
                this.limpiarBotonesBarrido();
            }

        }

        /**
         * limpia los botones con un efecto de barrido y asigna de nuevo los
         * valores String al atributo 'name' de cada boton....
         */
        public void limpiarBotonesBarrido() {

            if (!this.recorrido && this.posicion < btnNumero.length) {
                if (!this.recorridoRojo) {
                   
                } else {
                
                }
                btnNumero[posicion].setIcon(null);
                btnNumero[posicion].setText("");
                posicion++;
            } else {
                this.recorrido = true;
            }

            if (posicion >= 0 && this.recorrido) {
                btnNumero[posicion - 1].setBackground(Color.white);
                btnNumero[posicion - 1].setText(Byte.toString(posicion));
                btnNumero[posicion - 1].setName(Byte.toString(posicion));
                posicion--;
            }

            if (this.posicion == 0) {
                tiempo.stop();
                this.posicion = 0;
                this.recorrido = false;

                //definimo si el barrido sera en color rojo o azul
                if (this.recorridoAzul) {
                    this.recorridoAzul = false;
                    this.recorridoRojo = true;
                } else {
                    this.recorridoAzul = true;
                    this.recorridoRojo = false;
                }
            }
        }

        /**
         * Efecto de luz parpadeante cuando aguein gana
         */
        /*public void efectoGanador() {
            if (this.efecto1) {
                for (byte x = 0; x < btnNumero.length; x++) {
                    if (btnNumero[x].getBackground() == Color.white) {
                        btnNumero[x].setBackground(Color.lightGray);
                        this.efecto1 = false;
                    }
                }
            } else {
                for (byte x = 0; x < btnNumero.length; x++) {
                    //esta comparacionn por que hay veces el efecto1 es true cuando el color es orange
                    if (btnNumero[x].getBackground() == Color.lightGray || btnNumero[x].getBackground() == Color.yellow) {
                        btnNumero[x].setBackground(Color.white);
                        this.efecto1 = true;
                    }
                }
            }
        }*/
    }

    /**
     * look and feel del tablero
     */
   /* static {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                // Solo estilo por nombre Nimbus
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblResultado1;
    private javax.swing.JLabel lblResultado2;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlResultado1;
    private javax.swing.JPanel pnlResultado2;
    private static javax.swing.JLabel t;
    private static javax.swing.JLabel tg;
    // End of variables declaration//GEN-END:variables
}
