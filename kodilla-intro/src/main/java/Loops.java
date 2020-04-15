public class Loops {

    public int sumNumbers(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;

    }
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {  // pętla
            System.out.println(i);
        }

        String[] names = new String[] {"Jagoda", "Oliwia", "Dorota"};

        int numberOfNames = names.length;

        for ( int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for (int i = names.length - 1; i >= 0 ; i--) {
            System.out.println(names[i]);
        }

        int[] numbers = new int[] {45, 55, 65, 85, 455};
            int result = 0;
            for (int i = 0; i < numbers.length; i++) {
                result += numbers[i];
            }
        System.out.println("The result is " + result);

        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }







    }

    
}
