Feature: Ingresar al modulo de registro
  yo como usuario
  necesito registrar un nuevo automatizador
  para recopilar informacion


  Scenario Outline: Crear un nuevo resgistro para un automatizador
    Given usuario puede acceder a la Url
    When desee agregar un nuevo automatizador
    |primernombre|<primernombre>|
    |apellido    |<apellido>|
    |correo      |<correo>|
    |lenguajes   |<lenguajes>|
    |dia         | <dia>|
    |mes            |<mes>     |
    |anio         | <anio>|
    |ciudad       |<ciudad>|
    |codigoPostal       |<codigoPostal>|
    |pais       |<pais>|
    |computador       |<computador>|
    |version                |<version>|
    |lenguaje               |<lenguaje>|
    |contrasena                      |<contrasena>|
    |contrasenaConfirmacion                      |<contrasenaConfirmacion>|


    Then valida que el nuevo resgistro se haya realizado
    Examples:
      |primernombre  |apellido|correo|lenguajes|dia|mes|anio|ciudad|codigoPostal|pais|computador|version|lenguaje|contrasena|contrasenaConfirmacion|
      |pepe          |perez   |pperez@gmail.com     |Spanish|25       |February   | 1995   |Bogotá      |110011            |Colombia    |Windows |8|Spanish        | P3p3rez1187#*         |P3p3rez1187#*   |
