import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> mas = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            int ra = random.nextInt(0,2);
            arr[i] = ra;
            arrayList.add(ra);
            mas.add(ra);

        }
        System.out.println("Sorting Massiv    :"+Arrays.toString(sorting(arr)));
        System.out.println("Sorting ArrayList :"+sorting(arrayList));
        System.out.println("Sorting LinkedList:"+sorting(mas));
    }
    public static int[] sorting(int[] arr){
        Arrays.sort(arr);
        return arr;
    }public static ArrayList sorting(ArrayList<Integer> arrayList){
        Collections.sort(arrayList);
        return arrayList;
    }
    public static LinkedList sorting(LinkedList<Integer> mas){
        Collections.sort(mas);
        return mas;
    }
}

