package WarmUp;

import java.util.stream.IntStream;

public class Application {

    public static void main(String args[]) {
//        int[] result = reverseArray(new int[]{1,2,3,4,5,6});
//        System.out.println(Arrays.toString(result));
        int[] tab = new int[]{1, 5, 3, 76, -81, 23, 4};
        printArray(tab);
        printArray(reverseVariables(tab));
//        int tabMin = getMin(tab);
//        System.out.println(tabMin);

    }


    static int[] reverseVariables(int[] tab) {
        int max = getMaxIndex(tab);
        int min = getMinIndex(tab);
        swap(tab, max, min);
        return tab;
    }

    static void swap(int[] tab, int getMaxIndex, int getMinIndex) {
        int bufor = tab[getMinIndex(tab)];
        tab[getMinIndex(tab)] = tab[getMaxIndex(tab)]; // pierwsza zamiana
        tab[getMaxIndex(tab)] = bufor;
    }

//    static int [] reverseVariables2(int[] tab) {
//        int reverseTab2 [] = new int[tab.length];
//        int max = getMaxIndex(tab);
//        int min = getMinIndex(tab);
//        swap(tab, max, min);
//        return reverseTab2;
//    }


    static int[] doubleArray(int[] input) {
        int multiplication[] = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            multiplication[i] = (input[i]) * 2;
        }
        return multiplication;

    }


    static int[] reverseArray(int[] input) {
//        int reverse [] = new int [input.length];
//        for (int i = input.length-1; i>0;){
//            for (int j = 0; j < input.length; j++) {
//                reverse[j] = input[i];
//                i--;
//            }
//        }
//        return reverse;
        int[] result = new int[input.length];
        for (int x = input.length - 1; x >= 0; x--) {
            result[input.length - x - 1] = input[x];
        }

        return result;
    }


    static int getMax(int[] input) {
        int max = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
            }
        }
        return max;
    }

    static int getMin(int[] input) {
        int min = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] < min) {
                min = input[i];
            }
        }
//        for (int number : input) {
//            if (number < min) {
//                min = number;
//            }
//        }
//
//        min = IntStream.of(input).min().getAsInt();
//
//
        return min;
    }

    static int getMinIndex(int[] tab) {
        int minValue = tab[0];
        int minIndex = 0;
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < minValue) {
                minValue = tab[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    static int getMaxIndex(int[] tab) {
        int maxValue = tab[0];
        int maxIndex = 0;
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > maxValue) {
                maxValue = tab[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static void printArray(int[] input) {
        IntStream.of(input).forEach((number) -> System.out.print(number + " "));
        System.out.println();
//        IntStream.of(input).forEach(System.out::println); //referencja do metody
    }

//    private static void findMax() {
//        int[] tablica = {7, 6, 1, 3, 8, 10, 13, 2};
//        int bufor = tablica[0];
//        for (int i = 1; i < tablica.length; i++) {
//            if (bufor < tablica[i]) {
//                bufor = tablica[i];
//            }
//        }
//        System.out.print(bufor);
//    }


//    private static void findMin() {
//        int[] tablica = {7, 6, 1, 3, 8, 10, 13, 2};
//        int bufor = tablica[0];
//        for (int i = 1; i < tablica.length; i++) {
//            if (bufor > tablica[i]) {
//                bufor = tablica[i];
//            }
//        }
//        System.out.print(bufor);
//    }


}
