public class Client {
    private Identification id;
    private Contact contact;

    public Client(Identification id, Contact contact) {
        this.id = id;
        this.contact = contact;
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
}
