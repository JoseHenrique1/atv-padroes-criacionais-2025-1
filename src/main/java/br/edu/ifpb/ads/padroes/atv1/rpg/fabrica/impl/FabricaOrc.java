package br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.impl;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.FabricaAbstrataPersonagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.classes.Arqueiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.classes.Guerreiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.classes.Mago;
import br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.classes.orc.OrcArqueiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.classes.orc.OrcGuerreiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.classes.orc.OrcMago;

public class FabricaOrc implements FabricaAbstrataPersonagem {
    @Override
    public Arqueiro criarArqueiro(String nome) {
        int forca, inteligencia, agilidade, vida, mana;
        forca = 14;
        inteligencia = 8;
        agilidade = 12;
        vida = 120;
        mana = 40;
        Arma arma = new Arma("Arco de Osso", 24, "Arco");
        Armadura armadura = new Armadura("Couro de Besta", 16, "Média");
        String[] habilidades = new String[]{"Tiro Brutal", "Intimidação"};
        return new OrcArqueiro(nome, forca, inteligencia, agilidade, vida, mana, arma, armadura, habilidades);
    }

    @Override
    public Guerreiro criarGuerreiro(String nome) {
        int forca, inteligencia, agilidade, vida, mana;
        forca = 20;
        inteligencia = 6;
        agilidade = 8;
        vida = 150;
        mana = 20;
        Arma arma = new Arma("Machado de Guerra", 30, "Machado");
        Armadura armadura = new Armadura("Armadura Brutal", 25, "Pesada");
        String[] habilidades = new String[]{"Fúria", "Pancada Devastadora"};
        return new OrcGuerreiro(nome, forca, inteligencia, agilidade, vida, mana, arma, armadura, habilidades);
    }

    @Override
    public Mago criarMago(String nome) {
        int forca, inteligencia, agilidade, vida, mana;
        forca = 10;
        inteligencia = 14;
        agilidade = 6;
        vida = 100;
        mana = 120;
        Arma arma = new Arma("Cajado Tribal", 12, "Cajado");
        Armadura armadura = new Armadura("Vestes Xamânicas", 6, "Leve");
        String[] habilidades = new String[]{"Magia Sombria", "Invocação"};
        return new OrcMago(nome, forca, inteligencia, agilidade, vida, mana, arma, armadura, habilidades);
    }
}
