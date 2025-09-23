//let autos = new Array("Ferrari","Renault","BMW")
//esta sintaxis es vieja

//Esta es la forma usada para declarar un array
const autos = ["Ferrari","Renault","BMW"];
console.log(autos)

//Recorriendo un arreglo
console.log(autos[0])//De esta forma lo recorremos por indice

for (let index = 0 ; index < autos.length; index++){
    const element = autos[index];
    console.log(index +"->"+element)
    //De esta forma recorremos el array con indice y valor
}


// Modificando un elemento de la array
autos[1] = "Volvo"
console.log(autos)

//Agregando un elemento al array
autos.push("Audi")//De esta forma agregamos un elemento al final
console.log(autos)

//Otra forma de agregar elemento al array
autos[autos.length] = "Porsche"
console.log(autos)


//Agregar elemento con indice
//Cuidado a la hora de indicar el indice,ya que cada indice ocupa un espacio de memoria
autos[3] = "Renault"
console.log(autos)



//Como saber si es un array
console.log(Array.isArray(autos))//Nos devuelve un valor booleano

//opcion 2 para saber si es array
console.log(autos instanceof Array)