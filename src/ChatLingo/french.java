package ChatLingo;
import java.util.Scanner;
import java.util.Random;

public class french extends Language{
    String[][][] frenchWordsWithTranslationsAndLevels = {
            // Beginner Level
            {
                    {"Bonjour", "Hello"},
                    {"Au revoir", "Goodbye"},
                    {"S'il vous plaît", "Please"},
                    {"Merci", "Thank you"},
                    {"Oui/Non", "Yes/No"}
            },
            // Intermediate Level
            {
                    {"Converser", "Converse"},
                    {"Comprendre", "Comprehend"},
                    {"Éloquent", "Eloquent"},
                    {"Prononciation", "Pronunciation"},
                    {"Vocabulaire", "Vocabulary"}
            },
            // Advanced Level
            {
                    {"Fluidité", "Fluency"},
                    {"Bilingue", "Bilingual"},
                    {"Polyglotte", "Polyglot"},
                    {"Linguistique", "Linguistics"},
                    {"Idiomatique", "Idiomatic"}
            }
    };

    private static final String[][][] frenchGrammarModule = {
            // Nouns and Articles
            {
                    {"Le chat", "The cat (masculine)"},
                    {"Un chien", "A dog (masculine)"},
                    {"Une pomme", "An apple (feminine)"}
            },

            // Subject Pronouns
            {
                    {"Je", "I"},
                    {"Tu", "You (informal)"},
                    {"Il/Elle", "He/She"},
                    {"Nous", "We"},
                    {"Vous", "You (formal or plural)"},
                    {"Ils/Elles", "They"}
            },

            // Verbs 'Être' (To Be)
            {
                    {"Je suis", "I am"},
                    {"Tu es", "You are (informal)"},
                    {"Il/Elle est", "He/She is"},
                    {"Nous sommes", "We are"},
                    {"Vous êtes", "You are (formal or plural)"},
                    {"Ils/Elles sont", "They are"}
            },

            // Verbs 'Avoir' (To Have)
            {
                    {"J'ai", "I have"},
                    {"Tu as", "You have (informal)"},
                    {"Il/Elle a", "He/She has"},
                    {"Nous avons", "We have"},
                    {"Vous avez", "You have (formal or plural)"},
                    {"Ils/Elles ont", "They have"}
            },

            // Basic Sentence Structure
            {
                    {"Je mange une pomme (Subject + Verb + Object)", "I eat an apple."}
            }
    };

    private static final String[] frenchSectionTitles = {"Nouns and Articles", "Subject Pronouns", "Verbs 'Être' (To Be)", "Verbs 'Avoir' (To Have)", "Basic Sentence Structure"};
    int score;
    public void BeginnerLevel(){
        System.out.println("\n***** Beginner French Words *****\n");
        for (String[] wordPair : frenchWordsWithTranslationsAndLevels[0]) {
            System.out.println(wordPair[0] + " - " + wordPair[1]);
        }
    }

    public void IntermediateLevel(){
        System.out.println("\n***** Intermediate French Words *****\n");
        for (String[] wordPair : frenchWordsWithTranslationsAndLevels[1]) {
            System.out.println(wordPair[0] + " - " + wordPair[1]);
        }
    }

    public void AdvancedLevel(){
        System.out.println("\n***** Advanced French Words *****\n");
        for (String[] wordPair : frenchWordsWithTranslationsAndLevels[2]) {
            System.out.println(wordPair[0] + " - " + wordPair[1]);
        }
    }

    public void GrammarPractice(){
        System.out.println("\n******************************************************************************************");
        for (int i = 0; i < frenchGrammarModule.length; i++) {
            System.out.println("[" + frenchSectionTitles[i] + "]");
            for (String[] topic : frenchGrammarModule[i]) {
                for (int j = 0; j < topic.length; j += 2) {
                    String french = topic[j];
                    String english = topic[j + 1];
                    System.out.print("French: " + french + "\t\t\t");
                    System.out.println("English: " + english);
                }
            }
            System.out.println();
        }
        System.out.println("******************************************************************************************");
    }

    public void TakeQuiz(){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        score = 0;

        boolean[] usedWordIndices = new boolean[frenchWordsWithTranslationsAndLevels[0].length];
        boolean[] usedGrammarIndices = new boolean[frenchGrammarModule.length];

        // Quiz for basic words and translations
        System.out.println("\n******************** French Basic Word Quiz ********************");
        for (int i = 0; i < 5; i++) {
            int randomIndex;
            do {
                randomIndex = random.nextInt(frenchWordsWithTranslationsAndLevels[0].length);
            } while (usedWordIndices[randomIndex]);

            usedWordIndices[randomIndex] = true;

            String[] wordPair = frenchWordsWithTranslationsAndLevels[0][randomIndex];
            System.out.println("\nTranslate: " + wordPair[0]);
            String userTranslation = sc.nextLine().trim();
            if (userTranslation.equalsIgnoreCase(wordPair[1])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + wordPair[1]);
            }
        }

        // Quiz for grammar
        System.out.println("\n\n******************** French Grammar Quiz ********************");
        for (int i = 0; i < 5; i++) {
            int randomIndex;
            do {
                randomIndex = random.nextInt(frenchGrammarModule.length);
            } while (usedGrammarIndices[randomIndex]);

            usedGrammarIndices[randomIndex] = true;

            String[] sentencePair = frenchGrammarModule[randomIndex][0];
            System.out.println("\nTranslate: " + sentencePair[1]);
            String userTranslation = sc.nextLine().trim();
            if (userTranslation.equalsIgnoreCase(sentencePair[0])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + sentencePair[0]);
            }
        }

        System.out.println("\nQUIZ COMPLETE! YOUR SCORE: " + score + " OUT OF 10");
    }
    public int getScore(){
        return score;
    }
}