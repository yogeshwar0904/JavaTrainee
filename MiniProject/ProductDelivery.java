import java.util.Scanner;

// Here we created the application for  purchase watches on online.

public class ProductDelivery {

    public static void main(String[] args) {
        System.out.println(" Welcome to watches world");
        Scanner purchase = new Scanner(System.in);
        System.out.println("\n Please enter your login Id");
        int loginId = purchase.nextInt();
        System.out.println("Please enter your password");
        String passWord = purchase.next();
        System.out.println("Available branded product \n1.Titan( ID = 199) \n2.Fastrack(ID = 991)"  
                              + "\n3.Sonata(ID = 919) \n4.apple(ID = 999)");
        System.out.println(" \n Please enter brand Id you want");
        int brandId = purchase.nextInt();

        if(brandId == 199) {
            System.out.println(" \n Titan models are \n1.classicBlack(modelNo = 333) \n2.thinBlackleather(modelNo = 335)"
                                       + "\n3.casioEdificewhite(modelNo = 337) \n4.ulatrathin(modelNo = 339)");

            System.out.println("Please enter modelNo you want");
            int modelNo= purchase.nextInt();

            switch(modelNo) {
            case 333:
                System.out.println("prize is Rs:6,600 \n 30% Off \n offer prise Rs:4,620");
                break;

            case 335:
                System.out.println("prize is Rs:9,000 \n 50% Off \n offer prise Rs:4,500");
                break;
               
            case 337:
                System.out.println("prize is Rs:20,000 \n 10% Off \n offer prise Rs:18,000");
                break;

            case 339:
                System.out.println("prize is Rs:15,000 \n 10% Off \n offer prise Rs:9,000");
                break;

            default :
                System.out.println("The enterd model no is Invalid!!!!");
                break;
            }
        } else if( brandId == 991 ) {
            System.out.println("Fastrack models are \n1.classicNew(modelNo = 433) \n2.thinWhiteleather(modelNo = 435)"
                                   + "\n3.casioEdificewhite(modelNo = 437) \n4.ulatrathin(modelNo = 439)");
            System.out.println("Please enter modelNo you want");
            int modelNo= purchase.nextInt();

            switch(modelNo) {
            case 433:
                System.out.println("prize is Rs:7,000 \n 30% Off \n offer prise Rs:4,900");
                break;

            case 435:
                System.out.println("prize is Rs:18,000 \n 50% Off \n offer prise Rs:9000");
                break;
               
            case 437:
                System.out.println("prize is Rs:40,000 \n 30% Off \n offer prise Rs:28,000");
                break;

            case 439:
                System.out.println("prize is Rs:15,000 \n 10% Off \n offer prise Rs:13,500");
                break;

            default :
                System.out.println("The enterd model no is Invalid!!!!");
                break;
            }
        } else if( brandId == 919 ) {
            System.out.println("Sonata models are \n1.basic(modelNo = 533) \n2.leatherView.(modelNo = 535)"
                                   + "\n3.goldYellow(modelNo = 537) \n4.ulatrathin(modelNo = 539)");
            System.out.println("Please enter modelNo you want");
            int modelNo= purchase.nextInt();

            switch(modelNo) {
            case 533:
                System.out.println("prize is Rs:6,000 \n 30% Off \n offer prise Rs:4,200");
                break;

            case 535:
                System.out.println("prize is Rs:5,000 \n 50% Off \n offer prise Rs:2,500");
                break;
               
            case 537:
                System.out.println("prize is Rs:8,000 \n 30% Off \n offer prise Rs:5,900");
                break;

            case 539:
                System.out.println("prize is Rs:15,000 \n 10% Off \n offer prise Rs:13,500");
                break;

            default :
                System.out.println("The enterd model no is Invalid!!!!");
                break;
            }
        } else if(brandId == 999) {
            System.out.println("Apple models are \n1.digital(modelNo = 633) \n2.leatherView.(modelNo = 635)"
                                   + "\n3.goldYellow(modelNo = 637) \n4.ulatrathin(modelNo = 639)");
            System.out.println("Please enter modelNo you want");
            int modelNo= purchase.nextInt();

            switch(modelNo) {
            case 633:
                System.out.println("prize is Rs:45,000 \n 30% Off \n offer prise Rs:31,500");
                break;

            case 635:
                System.out.println("prize is Rs:70,000 \n 50% Off \n offer prise Rs:35,000");
                break;
               
            case 637:
                System.out.println("prize is Rs:90,000 \n 30% Off \n offer prise Rs:63,000");
                break;

            case 639:
                System.out.println("prize is Rs:30,000 \n 10% Off \n offer prise Rs:27,000");
                break;

            default :
                System.out.println("The enterd model no is Invalid!!!!");
                break;
            }
        } else {
            System.out.println("The enterd brandId is Invalid!!!!");  
        }
        int entireModelno [] = {333,335,337,339,433,435,437,439,533,535,537,539,633,635,637,639};
        
        for(int model = 0; model < entireModelno.length; model++) {
            System.out.println("confirm the watche you need \n==> please enter modele no ");
            int confirmModelno = purchase.nextInt();     
        
            if(confirmModelno == 333) {
                System.out.println("prize is Rs:6,600 \n 30% Off \n");
                    
    }
}
