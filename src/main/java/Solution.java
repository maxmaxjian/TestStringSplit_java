public class Solution {
    public static void main(String[] args) {
        String s = "1,2,3,#,4";
        String[] splitted = s.split(",");
        for (int i = 0; i < splitted.length; i++) {
            System.out.println(splitted[i]);
        }
    }
}
