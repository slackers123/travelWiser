public class Restaurant {
    private String name;
    private String address;
    private String city;
    private String category;
    public Restaurant(String name, String address, String city, String category) {
        setName(name);
        setAddress(address);
        setCity(city);
        setCategory(category);
    }
    private void setName(String name) {
        this.name=name;
    }
    private void setAddress(String address) {
        this.address=address;
    }
    private void setCity(String city) {
        this.city = city;
    }
    private void setCategory(String category) {
        this.category = category;
    }
    public String getAddress() {
        return address;
    }
    public String getCategory() {
        return category;
    }
    public String getCity() {
        return city;
    }
    public String getName() {
        return name;
    }
}
