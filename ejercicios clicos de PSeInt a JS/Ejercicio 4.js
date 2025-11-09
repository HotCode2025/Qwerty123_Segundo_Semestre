//  Calcular el factorial de un número >= 0

const num = 5; // este valor puede cambiarse para probar otros casos.
let i = 1;
let factorial = 1;

// N! = 1 * 2 * 3 * ... * N
while (i <= num) {
  factorial *= i;
  i++;
}

console.log("El factorial de", num, "es:", factorial);