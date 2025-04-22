public class LocalizationServiceImpl implements LocalizationService {

    @Override
    public String locale(Country country) {
        if (country == Country.RUSSIA) {
            return "Привет";
        } else if (country == Country.USA) {
            return "Hello";
        } else {
            return "Unknown";
        }
    }
}
