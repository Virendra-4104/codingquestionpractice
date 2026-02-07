void main(){
    IO.println("Check Number is Prime or Not in given range");
    int startingNumber = Integer.parseInt(IO.readln("Enter the starting number => "));
    int endingNumber = Integer.parseInt(IO.readln("Enter the ending number => "));

    if (startingNumber > endingNumber) {
        int temp = startingNumber;
        startingNumber = endingNumber;
        endingNumber = temp;
    }

    for(int i = startingNumber; i <= endingNumber; i++)
        if (isPrime(i)) 
            IO.print(i+" ");
}

public static boolean isPrime(int num) {
    if (num <= 1) return false;
    if (num == 2) return true;
    if (num % 2 == 0) return false;

    for (int i = 3; i * i <= num; i+=2)
        if (num % i == 0) 
            return false;

    return true;
}