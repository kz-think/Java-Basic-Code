package StringDemo;

public class StringDemo7 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        String arrString = arrToString(arr);
        System.out.println(arrString);
    }

    public static String arrToString(int[] arr) {
        if(arr.length == 0){
            return "[]";
        }

       String resultString = "";
        for (int i = 0, j = 0; i < (arr.length*2+1); i++) {
            if (i == 0) {
                resultString = resultString + "[";
            } else if (i == arr.length*2) {
                resultString = resultString + "]";
            } else if (i % 2 != 0) {
                resultString = resultString + arr[j];
                j++;
            } else if (i % 2 == 0) {
                resultString = resultString + ",";
            }
        }

       return resultString;
    }
}
