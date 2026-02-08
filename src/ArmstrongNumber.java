void main() {
    int number = Integer.parseInt(IO.readln("Enter a number to check it is an Armstrong or Not : "));
    if(isArmstrong(number))
        IO.println(number +" is an Armstrong number.");
    else
        IO.println(number +" is not an Armstrong number.");
}

public static boolean isArmstrong(int number) {
    if (number < 0)
        return false;
    
    if(number == 0)
        return true;

    int temp = number, count = 0,remainder = 0,sum = 0;
    while (temp > 0) {
        temp /= 10;
        count++;
    }

    temp = number;
    while(temp > 0){
        remainder = temp % 10;
        sum = sum + (int)Math.pow(remainder, count);
        temp/=10;
    }
    return sum == number;
}