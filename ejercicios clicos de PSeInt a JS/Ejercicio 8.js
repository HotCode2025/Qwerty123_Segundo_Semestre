// Leer 10 numeros e imprimir cuantos son positivos y cuantos son negativos
// y cuantos neutros.
// No ingresar por teclado. Para que pueda ejecutar Quokka. Contar positivos, negativos y neutros

const numeros = [5, -3, 0, 8, -1, 0, 12, -7, 0, 4]; // Cambiar los números del arreglo para distintos casos. 
let positivos = 0;
let negativos = 0;
let neutros = 0;

for (let i = 0; i < numeros.length; i++) {
  const num = numeros[i];

  if (num > 0) {
    positivos++;
  } else if (num < 0) {
    negativos++;
  } else {
    neutros++;
  }
}

console.log("Cantidad de positivos:", positivos);
console.log("Cantidad de negativos:", negativos);
console.log("Cantidad de neutros:", neutros);