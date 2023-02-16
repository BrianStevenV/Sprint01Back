public class Contact {
    private int phone;
    private String mail;
    private String residenceAddress;
    private String locationCity;

    public Contact(int phone, String mail, String residenceAddress, String locationCity) {
        this.phone = phone;
        this.mail = mail;
        this.residenceAddress = residenceAddress;
        this.locationCity = locationCity;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getResidenceAddress() {
        return residenceAddress;
    }

    public void setResidenceAddress(String residenceAddress) {
        this.residenceAddress = residenceAddress;
    }

    public String getLocationCity() {
        return locationCity;
    }

    public void setLocationCity(String locationCity) {
        this.locationCity = locationCity;
    }
}
