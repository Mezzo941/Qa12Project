public class Unit2Task2 {
    public static void main(String[] args) {
        int[] a = new int[50];
        int j=0;
        for(int i=1;i<a.length*2;i+=2){
            a[j]=i;
            System.out.print(a[j]+" ");
            j++;
        }

        System.out.println();

        for(int i=a.length*2-1;i>0;i-=2){
            System.out.print(a[j-1]+" ");
            j--;
        }
    }
}
