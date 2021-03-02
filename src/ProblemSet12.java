import java.util.ArrayList;

public class ProblemSet12 {

    /////////////// EXERCISE 1  ///////////////

    public long factorial(int n) {

        if (n <= 0) {
            return -1;
        }

        else if(n==1){
            return 1;
        }

        return n * factorial(n - 1);
    } //DONE

    /////////////// EXERCISE 2  ///////////////

    public long fibonacci(int n) {

        if(n < 0){
            return -1;
        }

        else if(n==0 || n==1){
            return n;
        }

        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    } //DONE

    /////////////// EXERCISE 3  ///////////////

    public long triangle(int rows) {

        if(rows < 0){
            return -1;
        }

        if(rows == 0){
            return 0;
        }

        else{

          return rows + triangle(rows-1);

        }
    } //DONE

    /////////////// EXERCISE 4  ///////////////

    public long sumDigits(int n) {
        if(n < 0){
            return -1;
        }
        if( n == 0) {
            return n;
        }
            return n % 10 + sumDigits(n/10);

    } //DONE

    /////////////// EXERCISE 5  ///////////////

    public long powerN(int base, int exponent) {
        if(base < 1 || exponent < 1){
            return -1;
        }

        if (exponent == 1) {
            return base;
        }

        return base * powerN(base, exponent - 1);

    } //DONE

    /////////////// EXERCISE 6  ///////////////

    public String changeXY(String text) {
        if(text == null){
            return null;
        }
        if(text.length() == 0)
            return text;

        if(text.charAt(0) == 'x')
            return 'y' + changeXY(text.substring(1));

        return text.charAt(0) + changeXY(text.substring(1));

    } //DONE

    /////////////// EXERCISE 7  ///////////////
    public int array11(int[] data, int index) {
        if(data == null){
            return -1;
        }

        if(index < 0){
            return -1;
        }
        if(index >= data.length)
            return 0;

        if(data[index] == 11)
            return 1 + array11(data, index + 1);

        return array11(data, index + 1);
    }

    /////////////// EXERCISE 8  ///////////////

    public int strCount(String text, String sub) {
        if(text == null){
            return -1;
        }
        if(sub == null ){
            return -1;
        }
        if(sub.length() == 0){
            return -1;
        }
        if(text.length() < sub.length())
            return 0;

        if(text.substring(0, sub.length()).equals(sub))
            return 1 + strCount(text.substring(sub.length()), sub);

        return strCount(text.substring(1), sub);


    }

    /////////////// EXERCISE 9  ///////////////

    public boolean strCopies(String text, String sub, int n) {
        if(text == null){
            return false;
        }
        if(sub == null ){
            return false;
        }
        if(sub.length() == 0){
            return false;
        }
        if(n<0){
            return false;
        }
        if(n == 0) {
            return true;
        }
        if(text.length() < sub.length()) {
            return false;
        }
        if(text.substring(0, sub.length()).equals(sub))
            return strCopies(text.substring(1), sub, n-1);

        return strCopies(text.substring(1), sub, n);
    }

    /////////////// EXERCISE 10  ///////////////

    public int strDist(String text, String sub) {
        if(text == null){
            return -1;
        }
        if(sub == null ){
            return -1;
        }
        if(sub.length() == 0){
            return -1;
        }

        if(text.length() < sub.length()) {
            return 0;
        }
        if(text.substring(0, sub.length()).equals(sub) && text.substring(text.length() - sub.length()).equals(sub)) {
            return text.length();
        }
        if(!text.substring(0, sub.length()).equals(sub))
            return strDist(text.substring(1), sub);

        return strDist(text.substring(0, text.length()-1), sub);
    }
}
