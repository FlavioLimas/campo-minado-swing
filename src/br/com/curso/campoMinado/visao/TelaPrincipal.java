package br.com.curso.campoMinado.visao;

import javax.swing.JFrame;

public class TelaPrincipal extends JFrame {
    
    public TelaPrincipal() {
        setTitle("Campo Minado");
        setSize(690, 438);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TelaPrincipal();
    }
}
