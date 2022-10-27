package Practice4.task_2;

public class task_2 {
    public static void main(String[] args) {
        Atelier a = new Atelier();
        Clothes[] clothes = new Clothes[10];
        Clothes tie = new Tie(Sizes.M, 5.0, "red");
        clothes[0] = tie;
        Clothes skirt = new Skirt(Sizes.S, 7.0, "black");
        clothes[1] = skirt;
        Clothes tshirt = new TShirt(Sizes.L, 3.0, "white");
        clothes[2] = tshirt;
        a.dressMan(clothes);
    }

}
enum Sizes{
    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40);
    int euro_size;
    Sizes (int euro_size){
        this.euro_size = euro_size;
    }
    public String getDescription(){
        if (this.equals(Sizes.XXS)){
            System.out.println("Child size");
        }
        return "Adult size";
    }
}
