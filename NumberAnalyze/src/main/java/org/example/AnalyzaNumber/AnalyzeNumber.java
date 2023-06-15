package org.example.AnalyzaNumber;

public class AnalyzeNumber {
    public static boolean isNotPrimeNumber(long number) {
        boolean isPrimeNumber = false;

        for (int counter = 2; counter < number && !isPrimeNumber; counter++) {
            // System.out.println(number % counter);
            isPrimeNumber = number % counter == 0;
        }

        return isPrimeNumber;
    }
    public static boolean isPairNumber(long number) {
        return number % 2 == 0;
    }

    public static String analyzeNumber(long number) {
        StringBuilder resultTextAnalyzeNumber = new StringBuilder();
        resultTextAnalyzeNumber.append(
                number + " " +
                (!isNotPrimeNumber(number) ? "es" : "no es") +
                        " primo, " +
                (isFibonnacciNumber(number) ? "es" : "no es") +
                " fibonacci y " +
                        (isFibonnacciNumber(number) ? "es" : "no es") +
                        "" +
                        " par");
        return resultTextAnalyzeNumber.toString();
    }

    public static boolean isFibonnacciNumber(long number) {
        long serie = number, num1 = 0, num2 = 1, suma = 1;

        boolean isFibonnacci = false;

        // Muestro el valor inicial
        // System.out.println(num1);

        for (long i = 1; i <= serie && !isFibonnacci; i++) {

            // muestro la suma
            // System.out.println(suma);

            //primero sumamos
            suma = num1 + num2;
            //Despues, cambiamos la segunda variable por la primera
            num1 = num2;
            //Por ultimo, cambiamos la suma por la segunda variable
            num2 = suma;
            isFibonnacci = num1 == number || num2 == number;
            // System.out.println(num1 + " " + num2);
        }
        return isFibonnacci;
    }

}
