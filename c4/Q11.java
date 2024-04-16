import java.util.*;
public class Q11 {
public static void main(String[] args){
System.out.println("Name: George Paul");
System.out.println("23mca029");
System.out.println("Date: 15/04/2024");
System.out.println("Course code: 20MCA132");
System.out.println();
LinkedList<String> L=new LinkedList<>();
L.add("Gold");
L.add("Silver");
L.add("Bronze");
L.add(0,"Olympics Medals");
System.out.println(L);
L.remove("Bronze");
System.out.println(L);
L.remove(2);
System.out.println(L);
L.removeLast();
System.out.println(L);
L.removeFirst();
System.out.println(L);

}
}
