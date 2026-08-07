class Square extends Shape{
    public Square(int x, int y){
        super(x, y);

    }

    public void draw(){
        System.out.println("Ve hinh vuong tai" + " (" + x + ", " + y + ")");
    }
    public void erase(){
        System.out.println("Xoa hinh vuong tai" + " (" + x + ", " + y + ")"); 
    }
}