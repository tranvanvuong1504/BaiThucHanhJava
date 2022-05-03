import java.util.ArrayList;
public class App17{
    public static void main(String[] args) {
        ArrayList<Integer> arrayListIntegers = new ArrayList<>();
        arrayListIntegers.add(0);
        arrayListIntegers.add(7);
        arrayListIntegers.add(1);
        arrayListIntegers.add(9);
        System.out.println("cac phan tu co trong arrListInteger laf: ");
        for (int number : arrayListIntegers){
            System.out.print(number + "\t");
        }

    }
}
