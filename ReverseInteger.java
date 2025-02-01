public class ReverseInteger {

    // 7. Reverse Integer
    public int reverse(int x) {
        boolean isPositive = x > 0;
        x = Math.abs(x);
        long reversedX = 0;

        while (x > 0) {
            reversedX *= 10;
            reversedX += (x % 10);
            x /= 10;
        }

        if (reversedX > Integer.MAX_VALUE || reversedX < Integer.MIN_VALUE) return 0;
        else {
            return isPositive ? (int) reversedX : -(int) reversedX;
        }
    }

    public static void main(String[] args) {
        ReverseInteger main = new ReverseInteger();

        int x = 1534236469;

        int result = main.reverse(x);

        System.out.println(result);
    }

}
