void main(){
    int number = Integer.parseInt(IO.readln("Check Strong number : "));
    if(isStrongNumber(number)) IO.println(number + " is a Strong number");
    else IO.println(number + " is not a Strong number");
}
public static boolean isStrongNumber(int number){
    int temp = number, lastDigit, ans = 0;
    
    if(number == 0) return false;

    while(temp > 0){
        lastDigit = temp % 10;
        ans += isFactorial(lastDigit);
        temp /= 10;
    }

    return number == ans;
}

public static int isFactorial(int number){
    if(number == 0 || number == 1) return 1;
    return number * isFactorial(number-1);
}