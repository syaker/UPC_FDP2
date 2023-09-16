package upc.trabajo_final;

public class Cliente {
    String[][] clientes = {
            {"9982319","Walter", "White", "60",  "04/09/2023", "ww@gmail.com", "999324235"},
            {"9982319","Jesse", "Pinkman", "28", "19/11/2022", "jp@gmail.com", "999767675"},
            {"9982319","Nelly", "Caceres", "39", "28/02/2023", "nc@gmail.com", "934534534"},
            {"9982319","Alex", "Bunny", "40",  "23/05/2023", "ab@gmail.com", "999435334"},
            {"9982319","Stephanie", "Sanchez", "60", "04/06/2023", "ss@gmail.com", "96977798"},
    };

    private String numeroDocumento;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String edad;
    private String fechaRegistro;
    private String correoElectronico;
    private String telefono;

    public Cliente(String numeroDocumento, String nombre, String primerApellido, String segundoApellido, String edad, String fechaRegistro, String correoElectronico, String telefono) {
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.edad = edad;
        this.fechaRegistro = fechaRegistro;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
