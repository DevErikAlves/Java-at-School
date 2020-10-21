
package com.mycompany.campeonato;


public class Time {
    private int codigo;
    private String nome;
    private String cidade;
    private int anoDeFundacao;
    private String serie;
    private boolean EstadioProprio;
    private int golsFeitos;
    private int golsSofridos;
    private int vitorias;
    private int empates;
    private int derrotas;

    public Time(int codigo, String nome, String cidade, int anoDeFundacao, String serie, boolean EstadioProprio) {
        this.codigo = codigo;
        this.nome = nome;
        this.cidade = cidade;
        this.anoDeFundacao = anoDeFundacao;
        this.serie = serie;
        this.EstadioProprio = EstadioProprio;
        
    }
    
    public void registrarResultado(int golsFeitos, int golsSofridos){
        
    }
    public void apresentar(){
        System.out.println("Código do time: " + this.codigo);
        System.out.println("Nome do time: " + this.nome);
        System.out.println("Cidade do time: " + this.cidade);
        System.out.println("Ano de fundação do time: " + this.anoDeFundacao);
        System.out.println("Série em que o time se encontra: " + this.serie);
        System.out.println("O time possui estádio próprio?");
        
        if (this.EstadioProprio == true){
            System.out.println("\tSim");
        }
        else{
            System.out.println("\tNão");
        }
        System.out.println("Gols feitos pelo time: " + this.golsFeitos);
        System.out.println("Gols sofridos pelo time: " + this.golsSofridos);
        System.out.println("Vitórias: " + this.vitorias);
        System.out.println("Empates: " + this.empates);
        System.out.println("Derrotas: " + this.derrotas);
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getAnoDeFundacao() {
        return anoDeFundacao;
    }

    public void setAnoDeFundacao(int anoDeFundacao) {
        this.anoDeFundacao = anoDeFundacao;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        serie = toUpperCase(serie);
        if (this.getSerie() != "A" || this.getSerie() != "B" || this.getSerie() != "C"){
            System.out.println("Série inválida");
        }
        else{
        this.serie = serie;
        }
    }

    public boolean isEstadioProprio() {
        return EstadioProprio;
    }

    public void setEstadioProprio(boolean EstadioProprio) {
        this.EstadioProprio = EstadioProprio;
    }

    public int getGolsFeitos() {
        return golsFeitos;
    }

    public void setGolsFeitos(int golsFeitos) {
        golsFeitos = 0;
        this.golsFeitos = golsFeitos;
    }

    public int getGolsSofridos() {
        return golsSofridos;
    }

    public void setGolsSofridos(int golsSofridos) {
        golsSofridos = 0;
        this.golsSofridos = golsSofridos;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        vitorias = 0;
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        empates = 0;
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        derrotas = 0;
        this.derrotas = derrotas;
    }

    private String toUpperCase(String serie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
