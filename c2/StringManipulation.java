import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
         System.out.println("Sandra Saji \n23mca047 \n14/03/24\nQn:Perform string manipulations \n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        int length = str.length();
        System.out.println("Length of the string: " + length);

        String upperCase = str.toUpperCase();
        System.out.println("Uppercase string: " + upperCase);

        String lowerCase = str.toLowerCase();
        System.out.println("Lowercase string: " + lowerCase);

        System.out.println("Enter a string to concatenate with:");
        String concatStr = str.concat(scanner.nextLine());
        System.out.println("Concatenated string: " + concatStr);
        
        System.out.println("Enter the starting index for substring:");
        int startIndex = scanner.nextInt();
        String substring = str.substring(startIndex);
        System.out.println("Substring: " + substring);
        scanner.nextLine();

        System.out.println("Enter the character to replace:");
        char oldChar = scanner.nextLine().charAt(0);
        System.out.println("Enter the replacement character:");
        char newChar = scanner.nextLine().charAt(0);
        String replacedStr = str.replace(oldChar, newChar);
        System.out.println("Replaced string: " + replacedStr);

        System.out.println("Enter the delimiter for splitting:");
        String delimiter = scanner.nextLine();
        String[] splitStr = str.split(delimiter);
        System.out.println("Split string:");
        for (String s : splitStr) {
            System.out.println(s);
        }
        scanner.close();
    }
}
