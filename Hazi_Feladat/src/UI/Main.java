package UI;
import Logic.DataManipulation;
import Logic.Picture;
import Persistence.MemoryBasedData.MemoryBased;

//Ez a UI réteg, itt létrehozzuk az osztályt, majd klönböző parancsokat adunk meg.
public class Main {
    public static void main(String[] args)  {

        Picture picture1=new Picture("alma",12,12, "jpeg");
        Picture picture2=new Picture("Béka",12,13,"bmp");
        DataManipulation MemoryBasedDataManipulation=new DataManipulation(new MemoryBased());

        MemoryBasedDataManipulation.AddPicture(picture1);
        MemoryBasedDataManipulation.AddPicture(picture2);
        MemoryBasedDataManipulation.List();
        MemoryBasedDataManipulation.Remove("Béka");
        MemoryBasedDataManipulation.List();
    }
}
