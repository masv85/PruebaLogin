#language:es
Característica: inicio de sesion exitoso

  Escenario: ejecutar exitosamente inicio de sesion en la aplicacion
    Dado que el usuaio se encuentra en la pagina opencart
    Cuando ingresa sus credenciales
      | email              | clave    |
      | masv1985@gmail.com | MASV85** |
    Entonces el visualizara la palabra My Account