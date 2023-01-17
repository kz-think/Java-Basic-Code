package StringDemo;

public class StringDemo8 {
    public static void main(String[] args) {
        String str = "abc123";
        String reverseStr = reverser(str);
        System.out.println(reverseStr);
    }
    
    public static  String reverser(String str){
        //abc
        String reverseStr = "";
        for (int i = str.length() - 1 ; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }

        return reverseStr;
    }
}
