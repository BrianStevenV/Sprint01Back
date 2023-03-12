package User;

public class typeUser {
    private int id;
    private String name;
    private String lastName;
    private String phone;
    private String email;
    private String residencyAddres;
    private String cityLocation;

    public typeUser(int id, String name, String lastName, String phone, String email, String residencyAddres, String cityLocation) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.residencyAddres = residencyAddres;
        this.cityLocation = cityLocation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResidencyAddres() {
        return residencyAddres;
    }

    public void setResidencyAddres(String residencyAddres) {
        this.residencyAddres = residencyAddres;
    }

    public String getCityLocation() {
        return cityLocation;
    }

    public void setCityLocation(String cityLocation) {
        this.cityLocation = cityLocation;
    }
}
