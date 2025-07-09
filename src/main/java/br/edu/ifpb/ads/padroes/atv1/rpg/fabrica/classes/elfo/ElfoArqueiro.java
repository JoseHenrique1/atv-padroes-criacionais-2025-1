package br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.classes.elfo;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.classes.Arqueiro;

public class ElfoArqueiro extends Personagem implements Arqueiro {
    public ElfoArqueiro(String nome, int forca, int inteligencia, int agilidade, int vida, int mana, Arma arma, Armadura armadura, String[] habilidades) {
        super(nome, "Elfo", "Arqueiro", forca, inteligencia, agilidade, vida, mana, arma, armadura, habilidades);
    }
}