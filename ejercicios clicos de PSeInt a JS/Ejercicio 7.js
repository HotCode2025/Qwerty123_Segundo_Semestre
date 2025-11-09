//Se desea calcular independientemente la suma de los números pares e impares comprendidos entre 1 y 50. Ciclos: para - hasta - hacer....
//Suma de pares e impares entre 1 y 50

let suma_pares = 0;
let suma_impares = 0;

for (let i = 1; i <= 50; i++) {
  if (i % 2 === 0) {
    suma_pares += i;
  } else {
    suma_impares += i;
  }
}

console.log("Suma de los números pares entre 1 y 50:", suma_pares);
console.log("Suma de los números impares entre 1 y 50:", suma_impares);