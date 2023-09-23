package upc.trabajo_final.interfaz_sistema;

public class ElementoMenu {
    private int idElementoMenu;
    private String textoElementoMenu;
    private Menu submenu;
    private IAccionMenu accion;

    public ElementoMenu(int idElementoMenu, String textoElementoMenu, Menu submenu,IAccionMenu accion) {
        this.idElementoMenu = idElementoMenu;
        this.textoElementoMenu = textoElementoMenu;
        this.submenu = submenu;
        this.accion = accion;
    }

    public Menu getSubmenu() {
        return submenu;
    }

    public int getIdElementoMenu() {
        return idElementoMenu;
    }

    public String getTextoElementoMenu() {
        return textoElementoMenu;
    }

    public void ejecutarAccion(int accionId) {
        if (this.accion != null) {
            accion.ejecutarAccion(accionId);
        }
    }
}
