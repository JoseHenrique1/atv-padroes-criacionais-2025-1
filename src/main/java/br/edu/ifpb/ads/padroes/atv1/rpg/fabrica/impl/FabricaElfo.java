package br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.impl;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.FabricaAbstrataPersonagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.classes.Arqueiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.classes.Guerreiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.classes.Mago;
import br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.classes.elfo.ElfoArqueiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.classes.elfo.ElfoGuerreiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.classes.elfo.ElfoMago;

public class FabricaElfo implements FabricaAbstrataPersonagem {
    @Override
    public Arqueiro criarArqueiro(String nome) {
        int forca, inteligencia, agilidade, vida, mana;
        forca = 8;
        inteligencia = 16;
        agilidade = 20;
        vida = 90;
        mana = 100;
        Arma arma = new Arma("Arco Longo Élfico", 28, "Arco");
        Armadura armadura = new Armadura("Armadura de Couro Élfico", 14, "Média");
        String[] habilidades = new String[]{"Tiro Múltiplo", "Camuflagem"};
        return new ElfoArqueiro(nome, forca, inteligencia, agilidade, vida, mana, arma, armadura, habilidades);
    }

    @Override
    public Guerreiro criarGuerreiro(String nome) {
        int forca, inteligencia, agilidade, vida, mana;
        forca = 12;
        inteligencia = 14;
        agilidade = 16;
        vida = 100;
        mana = 60;
        Arma arma = new Arma("Lâmina Élfica", 22, "Espada");
        Armadura armadura = new Armadura("Cota de Malha Élfica", 15, "Média");
        String[] habilidades = new String[]{"Dança das Lâminas", "Agilidade Élfica"};
        return new ElfoGuerreiro(nome, forca, inteligencia, agilidade, vida, mana, arma, armadura, habilidades);
    }

    @Override
    public Mago criarMago(String nome) {
        int forca, inteligencia, agilidade, vida, mana;
        forca = 4;
        inteligencia = 20;
        agilidade = 14;
        vida = 70;
        mana = 180;
        Arma arma = new Arma("Cajado da Natureza", 18, "Cajado");
        Armadura armadura = new Armadura("Mantos Élficos", 10, "Leve");
        String[] habilidades = new String[]{"Magia da Natureza", "Teleporte"};
        return new ElfoMago(nome, forca, inteligencia, agilidade, vida, mana, arma, armadura, habilidades);
    }
}
