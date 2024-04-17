package hw9_Tasks;

public class IsPalindrome {
//todo

//    public static boolean isPalindromeRegex(String inputData) {
//    String cleanedString = inputData.replaceAll("","");
//    }

    public static boolean isPalindrome2(String s) {
        //"A man, a plan, a canal: Panama"
        int leftIndex = 0;
        int rightIndex = s.length() - 1;
        s = s.toLowerCase();
        while (leftIndex <= rightIndex) {
            if(!Character.isLetter(s.charAt(leftIndex)) ) {
                leftIndex++;
                continue;
            }
            if(!Character.isLetter(s.charAt(rightIndex)) ) {
                rightIndex--;
                continue;
            }
            if(s.charAt(leftIndex) != s.charAt(rightIndex)){
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        return true;
    }

}
