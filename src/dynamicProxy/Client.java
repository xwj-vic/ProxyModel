package dynamicProxy;

/**
 * Created by User on 2016/12/15.
 */
public class Client {
    public static void main(String[] args) {
        LogHandler logHandler = new LogHandler();
        UserManager userManager = (UserManager)logHandler.newProxyInstance(new UserManagerImpl());
        userManager.findUser("0001");
    }
}

