public class GeoServiceImpl implements GeoService {

    @Override
    public Location byIp(String ip) {
        if (ip.startsWith("172.")) {
            return new Location(Country.RUSSIA);
        } else if (ip.startsWith("96.")) {
            return new Location(Country.USA);
        }
        return new Location(Country.UNKNOWN);
    }
}
