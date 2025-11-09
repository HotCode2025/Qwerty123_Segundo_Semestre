// ingresar N enteros, visualizar la suma de los números pares de la lista.
// cuantos números pares existen y cuál es el promedio de los números impares.
// - Suma de pares, conteo de pares y promedio de impares
// no se puede ingresar la cantidad de números por teclado. Porque no lo ejecuta Quokka.

const numeros = [10, 2, 4, 3, 2, 11, 6]; // cambiar los números desde aquí

let suma_pares = 0;
let conteo_pares = 0;
let suma_impares = 0;
let conteo_impares = 0;

for (let i = 0; i < numeros.length; i++) {
  const num = numeros[i];

  if (num % 2 === 0) {
    suma_pares += num;
    conteo_pares++;
  } else {
    suma_impares += num;
    conteo_impares++;
  }
}

console.log("Suma de los números pares:", suma_pares);
console.log("Cantidad de números pares:", conteo_pares);

if (conteo_impares === 0) {
  console.log("No se han ingresado números impares");
} else {
  const promedio_impares = suma_impares / conteo_impares;
  console.log("Promedio de los números impares:", promedio_impares);
}