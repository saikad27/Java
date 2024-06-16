import java.util.Scanner;
class p8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean isDuck = false;
        int temp = number;
        boolean firstDigit = true;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0 && !firstDigit) {
                isDuck = true;
                break;
            }
            temp /= 10;
            firstDigit = false;
        }

        if (isDuck) {
            System.out.println(number + " is a duck number.");
        } else {
            System.out.println(number + " is not a duck number.");
        }
    }
}

