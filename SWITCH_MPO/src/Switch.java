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

    }

