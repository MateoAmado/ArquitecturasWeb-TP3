# Trabajo Practico Nro 3

## Consultas

### Estudiantes
- Para hacer un insert en Estudiantes, debemos hacelo via la siguiente url: http://localhost:8090/estudiantes en Postman, dejo un template de ejemplo


{
  "numeroDocumento": 123456789,
  "nombre": "Juan",
  "apellido": "Pérez",
  "edad": 22,
  "genero": "Masculino",
  "ciudadResidencia": "Buenos Aires",
  "numeroLibretaUniversitaria": 987654,
  "carreras": [
  {
  "idCarrera": 1
  },
  {
  "idCarrera": 2
  }
  ]
  }


### Carreras
- Para hacer un insert en Carreras, debemos hacerlo vía postman en la url: http://localhost:8090/carreras, dejo un template de ejemplo:

{
  "valor": 5000.0,
  "posicion": "Primera"
  }