package leap.filter;

import leap.core.AppContext;
import leap.core.web.RequestIgnore;
import leap.lang.logging.Log;
import leap.lang.logging.LogFactory;
import leap.paas.util.ConfigHelper;
import leap.paas.util.SystemSettings;
import leap.paas.util.ValidJwt;
import leap.web.*;
import leap.web.Filter;
import leap.web.assets.AssetHandler;

import javax.servlet.*;
import javax.servlet.FilterChain;
import java.io.IOException;



/**
 * Created by skadi on 2017/4/6.
 */
public class JwtFilter implements Filter {
    private static final Log log = LogFactory.get(JwtFilter.class);

    @Override
    public void doFilter(Request request, Response response, leap.web.FilterChain filterChain) throws ServletException,
            IOException {

        SystemSettings settings= ConfigHelper.systemSettings();
        String publickey = settings.getConfPublickey();
        String jwt_token = request.getHeader("Authorization"); // jwt token 包含鉴权信息，以及有效性。

        if (ValidJwt.validToken(jwt_token, publickey)) { // 验证成功
            filterChain.doFilter(request, response);
        }

    }

}
