public class Contact {

    private int id;
    private String name;
    private Phone phone;
    private String city;

    /**
     * Constructor whith its fields ( the ID will be automatically generated )
     *
     * @param name
     * @param phone
     * @param city
     */
    public Contact(String name, Phone phone, String city) {
        this.name = name;
        this.phone = phone;
        this.city = city;
    }

    public Contact() {
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

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
