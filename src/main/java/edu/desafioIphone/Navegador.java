package edu.desafioIphone;

public class Navegador {
    private String paginaAtual;
    private int abasAbertas = 0;

    public String getPaginaAtual() {
        return paginaAtual;
    }
    public void setPaginaAtual(String paginaAtual) {
        this.paginaAtual = paginaAtual;
    }
    public int getAbasAbertas() {
        return abasAbertas;
    }
    public void exibirPagina(){
        System.out.println("Sua página atual: "+getPaginaAtual());
    }
    public void adicionarNovaAba(){
        abasAbertas++;
        System.out.println("Nova aba adicionada!");
        System.out.println("Quantidade de abas abertas: "+getAbasAbertas());
    }
    public void atualizar() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Página atualizada com sucesso!");
    }
}
