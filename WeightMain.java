public class WeightMain{
    public static void main(String[] args) {
        Weight w1 = new Weight(10, 5);
        Weight w2 = new Weight(5,10);
        boolean b1 = w1.isHeavier(w1);
        System.out.println(b1);

        Weight w3 = w1.multiple(2);
        w2.print();
    }



}