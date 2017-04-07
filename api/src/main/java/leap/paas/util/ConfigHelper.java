package leap.paas.util;

import leap.core.AppContext;

/**
 * Created by yuanq on 2017/4/6.
 */
public class ConfigHelper {
    public ConfigHelper() {
    }

    public static SystemSettings systemSettings() {
        SystemSettings sysSettings = (SystemSettings) AppContext.getBean(SystemSettings.class);
        return sysSettings;
    }
}
