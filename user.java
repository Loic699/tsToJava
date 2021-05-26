package tsToJava;

import java.util.Date;
import java.util.List;

class User {
    public Date birthdate;
    public Number size;
    public List<Photo> photos;
    public Address address;

    public User(Date birthdate, Number size, List<Photo> photos, Address address) {
        this.birthdate = birthdate;
        this.size = size;
        this.photos = photos;
        this.address = address;
    }
}