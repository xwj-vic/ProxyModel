package dynamicProxy;

/**
 * Created by User on 2016/12/15.
 */
public interface UserManager {
    public void addUser(String userId,String userName);
    public void modifyUser(String userId,String userName);
    public void delUser(String userId);
    public String findUser(String userId);
}
