package com.futao.springmvcdemo.foundation.shiro;

import com.futao.springmvcdemo.model.entity.User;
import com.futao.springmvcdemo.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author futao
 * Created on 2018-12-13.
 */
public class CustomShiroRealm extends JdbcRealm {


    @Resource
    private UserService userService;

    /**
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo();
        String principal = (String) principals.getPrimaryPrincipal();

        User user = userService.currentUser();
//        for ()
        return null;
    }

    /**
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        return null;
    }

    @Override
    public void setDataSource(DataSource dataSource) {
        super.setDataSource(dataSource);
    }

    @Override
    public void setUserRolesQuery(String userRolesQuery) {
        super.setUserRolesQuery(userRolesQuery);
    }

    @Override
    public void setPermissionsQuery(String permissionsQuery) {
        super.setPermissionsQuery(permissionsQuery);
    }
}
