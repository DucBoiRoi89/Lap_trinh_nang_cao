class Student{
    private int id;
    private String name;
    private String email;
    private double gpa;

    public Student(){
        this.id = 0;
        this.name = "";
        this.email = "";
        this.gpa = 0.0;
    }
    public Student(int id, String name){
        this.id = id;
        this.name = name;
        this.email = "";
        this.gpa = 0.0;
    }
    public Student(int id, String name, String email, double gpa){
        this.id = id;
        this.name = name;
        this.email = email;
        if (gpa < 0.0 || gpa > 4.0){
            this.gpa = 0.0;
            System.out.println("Loi !. GPA khong hop le.");
        } else{
            this.gpa = gpa;
        }
    }
    public void setGpa(double gpa){
        if (gpa < 0.0 || gpa > 4.0){
            System.out.println("Loi !. GPA khong hop le.");
        } else{
            this.gpa = gpa;
        }
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setNam(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }

}