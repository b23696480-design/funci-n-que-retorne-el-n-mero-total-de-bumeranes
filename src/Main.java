//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // Función que cuenta la cantidad de bumeranes
    public static int contarBumeranes(int[] numeros) {
        int contador = 0;

        // Recorremos el arreglo hasta el antepenúltimo elemento
        for (int i = 0; i < numeros.length - 2; i++) {

            // El primero y el último deben ser iguales
            // y el número del medio debe ser diferente
            if (numeros[i] == numeros[i + 2] &&
                    numeros[i] != numeros[i + 1]) {

                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {

        int[] numeros = {2, 1, 2, 3, 3, 4, 2, 4};

        int resultado = contarBumeranes(numeros);

        System.out.println("Cantidad de bumeranes: " + resultado);
    }
}