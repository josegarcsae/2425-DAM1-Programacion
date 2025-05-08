import java.time.LocalDate;

public class Contacto {

    Integer idContacto;
    String nombre;
    String apellidos;
    String apodo;
    String relacion;
    String telefono;
    LocalDate cumpleanios;
    String instagram;
    String email;
    String empresa;

    public Contacto(Integer idContacto, String nombre, String apellidos) {
        this.idContacto = idContacto;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Integer getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(Integer idContacto) {
        this.idContacto = idContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getRelacion() {
        return relacion;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getCumpleanios() {
        return cumpleanios;
    }

    public void setCumpleanios(LocalDate cumpleanios) {
        this.cumpleanios = cumpleanios;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("idContacto=").append(idContacto);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", apodo='").append(apodo).append('\'');
        sb.append(", relacion='").append(relacion).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append(", cumpleanios=").append(cumpleanios);
        sb.append(", instagram='").append(instagram).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", empresa='").append(empresa).append('\'');
        return sb.toString();
    }
}
