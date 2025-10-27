// Ejercicio 1: Función que valide una contraseña (mínimo 8 caracteres, 1 número, 1 mayúscula)

function validatePassword(password) {
    // Debe tener al menos una mayúscula, un número y mínimo 8 caracteres
    const regex = /^(?=.*[A-Z])(?=.*\d).{8,}$/;
    return regex.test(password);
}

console.log(validatePassword("Abc12345")); // true
console.log(validatePassword("weak"));     // false
