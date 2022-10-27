package Practice4.task_1;


public class task_1 {
    public static void iLove(Season s){
        switch (s){
            case WINTER -> System.out.println("I love winter");
            case SPRING -> System.out.println("I love spring");
            case SUMMER -> System.out.println("I love summer");
            case FALL -> System.out.println("I love fall");
        }
    }

    public static void main(String[] args) {
        System.out.println("------task 1------");
        Season s = Season.SPRING;
        System.out.print("My fav season is " + s + "\nInfo: ");
        s.getInfo();
        System.out.println("------task 2------");
        task_1 test = new task_1();
        test.iLove(s);
        System.out.println("------task 3-------");
        System.out.println(s.getDescription());
        System.out.println("------task 4-------");
        Season[] seasons = Season.values();
        for (Season season : seasons){
            System.out.print(season.name() + " " + season.t + " ");
            season.getInfo();
        }
    }
}
enum Season{
        WINTER(-6.7){
            public void getInfo(){
                System.out.println("From December 1 to February 28");
            }
        },
        SPRING(6.5){
            public void getInfo(){
                System.out.println("From March 1 to May 31");
            }
        },
        SUMMER(20.0){
            public void getInfo(){
                System.out.println("From June 1 to August 31");
            }
        },
        FALL(6.5){
            public void getInfo(){
                System.out.println("From September 1 to November 30");
            }

        };
        final double t;
        public abstract void getInfo();
        Season (double t){
            this.t = t;
        }
        public String getDescription(){
            if (this.equals(Season.SUMMER)){
                return "Warm season";
            }
            return "Cold season";
        }
}


