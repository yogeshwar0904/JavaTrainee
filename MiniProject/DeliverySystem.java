/** 
 *Here we created the application for  purchase watches on online.
 *we have four branded luxary watches each brand mensioned with
 *unique code.
 */ 

import java.util.Scanner;


public class DeliverySystem {
    public static void main(String[] args) {
        System.out.println(" Welcome to watches world");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Please enter your login Id");
        int loginId = scanner.nextInt();
        System.out.println("Please enter your password");
        String passWord = scanner.next();
        final  int TITAN = 199;
        final  int FASTRACK = 991;
        final  int SONATA = 919;
        final  int APPLE = 999;
        final  int TITAN_CLASSICBLACK = 333;
        final  int TITAN_THINBLACKLEATHER = 335;
        final  int TITAN_CASIOEDIFICE = 337;
        final  int TITAN_ULTRATHIN = 339;
        final  int FASTRACK_CLASSICNEW = 433;
        final  int FASTRACK_THINWHITELEATHER = 435;
        final  int FASTRACK_CASIOEDIFICEWHITE = 437;
        final  int FASTRACK_THINWHITE = 439;
        final  int SONATA_BASIC = 533;
        final  int SONATA_LEATHERBLACK = 535;
        final  int SONATA_GOLDYELLOW= 537;
        final  int SONATA_ULTRATHIN = 539;
        final  int APPLE_ULTRATHIN = 633;
        final  int APPLE_LEATHERBROWN = 635;
        final  int APPLE_GOLDYELLOW = 637;
        final  int APPLE_CLASIC= 639;
        System.out.println("Available branded product"
                              + "\n1.Titan( ID = 199)"
                              + "\n2.Fastrack(ID = 991)" 
                              + "\n3.Sonata(ID = 919)" 
                              + "\n4.apple(ID = 999)");
        System.out.println(" \n Please enter brand Id you want");
        int brandId = scanner.nextInt();
 
        if (brandId == TITAN) {
            System.out.println("\n Titan models are" 
                                 + "\n1.modelNumber = 333"
                                 + "\n2.modelNumber = 335"
                                 + "\n3.modelNumber = 337" 
                                 + "\n4.modelNumber = 339");
            System.out.println("Please enter model number you want");
            int modelNumber= scanner.nextInt();

            switch (modelNumber) {
            case TITAN_CLASSICBLACK:
                System.out.println("prize is Rs:6,600 \n 30% Off \n offer prise Rs:4,620");
                break;

            case TITAN_THINBLACKLEATHER:
                System.out.println("prize is Rs:9,000 \n 50% Off \n offer prise Rs:4,500");
                break;
               
            case TITAN_CASIOEDIFICE:
                System.out.println("prize is Rs:20,000 \n 10% Off \n offer prise Rs:18,000");
                break;

            case TITAN_ULTRATHIN:
                System.out.println("prize is Rs:15,000 \n 10% Off \n offer prise Rs:9,000");
                break;

            default :
                System.out.println("The enterd model no is Invalid!!!!");
                break;
            }
        } else if (brandId == FASTRACK) {
            System.out.println("Fastrack models are" 
                                 + "\n1.modelNumber = 433"
                                 + "\n2.modelNumber = 435"
                                 + "\n3.modelNumber = 437" 
                                 + "\n4.modelNumber = 439");
            System.out.println("Please enter modle name you want");
            int modelNumber = scanner.nextInt();
            
            switch (modelNumber) {
            case FASTRACK_CLASSICNEW:
                System.out.println("prize is Rs:7,000 \n 30% Off \n offer prise Rs:4,900");
                break;

            case FASTRACK_THINWHITELEATHER:
                System.out.println("prize is Rs:18,000 \n 50% Off \n offer prise Rs:9000");
                break;
               
            case FASTRACK_CASIOEDIFICEWHITE:
                System.out.println("prize is Rs:40,000 \n 30% Off \n offer prise Rs:28,000");
                break;

            case FASTRACK_THINWHITE:
                System.out.println("prize is Rs:15,000 \n 10% Off \n offer prise Rs:13,500");
                break;

            default :
                System.out.println("The enterd model name is Invalid!!!!");
                break;
            }
        } else if (brandId == SONATA) {
            System.out.println("Sonata models are"
                                 + "\n1.modelName = 533"
                                 + "\n2.modelName = 535"
                                 + "\n3.modelName = 537" 
                                 + "\n4.modelName = 539");
            System.out.println("Please enter modelNo you want");
            int modelNumber = scanner.nextInt();

            switch (modelNumber) {
            case SONATA_BASIC:
                System.out.println("prize is Rs:6,000 \n 30% Off \n offer prise Rs:4,200");
                break;

            case SONATA_LEATHERBLACK:
                System.out.println("prize is Rs:5,000 \n 50% Off \n offer prise Rs:2,500");
                break;
               
            case SONATA_GOLDYELLOW:
                System.out.println("prize is Rs:8,000 \n 30% Off \n offer prise Rs:5,900");
                break;

            case SONATA_ULTRATHIN:
                System.out.println("prize is Rs:15,000 \n 10% Off \n offer prise Rs:13,500");
                break;

            default :
                System.out.println("The enterd model no is Invalid!!!!");
                break;
            }
        } else if (brandId == APPLE) {
            System.out.println("Apple models are" 
                                 + "\n1.modelName = 633"
                                 + "\n2.modelName = 635"
                                 + "\n3.modelName = 637" 
                                 + "\n4.modelName = 639");
            System.out.println("Please enter model Number you want");
            int modelnumber = scanner.nextInt();

            switch (modelnumber) {
            case APPLE_ULTRATHIN:
                System.out.println("prize is Rs:45,000 \n 30% Off \n offer prise Rs:31,500");
                break;

            case APPLE_LEATHERBROWN:
                System.out.println("prize is Rs:70,000 \n 50% Off \n offer prise Rs:35,000");
                break;
               
            case APPLE_GOLDYELLOW:
                System.out.println("prize is Rs:90,000 \n 30% Off \n offer prise Rs:63,000");
                break;

            case APPLE_CLASIC:
                System.out.println("prize is Rs:30,000 \n 10% Off \n offer prise Rs:27,000");
                break;

            default :
                System.out.println("The enterd model no is Invalid!!!!");
                break;
            }
         } else {
                System.out.println("The enterd brandId is Invalid!!!!");  
         }

         int entireModelnumber [] = {333,335,337,339,433,435,437,
                                        439,533,535,537,539,633,635,637,639};
        
            for (int model = 0; model < entireModelnumber.length; model++) {
                System.out.println("confirm the watche you need \n==> please enter modele no ");
                int confirmModelno = scanner.nextInt();     
        
                if (confirmModelno == 333) {
                    System.out.println("prize is Rs:6,600 \n 30% Off \n");
                }
            }            
        }
    }
