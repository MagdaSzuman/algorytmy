package WarmUp;

import java.util.stream.IntStream;

public class Sort {

    public static void main(String[] args) {
        int [] tableToBubbleSort = {3,60,35,2,45,320,5};
        printArray(tableToBubbleSort);
        printArray(bubbleSort(tableToBubbleSort, true));
        printArray(bubbleSort(tableToBubbleSort, false));
    }


    static int[] bubbleSort(int[] input, boolean ascending) {
        //int bubbleTable[] = new int[input.length];
//        int bufor = 0;
            for (int i = 0; i < input.length; i++) {
                for (int j = 1; j < input.length-i; j++) {
                    if (ascending){
                        if (input[j-1] > input[j]) {
                            swap(input, j-1, j);
                        }
                    }else {
                        if (input[j-1] < input[j]) {
                            swap(input, j-1, j);
                        }
                    }
                }
            }
        return input;
    }

    static void swap(int[] input, int index1, int index2) {
        int bufor = input[index1];
        input[index1] = input[index2]; // pierwsza zamiana
        input[index2] = bufor;
    }



    public static void printArray(int[] input) {
        IntStream.of(input).forEach((number) -> System.out.print(number + " "));
        System.out.println();
    }




}
