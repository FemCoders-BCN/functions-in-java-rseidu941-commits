public class Calculator {
    
    public static void main(String[] args) {

        //Ejecuta aquí todos los métodos creados e imprime en la terminal. 
      
        //Ejercicio 1
        double sumResult = add(10.5, 5.5);
        System.out.println("Result of addition: " + sumResult);

       // Ejercicio 2
       double  subtractResult = subtract(10.5, 5.5);
       System.out.println("Result of subtraction: " + subtractResult);

       // Ejercicio 3
       double multiplyResult = multiply(10.5, 5.5);
       System.out.println("Result of multiplication: " + multiplyResult);

        // Ejercicio 4
        double divideResult = divide(10.5, 5.5);
        System.out.println("Result of division: " + divideResult);


    }


    //Define los métodos basándote en su doc comment.

    //Ejercicio 1:
    /**
     * Function name: add
     * 
     * @param number1 (double) 
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. sum 2 numbers
     */
    public static double add(double number1, double number2 ){
      return number1 + number2;  
    }
    

     //Ejercicio 2:
    /**
     * Function name: subtract
     *
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. subtract 2 numbers
     */
  public static double subtract(double number1, double number2){
    return number1 - number2;
  }
    

    //Ejercicio 3:
    /**
     * Function name: multiply
     * 
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. multiply 2 numbers
     */
    public static  double multiply(double number1, double number2){
        return number1 * number2;
    }
    

    //Ejercicio 4:
    /**
     * Function name: divide
     * 
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. divide 2 numbers
     */
    public static  double divide(double number1, double number2){
        return number1 / number2;
    }

}
 