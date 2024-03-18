import java.util.Arrays;
public class StringSorter{
public static void main(String[] args) {
System.out.println("George Paul\n 23mca029\n 26-feb-2024");
String[] strings = {"banana", "apple", "cherry", "date"};
System.out.println("Original array: " + Arrays.toString(strings));
Arrays.sort(strings);
System.out.println("Sorted array: " + Arrays.toString(strings));
}
}
