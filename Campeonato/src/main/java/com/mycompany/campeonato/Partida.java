
package com.mycompany.campeonato;

public class Partida {
    private int codigo;
    private String data;
    private Time mandante;
    private Time visitante;
    private int golsMandante;
    private int golsVisitante;
    private boolean confirmada;
    private boolean realizada;

    public Partida(int codigo, String data, Time mandante, Time visitante) {
        this.codigo = codigo;
        this.data = data;
        this.mandante = mandante;
        this.visitante = visitante;

    }

    public void defineResultado(){
        
    }
    public void exibeResultado(){
        
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Time getMandante(int golsFeitos) {
         golsFeitos = this.getGolsMandante();
        return mandante;
    }

    public void setMandante(Time mandante) {
        this.mandante = mandante;
    }

    public Time getVisitante() {
        return visitante;
    }

    public void setVisitante(Time visitante) {
        this.visitante = visitante;
    }

    public int getGolsMandante() {
        return golsMandante;
    }

    public void setGolsMandante(int golsMandante) {
        this.golsMandante = golsMandante;
    }

    public int getGolsVisitante() {
        return golsVisitante;
    }

    public void setGolsVisitante(int golsVisitante) {
        this.golsVisitante = golsVisitante;
    }

    public boolean isConfirmada() {
        return confirmada;
    }

    public void setConfirmada(boolean confirmada) {
        this.confirmada = confirmada;
    }

    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }
    
    
}
