
# language: es


@AddCandidate
Característica: Registro de candidato exitoso

  Yo como TAE(Test automation engineer)
  Quiero realizar una prueba de autenticación al sitio web
  Para comprobar la robustes y control de errores del aplicativo web, funcione correctamente


  Antecedentes:
    Dado "Gerson" abre el sitio web de pruebas
    Dado   ingresa las credenciales


  @authenticationSuccess
  Escenario: Registrar un candidato.
    Cuando Click agregar candidato
    Entonces Visualizara el formulario con estado hired

