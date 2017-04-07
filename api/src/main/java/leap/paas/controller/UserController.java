package leap.paas.controller;

import leap.paas.model.SecUser;
import leap.paas.util.ConfigHelper;
import leap.paas.util.SystemSettings;
import leap.paas.util.ValidJwt;
import leap.web.Request;
import leap.web.annotation.Path;
import leap.web.annotation.http.GET;
import leap.web.api.mvc.ApiResponse;
import leap.web.api.mvc.ModelController;

import java.util.List;

/**
 * 用户
 * Created by Jason on 2017/1/3.
 */
@Path("/user")
public class UserController  extends ModelController<SecUser> {

    @GET("/all")
    public ApiResponse<List<SecUser>> getAllUser() {

        SystemSettings settings= ConfigHelper.systemSettings();
        String publickey = settings.getConfPublickey();

        String jwt_token = Request.current().getHeader("Authorization"); // jwt token 包含鉴权信息，以及有效性。

        if (!ValidJwt.validToken(jwt_token, publickey)) { // 验证失败
            //filterChain.doFilter(request, response);
            return null;
        }

        List<SecUser> userList = SecUser.findAll();
        return ApiResponse.of(userList).setHeader("X-Total-Count", String.valueOf(userList.size()));
    }

}
