import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int pressure = s.nextInt();  
        float temp = s.nextFloat();  
        s.nextLine(); // consume the leftover newline
        String status = s.nextLine();  

        System.out.println("Pressure = " + pressure);
        System.out.printf("Temperature = %.2f\n", temp);
        System.out.println("Sensor: " + status);

        s.close(); // optional, good practice
    }
}
