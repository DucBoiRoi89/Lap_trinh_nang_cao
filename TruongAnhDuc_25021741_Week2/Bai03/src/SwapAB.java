final class SwapAB{
    private SwapAB(){
        throw new UnsupportedOperationException("Day la lop tien ich, khong the khoi tao doi tuong.");
    }
    public static void swap(NumberWrapper a, NumberWrapper b){
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }
}
