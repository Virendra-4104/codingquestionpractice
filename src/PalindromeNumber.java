void main() {
    int number = Integer.parseInt(IO.readln("Enter number : "));
    if(isPalindrome(number)) 
        IO.println(number +" is a Palindrome Number.");
    else 
        IO.println(number +" is not a Palindrome Number.");
}

public static boolean isPalindrome(int number) {
    if(number < 0) 
        return false;
    
    int temp = number, remainder = 0, reverse = 0;

    while (temp > 0) {
        remainder = temp % 10;
        reverse = reverse * 10 + remainder;
        temp /= 10;
    }

    return number == reverse;
}