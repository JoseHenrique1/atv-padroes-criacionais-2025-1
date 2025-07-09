package br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.classes.elfo;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.classes.Mago;

public class ElfoMago extends Personagem implements Mago {
    public ElfoMago(String nome, int forca, int inteligencia, int agilidade, int vida, int mana, Arma arma, Armadura armadura, String[] habilidades) {
        super(nome, "Elfo", "Mago", forca, inteligencia, agilidade, vida, mana, arma, armadura, habilidades);
    }
}