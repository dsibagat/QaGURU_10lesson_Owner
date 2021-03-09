package config;


import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})

public interface SelenoidConfig extends Config {
    @Key("browser")
    String browser();

    @Key("browser.version")
    String browserVersion();

    @Key("remote.url")
    String remoteUrl();

    @Key("video")
    String videoStore();

    @Key("video.storage")
    String videoStorage();
}
