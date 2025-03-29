public class UsingVariables {
    public static void main(String[] args) {
        // Paso 1: Declarar variables y asignar valores
        boolean isStudent = true;
        char surnameInitial = 'P';
        String completeName = "Danny Perilla";
        int age = 33;
        long bigNumber = 1234567890L;
        float height = 1.75f;

        // Paso 2: Imprimir contenido de las variables
        System.out.println("Valor de la variable boolean: " + isStudent);
        System.out.println("Valor de la variable char: " + surnameInitial);
        System.out.println("Valor de la variable String: " + completeName);
        System.out.println("Valor de la variable String: " + age);
        System.out.println("Valor de la variable String: " + bigNumber);
        System.out.println("Valor de la variable String: " + height);

        // Paso 3: Imprimir texto con nombre y edad
        String myName = "Danny";
        int myAge = 30;
        System.out.println("Mi nombre es " + myName + ", y tengo " + myAge +
                " años.");
    }
}
