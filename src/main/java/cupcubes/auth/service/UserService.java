package cupcubes.auth.service;

import me.zhyd.oauth.model.AuthUser;

import java.util.List;

public interface UserService {

    AuthUser save(AuthUser user);

    AuthUser getByUuid(String uuid);

    List<AuthUser> listAll();

    void remove(String uuid);
}
