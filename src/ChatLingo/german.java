package ChatLingo;

import java.util.Random;
import java.util.Scanner;

public class german extends Language{
    private static final String[][][] germanWordsWithTranslationsAndLevels = {
            // Beginner Level
            {
                    {"Hallo", "Hello"},
                    {"Auf Wiedersehen", "Goodbye"},
                    {"Bitte", "Please"},
                    {"Danke", "Thank you"},
                    {"Ja/Nein", "Yes/No"}
            },
            // Intermediate Level
            {
                    {"Kommunizieren", "Converse"},
                    {"Verstehen", "Comprehend"},
                    {"Eloquent", "Eloquent"},
                    {"Aussprache", "Pronunciation"},
                    {"Wortschatz", "Vocabulary"}
            },
            // Advanced Level
            {
                    {"Flüssigkeit", "Fluency"},
                    {"Zweisprachig", "Bilingual"},
                    {"Polyglott", "Polyglot"},
                    {"Linguistik", "Linguistics"},
                    {"Idiomatisch", "Idiomatic"}
            }
    };

    private static final String[][][] germanGrammarModule = {
            // Nouns and Articles
            {
                    {"Der Hund", "The dog (masculine)"},
                    {"Die Katze", "The cat (feminine)"},
                    {"Ein Apfel", "An apple (masculine)"},
                    {"Eine Blume", "A flower (feminine)"}
            },

            // Subject Pronouns
            {
                    {"Ich", "I"},
                    {"Du", "You (informal)"},
                    {"Er/sie/es", "He/She/It"},
                    {"Wir", "We"},
                    {"Ihr", "You (informal plural)"},
                    {"Sie", "They/You (formal)"}
            },

            // Verbs 'Sein' (To Be)
            {
                    {"Ich bin", "I am"},
                    {"Du bist", "You are (informal)"},
                    {"Er/sie/es ist", "He/She/It is"},
                    {"Wir sind", "We are"},
                    {"Ihr seid", "You are (informal plural)"},
                    {"Sie sind", "They/You are (formal)"}
            },

            // Verbs 'Haben' (To Have)
            {
                    {"Ich habe", "I have"},
                    {"Du hast", "You have (informal)"},
                    {"Er/sie/es hat", "He/She/It has"},
                    {"Wir haben", "We have"},
                    {"Ihr habt", "You have (informal plural)"},
                    {"Sie haben", "They/You have (formal)"}
            },

            // Basic Sentence Structure
            {
                    {"Ich esse einen Apfel (Subject + Verb + Object)", "I eat an apple."}
            }
    };

    private static final String[] germanSectionTitles = {"Nouns and Articles", "Subject Pronouns", "Verbs 'Sein' (To Be)", "Verbs 'Haben' (To Have)", "Basic Sentence Structure"};
    int score;
    public void BeginnerLevel(){
        System.out.println("\n***** Beginner German Words *****\n");
        for (String[] wordPair : germanWordsWithTranslationsAndLevels[0]) {
            System.out.println(wordPair[0] + " - " + wordPair[1]);
        }
    }
    public void IntermediateLevel(){
        System.out.println("\n***** Intermediate German Words *****\n");
        for (String[] wordPair : germanWordsWithTranslationsAndLevels[1]) {
            System.out.println(wordPair[0] + " - " + wordPair[1]);
        }
    }
    public void AdvancedLevel(){
        System.out.println("\n***** Advanced German Words *****\n");
        for (String[] wordPair : germanWordsWithTranslationsAndLevels[2]) {
            System.out.println(wordPair[0] + " - " + wordPair[1]);
        }
    }
    public void GrammarPractice(){
        System.out.println("\n******************************************************************************************");
        for (int i = 0; i < germanGrammarModule.length; i++) {
            System.out.println("[" + germanSectionTitles[i] + "]");
            for (String[] topic : germanGrammarModule[i]) {
                for (int j = 0; j < topic.length; j += 2) {
                    String german = topic[j];
                    String english = topic[j + 1];
                    System.out.print("German: " + german + "\t\t\t");
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

        boolean[] usedWordIndices = new boolean[germanWordsWithTranslationsAndLevels[0].length];
        boolean[] usedGrammarIndices = new boolean[germanGrammarModule.length];

        // Quiz for basic words and translations
        System.out.println("\n******************** German Basic Word Quiz ********************");
        for (int i = 0; i < 5; i++) {
            int randomIndex;
            do {
                randomIndex = random.nextInt(germanWordsWithTranslationsAndLevels[0].length);
            } while (usedWordIndices[randomIndex]);

            usedWordIndices[randomIndex] = true;

            String[] wordPair = germanWordsWithTranslationsAndLevels[0][randomIndex];
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
        System.out.println("\n\n******************** German Grammar Quiz ********************");
        for (int i = 0; i < 5; i++) {
            int randomIndex;
            do {
                randomIndex = random.nextInt(germanGrammarModule.length);
            } while (usedGrammarIndices[randomIndex]);

            usedGrammarIndices[randomIndex] = true;

            String[] sentencePair = germanGrammarModule[randomIndex][0];
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