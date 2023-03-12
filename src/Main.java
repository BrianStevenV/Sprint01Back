import User.*;

public class Main {
    public static void main(String[] args) {
        typeUser userClient = new typeUser(1,"Brian","Villegas","30566789","java@mail.com","Av. Java 74", "Bogojava");
        Client client = new Client(userClient);
        System.out.println(client);

        typeUser userEmployed = new typeUser(111,"Steven","Galletas","3192625557","reactjs@react.org","Buckingjava Palace", "Java palace");
        Employed employed = new Employed(userEmployed,"2008/05/16","O+","Coordinator");
        System.out.println(employed);

        Package onePackage = new Package(234,"Medium", 4, 30000);
        System.out.println(onePackage);

        Shipment oneShipment = new Shipment("989XAKHJ",client, "Bogojava", "Madrijava", "NodeJS 77 C# 45 SUR", "Brian Java", 333333,"21:00 java", "Received", 30000, onePackage);
        System.out.println(oneShipment);
    }
}