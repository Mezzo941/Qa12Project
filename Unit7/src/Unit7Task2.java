public class Unit7Task2 {

    public String strReverse(String str) {

        String reverseStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }
        return reverseStr;
    }

    public boolean getPoly(String str) {
        if (str.equals(strReverse(str)) && str.length()>2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Unit7Task2 poly = new Unit7Task2();
        String[] a = {"букваешка", "топот", "джава", "колокол", "лол", "молококолом"};

        System.out.println(poly.getPoly(a[0]));
        System.out.println("Полиндромы: ");
        for (int i = 0; i < a.length; i++) {
            if (poly.getPoly(a[i])) {
                System.out.println(a[i]);
            }
        }
    }
}
