package br.com.curso.campoMinado.visao;

import java.awt.GridLayout;

import javax.swing.JPanel;

import br.com.curso.campoMinado.modelo.Tabuleiro;

public class PainelTabuleiro extends JPanel {
    
    public PainelTabuleiro(Tabuleiro tabuleiro) {

        setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));

        tabuleiro.iterarCampos(c -> add(new BotaoCampo(c)));
    }
}