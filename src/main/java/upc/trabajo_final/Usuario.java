package upc.trabajo_final;

public class Usuario implements IUsuario {
    private String tipoUsuario;
    private String numeroDocumento;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String edad;
    private String fechaIngreso;
    private String inicioSesion;
    private String correoElectronico;
    private int telefono;
    private double salario;
    private boolean anulado;

    public Usuario(String tipoUsuario, String numeroDocumento, String nombre, String primerApellido, String segundoApellido, String edad, String fechaIngreso, String inicioSesion, String correoElectronico, String telefono, String salario) {
        this.tipoUsuario = tipoUsuario;
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.edad = edad;
        this.fechaIngreso = fechaIngreso;
        this.inicioSesion = inicioSesion;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.salario = salario;
        this.anulado = false;
    }

    public boolean isAnulado() {
        return anulado;
    }

    public void setAnulado(boolean anulado) {
        this.anulado = anulado;
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

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
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

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getInicioSesion() {
        return inicioSesion;
    }

    public void setInicioSesion(String inicioSesion) {
        this.inicioSesion = inicioSesion;
    }
    @Override
    public boolean salirSistema() {
        return true;
    }
    @Override
    public void crearPedido() {
        // Aqui se crea una nueva instancia de objeto a partir de la clase Pedido
    }
    @Override
    public void editarPedido() {
    }
}
