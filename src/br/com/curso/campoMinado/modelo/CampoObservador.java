package br.com.curso.campoMinado.modelo;

public interface CampoObservador {
    
    public void eventoOcorreu(Campo campo, CampoEvento evento);
}
