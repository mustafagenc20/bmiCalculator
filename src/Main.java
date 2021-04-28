public class Main {

    public static void main(String[] args) {

//        age of user
//        int age = 15;
//        based on user age: print age group
//        < 2 years >> baby
//        2 <> 12 >> kind
//        12 <> 18 >> tiener
//        18+ >> volwassene
//        if (age < 2) System.out.println("You are a baby");
//        if (age >= 2 && age < 12) System.out.println("You are a child");
//        if (age >= 12 && age < 18) System.out.println("You are a teenager (and a pain in the ass)");
//        if (age >= 18) System.out.println("You are a adult");

//        if (age < 2) System.out.println("You are a baby");
//        else{
//            if (age < 12) System.out.println("You are a child");
//            else{
//                if (age < 18) System.out.println("You are a teenager (and a pain in the ass)");
//                else System.out.println("You are a adult");
//            }
//        }





//        --------------------------------------------------------------------------------------------
////      Input > weight, height
//        double height = 1.50;
//        int weight = 150;
//
////      calculate BMI > w / (h * h)
//        double BMI = weight / (height * height);
//
//
////      output stuff based on BMI
//        if (BMI < 20) System.out.println("ondergewicht");
//        else {
//            if (BMI < 25) System.out.println("ok");
//            else {
//                if (BMI < 30) System.out.println("overgewicht");
//                else {
//                    if (BMI < 40) System.out.println("obesitas");
//                    else
//                        System.out.println("ziekelijk overgewicht");
//                }
//            }
//        }
//        System.out.println("Uw BMI: " + BMI);
//        --------------------------------------------------------------------------------------------

//        int a; // int a = (b > 5) ? 2 * b : 3 * b;
//        int b = 10;
//
//        if (b > 5) a =2 * b;
//        else a = 3 * b;
//        System.out.println(a);

//        --------------------------------------------------------------------------------------------


//        int month = 8;
//
//        if (month == 1) System.out.println("January has 31 days");
//        if (month == 2) System.out.println("February has 28 or 29 days");
//        if (month == 3) System.out.println("March has 31 days");
//        //....
//        if (month == 12) System.out.println("December has 31 days");


//        USTTEKEI KOD YERINE

        int month = 8;
        switch (month){
            case 1:
                System.out.println("January has 31 days"); break;
            case 2:
                System.out.println("February has 28 or 29 days"); break;
            case 3:
                System.out.println("March has 31 days"); break;
        }
//        --------------------------------------------------------------------------------------------
        int month = 8;
        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("Het is winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Het is lente");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Het is zomer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Het is herfst");
                break;



        }


    }
}
