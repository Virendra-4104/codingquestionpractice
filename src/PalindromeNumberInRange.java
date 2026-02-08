void main() {
    IO.println("Find Palindrome Number in given range.");
    int startNumber = Integer.parseInt(IO.readln("Enter Staring Number : "));
    int endNumber = Integer.parseInt(IO.readln("Enter Ending Number : "));

    if (startNumber > endNumber) {
        int temp = startNumber;
        startNumber = endNumber;
        endNumber = temp;
    }
    for (int i = startNumber; i <= endNumber; i++) {
        if (isPalindrome(i))
            IO.println(i);
    }
}

public static boolean isPalindrome(int number) {
    if (number < 0)
        return false;

    int temp = number, remainder = 0, reverse = 0;

    while (temp > 0) {
        remainder = temp % 10;
        reverse = reverse * 10 + remainder;
        temp /= 10;
    }

    return number == reverse;
}