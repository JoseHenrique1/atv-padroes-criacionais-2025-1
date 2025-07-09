package br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.classes.humano;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.classes.Mago;

public class HumanoMago extends Personagem implements Mago {
    public HumanoMago(String nome, int forca, int inteligencia, int agilidade, int vida, int mana, Arma arma, Armadura armadura, String[] habilidades) {
        super(nome, "Humano", "Mago", forca, inteligencia, agilidade, vida, mana, arma, armadura, habilidades);
    }
}
