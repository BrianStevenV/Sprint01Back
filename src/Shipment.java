public class Shipment {
    private String id;
    private Client client;
    private String originCity;
    private String designationCity;
    private String designationDirection;
    private String nameReceiver;
    private int phoneReceiver;
    private String receivedHour;
    private String stateShipment;
    private int valueShipment;
    private Package thePackage;

    public Shipment(String id, Client client, String originCity, String designationCity, String designationDirection, String nameReceiver, int phoneReceiver, String receivedHour, String stateShipment, int valueShipment, Package thePackage) {
        this.id = id;
        this.client = client;
        this.originCity = originCity;
        this.designationCity = designationCity;
        this.designationDirection = designationDirection;
        this.nameReceiver = nameReceiver;
        this.phoneReceiver = phoneReceiver;
        this.receivedHour = receivedHour;
        this.stateShipment = stateShipment;
        this.valueShipment = valueShipment;
        this.thePackage = thePackage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getOriginCity() {
        return originCity;
    }

    public void setOriginCity(String originCity) {
        this.originCity = originCity;
    }

    public String getDesignationCity() {
        return designationCity;
    }

    public void setDesignationCity(String designationCity) {
        this.designationCity = designationCity;
    }

    public String getDesignationDirection() {
        return designationDirection;
    }

    public void setDesignationDirection(String designationDirection) {
        this.designationDirection = designationDirection;
    }

    public String getNameReceiver() {
        return nameReceiver;
    }

    public void setNameReceiver(String nameReceiver) {
        this.nameReceiver = nameReceiver;
    }

    public int getPhoneReceiver() {
        return phoneReceiver;
    }

    public void setPhoneReceiver(int phoneReceiver) {
        this.phoneReceiver = phoneReceiver;
    }

    public String getReceivedHour() {
        return receivedHour;
    }

    public void setReceivedHour(String receivedHour) {
        this.receivedHour = receivedHour;
    }

    public String getStateShipment() {
        return stateShipment;
    }

    public void setStateShipment(String stateShipment) {
        this.stateShipment = stateShipment;
    }

    public int getValueShipment() {
        return valueShipment;
    }

    public void setValueShipment(int valueShipment) {
        this.valueShipment = valueShipment;
    }

    public Package getThePackage() {
        return thePackage;
    }

    public void setThePackage(Package thePackage) {
        this.thePackage = thePackage;
    }
}
