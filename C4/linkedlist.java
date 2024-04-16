import java.util.*;
public class linkedlist {
public static void main(String[] args){
System.out.println("Sandra Saji \n23mca047 \n15/04/24\nQn:Program to remove all the elements from a linked list\n");
LinkedList<String> L=new LinkedList<>();
L.add("JAVA");
L.add("PYTHON");
L.add("CSS");
L.add(0,"PROGRAMING LANGUAGE");
System.out.println(L);
L.remove("CSS");
System.out.println(L);
L.remove(2);
System.out.println(L);
L.removeLast();
System.out.println(L);
L.removeFirst();
System.out.println(L);
}
}
