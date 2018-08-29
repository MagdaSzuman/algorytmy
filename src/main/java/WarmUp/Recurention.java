package WarmUp;

public class Recurention {

    public static void main(String[] args) {
        String word = "civic";
        boolean isPalindrome =  isPalindromeIteration(word);
        System.out.println("Is word " + word + " a palindrome? " + isPalindrome);
    }

    static boolean isPalindromeRecurention(String word) {
        if (word.length() == 1 || word.length()==00){
            return true;
        }

        if (word.charAt(0) == word.charAt(word.length() - 1)){
            return isPalindromeRecurention(word.substring(1, word.length()-1));
        }else {
        return false;
    }

    static boolean isPalindromeIteration(String wordIsPalindrome) {
        int indexFirstLeter = 0;
        int indexLastLeter = wordIsPalindrome.length()-1;
        while (indexFirstLeter<indexLastLeter){
            boolean isEq = wordIsPalindrome.charAt(indexFirstLeter) != wordIsPalindrome.charAt(indexLastLeter);
            if (isEq){
                return false;
            }
            indexFirstLeter++;
            indexLastLeter--;
        }
        return true;
    }
}
