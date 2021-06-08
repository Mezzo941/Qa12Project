public class Unit2Task1 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int j=0;
        for(int i=2;i<21;i+=2){
            a[j]=i;
            System.out.print(a[j]+" ");
            j++;
        }

        System.out.println();

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
