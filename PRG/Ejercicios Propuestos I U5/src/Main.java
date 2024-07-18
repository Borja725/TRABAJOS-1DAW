import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int seleccio;


        System.out.println("Quin exercici vols? ");
        seleccio = teclado.nextInt();

        switch (seleccio) {

            case 1:
                float x;
                float y;


                System.out.print("Disme un numero: ");
                x = teclado.nextFloat();

                System.out.print("Disme un altre numero: ");
                y = teclado.nextFloat();

                float suma = x + y;
                float resta = x - y;
                float producto = x * y;
                double potencia = Math.pow(x, y);
                float divisio = x / y;

                System.out.println("La suma es: " + suma);
                System.out.println("La resta es: " + resta);
                System.out.println("El producte es: " + producto);
                System.out.println("La potencia es: " + potencia);
                System.out.println("La divisio es: " + divisio);
                break;
            case 2:
                float c;
                float d;

                System.out.print("Disme un numero: ");
                c = teclado.nextFloat();

                System.out.print("Disme un altre numero: ");
                d = teclado.nextFloat();

                if (c == d)
                    System.out.println("Son iguals");
                else if (c > d)
                    System.out.println("El numero major es: " + c);
                else
                    System.out.println("El numero major es: " + d);
                break;
            case 3:
                float precio;
                int IVA;

                System.out.print("Disme un preu: ");
                precio = teclado.nextFloat();

                System.out.println("Que IVA quieres aplicar: (4%,10%,21%)");
                System.out.println("1-4% IVA");
                System.out.println("2-10% IVA");
                System.out.println("3-21% IVA");
                IVA = teclado.nextInt();

                double opcio1 = precio * 1.04;
                double opcio2 = precio * 1.1;
                double opcio3 = precio * 1.21;

                switch (IVA) {
                    case 1:
                        System.out.println("El 4% de iva es: " + opcio1);
                        break;
                    case 2:
                        System.out.println("El 10% de iva es: " + opcio2);
                        break;
                    case 3:
                        System.out.println("El 21% de iva es: " + opcio3);
                        break;
                    default:
                        System.out.println("Introduce un valor valido.");
                        break;
                }
                break;
            case 4:
                float nota;

                System.out.println("Introde una nota: (0-10)");
                nota = teclado.nextFloat();

                if (nota >= 0 && nota < 5)
                    System.out.println("insuficiente");
                else if (nota >= 5 && nota < 6)
                    System.out.println("suficiente");
                else if (nota >= 6 && nota < 7)
                    System.out.println("bien");
                else if (nota >= 7 && nota < 9)
                    System.out.println("Notable");
                else if (nota >= 9 && nota < 10)
                    System.out.println("excelente");
                else if (nota == 10)
                    System.out.println("matrícula de honor");
                else
                    System.out.println("Introduce un valor valido.");
                break;
            case 5:
                for (int numero = 1; numero <= 20; numero++) {
                    System.out.println(numero);
                }
                break;
            case 6:
                for (int pares = 2; pares <= 200; pares += 2) {
                    System.out.println(pares);
                }
                break;
            case 7:
                float imp;
                for (int impares = 1; impares <= 200; impares++) {
                    imp = impares%2;
                    if (imp==1)
                        System.out.println(impares);
                    else
                        System.out.println();
                }
                break;
            case 8:
                int num;
                int sumatorio=0;
                int productos=1;

                System.out.println("Dime un numero: ");
                num = teclado.nextInt();

                for (int numer=1; numer<=num; numer++) {
                    System.out.println(numer);
                    sumatorio+=numer;
                    productos*=numer;
                }
                System.out.println("El sumatorio de todos los numeros es: " + sumatorio);
                System.out.println("El producto de todos los numeros es: " + productos);
                break;
            case 17:
                System.out.println("Pensa en un número del 1 al 100.");

                int min = 1;
                int max = 100;
                int intents = 0;



                while (true) {
                    int nume = (min + max) / 2;

                    System.out.println("¿Es " + nume + " el teu número? (major/menor/igual)");
                    String resp = teclado.next();

                    if (resp.equalsIgnoreCase("igual")) {
                        System.out.println("He adivinat el  teu número en " + intents + " intents!");
                        break;
                    } else if (resp.equalsIgnoreCase("major"))
                        min = nume + 1;
                    else if (resp.equalsIgnoreCase("menor"))
                        max = nume - 1;
                    else
                        System.out.println("Resposta no válida. ingresa 'major', 'menor' o 'igual'.");

                    intents++;
                }
                break;
            case 19:
                while (true) {
                    System.out.println("1. Suma");
                    System.out.println("2. Resta");
                    System.out.println("3. Producte");
                    System.out.println("4. Potencia");
                    System.out.println("5. Divisió");
                    System.out.println("6. Salir");

                    System.out.print("Selecciona una opción: ");
                    int opcio = teclado.nextInt();

                    if (opcio == 6) {
                        System.out.println("Ixint del programa.");
                        break;
                    }

                    System.out.print("Ingresa el primer número: ");
                    double num1 = teclado.nextDouble();

                    System.out.print("Ingresa el segon número: ");
                    double num2 = teclado.nextDouble();

                    switch (opcio) {
                        case 1:
                            System.out.println("Suma: " + (num1 + num2));
                            break;
                        case 2:
                            System.out.println("Resta: " + (num1 - num2));
                            break;
                        case 3:
                            System.out.println("Producte: " + (num1 * num2));
                            break;
                        case 4:
                            System.out.println("Potencia: " + Math.pow(num1, num2));
                            break;
                        case 5:
                            if (num2 != 0) {
                                System.out.println("Divisió: " + (num1 / num2));
                            } else {
                                System.out.println("No se pot dividir per cero.");
                            }
                            break;
                        default:
                            System.out.println("Opció no válida. ingresa una opció del 1 al 6.");
                    }
                }
                break;
            case 20:
                System.out.print("Ingresa un número per a construir la pirámide: ");
                int altura = teclado.nextInt();

                for (int i = 0; i < altura; i++) {

                    for (int j = 0; j < altura - i - 1; j++) {
                        System.out.print(" ");
                    }


                    for (int k = 0; k < 2 * i + 1; k++) {
                        System.out.print("*");
                    }


                    System.out.println();
                }
                break;
            default:
                System.out.println("Introduix un exercici fet");
        }
    }
}
