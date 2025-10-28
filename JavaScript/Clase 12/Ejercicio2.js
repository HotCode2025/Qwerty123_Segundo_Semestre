function createTaskManager() {
    let tasks = [];
    
    return {
        addTask: function(task) {
            // Agrega una nueva tarea con un id y estado "incompleta"
            tasks.push({ id: tasks.length + 1, name: task, completed: false });
            console.log(`Tarea agregada: "${task}"`);
        },
        completeTask: function(taskId) {
            // Marca una tarea como completada según su id
            const task = tasks.find(t => t.id === taskId);
            if (task) {
                task.completed = true;
                console.log(`Tarea completada: "${task.name}"`);
            } else {
                console.log("Tarea no encontrada.");
            }
        },
        listTasks: function() {
            // Muestra todas las tareas con su estado
            console.log("Lista de tareas:");
            tasks.forEach(t => {
                const estado = t.completed ? "Completada" : "Pendiente";
                console.log(`${t.id}. ${t.name} - ${estado}`);
            });
        }
    };
}

// Uso:
const myTasks = createTaskManager();
myTasks.addTask("Aprender JavaScript");
myTasks.addTask("Hacer ejercicio");
myTasks.listTasks();
myTasks.completeTask(1);
myTasks.listTasks();
