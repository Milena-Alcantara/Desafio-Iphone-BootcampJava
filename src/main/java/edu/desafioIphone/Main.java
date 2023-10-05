package edu.desafioIphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        try {
            iphone.menuInicial();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
