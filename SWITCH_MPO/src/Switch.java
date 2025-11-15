import java.util.Scanner;

public class Switch {
    public void Ejercicio1() {
/*
Crear un programa que convierta una calificación numérica (0-10)
en su equivalente alfabético usando un switch.
Considera: 9-10 = A, 7-8.9 = B, 5-6.9 = C, 4-4.9 = D, 0-3.9 = F
*/


        double calificacion = 7.5;


        int calificacionEntera = (int) calificacion;


        switch (calificacionEntera) {
            case 10:
            case 9:
                System.out.println("Tu calificación es A");
                break;

            case 8:
            case 7:
                System.out.println("Tu calificación es B");
                break;

            case 6:
            case 5:
                System.out.println("Tu calificación es C");
                break;

            case 4:
                System.out.println("Tu calificación es D");
                break;

            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Tu calificación es F");
                break;

            default:
                System.out.println("Calificación inválida");
                break;
        }
    }

    public void Ejercicio2() {
        /*
        **Objetivo:** Crear un programa que convierta una cantidad en euros a otras monedas según la opción seleccionada.
**Requisitos:**

1. Crea un enum `Moneda` con: `DOLAR`, `LIBRA`, `YEN`, `PESO`.
2. Declara una variable `double euros` con una cantidad.
3. Usa un `switch` con el enum para aplicar la tasa de conversión correspondiente.
4. Muestra el resultado de la conversión.
         */
        double euros = 512.00;
        Divisas monedaDestino = Divisas.Dollar;
        final double Tasa_Dollar = 1.16;
        final double Tasa_Yen = 179.72;
        final double Tasa_Libra = 0.88;
        final double Tasa_Pesos = 21.21;
        double resultadoConversion = 0;
        switch (monedaDestino) {
            case Dollar:
                resultadoConversion = euros * Tasa_Dollar;
                break;
            case Yen:
                resultadoConversion = euros * Tasa_Yen;
                break;
            case Libra:
                resultadoConversion = euros * Tasa_Libra;
                break;
            case Pesos:
                resultadoConversion = euros * Tasa_Pesos;
                break;
            default:
                System.out.println("Conversión no contemplada");
        }
        System.out.printf("--- Resultado de la Conversión ---%n");
        System.out.printf("Cantidad: %.2f EUR%n", euros);
        System.out.printf("Convertido a: %s%n", monedaDestino);
        System.out.printf("Resultado: %.2f %s%n", resultadoConversion, monedaDestino);
    }

    public void Ejercicio3() {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Introduce la temperatura de tu ciudad:");
        int temperatura = scanner.nextInt();

        String mensaje = switch (temperatura) {
            case Integer t when t >= 35 -> "La temperatura es de " + t + " º, el tiempo es muy caliente, hidrátate";
            case Integer t when t >= 25 -> "La temperatura es de " + t + "º, hace calor, sal más tarde a la calle";
            case Integer t when t >= 16 -> "La temperatura es de " + t + "º, el tiempo está templado, ni frío ni calor";
            case Integer t when t >= 0 -> "La temperatura es de " + t + "º, el tiempo es frío, abrígate.";
            default -> "La temperatura es de " + temperatura + "º, el tiempo está helado, tómate una sopa.";
        };
        System.out.println(mensaje);

    }

    public void Ejercicio5() {
        /*
        **Objetivo:** Crear una calculadora simple que realice operaciones según un operador.

         **Requisitos:**

         1. Declara dos variables `double num1` y `double num2`.
         2. Declara una variable `char operador` con valores posibles: '+', '-', '*', '/'.
         3. Usa un `switch` para realizar la operación correspondiente.
         4. Maneja el caso especial de división por cero.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Introduce el operador (+, -, *, /):");
        char operador = scanner.next().charAt(0);

        System.out.println("Introduce el segundo número:");
        double num2 = scanner.nextDouble();

        double resultado;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;

            case '-':
                resultado = num1 - num2;
                break;

            case '*':
                resultado = num1 * num2;
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Error: No se puede dividir por cero.");
                    scanner.close();
                    return;
                }
                resultado = num1 / num2;
                break;

            default:
                System.out.println("Error: Operador '" + operador + "' no es válido.");
                scanner.close();
                return;
        }

        System.out.println("Resultado: " + num1 + " " + operador + " " + num2 + " = " + resultado);

        scanner.close();
    }

    public void Ejercicio6() {
        /*
        **Objetivo:** Crear un programa que genere saludos diferentes según la hora del día.

         **Requisitos:**

         1. Crea un método `obtenerHoraActual()` que devuelva un número entre 0 y 23.
         2. En el `main`, llama al método y usa `switch(true)` para clasificar en:
         *                            Madrugada (0-5), Mañana (6-11), Tarde (12-19), Noche (20-23).
         3. Muestra un saludo apropiado para cada período del día.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la hora (ej:19):");
        int horaUsuario = scanner.nextInt();

        switch (horaUsuario) {

            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Aún es de madrugada, sigue durmiendo");
                break;


            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("Ya es de mañana... ¡Buenos días!");
                break;


            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                System.out.println("¡Buenas tardes!");
                break;


            default:
                System.out.println("Buenas noches");
                break;
        }
    }

    public void Ejercicio7() {
        /*
        **Objetivo:** Crear un sistema que determine el nivel del jugador según su puntuación.

**Requisitos:**

1. Declara una variable `int puntuacion`.
2. Usa `switch(true)` para clasificar en niveles:
* Principiante (0-100), Intermedio (101-500), Avanzado (501-1000), Experto (1001-5000), Maestro (>5000).
3. Muestra el nivel alcanzado y un mensaje motivacional.
4. Otorga una recompensa virtual diferente para cada nivel.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu puntuación:");
        int puntuacion = scanner.nextInt();

        if (puntuacion >= 0 && puntuacion <= 100) {
            System.out.println("Nivel: Principiante");
            System.out.println("¡Sigue mejorando, vas por buen camino!");
            System.out.println("Has ganado: [Poción de curación básica]");

        } else if (puntuacion >= 101 && puntuacion <= 500) {
            System.out.println("Nivel: Intermedio");
            System.out.println("¡Buen trabajo! Ya dominas lo básico.");
            System.out.println("Has ganado: [Espada de aprendiz]");

        } else if (puntuacion >= 501 && puntuacion <= 1000) {
            System.out.println("Nivel: Avanzado");
            System.out.println("¡Tu habilidad es impresionante!");
            System.out.println("Has ganado: [Armadura de caballero]");

        } else if (puntuacion >= 1001 && puntuacion <= 5000) {
            System.out.println("Nivel: Experto");
            System.out.println("Pocos jugadores llegan tan lejos.");
            System.out.println("Has ganado: [Báculo de mago experto]");

        } else if (puntuacion > 5000) {
            System.out.println("Nivel: Maestro");
            System.out.println("¡Eres una leyenda del juego!");
            System.out.println("Has ganado: [La corona del Rey Dragón]");

        } else {
            // Esto cubre las puntuaciones negativas
            System.out.println("Puntuación no válida.");
        }


        scanner.close();
    }

    public void Ejercicio8() {
        /*
        **Objetivo:** Crear un programa que identifique el tipo de archivo según su extensión.

**Requisitos:**

1. Declara una variable `String extension` (por ejemplo: "jpg", "pdf", "txt", "mp3").
2. Usa un `switch` para agrupar extensiones similares:
* Imágenes (jpg, png, gif), Documentos (pdf, doc, txt), Audio (mp3, wav), Video (mp4, avi).
3. Muestra el tipo de archivo y el programa recomendado para abrirlo.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el tipo de archivo que quieres abrir:");
        String extension = scanner.nextLine();
        switch (extension) {
            case "jpg":
            case "png":
            case "gif":
                System.out.println("Tipo: Archivo de imagen");
                System.out.println("Programa recomendado: Adobe o Gimp");
                break;
            case "pdf":
            case "doc":
            case "txt":
                System.out.println("Tipo: Documento de Texto");
                System.out.println("Programa recomendado: Microsoft Word o Adobe Acrobat Reader");
                break;
            case "mp3":
            case "wav":
                System.out.println("Tipo: Archivo de Audio");
                System.out.println("Programa recomendado: Spotify");
                break;
            case "mp4":
            case "avi":
            case "mov":
                System.out.println("Tipo: Archivo de Video");
                System.out.println("Programa recomendado: VLC Media Player");
                break;

            default:
                System.out.println("Tipo: Extensión desconocida o no soportada.");
                System.out.println("Programa recomendado: Desconocido.");
                break;
        }
        scanner.close();
    }
}
    }



