package br.unijorge.letramento.ui.vaadin;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "", layout = MainLayout.class)
@PageTitle("Início | Cidadania em Rede")
public class InicioView extends VerticalLayout {

    public InicioView() {
        add(new H2("Entenda a política antes de votar"));
        add(new Paragraph("Saiba o que faz cada cargo, treine na urna com candidatos fictícios "
                + "e aprenda a reconhecer boatos e conteúdos feitos por IA. Grátis, sem cadastro."));
    }
}
