import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GeoServiceImplTest {

    @Test
    void testByIpForRussia() {
        // Arrange
        GeoService geoService = new GeoServiceImpl();

        // Act
        Location location = geoService.byIp("172.123.123.123");

        // Assert
        assertEquals(Country.RUSSIA, location.getCountry());
    }

    @Test
    void testByIpForUSA() {
        // Arrange
        GeoService geoService = new GeoServiceImpl();

        // Act
        Location location = geoService.byIp("96.123.123.123");

        // Assert
        assertEquals(Country.USA, location.getCountry());
    }

    @Test
    void testByIpForUnknown() {
        // Arrange
        GeoService geoService = new GeoServiceImpl();

        // Act
        Location location = geoService.byIp("192.123.123.123");

        // Assert
        assertEquals(Country.UNKNOWN, location.getCountry());
    }
}
