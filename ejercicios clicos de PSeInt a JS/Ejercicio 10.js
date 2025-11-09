// Calcular la suma de los N terminos de la siguiente serie:
//  S= 1/2 + 1/3 - 1/4 + 1/5 - 1/6 +....1/N Ciclos repetir Hasta que
// Suma alternada de fracciones desde 1/2 hasta 1/N

const N = 10; // cambiar valor para mostrar mas N elementos
let suma = 0;

for (let i = 2; i <= N; i++) {
  if (i % 2 === 0) {
    suma -= 1 / i;
  } else {
    suma += 1 / i;
  }
}

console.log(`La suma de la serie hasta 1/${N} es:`, suma);

