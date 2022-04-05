import java.util.Scanner;
/*Using recursion convert the numeric string in integer format
Time complexity O(n) where n is the length of the string.
 */
public class StringToIntRecursion {
    String str;
    public StringToIntRecursion(String str){
        this.str = str;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numeric string");
        String numberString = input.next();
        StringToIntRecursion strInt = new StringToIntRecursion(numberString);

        System.out.println("String in Integer format is " + strInt.stringToIntRec(numberString.length()-1));
    }
    int stringToIntRec(int i){
        if(i==0){
            return (str.charAt(0) - '0');
        }

        return stringToIntRec(i-1) *10 + (str.charAt(i) - '0');
    }
}
