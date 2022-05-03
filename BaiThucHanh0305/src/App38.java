import java.util.LinkedList;
import java.util.List;
public class App38{
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();
        // Add objects to list
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");
   
        System.out.println("vi du su dung phuong thuc addAll()");
        System.out.println("vi du su dung phuong thuc addAll()");
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.print("listA:");
        showList(listA);
   
        System.out.println("\nvi du su dung phuong thuc retainAll()");
        System.out.println("\nvi du su dung phuong thuc retainAll()");
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("java");
        listA.retainAll(listB);
        System.out.print("list:");
        showList(list);   
    }
    
 public static void showList(LinkedList<String> list) {
     for (String obj : list) {
         System.out.print("\t" + obj + ",");
        }
     System.out.println();
    }
}