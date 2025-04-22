public class MessageSenderImpl {
    private final GeoService geoService;
    private final LocalizationService localizationService;

    public MessageSenderImpl(GeoService geoService, LocalizationService localizationService) {
        this.geoService = geoService;
        this.localizationService = localizationService;
    }

    public String sendMessage(String ip) {
        Location location = geoService.byIp(ip);
        String country = location.getCountry().name();
        return localizationService.locale(location.getCountry());
    }
}
