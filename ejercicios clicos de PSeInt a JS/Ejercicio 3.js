//Se tiene un conjunto de calificaciones de un grupo de 10 alumnos
//realizar un algoritmo para calcular la calificación promedio y la 
//calificación más baja de todo el grupo.
//  - Promedio y nota más baja de 10 alumnos

const calificaciones = [8, 7, 9, 6, 7, 5, 9, 8, 7, 7]; // Podés cambiar estos valores

let suma = 0;
let notaMasBaja = calificaciones[0];

for (let i = 0; i < calificaciones.length; i++) {
  suma += calificaciones[i];
  if (calificaciones[i] < notaMasBaja) {
    notaMasBaja = calificaciones[i];
  }
}

const promedio = suma / calificaciones.length;

console.log("Promedio del grupo:", promedio);
console.log("Nota más baja del grupo:", notaMasBaja);