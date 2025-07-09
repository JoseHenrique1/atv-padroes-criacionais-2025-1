package br.edu.ifpb.ads.padroes.atv1.rpg.fabrica;

import br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.classes.Arqueiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.classes.Guerreiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.classes.Mago;

public interface FabricaAbstrataPersonagem {
    Arqueiro criarArqueiro(String nome);
    Guerreiro criarGuerreiro(String nome);
    Mago criarMago(String nome);
}
