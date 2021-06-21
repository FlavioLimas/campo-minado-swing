package br.com.curso.campoMinado.visao;

import javax.swing.JButton;

import br.com.curso.campoMinado.modelo.Campo;
import br.com.curso.campoMinado.modelo.CampoEvento;
import br.com.curso.campoMinado.modelo.CampoObservador;

public class BotaoCampo extends JButton implements CampoObservador {

    public BotaoCampo(Campo campo) {
        
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
                break;
        }
    }

    private void aplicarEstiloExplodir() {
    }

    private void aplicarEstiloMarcar() {
    }

    private void aplicarEstiloAbrir() {
    }
}
