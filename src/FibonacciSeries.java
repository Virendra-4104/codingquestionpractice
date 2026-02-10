
void main(){
    int number = Integer.parseInt(IO.readln("Enter number : "));
    fibonacciSeries(number);
}
public static void fibonacciSeries(int number){
    int first = 0, second = 1,next;
    if (number >= 1)
        IO.println(first);
    if (number >= 2)
        IO.println(second);
    for(int i = 3;i <= number; i++){
        next = first + second;
        IO.println(next);
        first = second;
        second = next;
    }
}
