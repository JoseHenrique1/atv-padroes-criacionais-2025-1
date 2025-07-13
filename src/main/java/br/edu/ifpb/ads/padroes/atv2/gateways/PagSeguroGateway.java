package br.edu.ifpb.ads.padroes.atv2.gateways;

import br.edu.ifpb.ads.padroes.atv2.sdk.PagSeguroSDK;

public class PagSeguroGateway implements PagamentoGateway {
    @Override
    public void pagar() {
        System.out.println("Realizando pagamento com PagSeguro.");
        PagSeguroSDK.pagar();
    }
}
