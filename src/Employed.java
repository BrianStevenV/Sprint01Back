public class Employed {
    private Identification id;
    private Contact contact;

    private InfoEmployed infoEmployed;

    public Employed(Identification id, Contact contact, InfoEmployed infoEmployed) {
        this.id = id;
        this.contact = contact;
        this.infoEmployed = infoEmployed;
    }

    public Identification getId() {
        return id;
    }

    public void setId(Identification id) {
        this.id = id;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public InfoEmployed getInfoEmployed() {
        return infoEmployed;
    }

    public void setInfoEmployed(InfoEmployed infoEmployed) {
        this.infoEmployed = infoEmployed;
    }
}
