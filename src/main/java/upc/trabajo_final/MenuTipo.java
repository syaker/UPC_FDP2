package upc.trabajo_final;

import java.util.ArrayList;
import java.util.List;

public class MenuTipo {
    //Atributos
    private String nombreCarta;

    private String horario;
    private List<Comida> platos;





    //Constructor
    //Carta sección comida
    public MenuTipo(String nombreCarta, String horario, List<Comida> platos) {
        this.nombreCarta = nombreCarta;
        this.horario = horario;
        this.platos = platos;
    }

    //Carta sección bebidas
    public MenuTipo() {
        this.nombreCarta = nombreCarta;
        this.horario = horario;
    }

    //Getter & setter


    public String getNombreCarta() {
        return nombreCarta;
    }

    public void setNombreCarta(String nombreCarta) {
        this.nombreCarta = nombreCarta;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String hora) {
        this.horario = horario;
    }

    public List<Comida> getPlatos() {

        return platos;
    }

    public void setPlatos(List<Comida> platos) {

        this.platos = platos;
    }

}
