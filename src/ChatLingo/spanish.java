package ChatLingo;

import java.util.Random;
import java.util.Scanner;

class spanish extends Language{
    private static final String[][][] spanishWordsWithTranslationsAndLevels = {
            // Beginner Level
            {
                    {"Hola", "Hello"},
                    {"Adiós", "Goodbye"},
                    {"Por favor", "Please"},
                    {"Gracias", "Thank you"},
                    {"Sí/No", "Yes/No"}
            },
            // Intermediate Level
            {
                    {"Conversar", "Converse"},
                    {"Comprender", "Comprehend"},
                    {"Elocuente", "Eloquent"},
                    {"Pronunciación", "Pronunciation"},
                    {"Vocabulario", "Vocabulary"}
            },
            // Advanced Level
            {
                    {"Fluidez", "Fluency"},
                    {"Bilingüe", "Bilingual"},
                    {"Políglota", "Polyglot"},
                    {"Lingüística", "Linguistics"},
                    {"Idiomático", "Idiomatic"}
            }
    };

    private static final String[][][] spanishGrammarModule = {
            // Nouns and Articles
            {
                    {"El gato", "The cat (masculine)"},
                    {"Un perro", "A dog (masculine)"},
                    {"Una manzana", "An apple (feminine)"}
            },

            // Subject Pronouns
            {
                    {"Yo", "I"},
                    {"Tú", "You (informal)"},
                    {"Él/ella", "He/She"},
                    {"Nosotros/nosotras", "We"},
                    {"Vosotros/vosotras", "You (informal plural)"},
                    {"Ellos/ellas", "They"}
            },

            // Verbs 'Ser' (To Be)
            {
                    {"Soy", "I am"},
                    {"Eres", "You are (informal)"},
                    {"Es", "He/She is"},
                    {"Somos", "We are"},
                    {"Sois", "You are (informal plural)"},
                    {"Son", "They are"}
            },

            // Verbs 'Tener' (To Have)
            {
                    {"Tengo", "I have"},
                    {"Tienes", "You have (informal)"},
                    {"Tiene", "He/She has"},
                    {"Tenemos", "We have"},
                    {"Tenéis", "You have (informal plural)"},
                    {"Tienen", "They have"}
            },

            // Basic Sentence Structure
            {
                    {"Yo como una manzana (Subject + Verb + Object)", "I eat an apple."}
            }
    };

    private static final String[] spanishSectionTitles = {"Nouns and Articles", "Subject Pronouns", "Verbs 'Ser' (To Be)", "Verbs 'Tener' (To Have)", "Basic Sentence Structure"};
    int score;
    public void BeginnerLevel(){
        System.out.println("\n***** Beginner Spanish Words *****\n");
        for (String[] wordPair : spanishWordsWithTranslationsAndLevels[0]) {
            System.out.println(wordPair[0] + " - " + wordPair[1]);
        }
    }

    public void IntermediateLevel(){
        System.out.println("\n***** Intermediate Spanish Words *****\n");
        for (String[] wordPair : spanishWordsWithTranslationsAndLevels[1]) {
            System.out.println(wordPair[0] + " - " + wordPair[1]);
        }
    }

    public void AdvancedLevel(){
        System.out.println("\n***** Advanced Spanish Words *****\n");
        for (String[] wordPair : spanishWordsWithTranslationsAndLevels[2]) {
            System.out.println(wordPair[0] + " - " + wordPair[1]);
        }
    }

    public void GrammarPractice(){
        System.out.println("\n******************************************************************************************");
        for (int i = 0; i < spanishGrammarModule.length; i++) {
            System.out.println("[" + spanishSectionTitles[i] + "]");
            for (String[] topic : spanishGrammarModule[i]) {
                for (int j = 0; j < topic.length; j += 2) {
                    String spanish = topic[j];
                    String english = topic[j + 1];
                    System.out.print("Spanish: " + spanish + "\t\t\t");
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

        boolean[] usedWordIndices = new boolean[spanishWordsWithTranslationsAndLevels[0].length];
        boolean[] usedGrammarIndices = new boolean[spanishGrammarModule.length];

        // Quiz for basic words and translations
        System.out.println("\n******************** Spanish Basic Word Quiz ********************");
        for (int i = 0; i < 5; i++) {
            int randomIndex;
            do {
                randomIndex = random.nextInt(spanishWordsWithTranslationsAndLevels[0].length);
            } while (usedWordIndices[randomIndex]);

            usedWordIndices[randomIndex] = true;

            String[] wordPair = spanishWordsWithTranslationsAndLevels[0][randomIndex];
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
        System.out.println("\n\n******************** Spanish Grammar Quiz ********************");
        for (int i = 0; i < 5; i++) {
            int randomIndex;
            do {
                randomIndex = random.nextInt(spanishGrammarModule.length);
            } while (usedGrammarIndices[randomIndex]);

            usedGrammarIndices[randomIndex] = true;

            String[] sentencePair = spanishGrammarModule[randomIndex][0];
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