public class ReverseBits {
    public static void main(String[] args) {
        int n = 00000010100101000001111010011100;

        System.out.println(reverseBits((int) n));
    }
    // you need treat n as an unsigned value
    public static int reverseBits(int n ) {
        int ans = 0;

      for (int i = 0; i < 32; i++)
          if((n >> i & 1) == 1)
              ans |= 1 << 31 - i;

        return ans;
    }
}