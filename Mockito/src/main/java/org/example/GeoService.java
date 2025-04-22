public interface GeoService {
    Location byIp(String ip);
}

public interface LocalizationService {
    String locale(Country country);
}

public class Location {
    private final Country country;

    public Location(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }
}

public enum Country {
    RUSSIA, USA, UNKNOWN;
}
