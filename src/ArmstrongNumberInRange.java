void main(){
    long startNumber = Long.parseLong(IO.readln("Enter staring numbr : "));
    long endNumber = Long.parseLong(IO.readln("Enter Ending numbr : "));

    if(startNumber > endNumber){
        long temp = startNumber;
        startNumber = endNumber;
        endNumber = temp;
    }

    for(long i = startNumber; i <= endNumber;i++){
        if(isArmstrong(i))
            IO.println(i);
    }
}
public static boolean isArmstrong(long number){
    if (number < 0)
        return false;
    
    if(number == 0)
        return true;

                
    long temp = number,remainder = 0,sum = 0;
    int count = 0 ;
    while (temp > 0) {
        temp /= 10;
        count++;
    }

    temp = number;
    while(temp > 0){
        remainder = temp % 10;
        sum = sum + (long)Math.pow(remainder, count);
        temp/=10;
    }

    return sum == number;
}