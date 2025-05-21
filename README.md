## El programa se compone de tres clases principales:

`ConvertidorMaya`: Se encarga de transformar un número decimal en su equivalente en base 20. Utiliza un Vector<Integer> para almacenar los dígitos en base maya, aplicando divisiones sucesivas entre 20 y guardando los residuos. Al finalizar, invierte el orden del vector para respetar la estructura jerárquica del sistema maya (de menor a mayor valor posicional, de abajo hacia arriba).

`CodigoMaya`: Proporciona una representación visual de cada dígito maya entre 0 y 19, utilizando puntos (.) para unidades, barras (______) para quinarias y el símbolo @ para representar el cero (que en el sistema maya era un glifo con forma de caracol).

`Main`: Es la clase principal que gestiona la interacción con el usuario. Solicita un número por consola, genera su conversión a base maya y luego imprime cada nivel del número en formato visual, separando claramente las potencias de 20 (1, 20, 400, 8000, etc.) mediante líneas divisorias para facilitar su lectura.

Esta implementación permite comprender visualmente cómo los mayas representaban los números utilizando una notación posicional vigesimal, y resalta la importancia de los símbolos y la jerarquía en su sistema numérico.
