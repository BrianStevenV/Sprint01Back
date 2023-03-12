package User;
public class Employed {
    private typeUser user;
    private String lengthService;
    private String rh;
    private String typeEmployed;

    public Employed(typeUser user, String lengthService, String rh, String typeEmployed) {
        this.user = user;
        this.lengthService = lengthService;
        this.rh = rh;
        this.typeEmployed = typeEmployed;
    }

    public typeUser getUser() {
        return user;
    }

    public void setUser(typeUser user) {
        this.user = user;
    }

    public String getLengthService() {
        return lengthService;
    }

    public void setLengthService(String lengthService) {
        this.lengthService = lengthService;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public String getTypeEmployed() {
        return typeEmployed;
    }

    public void setTypeEmployed(String typeEmployed) {
        this.typeEmployed = typeEmployed;
    }
}
