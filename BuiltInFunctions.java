public class BuiltInFunctions {
    public static void main(String[] args) {

     //Ejecuta aquí todos los métodos creados e imprime en la terminal. 

     //Ejercicio 1
     printMessage("Hello FemCoders!");

     //Ejercicio 2
     int length = getLength("FemCoder");
     System.out.println("Length of String: " + length);
        
    //Ejercicio 3
     String lowercase = convertToLowercase("JAVA PROGRAMMING");
     System.out.println("Lowercase string: " + lowercase);

    //Ejercicio 4
     boolean startsWithPrefix = findPrefix("Unstoppable", "Un");
     System.out.println("Starts with prefix: " + startsWithPrefix);

     //Ejercicio 5
    String replacedText = replaceCharacters("apple", 'p', 'm');
    System.out.println("Replaced text: " + replacedText);

     //Ejercicio 6
     double squareRoot = getsSquareRoot(16.0);
     System.out.println("Square root: " + squareRoot);
     //Ejercicio 7
     double powerResult = getPower(2.0, 3.0);
     System.out.println("Power result: " + powerResult);
              
     //Ejercicio 8
     double randomNumber = getRandomNumber();
     System.out.println("Random number: " + randomNumber);

    //Ejercicio 9
    int max = maxNumber(45, 82);
     System.out.println("Max number: " + max);
    }

        //Ejercicio 1:
        /**
         * Function name: printMessage
         * 
         * @param message (String)
         * 
         * Inside the function:
         * 1. Find a java built-in function that prints the message on the console.
        */

        // Escribe tu código aquí
        public static void printMessage(String message) {
          System.out.println(message);  
        }
    
        //Ejercicio 2:
        /**
         * Function name: getLength
         * 
         * @param message (String)
         * @return (int)
         * 
         * Inside the function:
         * 1. Find a built-in function that returns the length of a string.
         */

        // Escribe tu código aquí
        public static int getLength(String message){
          return message.length();  
        }


        //Ejercicio 3:
        /**
         * Function name: convertToLowercase
         * 
         * @param message (String)
         * @return (String)
         * 
         * Inside the function:
         * 1. Find a built-in function that converts a string to lowercase.
         */

        // Escribe tu código aquí
        public static String convertToLowercase(String message){
        return message.toLowerCase();
        }

        //Ejercicio 4:
        /**
         * Function name: findPrefix
         * 
         * @param message (String)
         * @param prefix (String)
         * @return (boolean)
         * 
         * Inside the function:
         * 1. Find a built-in function that checks if a string starts with a specified prefix.
         */

        // Escribe tu código aquí
       public static boolean findPrefix(String message, String prefix) {
            return message.startsWith(prefix);
        }

        //Ejercicio 5:
        /**
         * Function name: replaceCharacters
         * 
         * @param message (String)
         * @param oldChar (char)
         * @param newChar (char)
         * @return (String)
         * 
         * Inside the function:
         * 1. Find a built-in function that replaces all occurrences of a specified character in a string with another character.
         */

        // Escribe tu código aquí
          public static String replaceCharacters(String message, char oldChar, char newChar) {
            return message.replace(oldChar, newChar);
        }

        //Ejercicio 6:
        /**
         * Function name: getsSquareRoot
         * 
         * @param number (double)
         * @return (double)
         * 
         * Inside the function:
         * 1. Find a built-in function that calculates the square root of a number.
         */

        // Escribe tu código aquí
         public static double getsSquareRoot(double number) {
            return Math.sqrt(number);
        }

        //Ejercicio 7:
        /**
         * Function name: getPower
         * 
         * @param base (double)
         * @param exponent (double)
         * @return (double)
         * 
         * Inside the function:
         * 1. Find a built-in function that calculates the power of a number.
         */

        // Escribe tu código aquí
         public static double getPower(double base, double exponent) {
            return Math.pow(base, exponent);
        }

        //Ejercicio 8:
        /**
         * Function name: getRandomNumber
         *
         * @return (double)
         * 
         * Inside the function:
         * 1. Find a built-in function that generates a random number between 0.0 (inclusive) and 1.0 (exclusive).
         */

        // Escribe tu código aquí
        public static double getRandomNumber() {
            return Math.random();
        }

        //Ejercicio 9:
        /**
         * Function name: maxNumber
         * 
         * @param number1 (int)
         * @param number2 (int)
         * @return (int)
         * 
         * Inside the function:
         * 1. Find a built-in function that returns the larger of two numbers.
         */

        // Escribe tu código aquí
         public static int maxNumber(int number1, int number2) {
            return Math.max(number1, number2);
        }
 }