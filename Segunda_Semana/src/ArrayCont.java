public class ArrayCont {
    public static void main(String[] args) {
        int[] num = new int[5];

        for(int i = 0; i < 5; i++) {
            num[i] = i * 3;
        }

        for(int x : num) {
            System.out.println(x);
        }
    }
}
