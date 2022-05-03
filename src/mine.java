public class mine {
    public static void main(String[] args) {
        long score_client = 100;
        long supplement =  1100;
        long bonus = 0;
        if (supplement > 1000) {
            bonus = supplement / 100;
        }
        long sum = score_client + supplement + bonus;
        System.out.println(sum);
    }
}
