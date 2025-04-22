import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LocalizationServiceImplTest {

    @Test
    void testLocaleForRussia() {
        // Arrange
        LocalizationService localizationService = new LocalizationServiceImpl();

        // Act
        String message = localizationService.locale(Country.RUSSIA);

        // Assert
        assertEquals("Привет", message);
    }

    @Test
    void testLocaleForUSA() {
        // Arrange
        LocalizationService localizationService = new LocalizationServiceImpl();

        // Act
        String message = localizationService.locale(Country.USA);

        // Assert
        assertEquals("Hello", message);
    }

    @Test
    void testLocaleForUnknown() {
        // Arrange
        LocalizationService localizationService = new LocalizationServiceImpl();

        // Act
        String message = localizationService.locale(Country.UNKNOWN);

        // Assert
        assertEquals("Unknown", message);
    }
}
