//Se tiene un conjunto de calificaciones de un grupo de 10 alumnos. 
// Realizar un algoritmo para calcular la calificación promedio y la calificación más baja de todo el grupo.

const nota1 = 80;
const nota2 = 70;
const nota3 = 60;

const promedio = (nota1 + nota2 + nota3) / 3;

if (promedio >= 70) {
  console.log("El alumno está aprobado con:", promedio);
} else {
  console.log("El alumno está desaprobado con:", promedio);
}

