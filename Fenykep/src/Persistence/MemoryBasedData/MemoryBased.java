package Persistence.MemoryBasedData;
import Persistence.IStrategy;
import Logic.Picture;
import java.util.ArrayList;

//Az Istrategy interface-t implementálva ez az első stratégia, a memória alapú adatmanipulácó, illetve listázás.
public class MemoryBased implements IStrategy {
    protected ArrayList<Picture> items=new ArrayList<>();
    public void Add(Picture picture) {
        items.add(picture);
    }
    public void Delete(String name){
        for (int i=0;i< items.size();i++){
           if (items.get(i).getName().equals(name)){
                items.remove(i);
                break;
            }
        }
    }
    public void List(){
        System.out.println(items.toString());
    }
}
