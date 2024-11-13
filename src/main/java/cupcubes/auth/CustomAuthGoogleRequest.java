package cupcubes.auth;

import me.zhyd.oauth.config.AuthConfig;
import me.zhyd.oauth.model.AuthToken;
import me.zhyd.oauth.model.AuthUser;
import me.zhyd.oauth.request.AuthGoogleRequest;

/**
 * 测试：通过继承原 Request 实现 通过 token 获取用户信息的接口
 *
 */
public class CustomAuthGoogleRequest extends AuthGoogleRequest {

    public CustomAuthGoogleRequest(AuthConfig config) {
        super(config);
    }

    @Override
    public AuthUser getUserInfo(AuthToken authToken) {
        return super.getUserInfo(authToken);
    }
}
