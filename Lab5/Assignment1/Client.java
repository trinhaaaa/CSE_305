import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contractType;

        while (true) {
            System.out.print("Enter contract type (Permanent, LongTerm, ShortTerm): ");
            contractType = scanner.nextLine();
            if (contractType.equals("Permanent") || contractType.equals("LongTerm") || contractType.equals("ShortTerm")) {
                break;
            } else {
                System.out.println("Invalid contract type. Please enter Permanent, LongTerm, or ShortTerm.");
            }
        }

        System.out.print("Enter Contract ID: ");
        String contractID = scanner.nextLine();

        System.out.print("Enter Property ID: ");
        String propertyID = scanner.nextLine();

        System.out.print("Enter Tenant ID: ");

        String tenantID = scanner.nextLine();

        System.out.print("Enter Rent Amount: ");
        double rentAmount = scanner.nextDouble();

        ContractBuilder builder = new ContractBuilder();
        builder.createContract(contractType, contractID, propertyID, tenantID, rentAmount);
        
        scanner.close();
    }
}
