package Chapter10;

public class QuestionThree {

    public static void main(String[] args) {

        //Create three MyInteger objects
        MyInteger num1 = new MyInteger(7);
        MyInteger num2 = new MyInteger(7);
        MyInteger num3 = new MyInteger(25);

        //Check whether they are prime, even, and/or odd
        System.out.printf("Number 1 = %d isPrime: %b isOdd: %b isEven %b\n",
                num1.getValue(), num1.isPrime(), num1.isOdd(), num1.isEven());

        System.out.printf("Number 2 = %d isPrime: %b isOdd: %b isEven %b\n",
                num2.getValue(), num2.isPrime(), num2.isOdd(), num2.isEven());

        System.out.printf("Number 3 = %d isPrime: %b isOdd: %b isEven %b\n",
                num3.getValue(), num3.isPrime(), num3.isOdd(), num3.isEven());

        //Do they equal one another?
        System.out.printf("Num 1 == Num 2: %b\n", num1.equals(num2));
        System.out.printf("Num 1 == Num 3: %b\n", num1.equals(num3));

        //Parse the strings to ints
        System.out.printf("Parse int 100 string value == %d\n", MyInteger.parseInt("100"));
        System.out.printf("Parse int 150 char array value == %d\n", MyInteger.parseInt("150".toCharArray()));

    }

}

class MyInteger{

    int value;

    public MyInteger(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven(){
        return value % 2 == 0;
    }

    public boolean isOdd(){
        return value % 2 != 0;
    }

    /**
     * Check whether the number is a prime number
     * @return true or false
     */
    public boolean isPrime(){
        for (int divisor = 2; divisor <= value / 2; divisor++) {
            if (value % divisor == 0)
                return false;
        }
        return true;
    }

    public boolean isEven(int value){
        return value % 2 == 0;
    }

    public boolean isOdd(int value){
        return value % 2 != 0;
    }

    /**
     * Check whether the number is a prime number
     * @param value
     * @return true or false
     */
    public boolean isPrime(int value){
        for (int divisor = 2; divisor <= value / 2; divisor++) {
            if (value % divisor == 0)
                return false;
        }
        return true;
    }

    public boolean isEven(MyInteger myInt){
        return myInt.isEven();
    }

    public boolean isOdd(MyInteger myInt){
        return myInt.isOdd();
    }

    public boolean isPrime(MyInteger myInt){
        return myInt.isPrime();
    }

    public boolean equals(int value){
        return this.value == value;
    }

    public boolean equals(MyInteger myInt){
        return myInt.value == this.value;
    }

    /**
     * Parse characters into ints
     * @param characters
     * @return value
     */
    public static int parseInt(char characters[]){
        int value = 0;
        for (int i = 0, j = (int)Math.pow(10, characters.length - 1);
             i < characters.length; i++, j /= 10) {
            value += (characters[i]- 48) * j;
        }
        return value;
    }

    /**
     * Parse strings into ints
     * @param str
     * @return value
     */
    public static int parseInt(String str) {
        int value = 0;
        for (int i = 0, j = (int)Math.pow(10, str.length() - 1);
             i < str.length(); i++, j /= 10) {
            value += (str.charAt(i) - 48) * j;
        }
        return value;
    }
}
