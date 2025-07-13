package br.edu.ifpb.ads.padroes.atv2;

import br.edu.ifpb.ads.padroes.atv2.gateways.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.gateways.PayPalGateway;
import br.edu.ifpb.ads.padroes.atv2.gateways.StripeGateway;
import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;

public class Loader {
    public static void main(String[] args) {
        MutablePicoContainer container = new DefaultPicoContainer();
        container.addComponent(PagamentoGateway.class, PayPalGateway.class);
        container.addComponent(PagamentoServico.class);

        PagamentoServico pagamentoPayPal = container.getComponent(PagamentoServico.class);
        pagamentoPayPal.pagar();


        //Novo objetp com um gateway diferente
        MutablePicoContainer container2 = new DefaultPicoContainer();
        container2.addComponent(PagamentoGateway.class, StripeGateway.class);
        container2.addComponent(PagamentoServico.class);

        PagamentoServico pagamentoStripe = container2.getComponent(PagamentoServico.class);
        pagamentoStripe.pagar();
    }
}
