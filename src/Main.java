import java.text.DecimalFormat;
import java.util.Scanner;

public class  Ejercicios{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat=new DecimalFormat(0.00);
        int opcion;
        do {
            System.out.println("Menu");
            System.out.println("1. Calcular valor pedido segun la ley de Ohm");
            System.out.println("2.Calcular nota del estudiante");
            System.out.println("3.Salir");
            System.out.println("Ingrese una opcion: ");

            opcion = scanner.nextInt();
            if (opcion == 1) {
                System.out.println("Que valor deseas calcular? (V,I,R)");
                String opcionOhm = scanner.next().toUpperCase();    //Convertir texto (String) a mayusculadouble Valor1= scanner.nextDouble();
                if (opcionOhm.equals("V")) {
                    System.out.println("Ingrese el valor de R(resistencia): ");
                    double r = scanner.nextDouble();
                    System.out.println("Ingrese el valor de I(corriente): ");
                    double i = scanner.nextDouble();
                    System.out.println("El valor calculado de V(voltaje) es: " + df.format(r * i));
                } else if (opcionOhm.equals("R")) {
                    System.out.println("Ingrese el valor de V(voltaje): ");
                    double v = scanner.nextDouble();
                    System.out.println("Ingrese el valor de I(corriente): ");
                    double i = scanner.nextDouble();
                    System.out.println("El valor calculado es: " + df.format(v / i));
                    if (opcionOhm.equals("I")) {
                        System.out.println("Ingrese el valor de V(voltaje): ");
                        double v = scanner.nextDouble();
                        System.out.println("Ingrese el valor de R(resistencia): ");
                        double r = scanner.nextDouble();
                        System.out.println("El valor calculado es: " + df.format(v / r));
                    } else {
                        System.out.println("Opcion invalida");
                    }
                    if (opcion == 2) {
                        System.out.println("Ingrese nota de Tareas corte 1: ");
                        double tarea1 = scanner.nextDouble();
                        System.out.println("Ingrese nota de Quiz corte 1: ");
                        double quiz1 = scanner.nextDouble();
                        System.out.println("Ingrese nota de Parcial corte 1: ");
                        double parcial1 = scanner.nextDouble();
                        System.out.println("Ingrese nota de Tareas corte 2: ");
                        double tarea2 = scanner.nextDouble();
                        System.out.println("Ingrese nota de Quiz corte 2: ");
                        double quiz2 = scanner.nextDouble();
                        System.out.println("Ingrese nota de Parcial corte 2: ");
                        double parcial2 = scanner.nextDouble();
                        System.out.println("Ingrese nota de Tareas corte 3: ");
                        double tarea3 = scanner.nextDouble();
                        System.out.println("Ingrese nota de Quiz corte 3: ");
                        double quiz3 = scanner.nextDouble();
                        System.out.println("Ingrese nota de Parcial corte 3: ");
                        double parcial3 = scanner.nextDouble();
                        double nota1 = (tarea1 * 0.1) + (quiz1 * 0.1) + (parcial1 * 0.15);
                        double nota2 = (tarea2 * 0.1) + (quiz2 * 0.1) + (parcial2 * 0.15);
                        double nota3 = (tarea3 * 0.1) + (quiz3 * 0.1) + (parcial3 * 0.10);
                        double notaFinal = (nota1 * 0.35) + (nota2 * 0.35) + (nota3 * 0.30);
                        if (notaFinal >= 3 && notaFinal <= 5) {
                            System.out.println("Aprobado");
                        } else if (notaFinal >= 1.9 && notaFinal < 3) {
                            System.out.println("Habilita");
                        } else if (notaFinal > 0 && notaFinal < 1.9) {
                            System.out.println("Reprueba");
                        } else {
                            System.out.println("Error en las notas ingresadas");
                        }
                    } else if (opcion == 3) {
                        System.out.println("Saliendo...");

                    } else {
                        System.out.println("Opcion invalida");
                    }
                    while (opcion != 3) ;
                    scanner.close();
                }

            }


        }
        }
    }