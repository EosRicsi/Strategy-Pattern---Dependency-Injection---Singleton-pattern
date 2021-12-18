package Persistence.ClientName;

import Logic.Client;

//Singleton mintát alkalmazva lekérdezzük a nevet a Client osztály segítségével.
public class ClientName implements IClientName  {
    final int num=1;
    final String name="Néma Bob";
    private static ClientName instance;
    public static ClientName getInstance(){
        if(instance==null)
            instance=new ClientName();
        return instance;
    }
    protected ClientName(){};
    public String getClientName(){
        if(Client.getInstance().getId()==num){
            return name;
        }
        return null;
    }
}
