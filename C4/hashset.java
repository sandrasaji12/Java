import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class hashset {
public static void main(String[] args) {
System.out.println("Sandra Saji \n23mca047 \n16/04/24\nQn:Write a Java program to compare two hash set\n");
Set<Integer> set1 = new HashSet<>();
Set<Integer> set2 = new HashSet<>();
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of elements in Set 1: ");
int numElements1 = scanner.nextInt();
System.out.println("Enter the elements for Set 1:");
for (int i = 0; i < numElements1; i++) {
int element = scanner.nextInt();
set1.add(element);
}
System.out.print("Enter the number of elements in Set 2: ");
int numElements2 = scanner.nextInt();
System.out.println("Enter the elements for Set 2:");
for (int i = 0; i < numElements2; i++) {
int element = scanner.nextInt();
set2.add(element);
}
boolean isEqual = set1.equals(set2);
System.out.println("Set 1: " + set1);
System.out.println("Set 2: " + set2);
if (isEqual) {
System.out.println("Set 1 and Set 2 are equal.");
} else {
System.out.println("Set 1 and Set 2 are not equal.");
}
scanner.close();
}
}

