void main() {
    int number = Integer.parseInt(IO.readln("Enter number : "));
    IO.println( addUntilOneDigit(number));
}
public static int addUntilOneDigit(int number) {
    number = Math.abs(number);

    int sum = 0;

    while (number > 0) {
        sum += number % 10;
        number /= 10;
    }

    if (sum > 9) return addUntilOneDigit(sum);

    return sum;
}

//public static int digitalRoot(int number) {
//    number = Math.abs(number);
//    return (number == 0) ? 0 : 1 + (number - 1) % 9;
//}