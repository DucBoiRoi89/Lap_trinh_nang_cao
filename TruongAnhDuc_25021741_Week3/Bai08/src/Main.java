import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Robot[] listRobot = new Robot[n];
        for (int i = 0; i < n; i++){
            String lines = scanner.nextLine();
            String[] listLines = lines.split(" ");
            String type = listLines[0];
            if (type.equals("DR")){
                listRobot[i] = new DroneRobot(Integer.parseInt(listLines[1]), listLines[2]);
            } else if (type.equals("FR")){
                listRobot[i] = new FishRobot(Integer.parseInt(listLines[1]), listLines[2]);
            } else if (type.equals("AR")){
                listRobot[i] = new AmphibiousRobot(Integer.parseInt(listLines[1]), listLines[2]);
            }
        }
        for (int i = 0; i < n; i++){
            listRobot[i].performMainTask();
        }
        for (int i = 0; i < n; i++){
            if (listRobot[i] instanceof DroneRobot){
                Robot robot1 = listRobot[i];
                // robot1.fly();
                DroneRobot droneRobot1 = (DroneRobot) robot1;
                droneRobot1.fly();
                break;
            }
        }
        for (int i = 0; i < n; i++){
            if (listRobot[i] instanceof Flyable){
                if (listRobot[i] instanceof DroneRobot){
                    ((DroneRobot) listRobot[i]).fly();
                } else if (listRobot[i] instanceof AmphibiousRobot){
                    ((AmphibiousRobot) listRobot[i]).fly();
                }
            }
        }
    }
}