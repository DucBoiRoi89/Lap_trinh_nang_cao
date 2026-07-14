class SwapAB{
    public void swap(NumberWrapper a, NumberWrapper b){
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }
}
