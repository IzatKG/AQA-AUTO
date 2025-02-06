package UI.owner;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "file:src/main/resources/config.properties"
})
public interface ConfigProperties extends Config {

    @Key("browser")
    String browser();

    @Key("headless")
    boolean headless();

    @Key("url")
    @DefaultValue("https:demoga.com")
    String url();


}
