void main() {
    int number = Integer.parseInt(IO.readln("Enter number: "));
    if (isPerfectNumber(number)){
        IO.println(number+" : is a Perfect number");
    }else{
        IO.println(number+": is not a Perfect number");
    }
}
public static boolean isPerfectNumber(int number){
    if(number <= 0) return false;
    int sum = 0;
    for(int i = 1; i < number; i++){
        if (number % i == 0){
            sum += i;
        }
    }
    return number == sum;
}