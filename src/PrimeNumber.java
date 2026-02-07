void main() {
    IO.println("Check Number is Prime or Not.");
    int number = Integer.parseInt(IO.readln("Enter the number => "));
    isPrime(number);
}

public static void isPrime(int num) {
    if (num <= 1) {
        IO.println(num + " is not a prime number.");
        return;
    }

    for (int i = 2; i * i <= num; i++)
        if (num % i == 0){
            IO.println(num + " is not a prime number.");
            return;
        }

    IO.println(num + " is a prime number.");
}