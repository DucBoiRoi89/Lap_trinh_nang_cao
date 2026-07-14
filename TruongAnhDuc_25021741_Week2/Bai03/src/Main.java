class Main{
    public static void main(String[] args){
        NumberWrapper a = new NumberWrapper(5);
        NumberWrapper b = new NumberWrapper(10);
        SwapAB.swap(a, b);
        System.out.println(a.value);
        System.out.println(b.value);
    }
}