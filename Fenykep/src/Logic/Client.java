package Logic;

//Singleton minta alapján létrehozott Felhasználó osztály, amely egy fix számot ad vissza.
public class Client {
    final int num=1;
    private static Client instance;
    public static Client getInstance(){
        if(instance==null)
            instance=new Client();
        return instance;
    }
    protected Client(){};
    public int getId(){
        return num;
    }
}
