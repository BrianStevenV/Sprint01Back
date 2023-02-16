public class Package {
    private int id;
    private String typePackage;
    private double weigth;
    private double declaredValue;

    public Package(int id, String typePackage, double weigth, double declaredValue) {
        this.id = id;
        this.typePackage = typePackage;
        this.weigth = weigth;
        this.declaredValue = declaredValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypePackage() {
        return typePackage;
    }

    public void setTypePackage(String typePackage) {
        this.typePackage = typePackage;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public double getDeclaredValue() {
        return declaredValue;
    }

    public void setDeclaredValue(double declaredValue) {
        this.declaredValue = declaredValue;
    }

}
