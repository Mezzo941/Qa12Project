public class Unit7Task2 {

    public static String strReverse(String str) {

        String reverseStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }
        return reverseStr;
    }

    public boolean getPoly(String str) {

        String firstStr = "";
        String secondStr = "";
        int firstIndex = 0;
        int lastIndex;

        if (str.length() % 2 == 1 && str.length()>1) {
            lastIndex = (str.length() - 1) / 2;
            firstStr = str.substring(firstIndex, lastIndex);

            firstIndex = (str.length() - 1) / 2 + 1;
            lastIndex = str.length() - 1;
            secondStr = str.substring(firstIndex, lastIndex + 1);
        } else return false;

        if (firstStr.equals(strReverse(secondStr))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Unit7Task2 poly = new Unit7Task2();
        String[] a = {"букваешка", "топот", "джава", "колокол", "лол", "молококолом"};

        System.out.println(poly.getPoly(a[1]));
        System.out.println("Полиндромы: ");
        for (int i = 0; i < a.length; i++) {
            if (poly.getPoly(a[i])) {
                System.out.println(a[i]);
            }
        }
    }
}
