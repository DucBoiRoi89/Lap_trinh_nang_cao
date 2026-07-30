import java.util.ArrayList;
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employeeList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++){
            String lines = scanner.nextLine();
            String[] listLines = lines.split(" ");
            String type = listLines[0];
            if (type.equals("E")){
                String name = listLines[1];
                double baseSalary = Double.parseDouble(listLines[2]);
                employeeList.add(new Employee(name, baseSalary));
            } else if (type.equals("D")){
                String name = listLines[1];
                double baseSalary = Double.parseDouble(listLines[2]);
                int overtimeHours = Integer.parseInt(listLines[3]);
                employeeList.add(new Developer(name, baseSalary, overtimeHours));
            } else if (type.equals("T")){
                String name = listLines[1];
                double baseSalary = Double.parseDouble(listLines[2]);
                int bugsFound = Integer.parseInt(listLines[3]);
                employeeList.add(new Tester(name, baseSalary, bugsFound));
            }
        }
        for (int i = 0; i < employeeList.size(); i++){
            System.out.println(employeeList.get(i).name + " - " + "Bonus" + ": " + employeeList.get(i).calculateBonus());
            if (employeeList.get(i) instanceof Developer){
                System.out.println("Tang khoa hoc AWS");
            } else if (employeeList.get(i) instanceof Tester){
                System.out.println("Tang tool Test");
            }

        }
    }   
}