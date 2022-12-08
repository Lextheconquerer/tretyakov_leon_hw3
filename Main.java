public class Main {
    public static void main(String[] args) {
        System.out.println(ageOfMan(14,10));
        System.out.println(ageOfMan(22,-5));
        System.out.println(ageOfMan(12,-4));
        System.out.println(ageOfMan(13,-3));
        System.out.println(ageOfMan(14,-2));

    }

     public static String ageOfMan(int age, int temperature) {
        if (age>20&& age<45&& temperature>-20&& temperature<30) {
            return "Можно идти гулять";
        }
        else if (age<20&& temperature>0&& temperature<28
            return "Можно идти гулять";
        }
        else if (age>45&& temperature>-10 && temperature<25) {
            return "Можно идти гулять";

        }
        else {
            return "Оставайтесь дома";
        }







    }
}