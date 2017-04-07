package leap.paas.util;

import leap.core.annotation.Bean;
import leap.core.annotation.ConfigProperty;
import leap.core.annotation.Configurable;

/**
 * Created by yuanq on 2017/4/6.
 */
@Bean
@Configurable
public class SystemSettings {
    @ConfigProperty({"conf.publickey"})
    private String confPublickey;

    public SystemSettings() {
    }

    public String getConfPublickey() {
        return confPublickey;
    }

    public void setConfPublickey(String confPublickey) {
        this.confPublickey = confPublickey;
    }
}
