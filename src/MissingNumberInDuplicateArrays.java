public class MissingNumberInDuplicateArrays {
    public static void main(String[] args) {
        System.out.println("We will find the missing number in the two arrays which " +
                "have exactly same elements except one");
        System.out.println("First array elements ");
        ArrayInputOutput arrInOut = new ArrayInputOutput();
        int[] array1 = arrInOut.inputArray();

        System.out.println("Second array elements ");
        int[] array2 = arrInOut.inputArray();

        System.out.println("Missing number is " + findMissingMumber(array1,array2));
    }

    static int findMissingMumber(int[] a, int[] b){
        int ans=0;
        for(int i = 0; i< a.length; i++){
            ans^=a[i];
        }
        for(int i = 0; i<b.length;i++) {
            ans^=b[i];
        }
        return ans;
    }
}
