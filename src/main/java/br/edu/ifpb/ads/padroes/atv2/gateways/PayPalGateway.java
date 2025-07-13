package br.edu.ifpb.ads.padroes.atv2.gateways;

import br.edu.ifpb.ads.padroes.atv2.sdk.PayPalSDK;

public class PayPalGateway implements PagamentoGateway{
    @Override
    public void pagar() {
        System.out.println("Realizando pagamento com PayPal.");
        PayPalSDK.pagar();
    }
}
