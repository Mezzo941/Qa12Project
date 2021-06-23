public class Unit7Task1 {
    public static void main(String[] args) {
        String str = "privet vsem ya seva";
        char a = str.charAt(3);
        char b = str.charAt(1);
        char[] str1 = str.toCharArray();

        for (int i = 0; i < str1.length; i++) {
            if (str1[i]==a) {str1[i]=b;}
        }

        str = String.valueOf(str1);

        System.out.println(str);

    }
}
