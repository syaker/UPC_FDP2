package upc.trabajo_final.usuario;

import upc.trabajo_final.pedido.Pedido;

import java.util.ArrayList;

public class UsuarioDB {
    ArrayList<Usuario> usuarios = new ArrayList<>();
    public UsuarioDB() {
        Usuario u1 = new Usuario("mozo","9882985", "Ana", "Perez", "Rodriguez", "20", "04/09/2023", "si", "anaperez@gmail.com", 999324235, 2000);
        Usuario u2 = new Usuario("administrador","123456789", "Juan", "Martinat", "Chavez", "20", "19/11/2022", "si", "jmarti@gmail.com", 999767675, 2000);
        Usuario u3 = new Usuario("cajero","3634643", "Nelly", "Tapia", "Ballena", "20", "28/02/2023", "si", "nellytb@gmail.com", 934534534, 1300);
        Usuario u4 = new Usuario("mozo","3563456", "Gonzalo", "Lastra", "Fernandez", "20", "23/05/2023", "si", "gonza9899@gmail.com", 999435334, 5000);
        Usuario u5 = new Usuario("mozo","5675675", "Carola", "Quintanilla", "Rodriguez", "20", "04/06/2023", "si", "caroquinta@gmail.com", 96977798, 2000);
        Usuario u6 = new Usuario("cajero","324324", "Ana", "Carolina", "Vertiz", "35", "04/04/2023", "si", "caroquinta@gmail.com", 96977798, 2000);

        this.usuarios.add(u1);
        this.usuarios.add(u2);
        this.usuarios.add(u3);
        this.usuarios.add(u4);
        this.usuarios.add(u5);
        this.usuarios.add(u6);

    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
}
