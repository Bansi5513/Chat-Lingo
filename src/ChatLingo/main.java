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

        // You can add calls to other methods here based on user's choices
        if (lang != null && !lang.isEmpty()) {

            // further functionalities
        }

    }
}

