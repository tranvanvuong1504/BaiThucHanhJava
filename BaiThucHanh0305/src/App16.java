import java.util.ArrayList;
import java.util.List;
public class App16 {
    public static void main(String[] args) {
        ArrayList<String> arrayListString = new ArrayList<>();
        arrayListString = new ArrayList<>();
        arrayListString.add("JAVA");
        arrayListString.add("PHP");
        arrayListString.add("C#");
        arrayListString.add("C++");
        System.out.println("cac phan tu co trong ArrayList la:");
        for (int i = 0; i<arrayListString.size();i++){
            System.out.print(arrayListString.get(i) + "\t");
        }
        
    }


}