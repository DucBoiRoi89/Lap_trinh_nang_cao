import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Employee[] employees = new Employee[n];   
        for (int i = 0; i < n; i++){
            String lines = scanner.nextLine();
            String type = lines.substring(0, 1);
            if (type.equals("F")){
                String name = lines.substring(lines.indexOf("\"") + 1, lines.lastIndexOf("\""));
                String[] beforeLines = lines.substring(lines.lastIndexOf("\"") + 2, lines.length()).split(" ");
                double baseSalary = Double.parseDouble(beforeLines[0]);
                double bonus = Double.parseDouble(beforeLines[1]);
                double penalty = Double.parseDouble(beforeLines[2]);
                employees[i] = new FullTimeEmployee(name, baseSalary, bonus, penalty);
            } else if (type.equals("P")){
                String name = lines.substring(lines.indexOf("\"") + 1, lines.lastIndexOf("\""));
                String[] beforeLines = lines.substring(lines.lastIndexOf("\"") + 2, lines.length()).split(" ");
                double workingHours = Double.parseDouble(beforeLines[0]);
                double hourlyRate = Double.parseDouble(beforeLines[1]);
                employees[i] = new PartTimeEmployee(name, workingHours, hourlyRate);
            }
        }
        for (int i = 0; i < n; i++){
            if (employees[i] instanceof FullTimeEmployee){
                System.out.println(employees[i].name + " - " + "Full-time" + " - " + employees[i].getSalary());
            } else if (employees[i] instanceof PartTimeEmployee){
                System.out.println(employees[i].name + " - " + "Part-time" + " - " + employees[i].getSalary());
            }
        }
    }
}