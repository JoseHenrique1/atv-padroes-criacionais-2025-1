package br.edu.ifpb.ads.padroes.atv1.rpg.config;

public class ConfiguracaoJogo {

    private static ConfiguracaoJogo instance;

    private int nivelDificuldade;

    private ConfiguracaoJogo() {
        this.nivelDificuldade = 1;
    }

    public int getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(int nivel) {
        this.nivelDificuldade = nivel;
    }

    public static ConfiguracaoJogo getInstance(){
        if (instance == null) {
            instance = new ConfiguracaoJogo();
        }
        return instance;
    }

}
