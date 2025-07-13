package br.edu.ifpb.ads.padroes.atv2.gateways;

import br.edu.ifpb.ads.padroes.atv2.sdk.StripeSDK;

public class StripeGateway implements PagamentoGateway{
    @Override
    public void pagar() {
        System.out.println("Realizando pagamento com Stripe.");
        StripeSDK.pagar();
    }
}
