public class CentralHub{
    public CentralHub(){   
    }
    public static void registerDevice(SmartLight light){
        System.out.println("[HUB] Dang ket noi voi thiet bi: " + light.getName());
    }
}