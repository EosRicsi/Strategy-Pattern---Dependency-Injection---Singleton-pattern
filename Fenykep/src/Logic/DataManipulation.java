package Logic;

import Persistence.ClientName.ClientName;
import Persistence.IStrategy;
import Persistence.MemoryBasedData.MemoryBased;

//Dependency Injection segítségével interface-t adok meg a konstruktornak, hogy a UI osztályban
//A különböző stratégia alapján lehessen kiválasztani mit szeretnénk
//(new MemoryBased(),new DataBased)
public class DataManipulation extends MemoryBased {
    IStrategy iStrategy;

    public DataManipulation(IStrategy iStrategy){
        this.iStrategy=iStrategy;
    }
    //Listába helyezéskor meghívjuk az Add metódust, Singleton mintával pedig lekérdezzük a nevét
    //Client és ClientName osztály
    public void AddPicture(Picture picture){
        this.Add(picture);
        System.out.println("Létrehozás");
        System.out.println(ClientName.getInstance().getClientName());
    }
    //Ugyan ez, csak Delete metódussal.
    public void Remove(String name){
        this.Delete(name);
        System.out.println("Megszüntetés");
        System.out.println(ClientName.getInstance().getClientName());
    }
    public void Listing(){
        this.List();
    }
}