package upc.trabajo_final;

public class ElementoMenu {
    private int idElementoMenu;
    private String textoElementoMenu;
    private MenuSistema submenu;

    public ElementoMenu(int idElementoMenu, String textoElementoMenu, MenuSistema submenu) {
        this.idElementoMenu = idElementoMenu;
        this.textoElementoMenu = textoElementoMenu;
        this.submenu = submenu;
    }

    public MenuSistema getSubmenu() {
        return submenu;
    }

    public int getIdElementoMenu() {
        return idElementoMenu;
    }

    public String getTextoElementoMenu() {
        return textoElementoMenu;
    }
}
