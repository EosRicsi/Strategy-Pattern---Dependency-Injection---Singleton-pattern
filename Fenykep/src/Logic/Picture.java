package Logic;
//Ez a Kép osztály, itt hozhatjuk létre a képet név,szélesség,magasság és formátum formájában.
public class Picture {

    private String Name;
    private int X_pixel;
    private int Y_pixel;
    private String Format;

    public Picture(String name, int x_pixel, int y_pixel, String format)  {
        //A konstruktorban megadva adom meg a különböző szabályok alapján a paramétereket hibakezelve
        if(name.length()<2){
            throw new IllegalArgumentException("Hiba - A név kisebb mint 2 karakter");
        }
        if (    x_pixel<0||y_pixel<0||
                x_pixel>100000|y_pixel>100000){
            throw new IllegalArgumentException("Hiba - Túl nagy a szélesség/magasság vagy kisebb/egyenlő mint 0");
        }
        if (!format.equals("jpeg")&&!format.equals("bmp")&&!format.equals("png")){
            throw new IllegalArgumentException("Hiba - Nem megfelelő formátum(jpeg,bmp,png)");
        }
        this.Name=name;
        this.X_pixel=x_pixel;
        this.Y_pixel=y_pixel;
        this.Format=format;
    }
    public String getName(){
        return this.Name;
    }
    public void setName(String new_name){
        this.Name=new_name;
    }

    public int getX_pixel(){
        return this.X_pixel;
    }
    public void setX_coordinate(int new_X_pixel){
        this.X_pixel=new_X_pixel;
    }

    public int getY_pixel(){
        return this.Y_pixel;
    }
    public void setY_pixel(int new_Y_pixel){
        this.Y_pixel=new_Y_pixel;
    }

    public String getFormat(){
        return this.Format;
    }
    public void setFormat(String new_Format){
        this.Format=new_Format;
    }

    public String toString(){
        return Name+"#"+X_pixel+"#"+Y_pixel+"#"+Format;
    }
}

