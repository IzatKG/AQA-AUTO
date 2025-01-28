package UI.owner;

import com.github.dockerjava.api.model.Config;

import static com.github.dockerjava.api.model.Config.*;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "file:src/main/resources/config.properties"
})
public interface ConfigProperties extends org.aeonbits.owner.Config {
    @Key("browser")
    String browser();

    @Key("url")
    @DefaultValue("https:demoga.com")
    String url();


}
