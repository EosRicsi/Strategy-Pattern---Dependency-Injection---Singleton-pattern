package Persistence.DataBasedData;

import Persistence.IStrategy;
import Logic.Picture;

//Ez a másdóik stratégia, az adatbázis alapú adatmanipuláció és listázás.
public class DataBased implements IStrategy {
    public void Add(Picture picture){System.out.println("Ez az adatbázis alapú tárolás...");}
    public void Delete(String name){System.out.println("Ez az adatbázis alapú törlés");}
    public void List(){System.out.println("Ez az adatbázis alapú listázás...");}
}
