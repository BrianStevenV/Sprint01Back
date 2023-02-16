public class Main {
    public static void main(String[] args) {
        Identification idClient = new Identification(12314, "Jhon", "Smith");
        Contact contactClient = new Contact(31925257, "jsmith@java.org", "Street Javascript 88 Python B Sur", "Java");
        Client client = new Client(idClient, contactClient);
        System.out.println(client);

        InfoEmployed infoEmployed = new InfoEmployed("28/05/2007", "O+");

        Identification idEmployed = new Identification(4572,"Brian", "Steven");
        Contact contactEmployed = new Contact(312344,"brian@java.org@","Avenue Java 8 SE 11", "Spain Java");
        Employed employed = new Employed(idEmployed, contactEmployed, infoEmployed);
        System.out.println(employed);

        Courier courier = new Courier(idEmployed, contactEmployed, infoEmployed);

        Package onePackage = new Package(234,"Medium", 4, 30000);
        System.out.println(onePackage);

        Shipment oneShipment = new Shipment("989XAKHJ",client, "Bogojava", "Madrijava", "NodeJS 77 C# 45 SUR", "Brian Java", 333333,"21:00 java", "Received", 30000, onePackage);
        System.out.println(oneShipment);
    }
}