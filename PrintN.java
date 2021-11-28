public class PrintN {

    public void printn(int n) {
        if (n < 1) {
            return;
        }
        printn(n - 1); // this will print 1,2,3,4,5,6
        System.out.println(n);
    }

    public static void main(String[] args) {
        PrintN print = new PrintN();
        print.printn(8);
    }
}
