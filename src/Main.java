import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        ArrayList<Integer>arrayList=new ArrayList<>();
        int[] massiv=new int[5];
        for (int i = 0; i < 5; i++) {
            Random random=new Random();
            linkedList.add(random.nextInt(0,2));
            arrayList.add(random.nextInt(0,2));
            massiv[i]= random.nextInt(0,2);
        }
        System.out.println(linkedList);
        System.out.println("\n");
        sort(linkedList);
        System.out.println("\n");
        sort(arrayList);
        System.out.println("\n");
        sort(massiv);

    }
    public static void sort (ArrayList<Integer>arrayList){
        Collections.sort(arrayList);
        for (Integer a:arrayList) {
            System.out.print(a + " ");
        }
    }
    public static void sort(LinkedList<Integer>linkedList){
        Collections.sort(linkedList);
        for (Integer d:linkedList) {
            System.out.print(d +" ");
        }

    }
    public static void sort(int[]massiv){
        Arrays.sort(massiv);
        for (int a:massiv) {
            System.out.print(a + " ");
        }
    }

}