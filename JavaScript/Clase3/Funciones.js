//Vamos a ver funciones

/*Podemos declarar una funcion y llamarla antes o despues
esto se conoce como "Hosting", lo que hace que podamos llamar a un funcion antes de declarla
*/
mifunction(8,2)//esto es lo que llamamos un "hosting"

function mifunction(a,b){
    console.log("Sumamos: " + (a + b))
    //return a + b;//Si no expresamos el "return",la funcion no puede ser llamada como variable
}

//llamamos a la funcion
mifunction(5,4);

let resultado = mifunction(6,7)//Aca la funcion no puede ser usada como variable,porque no tiene un return expresado
console.log(resultado)


//Declaramos una funcion de tipo expresion o anonima
let x = function(a,b){return a + b}
resultado = x(5,6)
console.log(resultado);


//Funciones de tipo self y invoking
(function(a,b){
    console.log("Ejecutando la funcion " + (a + b))
})(9,6);


//typeof para saber de que tipo es, y argumentos
console.log(typeof mifunction);
function mifunction2(a,b){
    console.log(arguments.length)
}
mifunction2(5,7,5,7,2);


//Este metodo nos sirve para mostrar la funcion en string
var miFuncionTexto = mifunction2.toString();
console.log(miFuncionTexto)



//Funciones de tipo flecha
const sumarFuncionFlecha = (a,b) => a + b; 
resultado = sumarFuncionFlecha(3,7)
console.log(resultado)


//Argumentos y parametros
//Funcion de tipo expresion
let sumar = function(a = 4,b = 6){//se pueden asignar valores por defectos
    console.log(arguments[0])
    console.log(arguments[1])
    console.log(arguments[3])
    return a + b;
    //A tener en cuenta...los valores asignados por default no es lo mismo que definidos
}
resultado = sumar()/*aca con la funcion "sumar" estamos pidiendo que nos muestre por iteracion []
por eso en la funcion nos muestra como "undefined" los valores pero nos da el "return" de los valores
por defecto*/
console.log(resultado)


//Sumar todos los argumentos haciendo un "hosting"
let respuesta = sumarTodo(5,4,13,10,9);
console.log(respuesta)

function sumarTodo(){//esta funcion es "hosting" del llamado de "respuesta"
    let suma = 0
    for(let i = 0; i < arguments.length; i++){
        suma += arguments[i]
    }
    return suma
}


//Pasar parametros por valor
//Tipos primitivos
let k = 10
function cambiarValor(a){
    a = 20;
}
/*Aca lo que hicimos fue crear una variable "k" con valor "10", y luego modificar la funcion
que tiene la variable "a" por la variable "k". Esto hace que el valor de "a = 20" pase a tener el valor de "k" 

Basicamente,creamos una funcion y cambiamos su valor asignado,por un valor de una variable global
*/
cambiarValor(k);
console.log(k)


//Paso de parametros por referencia
const persona = {
    nombre : "Juan",
    apellido : "Perez"
}
console.log(persona)
function cambiarValorObjeto(p1){
    p1.nombre = "Ignacio";
    p1.apellido = "Perez";
}
/* El llamado por referencia cambia un valor asignado en memoria
*/
cambiarValorObjeto(persona)
console.log(persona)