/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp_3_servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author navag
 */
public class psp_3_servidor extends Thread {

    private javax.swing.JTextArea txtmensajes;
    private javax.swing.JTextField jPuerto;
    private javax.swing.JTextField jStock;
    private int stockInicial = 0;
    private ServerSocket servidor;
    private boolean salir = false;
    private Socket cliente;

    private BufferedReader recibir;
    private PrintWriter enviar;

    public int getStockInicial() {
        return stockInicial;
    }

    public psp_3_servidor(javax.swing.JTextArea txtmensajes, javax.swing.JTextField jPuerto, javax.swing.JTextField jStock) {
        this.txtmensajes = txtmensajes;
        this.jPuerto = jPuerto;
        this.jStock = jStock;
        stockInicial = Integer.parseInt(this.jStock.getText());
        try {
            servidor = new ServerSocket(Integer.parseInt(this.jPuerto.getText()));
            this.txtmensajes.append("Servidor iniciado... " + System.lineSeparator() + "Stock inicial " + stockInicial + " Chirimoyas." + System.lineSeparator());
        } catch (Exception ex) {

        }

    }

    public void enviar(String mensaje) {
        enviar.println(mensaje);
        enviar.flush();

    }

    public void run() {
        try {
            cliente = servidor.accept();
            this.txtmensajes.append("Conexión realizada con el cliente " + System.lineSeparator());
            this.txtmensajes.append(cliente.toString() + System.lineSeparator());
            recibir = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            enviar = new PrintWriter(cliente.getOutputStream(), true);
            while (!salir) {
                String comando = recibir.readLine();
                if (comando.substring(0, 1).equalsIgnoreCase("c")) {
                    this.txtmensajes.append("CLIENTE HACE PETICION DE CONSULTA: " + System.lineSeparator());
                    enviar("Stock Chirimoya: " + this.stockInicial);
                }
                if (comando.substring(0, 1).equalsIgnoreCase("a")) {

                    int sumaStock = Integer.parseInt(comando.substring(1, comando.length()));
                    this.txtmensajes.append("CLIENTE AÑADE: " + sumaStock + " CHIRIMOYAS" + System.lineSeparator());
                    this.stockInicial += sumaStock;
                    enviar("El stock ha aumentado en: " + sumaStock);
                }
                if (comando.substring(0, 1).equalsIgnoreCase("r")) {

                    int restaStock = Integer.parseInt(comando.substring(1, comando.length()));
                    if (( stockInicial - restaStock ) < 0) {
                        enviar("STOCK INSUFICIENTE");
                    } else {
                        this.txtmensajes.append("CLIENTE RESTA: " + restaStock + System.lineSeparator());
                        this.stockInicial -= restaStock;
                        enviar("El stock se ha reducido en: " + restaStock);
                    }
                }

            }

        } catch (Exception ex) {

        }

    }

}
