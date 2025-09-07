//Ciclo While

let contador = 0;
while(contador < 3){
    console.log("Ciclo While = "+ contador);
    contador++;
}
console.log("Fin de Ciclo")

//Ciclo Do While
let conteo =0;
do{
    console.log("Ciclo Do While = "+ conteo);
    conteo++;
}while(conteo < 3);
console.log("Fin de Ciclo")


//Ciclo For
for(let contando = 0;contando < 3; contando++){
    console.log("Ciclo For = " + contando)
}
console.log("Fin de Ciclo")


//Palabra Reservada break
for(let ciclo = 0; ciclo <= 10; ciclo++){
    if(ciclo % 2 == 0){
        console.log("Los pares son : " + ciclo)
        break; //Esta funcion termina el ciclo mostrando el primer valor con la condicion
    }
}

console.log("Uso de palabra reservada para detener el ciclo")

//Palabra reservada continue
for(let ciclo = 0; ciclo <= 10; ciclo++){
    if(ciclo % 2 !== 0){ 
        continue;//ir a la siguiente iteracion
    }
    console.log("Los pares son : " + ciclo)
}
console.log("Fin del Ciclo")

//Las etiquetas Labels
inicio: 
for(let ciclo = 0; ciclo <= 10; ciclo++){
    if(ciclo % 2 !== 0){ 
    break inicio;//ir a la siguiente iteracion
    }
    console.log("Los pares son : " + ciclo)
}
console.log("Fin del Ciclo")