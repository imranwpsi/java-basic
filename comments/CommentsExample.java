package comments;
// This is single line comment
/**
 * @author Imran Hossain
 * @since 05-10-2020
 */
public class CommentsExample {
    /**
     * This is a method to display sum of 2 numbers
     * @param numA this is 1st parameter to pass the method
     * @param numB this is 2nd parameter to pass the method
     * @return This method return an integer value
     */
    public int addNum(int numA, int numB) {
        return numA + numB;
    }
    public static void main(String[] args) {
        CommentsExample obj = new CommentsExample();
        int sum = obj.addNum(10, 20);
        System.out.printf("Two number sum is : " + sum);
    }
}
