package upc.trabajo_final.interfaz_sistema;

import upc.trabajo_final.usuario.Administrador;
import upc.trabajo_final.usuario.Cajero;
import upc.trabajo_final.usuario.Mozo;

import java.util.ArrayList;

public class MenuEstatico {

    Menu menuMozo;
    Menu menuAdministrador;
    Menu menuCajero;
    Menu menuTipoDeUsuario;
    Menu menuIdioma;


    public MenuEstatico() {
        // Mozo
        Mozo mozoInstancia = new Mozo();
        ArrayList<ElementoMenu> elementosMenuMozo= new ArrayList<ElementoMenu>();
        elementosMenuMozo.add(new ElementoMenu(1, "Registrar pedido", null, mozoInstancia));
        elementosMenuMozo.add(new ElementoMenu(2, "Consultar carta de bebidas", null, mozoInstancia));
        elementosMenuMozo.add(new ElementoMenu(3, "Consultar carta de comidas", null, mozoInstancia));
        elementosMenuMozo.add(new ElementoMenu(4, "Consultar pedido", null, mozoInstancia));
        elementosMenuMozo.add(new ElementoMenu(-1, "Salir", null, mozoInstancia));

        this.menuMozo = new Menu(elementosMenuMozo, "Escoge una opcion");

        // Administrador
        Administrador administradorInstancia = new Administrador();
        ArrayList<ElementoMenu> elementosMenuAdministrador = new ArrayList<ElementoMenu>();
        elementosMenuAdministrador.add(new ElementoMenu(1, "Crear administrador", null, administradorInstancia));
        elementosMenuAdministrador.add(new ElementoMenu(2, "-----", null, administradorInstancia));
        elementosMenuAdministrador.add(new ElementoMenu(3, "-----", null, administradorInstancia));
        elementosMenuAdministrador.add(new ElementoMenu(4, "Eliminar pedido", null, administradorInstancia));
        elementosMenuAdministrador.add(new ElementoMenu(5, "Eliminar usuario", null, administradorInstancia));
        elementosMenuAdministrador.add(new ElementoMenu(6, "Eliminar cliente", null, administradorInstancia));
        elementosMenuAdministrador.add(new ElementoMenu(7, "Agregar una opcion de comida", null, administradorInstancia));
        elementosMenuAdministrador.add(new ElementoMenu(8, "Editar la opcion de comida", null, administradorInstancia));
        elementosMenuAdministrador.add(new ElementoMenu(9, "Eliminar la opcion de comida", null, administradorInstancia));
        elementosMenuAdministrador.add(new ElementoMenu(10, "Agregar bebida", null, administradorInstancia));
        elementosMenuAdministrador.add(new ElementoMenu(11, "Crear cliente", null, administradorInstancia));
        elementosMenuAdministrador.add(new ElementoMenu(12, "Consultar lista de clientes totales", null, administradorInstancia));
        elementosMenuAdministrador.add(new ElementoMenu(13, "Editar opcion de bebida", null, administradorInstancia));
        elementosMenuAdministrador.add(new ElementoMenu(14, "Eliminar opcion de bebida", null, administradorInstancia));
        elementosMenuAdministrador.add(new ElementoMenu(15, "Cambiar estado de pedido", null, administradorInstancia));
        elementosMenuAdministrador.add(new ElementoMenu(16, "Consultar lista general de pedidos", null, administradorInstancia));
        elementosMenuAdministrador.add(new ElementoMenu(17, "Consultar ranking de clientes fecuentes", null, administradorInstancia));
        elementosMenuAdministrador.add(new ElementoMenu(-1, "Salir", null, administradorInstancia));

        this.menuAdministrador = new Menu(elementosMenuAdministrador, "Escoge una opcion");

        // Cajero
        Cajero cajeroInstancia = new Cajero();
        ArrayList<ElementoMenu> elementosMenuCajero = new ArrayList<ElementoMenu>();
        elementosMenuCajero.add(new ElementoMenu(1, "Crear pedido", null, cajeroInstancia));
        elementosMenuCajero.add(new ElementoMenu(2, "Cobrar pedido", null, cajeroInstancia));
        elementosMenuCajero.add(new ElementoMenu(3, "Anular pedido", null, cajeroInstancia));
        elementosMenuCajero.add(new ElementoMenu(-1, "Salir", null, cajeroInstancia));


        this.menuCajero = new Menu(elementosMenuCajero, "Escoge una opcion");


        // Menu de tipo de usuario
        ArrayList<ElementoMenu> elementosMenuTipoUsuario = new ArrayList<ElementoMenu>();
        elementosMenuTipoUsuario.add(new ElementoMenu(1, "Mozo", this.menuMozo, null));
        elementosMenuTipoUsuario.add(new ElementoMenu(2, "Administrador", this.menuAdministrador, null));
        elementosMenuTipoUsuario.add(new ElementoMenu(3, "Cajero", this.menuCajero, null));

        this.menuTipoDeUsuario = new Menu(elementosMenuTipoUsuario, "Escoge un tipo de usuario");

        // Menu de idiomas
        ArrayList<ElementoMenu> elementosMenuIdioma = new ArrayList<ElementoMenu>();
        elementosMenuIdioma.add(new ElementoMenu(1, "Espanol", this.menuTipoDeUsuario, null));
        elementosMenuIdioma.add(new ElementoMenu(2, "Ingles", this.menuTipoDeUsuario, null));

        this.menuIdioma = new Menu(elementosMenuIdioma, "Escoge un idioma");
    }

    public Menu getMenuMozo() {
        return menuMozo;
    }

    public Menu getMenuAdministrador() {
        return menuAdministrador;
    }

    public Menu getMenuCajero() {
        return menuCajero;
    }

    public Menu getMenuTipoDeUsuario() {
        return menuTipoDeUsuario;
    }

    public Menu getMenuIdioma() {
        return menuIdioma;
    }
}
