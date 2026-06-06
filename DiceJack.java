import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {

        /* Reglas del juego:
        - El usuario debe escoger 3 números entre 1 y 6 (incluidos).
        - El usuario debe lanzar los dados una vez, el resultado serán 3 números aleatorios.

        ¿Cuándo gana el usuario?:
        - Cuando la suma de los números escogidos es mayor a la suma de los dados lanzados
        - Y cuando la diferencia entre los dos números anteriores es menor de 5

        ej. 
        - Usuario escoge los números: 1 3 5 (la suma es 9)
        - Usuario lanza dados y salen los números: 3 1 3 (la suma es 7)
        - 9 es mayor a 7 y la diferencia entre los dos números es menor a 5. El usuario gana.

        Requisitos no funcionales (atributos de calidad):
        - Definir las 4 funciones descritas abajo.
        - En el método main escribir el programa (usar condicionales, reusar las funciones creadas, pedir al usuario que ingrese datos y recogerlos).
       
        Pasos:
        - Pedir al usuario que escoja 3 números.
        - Si el usuario escoge un número fuera del rango, salir del programa (mira en los recursos system exit).
        - Si los números son correctos, pedir al usuario si desea lanzar dados.
        - Si el usuario dice que no, salir del programa.
        - Si el usuario dice que si, lanzar dados, hacer los cálculos que indiquen si el usuario ganó o perdió.
        - Imprimir la suma de los números escogidos por el usuario y la suma de los números que salieron en los dados.
        - Imprimir si el usuario ganó o perdió.
        */
    
        // Cleaned up: Removed the redundant stream placeholder line
        Scanner scan = new Scanner(System.in);

        // Pasos 1: Pedir al usuario que escoja 3 números.
        System.out.println("Enter three numbers between 1 and 6:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        // Pasos 2: Si el usuario escoge un número fuera del rango, salir del programa
        if (isLessThanOne(num1, num2, num3) || isHigherThanSix(num1, num2, num3)) {
            System.out.println("Error: One or more numbers are out of range (1-6). Exiting program.");
            System.exit(0);
        }

        // Pasos 3: Si los números son correctos, pedir al usuario si desea lanzar dados.
        System.out.println("Do you want to roll the dice? Type 'yes' or 'no':");
        scan.nextLine(); 
        String answer = scan.nextLine();

        // Pasos 4: Si el usuario dice que no, salir del programa.
        if (answer.equalsIgnoreCase("no")) {
            System.out.println("Exiting program.");
            System.exit(0);
        }

        // Pasos 5: Si el usuario dice que si, lanzar dados
        if (answer.equalsIgnoreCase("yes")) {
            int dice1 = rollDice();
            int dice2 = rollDice();
            int dice3 = rollDice();

            int sumNumbers = num1 + num2 + num3;
            int sumDiceRolls = dice1 + dice2 + dice3;

            // Pasos 6: Imprimir las sumas
            System.out.println("\nYour picked numbers: " + num1 + " " + num2 + " " + num3);
            System.out.println("Dice rolls: " + dice1 + " " + dice2 + " " + dice3);
            System.out.println("Sum of your numbers: " + sumNumbers);
            System.out.println("Sum of dice rolls: " + sumDiceRolls);

            // Pasos 7: Imprimir si el usuario ganó o perdió.
            if (userWon(sumNumbers, sumDiceRolls)) {
                System.out.println("Congratulations! You won!");
            } else {
                System.out.println("Sorry, you lost!");
            }
        } else {
            System.out.println("Invalid input. Exiting program.");
            System.exit(0);
        }

        scan.close();
    }


    /**
     * * Function name: isLessThanOne
     * * @param num1 (int)
     * @param num2 (int)
     * @param num3 (int)
     * @return (boolean)
     * * Inside the function:
     * 1. check if numbers are less than 1
     */
    
    // Escribe tu código aquí
    public static boolean isLessThanOne(int num1, int num2, int num3) {
        return (num1 < 1 || num2 < 1 || num3 < 1);
    }

    /**
     * * Function name: isHigherThanSix
     * * @param num1 (int)
     * @param num2 (int)
     * @param num3 (int)
     * @return (boolean)
     * * Inside the function:
     * 1. Check if numbers are greater than 6
     */

    // Escribe tu código aquí
    public static boolean isHigherThanSix(int num1, int num2, int num3) {
        return (num1 > 6 || num2 > 6 || num3 > 6);
    }

    /**
     * * Function name: userWon
     * * @param sumNumbers (int)
     * @param sumDiceRolls (int)
     * @return (boolean)
     * * Inside the function:
     * 1. check if user numbers are greater than computer numbers and the difference between user numbers and computer numbers are less than 5. 
     */

    // Escribe tu código aquí
    public static boolean userWon(int sumNumbers, int sumDiceRolls) {
        return (sumNumbers > sumDiceRolls && (sumNumbers - sumDiceRolls) < 5);
    }

    /**
     * Function name: rollDice
     * * @return (int)
     * * Inside the function:
     * 1. get random number between 1 and 6
     */

    // Escribe tu código aquí
    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }
}