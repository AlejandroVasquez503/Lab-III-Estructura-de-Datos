fun main() {
    while (true) {
        println("Seleccione una opción:")
        println("1. Ordenar una lista usando Bubble Sort")
        println("2. Ordenar una lista usando Quick Sort")
        println("3. Calcular el factorial de un número")
        println("4. Resolver las Torres de Hanói")
        println("5. Salir")
        
        print("Opción: ")
        val option = readLine()?.toIntOrNull()

        when (option) {
            1 -> bubbleSortOption()
            2 -> quickSortOption()
            3 -> factorialOption()
            4 -> hanoiOption()
            5 -> {
                println("Saliendo del programa...")
                return
            }
            else -> println("Opción no válida. Intente de nuevo.")
        }
    }
}

//Función Bubble Sort
fun bubbleSortOption() {
    print("Ingrese una lista de números separados por comas: ")
    val input = readLine()
    val numbers = input?.split(",")?.mapNotNull { it.trim().toIntOrNull() } ?: listOf()

    if (numbers.isEmpty()) {
        println("Lista no válida. Intente de nuevo.")
        return
    }

    val startTime = System.nanoTime()
    val sortedList = bubbleSort(numbers)
    val endTime = System.nanoTime()
    val duration = (endTime - startTime) / 1_000_000.0

    println("Lista ordenada usando Bubble Sort: $sortedList")
    println("Tiempo de ejecución: ${"%.3f".format(duration)} ms")
}

fun bubbleSort(list: List<Int>): List<Int> {
    val array = list.toMutableList()
    for (i in array.indices) {
        for (j in 0 until array.size - i - 1) {
            if (array[j] > array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
    return array
}

//Función Quick Sort
fun quickSortOption() {
    print("Ingrese una lista de números separados por comas: ")
    val input = readLine()
    val numbers = input?.split(",")?.mapNotNull { it.trim().toIntOrNull() } ?: listOf()

    if (numbers.isEmpty()) {
        println("Lista no válida. Intente de nuevo.")
        return
    }

    val startTime = System.nanoTime()
    val sortedList = quickSort(numbers)
    val endTime = System.nanoTime()
    val duration = (endTime - startTime) / 1_000_000.0

    println("Lista ordenada usando Quick Sort: $sortedList")
    println("Tiempo de ejecución: ${"%.3f".format(duration)} ms")
}

fun quickSort(list: List<Int>): List<Int> {
    if (list.size < 2) return list
    val pivot = list[list.size / 2]
    val less = list.filter { it < pivot }
    val equal = list.filter { it == pivot }
    val greater = list.filter { it > pivot }
    return quickSort(less) + equal + quickSort(greater)
}

// Función para calcular factorial
fun factorialOption() {
    print("Ingrese un número entero positivo: ")
    val number = readLine()?.toIntOrNull()

    if (number == null || number < 0) {
        println("Número no válido. Intente de nuevo.")
        return
    }

    val result = factorial(number)
    println("El factorial de $number es: $result")
}

fun factorial(n: Int): Long {
    return if (n == 0) 1 else n * factorial(n - 1)
}

// Función para Torres de Hanói
fun hanoiOption() {
    print("Ingrese el número de discos: ")
    val disks = readLine()?.toIntOrNull()

    if (disks == null || disks <= 0) {
        println("Número no válido. Intente de nuevo.")
        return
    }

    println("Resolviendo Torres de Hanói con $disks discos:")
    hanoi(disks, 'A', 'C', 'B')
}

fun hanoi(n: Int, from: Char, to: Char, aux: Char) {
    if (n == 1) {
        println("Mover disco 1 de Torre $from a Torre $to")
        return
    }
    hanoi(n - 1, from, aux, to)
    println("Mover disco $n de Torre $from a Torre $to")
    hanoi(n - 1, aux, to, from)
}
