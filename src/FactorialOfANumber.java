void main(){
    int number = Integer.parseInt(IO.readln("Enter the number : "));
    IO.println("Factorial of "+number+" is "+isFactorial(number));
}
public static int isFactorial(int number){
    if(number == 0 || number == 1) return 1;
    return number * isFactorial(number-1);
}
