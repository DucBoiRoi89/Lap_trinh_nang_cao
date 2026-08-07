class Circle extends Shape{
    public Circle(int x, int y){
        super(x, y);
    }

    public void draw(){
        System.out.println("Ve hinh tron tai" + " (" + x + ", " + y + ")");
    }
    public void erase(){
        System.out.println("Xoa hinh tron tai" + " (" + x + ", " + y + ")"); 
    }
}