import java.util.Scanner;
public class Main{

        public static void main(String[] args){

                Scanner scanner = new Scanner(System.in);

                String superSeniorMan  = "👴";
                String superSeniorWoman  = "🧓";
                String seniorMan  = "👨‍🦳";
                String seniorWoman = "👩‍🦳";
                String adultMan  = "👨";
                String adultWoman  = "👩‍";
                String teenager  = "🧑";
                String girl  = "👧";
                String invalid  = "❌";
                String baby  = "👶";
                String confused  = "😕";



                String name;

                do {
                        System.out.print("Enter your name: ");
                         name = scanner.nextLine();

                        if(name.isEmpty()) {
                                System.out.println("You didn't enter your name! " + confused);
                        }
                } while (name.isEmpty());





                int age = 0;
                String ageInput;

                do {
                        System.out.print("Enter your age: ");
                        ageInput = scanner.nextLine();

                        if (ageInput.isEmpty()) {
                                System.out.println("You didn't enter your age! " + confused);
                        }

                        try {
                                age = Integer.parseInt(ageInput);
                                if (age <= 0 || age > 130) {
                                        System.out.println("Invalid age entered! " + invalid);
                                        ageInput = "";
                                }

                        } catch (NumberFormatException e) {
                                System.out.println("That's not a valid number! " + invalid);
                                ageInput = "";
                        }

                } while (ageInput.isEmpty());


                System.out.print("Are you a student (true/false): ");
                boolean isStudent = scanner.nextBoolean();

                System.out.println("\nHello " + name + "!");

                if(age >= 80){
                        System.out.println("You are a Super Senior Citizen! " + superSeniorMan + "/" + superSeniorWoman);
                }
                else if(age >= 60){
                        System.out.println("You are a Senior Citizen! " + seniorMan + "/" + seniorWoman);
                }
                else if(age >= 18){
                        System.out.println("You are an Adult! " + adultMan + "/" + adultWoman);
                }
                else{
                        System.out.println("You are a Minor! " + teenager + "/" + girl);
                }






                if(isStudent){
                        System.out.println("You are a Student!");
                }
                else{
                        System.out.println("You are NOT a Student!");
                }






                scanner.close();


        }
}