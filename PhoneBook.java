import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean loop=true;
        int[] numbers=new int[10];
        String[] names=new String[10];
        int id =0;
        System.out.println("Welcome To This Application");

        System.out.println("..........................");

        do {
            System.out.println("1:Add Phone");
            System.out.println("2:Show");
            System.out.println("3:Exit");
            System.out.println("Please Enter Number From Menu");
            int select = scanner.nextInt();

            if (select == 1) {
                System.out.println("enter number :");
                numbers[id]=scanner.nextInt();
                System.out.println("enter name :");
                names[id]=scanner.next();
                id++;
                System.out.println("your data saved");

            } else if (select==2) {

                for(int i=0 ; i<id ; i++){
                    System.out.println(i +": number "+ names[i] + "  is :" + numbers[i]);
                }

            }
            else {
                loop=false;
            }


        }
        while (loop);
    }
    }




