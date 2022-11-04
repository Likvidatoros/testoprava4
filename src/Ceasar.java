import java.util.Scanner;
// Nascanujeme string zalozime metodu nahodnych cisel a udelame posun cisel podle klicu*//
public class Ceasar {
    public static int ram(int a, int x) {

        return a + 13 * x % 27;
    }

    public static void main(String[] args) {
        Scanner stringScanner = new Scanner(System.in);
        String number = stringScanner.nextLine();
        System.out.println(number);
        System.out.println();
        char array[] = {'A', 'g', 'R', 'z', 'Z'};
        Ceasar.code(array);
        char u = 'h';
        System.out.println((char) (u + 1));
    }

    public static void code(char array[]) {
        for (int i = 0; i < array.length; i++) {
            int x = 26;
            if (array[i] >= 97 && array[i] <= 122) {
                array[i] = (char) (array[i] + 1);
                if (array[i] > 122) {
                    array[i] = (char) (array[i] - x);
                }
                System.out.println(array[i]);
            }
            if (array[i] <= 90 && array[i] >= 65) {
                array[i] = (char) (array[i] + 1);
                if (array[i] > 90) {
                    array[i] = (char) (array[i] - x);
                }
                System.out.println(array[i]);
            }

        }
    }
}



