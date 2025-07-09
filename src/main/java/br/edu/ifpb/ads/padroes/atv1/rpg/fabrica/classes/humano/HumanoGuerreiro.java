package br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.classes.humano;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.classes.Guerreiro;

public class HumanoGuerreiro extends Personagem implements Guerreiro {
    public HumanoGuerreiro(String nome, int forca, int inteligencia, int agilidade, int vida, int mana, Arma arma, Armadura armadura, String[] habilidades) {
        super(nome, "Humano", "Guerreiro", forca, inteligencia, agilidade, vida, mana, arma, armadura, habilidades);
    }
}
