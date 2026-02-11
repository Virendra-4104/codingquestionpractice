void main(){
    int number = Integer.parseInt(IO.readln("Enter number : "));
    sumOfDivisior(number);
}

public static void sumOfDivisior(int number){
    if(number < 0){
        IO.println("enter the positive number.");
        return;
    }

    int sum = 0;
    IO.println("Divisors of "+ number + ": ");
    for(int i = 1; i <= number; i++){
        if(number % i == 0){
            IO.print(i+" ");
            sum += i;
        }
    }
    IO.println("= "+sum);
}