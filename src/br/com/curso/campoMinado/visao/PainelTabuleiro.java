package br.com.curso.campoMinado.visao;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import br.com.curso.campoMinado.modelo.Tabuleiro;

public class PainelTabuleiro extends JPanel {
    
    public PainelTabuleiro(Tabuleiro tabuleiro) {

        setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));
        tabuleiro.iterarCampos(c -> add(new BotaoCampo(c)));
        tabuleiro.registrarObservador(e -> {

            SwingUtilities.invokeLater(() -> {

                if (e.isGanhou()) {
                    JOptionPane.showMessageDialog(this, "Ganhou :)");
                } else {
                    JOptionPane.showMessageDialog(this, "Perdeu :(");
                }
            });
        });
    }
}
