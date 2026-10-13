package br.unijorge.letramento.ui.vaadin;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.RouterLink;

public class MainLayout extends AppLayout {

    public MainLayout() {
        H1 titulo = new H1("Cidadania em Rede");
        titulo.getStyle().set("font-size", "1.2rem").set("margin", "0");
        addToNavbar(new DrawerToggle(), titulo);

        VerticalLayout menu = new VerticalLayout();
        menu.add(new RouterLink("Início", InicioView.class));
        addToDrawer(menu);
    }
}
