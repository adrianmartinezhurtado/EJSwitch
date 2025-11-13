public class Switch {
    public void Ejercicio1(){
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

    public void Ejercicio2(){
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
        final double Tasa_Pesos= 21.21;
        double resultadoConversion = 0;
        switch (monedaDestino){
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

    }

