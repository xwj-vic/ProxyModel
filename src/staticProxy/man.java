package staticProxy;

/**
 * Created by User on 2016/12/15.
 */
public class man {
    public static void main(String[] args){
        Proxywang proxywang=new Proxywang(new women());
        proxywang.makefriendwithman();
    }
}
