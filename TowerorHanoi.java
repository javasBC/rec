public class TowerorHanoi {

    public static void main(String[] args) {

        hanoiT(5,'A','C','B');

    }

    public static void hanoiT(int n ,char from,char des ,char temp){
        if (n==1)
            System.out.println("move 1 desk "+from+"=>>"+des);
        else {
            hanoiT(n-1,from,temp,des);
            System.out.println("move 1 desk "+from+"=>>"+des);
            hanoiT(n-1,temp,des,from);
        }
    }














    //static void hanno(int n, String begin, String end, String mid) {
    //    if (n == 1) {
    //        System.out.println(begin + " -> " + end);
    //    } else {
    //        hanno(n - 1, begin, end, mid);
    //        System.out.println(begin + " -> " + end);
    //        hanno(n - 1, mid, begin, end);
    //    }
    //}

    //static void hanoiT(int n, char a, char b, char c) {
    //    if (n == 1) {
    //        System.out.println("move one disk from " + a +
    //                " to " + b);
    //        return;
    //    }
    //    //System.out.println(n-1);
    //    hanoiT(n - 1, a, c, b);
    //    System.out.println("Move one disk from " + a + " to " + b);
    //    hanoiT(n - 1, c, b, a);
    //}
    // static void towerOfHanoi(int numberOfDisks, char starterPole, char endPole, char helperPole)
    // {
    //     if (numberOfDisks == 0)
    //         return;
    //     towerOfHanoi(numberOfDisks-1,starterPole,helperPole,endPole);
    //     System.out.println(" From pole named "+starterPole+ " transfer disk number " + numberOfDisks + " to pole named " + endPole);
    //     towerOfHanoi(numberOfDisks-1,helperPole,endPole,starterPole);
    // }
}
