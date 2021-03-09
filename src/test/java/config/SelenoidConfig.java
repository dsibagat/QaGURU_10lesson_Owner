package config;


import org.aeonbits.owner.Config;

public interface SelenoidConfig extends Config {
    @Key("browser")
    String browser();

    @Key("browser.version")
    String browserVersion();

    @Key("remote.url")
    String remoteUrl();

    @Key("video.storage")
    String videoStorage();
}
