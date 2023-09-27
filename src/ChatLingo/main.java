package ChatLingo;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to the Language Chatbot!");

        UserInfo user1 = new UserInfo();
        user1.start();

        LanguageLearningModule module = new LanguageLearningModule();
        module.start();
        module.selectLanguage();
        String lang = module.langLearn;
        String Level = module.level;

        if (lang != null && !lang.isEmpty()  &&  Level != null && !Level.isEmpty()) {
            Language languageInstance = null;


            if (lang.equalsIgnoreCase("spanish")) {
                languageInstance = new spanish();
            } else if (lang.equalsIgnoreCase("french")) {
                languageInstance = new french();
            }else if (lang.equalsIgnoreCase("german")) {
                languageInstance = new german();
            }else if (lang.equalsIgnoreCase("chinese")) {
                languageInstance = new chinese();
            }else if (lang.equalsIgnoreCase("hindi")) {
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
                    System.out.println("Invalid level input.");
                }
            }
        }


    }
}