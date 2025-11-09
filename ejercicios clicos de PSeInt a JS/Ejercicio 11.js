// Ingresar N números, calcular el máximo y el mínimo de ellos.
// Calcular máximo y mínimo de N números

const numeros = [12, 5, 27, -3, 8, 0, 19, 33, -10, 7]; // Para otros casos. Cambiar números aquí.

let i = 0;
let maximo = numeros[0];
let minimo = numeros[0];

do {
  const num = numeros[i];

  if (num > maximo) {
    maximo = num;
  }

  if (num < minimo) {
    minimo = num;
  }

  i++;
} while (i < numeros.length);

console.log("Máximo:", maximo);
console.log("Mínimo:", minimo);