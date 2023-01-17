package StringBuilder;

public class StringBuilderDemo4 {
    //将数组拼接成字符串

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(arrToString(arr));
    }

    public static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder("");
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1) {
                sb.append(arr[i]+",");
            } else {
                sb.append(arr[i]+"]");
            }
        }

        String result = sb.toString();
        return result;
    }
}
