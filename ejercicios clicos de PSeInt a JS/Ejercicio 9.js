//Dadas las horas trabajadas de 5 personas y la tarifa de pago, 
// calcular el salario y la sumatoria de todos los salarios (ciclos Mientras - Hacer)
// Cálculo de salarios con ciclo while

const horasTrabajadas = [40, 35, 30, 45, 38]; // Horas trabajadas por cada persona
const tarifaPorHora = 1000; // Tarifa fija por hora (se puede cambiar)

let i = 0;
let sumaTotal = 0;

while (i < horasTrabajadas.length) {
  const salario = horasTrabajadas[i] * tarifaPorHora;
  console.log(`Persona ${i + 1} - Horas: ${horasTrabajadas[i]}, Salario: $${salario}`);
  sumaTotal += salario;
  i++;
}

console.log("Sumatoria total de salarios:", sumaTotal);