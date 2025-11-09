// Calcular la sumatoria: Ciclo Repetir - Hasta que....
//    S= 1+ x/1! + x²/2! + x³/3! + xexp.n/n!
// Se debe ingresar "x" real y "n" entero positivo.
//  Serie de e^X truncada hasta X^n/n!

const N = 5; // Número de términos (entero positivo)

let suma = 1; // Comienza con el primer término: 1
let factorial = 1;
let potencia = 1;

for (let i = 1; i <= N; i++) {
  potencia *= X;       // X^i
  factorial *= i;      // i!
  suma += potencia / factorial;
}

console.log(`La suma de la serie hasta X^${N}/${N}! es:`, suma); 


 