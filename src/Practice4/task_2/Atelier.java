package Practice4.task_2;

public class Atelier{

    public void dressMan(Clothes[] clothes) {
        System.out.println("INFO: ");
        for (Clothes c : clothes){
            if (c instanceof MenClothing) ((MenClothing)c).dressMan();
        }
    }

    public void dressWoman(Clothes[] clothes) {
        System.out.println("INFO: ");
        for (Clothes c : clothes){
            if (c instanceof WomenClothing) ((WomenClothing)c).dressWoman();
        }
    }
}
