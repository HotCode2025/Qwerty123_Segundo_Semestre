// Calcular la siguiente sumaria de los "N" elementos. Sumatoria S = 1 + 4 + 9 + ... + N²
//Por ejemplo, si ,  Suma = 1² + 2² + 3² + 4² + 5² = 55.


const n_elementos = 10; // Cambiá este valor para probar con otros
let i = 1;
let suma = 0;

while (i <= n_elementos) {
  suma += i ** 2; // i al cuadrado
  i++;
}

console.log("La suma de los", n_elementos, "primeros cuadrados es:", suma);