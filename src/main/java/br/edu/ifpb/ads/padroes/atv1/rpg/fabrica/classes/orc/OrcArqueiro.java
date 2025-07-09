package br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.classes.orc;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.classes.Arqueiro;

public class OrcArqueiro extends Personagem implements Arqueiro {
    public OrcArqueiro(String nome, int forca, int inteligencia, int agilidade, int vida, int mana, Arma arma, Armadura armadura, String[] habilidades) {
        super(nome, "Orc", "Arqueiro", forca, inteligencia, agilidade, vida, mana, arma, armadura, habilidades);
    }
}