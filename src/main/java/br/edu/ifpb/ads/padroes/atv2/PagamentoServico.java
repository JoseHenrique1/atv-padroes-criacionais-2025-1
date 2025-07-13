package br.edu.ifpb.ads.padroes.atv2;

import br.edu.ifpb.ads.padroes.atv2.gateways.PagamentoGateway;

public class PagamentoServico {
    private PagamentoGateway pagamentoGateway;

    public PagamentoServico(PagamentoGateway pagamentoGateway) {
        this.pagamentoGateway = pagamentoGateway;
    }

    public void pagar() {
        pagamentoGateway.pagar();
    }
}


/*

Multiplos gateways de pagamento(paypal, stripe, pagseguro)
Ser extensivel para novos provedores(nubank, picpay)

PagamentoGateway é uma abstração dos gateways(paypal, stripe, pagseguro)

PagamentoService vai receber PagamentoGateway via injeção de dependências.
PagamentoService tem um metodo pagar().



* */