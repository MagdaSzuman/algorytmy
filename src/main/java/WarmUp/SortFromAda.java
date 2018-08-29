//package WarmUp;
//
//import java.util.stream.IntStream;
//
//public class SortFromAda {
//    void bubbleSort(int input[]) {
//        int temp = 0;
//
//        for (int i = 0; i < input.length; i++) {
//            for (int j = 1; j < (input.length - i); j++) {
//                if (input[j - 1] > input[j]) {
//                    swap(input, j - 1, j);
//                }
//            }
//        }
//    }
//
//    void swap(int tab[], int index1, int index2) {
//        int temp = tab[index1];
//        tab[index1] = tab[index2];
//        tab[index2] = temp;
//    }
//
//    static void printArray(int[] input) {
//        IntStream.of(input).forEach((number) -> System.out.print(number + " "));
//    }
//
//    public static void main(String[] args) {
//        Sort sort = new Sort();
//        int arr[] = {2, 40, 5, 76, 13, 99};
//        System.out.println("-----------------------------------------------");
//
//        System.out.println("original array: ");
//        sort.printArray(arr);
//        sort.bubbleSort(arr);
//        System.out.println("");
//        System.out.println("-----------------------------------------------");
//        System.out.println("Bubble sorted array: ");
//        sort.printArray(arr);
//        System.out.println("");
//        System.out.println("-----------------------------------------------");
//
//
//    }
//
//
//}
