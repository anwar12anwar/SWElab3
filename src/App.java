import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        ReadeStudents();
        
    }
    public static void ReadeStudents(){
        ArrayList<String>  students = new ArrayList<>();
        students.add("Fatima");
        students.add("Noor");
        students.add("Zainab");
        students.add("Naba");
        System.out.println(students);
    }
    public void randomGroups(ArrayList<String>  students){
        ArrayList<String>  group1 = new ArrayList<>();
        ArrayList<String>  group2 = new ArrayList<>();
        
            group1.add(students.get(0));
            group1.add(students.get(3));
            group2.add(students.get(2));
            group2.add(students.get(1));
        
        System.out.println("group1"+ group1);
        System.out.println("group2 "+ group2);
        
    }


}
