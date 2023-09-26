package PALINDROME;

import java.util.Scanner;

public class PalindromeCheck {
	
    public static void main(String[] args) {
    	
    	Scanner  sc = new Scanner(System.in);
        String kata;
        
        System.out.print("Masukkan kata: "); kata = sc.next(); 
        
        if (isPalindrome(kata)) {
            System.out.println(kata + " adalah palindrom.");
        } else {
            System.out.println(kata + " bukan palindrom.");
        }
    }

    public static boolean isPalindrome(String word) {
        word = word.toLowerCase(); // Konversi ke huruf kecil
        int left = 0;
        int right = word.length() - 1;
        
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false; // Tidak palindrom
            }
            left++;
            right--;
        }
        return true; // Palindrom
    }
}

