import java.util.Scanner;

public class LetterCounter {

    public static int countLetterA(String input) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();
        scanner.close();

        int occurrences = countLetterA(input);

        if (occurrences > 0) {
            System.out.println("A letra 'a' aparece " + occurrences + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }
    }
}
