package models;

public class DatosUsuario {

    String email;
    String clave;

    public DatosUsuario(String email, String clave) {
        this.email = email;
        this.clave = clave;
    }

    public String getEmail() {
        return email;
    }

    public String getClave() {
        return clave;
    }
}
