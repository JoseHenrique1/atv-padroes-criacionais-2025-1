package br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.impl;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.FabricaAbstrataPersonagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.classes.Arqueiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.classes.Guerreiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.classes.Mago;
import br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.classes.humano.HumanoArqueiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.classes.humano.HumanoGuerreiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.classes.humano.HumanoMago;

public class FabricaHumano implements FabricaAbstrataPersonagem {
    @Override
    public Arqueiro criarArqueiro(String nome) {
        int forca, inteligencia, agilidade, vida, mana;
        forca = 10;
        inteligencia = 12;
        agilidade = 16;
        vida = 100;
        mana = 70;

        Arma arma = new Arma("Arco Élfico", 20, "Arco");
        Armadura armadura = new Armadura("Armadura de Couro", 12, "Média");
        String[] habilidades = new String[]{"Tiro Certeiro", "Chuva de Flechas"};
        return new HumanoArqueiro(nome, forca, inteligencia, agilidade, vida, mana, arma, armadura, habilidades);
    }

    @Override
    public Guerreiro criarGuerreiro(String nome) {
        int forca, inteligencia, agilidade, vida, mana;
        forca = 15;
        inteligencia = 8;
        agilidade = 10;
        vida = 120;
        mana = 30;

        Arma arma = new Arma("Espada de Ferro", 25, "Espada");
        Armadura armadura = new Armadura("Armadura de Placas", 20, "Pesada");
        String[] habilidades = new String[]{"Investida", "Bloqueio"};
        return new HumanoGuerreiro(nome, forca, inteligencia, agilidade, vida, mana, arma, armadura, habilidades);
    }

    @Override
    public Mago criarMago(String nome) {
        int forca, inteligencia, agilidade, vida, mana;
        forca = 6;
        inteligencia = 18;
        agilidade = 8;
        vida = 80;
        mana = 150;

        Arma arma = new Arma("Cajado Mágico", 15, "Cajado");
        Armadura armadura = new Armadura("Vestes Mágicas", 8, "Leve");
        String[] habilidades = new String[]{"Bola de Fogo", "Cura"};
        return new HumanoMago(nome, forca, inteligencia, agilidade, vida, mana, arma, armadura, habilidades);
    }
}
