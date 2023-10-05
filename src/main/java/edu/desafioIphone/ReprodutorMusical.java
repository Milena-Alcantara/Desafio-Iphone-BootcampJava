package edu.desafioIphone;

public class ReprodutorMusical {
    private boolean estaTocando = false;
    private boolean estaPausado = false;
    private String musicaSelecionada;

    public boolean isEstaTocando() {
        return estaTocando;
    }

    public void setEstaTocando(boolean estaTocando) {
        this.estaTocando = estaTocando;
    }

    public boolean isEstaPausado() {
        return estaPausado;
    }

    public void setEstaPausado(boolean estaPausado) {
        this.estaPausado = estaPausado;
    }

    public String getMusicaSelecionada() {
        return musicaSelecionada;
    }

    public void setMusicaSelecionada(String musicaSelecionada) {
        this.musicaSelecionada = musicaSelecionada;
    }

    public void selecionarMusica(String musicaSelecionada){
        setMusicaSelecionada(musicaSelecionada);
        System.out.println("Você selecionou: "+musicaSelecionada);
    }

    public boolean tocar(){
        System.out.println("Tocando a música: "+getMusicaSelecionada());
        setEstaTocando(true);
        return isEstaTocando();
    }
    public boolean pausar(){
        System.out.println("Música pausada...");
        setEstaPausado(true);
        return isEstaPausado();
    }

}
