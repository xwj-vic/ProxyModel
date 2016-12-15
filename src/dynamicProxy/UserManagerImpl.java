package dynamicProxy;

/**
 * Created by User on 2016/12/15.
 */
public class UserManagerImpl implements UserManager {
    @Override
    public void addUser(String userId, String userName) {
        System.out.println("正在添加用户,用户为："+userId+userName+"……");
    }

    @Override
    public void modifyUser(String userId, String userName) {
        System.out.println("modifyUser,userId="+userId);
    }

    @Override
    public void delUser(String userId) {
        System.out.println("delUser,userId="+userId);
    }

    @Override
    public String findUser(String userId) {
        System.out.println("findUser,userId="+userId);
        return userId;
    }
}
