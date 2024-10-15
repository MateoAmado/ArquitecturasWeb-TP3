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
  "numeroLibretaUniversitaria": 987654
  }


### Carreras
- Para hacer un insert en Carreras, debemos hacerlo vía postman en la url: http://localhost:8090/carreras, dejo un template de ejemplo:

{
  "nombre" : "TUDAI"
  }

### Estudiante_Carrera
- Para hacer un insert en Estudiante_Carrero, debemos hacerlo via postman en la url: http://localhost:8090/estudiante_carrera

{
    "id": {
        "estudianteNumeroDocumento": 365222336,
        "idCarrera": 5
    },
    "estudiante": 
        {
 "numeroDocumento": 365222336
    },
    "carrera": 
        {
   "idCarrera": 5
        }
    ,
    "fechaInscripcion": "2024-10-11",
    "graduado": true
}
