package ChatLingo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String decorativeLine = "=================================================================================================";
        String decorativeLine2 = "------------------------------------------------------------------------------------------------";

        System.out.println("\n" + decorativeLine);
        System.out.println("\t\t\t\t\t  Welcome to ChatLingo - Your Language Learning Chatbot!");
        System.out.println(decorativeLine);

        UserInfo user1 = new UserInfo();
        user1.start();
        String Name = user1.getName();
        String Lang = user1.getLang();

        LanguageLearningModule module = new LanguageLearningModule();
        module.start();
        module.selectLanguage();
        String langLearn = module.getLangLearn();
        String Level = module.getLevel();

        String choice1, choice2;

        if (langLearn != null && !langLearn.isEmpty()  &&  Level != null && !Level.isEmpty()) {
            Language languageInstance = null;


            if (langLearn.equalsIgnoreCase("spanish")) {
                languageInstance = new spanish();
            } else if (langLearn.equalsIgnoreCase("french")) {
                languageInstance = new french();
            }else if (langLearn.equalsIgnoreCase("german")) {
                languageInstance = new german();
            }else if (langLearn.equalsIgnoreCase("chinese")) {
                languageInstance = new chinese();
            }else if (langLearn.equalsIgnoreCase("hindi")) {
                languageInstance = new hindi();
            }else{
                System.out.println("\nSorry! ChatLingo doesn't offer modules for that language.");
            }


            if (languageInstance != null) {
                // Depending on the user's input, call methods on the created object
                if (Level.equalsIgnoreCase("Beginner Level")) {
                    languageInstance.BeginnerLevel();
                } else if (Level.equalsIgnoreCase("Intermediate Level")) {
                    languageInstance.IntermediateLevel();
                } else if (Level.equalsIgnoreCase("Advanced Level")) {
                    languageInstance.AdvancedLevel();
                } else {
                    System.out.println("Invalid level input. Please choose Beginner, Intermediate, or Advanced.");
                }

                System.out.print("\nDo you want to practice grammar for " + langLearn + " [Y/N]? ");
                choice1 = sc.nextLine();
                if(choice1.equalsIgnoreCase("yes") || choice1.equalsIgnoreCase("y")) {
                    languageInstance.GrammarPractice();
                }

                System.out.print("\nDo you want to take a quiz for " + langLearn + " [Y/N]? ");
                choice2 = sc.nextLine();
                if(choice2.equalsIgnoreCase("yes") || choice2.equalsIgnoreCase("y")) {
                    languageInstance.TakeQuiz();
                }

                System.out.println("\n" + decorativeLine2);
                System.out.println("HEllO " + Name.toUpperCase() + " ! Here are your details");
                System.out.println("Language you are comfortable with : " + Lang.toUpperCase());
                System.out.println("Language and the level you choose to learn : [" + langLearn.toUpperCase() + ", " + Level.toUpperCase() + "]");
                if(choice1.equalsIgnoreCase("yes") || choice1.equalsIgnoreCase("y")){
                    System.out.println("You practiced " + langLearn.toUpperCase() + " grammar");
                }
                if(choice2.equalsIgnoreCase("yes") || choice2.equalsIgnoreCase("y")){
                    System.out.println("You took a quiz for " + langLearn.toUpperCase() );
                    int score = languageInstance.getScore();
                    System.out.println("Your score: " + score + "/10");
                }
                System.out.println(decorativeLine2);
            }

        }

    }
}