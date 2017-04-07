package leap.paas;

import leap.filter.JwtFilter;
import leap.web.App;

/**
 * Created by yuanq on 2017/4/6.
 */
public class Global extends App{

    @Override
    protected void init() throws Throwable {
        filters().add(new JwtFilter());
    }

}
