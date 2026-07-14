class Main{
    public static void main(String[] args){
        MyDate myDate1 = new MyDate("1", "1", "2000");
        Employee emp1 = new Employee("Nguyen Van A", myDate1);
        Employee emp2 = new Employee(emp1);
        MyDate myDate2 = new MyDate("2", "2", "2022");
        emp1.setBirthday(myDate2);
        System.out.println(emp2.birthday.day + "/" + emp2.birthday.month + "/" + emp2.birthday.year);
    }
}