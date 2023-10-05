package edu.desafioIphone;

public class Telefone {
    public void ligar(){
        System.out.println("Ligando...");
    }
    public void atender(){
        System.out.println("Atendendo ligação");
    }

    public void inicarCorreioDeVoz(){
        System.out.println("Iniciando correio de Voz, após o sinal grave sua mensagem: ");
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
