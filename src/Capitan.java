public class Capitan {
    private String nombre;
    private String apellido;
    private String matriculaNav;

    public Capitan(String nombre, String apellido, String matriculaNav) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matriculaNav = matriculaNav;
    }

    public Capitan (){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMatriculaNav() {
        return matriculaNav;
    }

    public void setMatriculaNav(String matriculaNav) {
        this.matriculaNav = matriculaNav;
    }
}
