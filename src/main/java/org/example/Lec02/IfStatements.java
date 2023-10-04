package org.example.Lec02;

public class IfStatements {
    public static void main(String[] args) {
        boolean isNucaTeenager = true;
        boolean isLukaBelow25 = true;
        boolean isGiorgiYoung = false;

//        if (isNucaTeenager) {
//            System.out.println("Nuca is Teenager");
//        }
//        else if (isLukaBelow25)
//        {
//            System.out.println("Luka is below 25 years of age");
//        }
//        else if (isGiorgiYoung) {
//            System.out.println("Giorgi is young");
//        }
//        else {
//            System.out.println("Neither of them is teenager or below 25");
//        }

// *********************************************************************************
//        if (isNucaTeenager) {
//            System.out.println("Nuca is Teenager");
//        }
//         if (isLukaBelow25)
//        {
//            System.out.println("Luka is below 25 years of age");
//        }
//         if (isGiorgiYoung) {
//            System.out.println("Giorgi is young");
//        }
//        else {
//            System.out.println("Neither of them is teenager or below 25");
//        }

// *********************************************************************************

        if (isNucaTeenager) {

            if (isLukaBelow25 && isGiorgiYoung) {
                System.out.println("both of them is teenager and below 25");
            }

            else if (!isGiorgiYoung) {
                System.out.println("Giorgi is not young");
            }
            else {
                System.out.println("araferi ar daiwereba");
            }
        }


        //თუ ერთი if მაინც შესრულდა else if მდე მაშინ მეტი აღარაფერი შესრულდება (ეს იმ შემთხვევაში თუ გვაქვს 1 if ბლოკი და დანარჩენი else if და else
        // თუ ერთი if შესრულდა და შემდეგ გვაქვს ჩვეულებრივი if ები, თუ დანარჩენი if ებიც true არის, ეგენიც შესრულდება.
    }
}
