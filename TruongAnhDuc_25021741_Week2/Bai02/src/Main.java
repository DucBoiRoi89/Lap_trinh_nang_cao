class Main{
    public static void main(String[] args){
        Student student1 = new Student();
        Student student2 = new Student(1234, "Nguyen Van A");
        Student student3 = new Student(6789, "Nguyen Van B", "nguyenvanb@email.com", 3.7);
        student1.setGpa(-15.5);
        student2.setGpa(-15.5);
        student3.setGpa(-25.5);
    }
}