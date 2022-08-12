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
        final static int TITAN = 199;
        final static int FASTRACK = 991;
        final static int SONATA = 919;
        final static int APPLE = 999;
        final static int TITAN_CLASSICBLACK = 333;
        final static int TITAN_THINBLACKLEATHER = 335;
        final static int TITAN_CASIOEDIFICE = 337;
        final static int TITAN_ULTRATHIN = 339;
        final static int FASTRACK_CLASSICNEW = 433;
        final static int FASTRACK_THINWHITELEATHER = 435;
        final static int FASTRACK_CASIOEDIFICEWHITE = 437;
        final static int FASTRACK_THINWHITE = 439;
        final static int SONATA_BASIC = 533;
        final static int SONATA_LEATHERBLACK = 535;
        final static int SONATA_GOLDYELLOW= 537;
        final static int SONATA_ULTRATHIN = 539;
        final static int APPLE_ULTRATHIN = 633;
        final static int APPLE_LEATHERBROWN = 635;
        final static int APPLE_GOLDYELLOW = 637;
        final static int APPLE_CLASIC= 639;
        System.out.println("Available branded product"
                              + "\n1.Titan( ID = TITAN)"
                              + "\n2.Fastrack(ID = FASTRACK)" 
                              + "\n3.Sonata(ID = SONATA)" 
                              + "\n4.apple(ID = APPLE)");
        System.out.println(" \n Please enter brand Id you want");
        int brandId = scanner.nextInt();
 
        if (brandId == TITAN) {
            System.out.println("\n Titan models are" 
                                 + "\n1.modelName = TITAN_CLASSICBLACK "
                                 + "\n2.modelName = TITAN_THINBLACKLEATHER"
                                 + "\n3.modelName = TITAN_CASIOEDIFICE" 
                                 + "\n4.modelName = TITAN_ULTRATHIN");
            System.out.println("Please enter model name you want");
            int modelName= scanner.nextInt();

            switch (modelName) {
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
                                 + "\n1.modelName = FASTRACK_CLASSICNEW"
                                 + "\n2.modelName = FASTRACK_THINWHITELEATHER"
                                 + "\n3.modelName = FASTRACK_CASIOEDIFICEWHITE" 
                                 + "\n4.modelName = FASTRACK_THINWHITE");
            System.out.println("Please enter modle name you want");
            int modelName = scanner.nextInt();
            
            switch (modelName) {
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
                                 + "\n1.modelName = SONATA_BASIC"
                                 + "\n2.modelName = SONATA_LEATHERBLACK"
                                 + "\n3.modelName = SONATA_GOLDYELLOW" 
                                 + "\n4.modelName = SONATA_ULTRATHIN ");
            System.out.println("Please enter modelNo you want");
            int modelName = scanner.nextInt();

            switch (modelName) {
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
                                 + "\n1.modelName = APPLE_ULTRATHIN"
                                 + "\n2.modelName = APPLE_LEATHERBROWN"
                                 + "\n3.modelName = APPLE_GOLDYELLOW" 
                                 + "\n4.modelName = APPLE_CLASIC");
            System.out.println("Please enter model Name you want");
            int modelName = scanner.nextInt();

            switch (modelname) {
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
        
            for (int model = 0; model < entireModelno.length; model++) {
                System.out.println("confirm the watche you need \n==> please enter modele no ");
                int confirmModelno = scanner.nextInt();     
        
                if (confirmModelno == 333) {
                    System.out.println("prize is Rs:6,600 \n 30% Off \n");
                }
            }            
        }
    }
