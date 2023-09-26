package ChatLingo;

import java.util.Scanner;

class LanguageLearningModule extends UserInfo{
    Scanner sc = new Scanner(System.in);
    String choice, level, langLearn;

    public void start(){
        System.out.println("\nWelcome to the Language Learning Module!");
        System.out.print("\nAre you learning any language currently or planning to learn a language ? ");
        choice = sc.nextLine();
        if(choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y")){
            System.out.print("\nEnter the language : ");
            langLearn = sc.nextLine();
        }
    }

    public void selectLanguage(){
        if(langLearn != null && !langLearn.isEmpty()){
            System.out.print("\nDo you want to continue to learn " + langLearn + " ? ");
            choice = sc.nextLine();
            if(choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y")){
                System.out.println("Select a level : ");
                System.out.println("1. Beginner Level");
                System.out.println("2. Intermediate Level");
                System.out.println("3. Advanced Level");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        level = "Beginner Level";
                        break;
                    case 2:
                        level = "Intermediate Level";
                        break;
                    case 3:
                        level = "Advanced Level";
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }

            }
            else{
                System.out.print("\nDo you wish to learn another language ? ");
                choice = sc.nextLine();
                if(choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y")){
                    System.out.print("\nEnter the language : ");
                    langLearn = sc.nextLine();
                    System.out.println("Select a level : ");
                    System.out.println("1. Beginner Level");
                    System.out.println("2. Intermediate Level");
                    System.out.println("3. Advanced Level");
                    int choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            level = "Beginner Level";
                            break;
                        case 2:
                            level = "Intermediate Level";
                            break;
                        case 3:
                            level = "Advanced Level";
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                            break;
                    }
                }
            }
        }else{
            System.out.println("\nDo you wish to learn any language ? ");
            choice = sc.nextLine();
            if(choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y")){
                System.out.print("\nEnter the language : ");
                langLearn = sc.nextLine();
                System.out.println("Select a level : ");
                System.out.println("1. Beginner Level");
                System.out.println("2. Intermediate Level");
                System.out.println("3. Advanced Level");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        level = "Beginner Level";
                        break;
                    case 2:
                        level = "Intermediate Level";
                        break;
                    case 3:
                        level = "Advanced Level";
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
        }

    }

    //another method
}