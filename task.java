/* Напишите метод, который принимает на вход строку (String) и
определяет является ли строка палиндромом (возвращает boolean значение). */
 public class program {

        public static void main(String[] args) {
            System.out.println(isPalindrome("bob"));
            System.out.println(isPalindrome("ротор"));
            System.out.println(isPalindrome("2222"));
            System.out.println(isPalindrome("spok"));
        }

        public static boolean isPalindrome(String str) {
            return str.equalsIgnoreCase(new StringBuffer(str).reverse().toString());
        }
    }
 