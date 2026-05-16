import java.util.Scanner;

public class vowelfunction {

    static void checkvowel(char vowel) {

        if (vowel == 'A' || vowel == 'E' ||
                vowel == 'I' || vowel == 'O' ||
                vowel == 'U'||
        vowel== 'a' || vowel == 'e' || vowel == 'i' ||
                vowel == 'o' || vowel == 'u') {

            System.out.println("The vowel is " + vowel);
        }

        else {
            System.out.println("Consonent " + vowel);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter please a character");

        char vowel = sc.next().charAt(0);

        checkvowel(vowel);
    }
}