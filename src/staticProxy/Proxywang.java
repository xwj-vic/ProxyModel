package staticProxy;

/**
 * Created by User on 2016/12/15.
 * 代理类
 */
public class Proxywang implements kindWomen {

    private kindWomen kindWomen;

    public Proxywang(kindWomen kindWomen) {
        this.kindWomen = kindWomen;
    }

    @Override
    public void makefriendwithman() {
        this.kindWomen.makefriendwithman();
    }
}
