// imprimir la serie de los N términos de la serie Fibonacci
// Versión compatible con Quokka.js - Serie Fibonacci

const N = 10; // Cambiar este número para ver mas o menos términos.

let a = 0;
let b = 1;
let serie = [];

for (let i = 0; i < N; i++) {
  serie.push(a);
  const siguiente = a + b;
  a = b;
  b = siguiente;
}

console.log(`Los primeros ${N} términos de la serie Fibonacci son:`);
console.log(serie);

