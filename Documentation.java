public class Documentation {

    //Para documentar un método se toman en cuenta, el nombre del método, los parámetros con su tipo de dato, lo que devuelve con su tipo de dato y lo que hace el método. Mira estos ejemplos y resuelve el ejercicio final. 
    
    //Si escribes primero el método y luego sobre ella escribes /** */ te saldrá automáticamente la plantilla de documentación.

    public static void main(String[] args) {
        greeting();
        System.out.println(greetingCoder("Ruqy", 41));

        // Testing the new method from Ejercicio 1 (Optional but great for checking)
        System.out.println(callingAGoddess("Atenea"));
        System.out.println(callingAGoddess("Unknown"));
    }

    /**
     * Function name: greeting
     * 
     * Inside the function:
     * 1. prints "Hola FemCoder"
     * 
     */
    public static void greeting(){
        System.out.println("Hola FemCoder");
    }

    /**
     * Function name: greetingCoder
     * 
     * @param name (String)
     * @param age (int)
     * @return (String)
     * 
     * Inside the function:
     * 1. return the name and the age as part of a text
     * 
     */
     public static String greetingCoder(String name, int age){
        return "Hola mi nombre es " + name + " y tengo " + age + " años.";
     }

     //Ejercicio 1: Escribe un método llamado "callingAGoddess" que devuelva un String con una descripción de cada diosa de la mitología griega y romana al pasarle por parámetro un nombre. Documenta la función.

    /* 
    Afrodita: Hola soy Afrodita, la diosa del amor y la belleza.
    Atenea: Hola soy Atenea, la diosa de la sabiduría y la guerra estratégica.
    Artemisa: Hola soy Artemisa, la diosa de la caza y la naturaleza salvaje
    Hera: Hola soy Hera, la diosa de los dioses y de la familia.
    Deméter: Hola soy Deméter, la diosa de la cosecha y la agricultura.
    Perséfone: Hola soy Perséfone, la diosa de la primavera y el inframundo.
    Otro o vacío: ¡no la hemos encontrado aún!
    */
     
    /**
     * Function name: callingAGoddess
     * 
     * @param goddessName (String)
     * @return (String)
     * 
     * Inside the function:
     * 1. Check the goddess name and return her specific description.
     * 2. Return a fallback message if the name is empty or not found.
     */
    public static String callingAGoddess(String goddessName) {
        if (goddessName == null || goddessName.trim().isEmpty()) {
            return "¡no la hemos encontrado aún!";
        }

        switch (goddessName) {
            case "Afrodita":
                return "Hola soy Afrodita, la diosa del amor y la belleza.";
            case "Atenea":
                return "Hola soy Atenea, la diosa de la sabiduría y la guerra estratégica.";
            case "Artemisa":
                return "Hola soy Artemisa, la diosa de la caza y la naturaleza salvaje.";
            case "Hera":
                return "Hola soy Hera, la diosa de los dioses y de la familia.";
            case "Deméter":
                return "Hola soy Deméter, la diosa de la cosecha y la agricultura.";
            case "Perséfone":
                return "Hola soy Perséfone, la diosa de la primavera y el inframundo.";
            default:
                return "¡no la hemos encontrado aún!";
        }
    }

}