# Lab-III-Estructura-de-Datos
## Descripción
Este proyecto corresponde al laboratorio 3 de la materia de Estructuras de Datos. En él, se implementan varios conceptos relacionados con ordenamiento y recursividad utilizando el lenguaje de programación Kotlin. El programa proporciona un menú interactivo con diferentes opciones para ordenar listas, calcular factoriales y resolver el problema de las Torres de Hanói.

## Funcionalidades
- **Bubble Sort**: Permite ordenar una lista de números proporcionada por el usuario usando el algoritmo de Bubble Sort. Este algoritmo ordena los números comparando pares adyacentes y permutándolos si es necesario.
- **Quick Sort**: Ordena una lista de números de manera más eficiente que el Bubble Sort utilizando el algoritmo de Quick Sort. Este algoritmo selecciona un "pivote" y divide la lista en elementos menores y mayores que el pivote, ordenando las sublistas recursivamente.
- **Factorial**: Calcula el factorial de un número ingresado utilizando una función recursiva. El factorial es el producto de todos los números enteros positivos hasta el número ingresado.
- **Torres de Hanói**: Resuelve el clásico problema de las Torres de Hanói, mostrando paso a paso cómo mover los discos entre tres torres.
- **Salir**: Finaliza la ejecución del programa.

## Requisitos
Para ejecutar el programa, necesitas:
- Tener Kotlin instalado en tu máquina.
- Tener Java instalado.

## Cómo usarlo
1. con el archivo `lab3.kt`.
2. Abre el archivo en Visual Studio Code o cualquier editor compatible con Kotlin.
3. En la terminal de Visual Studio Code, compila el programa con los siguientes comandos:
   kotlinc lab3.kt -include-runtime -d lab3.jar
   java -jar lab3.jar


## Ejemplo
Cuando abra el programa, verás algo como esto:

### Menú Principal
Seleccione una opción:
1. Ordenar una lista usando Bubble Sort
2. Ordenar una lista usando Quick Sort
3. Calcular el factorial de un número
4. Resolver las Torres de Hanói
5. Salir
Opción: 

### Ejemplo de Bubble Sort
Ingrese una lista de números separados por comas: 8,3,5,1,9
Lista ordenada usando Bubble Sort: [1, 3, 5, 8, 9]
Tiempo de ejecución: 0.002 segundos

### Ejemplo de Factorial
Ingrese un número: 5
El factorial de 5 es: 120

### Ejemplo de Torres de Hanói
Ingrese el número de discos: 3
Paso 1: Mover disco 1 de Torre A a Torre C
Paso 2: Mover disco 2 de Torre A a Torre B
Paso 3: Mover disco 1 de Torre C a Torre B
Paso 4: Mover disco 3 de Torre A a Torre C
Paso 5: Mover disco 1 de Torre B a Torre A
Paso 6: Mover disco 2 de Torre B a Torre C
Paso 7: Mover disco 1 de Torre A a Torre C

## Nota
- El programa maneja errores de entrada y garantiza interactividad fácil de usar.
