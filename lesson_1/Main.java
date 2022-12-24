public class Main {

    public static void main(String[] args) {

        // TODO: просуммировать числа в диапазоне от 1 - 5

        /*
            1 + 2 + 3 + 4 + 5 = 15

            1 + 2 = 3
            3 + 3 = 6
            6 + 4 = 10
            10 + 5 = 15
        */

        // int result = 1;
        // for(int i = 2; i <= 5; i++) {
        //     result += i;
        //     if(result % 2 == 0) {
        //         System.out.println("Число " + result + " является четным");
        //     } else {
        //         System.out.println("Число " + result + " является нечетным");
        //     }
        // }

        // System.out.println("1 + 2 + 3 + 4 + 5 = " + result);

        // int result = 1;
        // int i = 2;
        // while(i <= 5) {
        //     result += i;
        //     if(result % 2 == 0) {
        //         System.out.println("Число " + result + " является четным");
        //     } else {
        //         System.out.println("Число " + result + " является нечетным");
        //     }
        //     i++;
        // }

        // System.out.println("1 + 2 + 3 + 4 + 5 = " + result);

        int result = 1;
        int i = 2;
        do {
            result += i;
            if(result % 2 == 0) {
                System.out.println("Число " + result + " является четным");
            } else {
                System.out.println("Число " + result + " является нечетным");
            }
            i++;
        } while(i <= 5);

        System.out.println("1 + 2 + 3 + 4 + 5 = " + result);
    }
}