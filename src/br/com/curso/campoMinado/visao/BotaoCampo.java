package br.com.curso.campoMinado.visao;

import javax.swing.JButton;

import br.com.curso.campoMinado.modelo.Campo;
import br.com.curso.campoMinado.modelo.CampoEvento;
import br.com.curso.campoMinado.modelo.CampoObservador;

public class BotaoCampo extends JButton implements CampoObservador {

    private Campo campo;

    public BotaoCampo(Campo campo) {
        this.campo = campo;

        campo.registrarObservador(this);
    }
    
    @Override
    public void eventoOcorreu(Campo campo, CampoEvento evento) {
        switch (evento) {
            case ABRIR:
                aplicarEstiloAbrir();
                break;
            case MARCAR:
                aplicarEstiloMarcar();
                break;
            case EXPLODIR:
                aplicarEstiloExplodir();
                break;
        
            default:
                aplicarEstiloPadrao();
                break;
        }
    }

    private void aplicarEstiloPadrao() {
    }

    private void aplicarEstiloExplodir() {
    }

    private void aplicarEstiloMarcar() {
    }

    private void aplicarEstiloAbrir() {
    }
}
