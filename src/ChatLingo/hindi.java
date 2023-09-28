package ChatLingo;

import java.util.Random;
import java.util.Scanner;

public class hindi extends Language{
    private static final String[][][] hindiWordsWithTranslationsAndLevels = {
            // Beginner Level
            {
                    {"नमस्ते (Namaste)", "Hello"},
                    {"अलविदा (Alvida)", "Goodbye"},
                    {"कृपया (Kripya)", "Please"},
                    {"धन्यवाद (Dhanyavad)", "Thank you"},
                    {"हाँ/नहीं (Haan/Nahin)", "Yes/No"}
            },
            // Intermediate Level
            {
                    {"बातचीत करना (Baatcheet karna)", "Converse"},
                    {"समझना (Samajhna)", "Comprehend"},
                    {"वाचागत (Vachagat)", "Eloquent"},
                    {"उच्चारण (Uccharan)", "Pronunciation"},
                    {"शब्दावली (Shabdaavali)", "Vocabulary"}
            },
            // Advanced Level
            {
                    {"धाराप्रवाह (Dhara pravah)", "Fluency"},
                    {"द्विभाषिक (Dvibhaashik)", "Bilingual"},
                    {"बहुभाषी (Bahubhaashi)", "Polyglot"},
                    {"भाषाशास्त्र (Bhaasha shastra)", "Linguistics"},
                    {"अक्ख़द (Akkhad)", "Idiomatic"}
            }
    };

    private static final String[][][] hindiGrammarModule = {
            // Nouns and Articles
            {
                    {"बिल्ली (Billi)", "Cat (feminine)"},
                    {"कुत्ता (Kutta)", "Dog (masculine)"},
                    {"सेब (Seb)", "Apple (masculine)"}
            },

            // Subject Pronouns
            {
                    {"मैं (Main)", "I"},
                    {"तुम (Tum)", "You (informal)"},
                    {"वह (Vah)", "He/She"},
                    {"हम (Ham)", "We"},
                    {"आप (Aap)", "You (formal or plural)"},
                    {"वे (Ve)", "They"}
            },

            // Verb 'होना (Hona)' (To Be)
            {
                    {"मैं हूँ (Main hoon)", "I am"},
                    {"तुम हो (Tum ho)", "You are"},
                    {"वह है (Vah hai)", "He/She is"},
                    {"हम हैं (Ham hain)", "We are"},
                    {"आप हैं (Aap hain)", "You are (formal or plural)"},
                    {"वे हैं (Ve hain)", "They are"}
            },

            // Verb 'रखना (Rakhna)' (To Have)
            {
                    {"मेरे पास (Mere paas)", "I have"},
                    {"तेरे पास (Tere paas)", "You have (informal)"},
                    {"उसके पास (Uske paas)", "He/She has"},
                    {"हमारे पास (Hamaare paas)", "We have"},
                    {"आपके पास (Aapke paas)", "You have (formal or plural)"},
                    {"उनके पास (Unke paas)", "They have"}
            },

            // Basic Sentence Structure
            {
                    {"मैं एक सेब खाता/खाती हूँ (Subject + Verb + Object)", "I eat an apple."}
            }
    };

    private static final String[] hindiSectionTitles = {"Nouns and Articles", "Subject Pronouns", "Verb 'होना (Hona)' (To Be)", "Verb 'रखना (Rakhna)' (To Have)", "Basic Sentence Structure"};
    int score;
    public void BeginnerLevel(){
        System.out.println("\n***** Beginner Hindi Words *****\n");
        for (String[] wordPair : hindiWordsWithTranslationsAndLevels[0]) {
            System.out.println(wordPair[0] + " - " + wordPair[1]);
        }
    }
    public void IntermediateLevel(){
        System.out.println("\n***** Intermediate Hindi Words *****\n");
        for (String[] wordPair : hindiWordsWithTranslationsAndLevels[1]) {
            System.out.println(wordPair[0] + " - " + wordPair[1]);
        }
    }
    public void AdvancedLevel(){
        System.out.println("\n***** Advanced Hindi Words *****\n");
        for (String[] wordPair : hindiWordsWithTranslationsAndLevels[2]) {
            System.out.println(wordPair[0] + " - " + wordPair[1]);
        }
    }
    public void GrammarPractice(){
        System.out.println("\n******************************************************************************************");
        for (int i = 0; i < hindiGrammarModule.length; i++) {
            System.out.println("[" + hindiSectionTitles[i] + "]");
            for (String[] topic : hindiGrammarModule[i]) {
                for (int j = 0; j < topic.length; j += 2) {
                    String hindi = topic[j];
                    String english = topic[j + 1];
                    System.out.print("Hindi: " + hindi + "\t\t\t");
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

        boolean[] usedWordIndices = new boolean[hindiWordsWithTranslationsAndLevels[0].length];
        boolean[] usedGrammarIndices = new boolean[hindiGrammarModule.length];

        // Quiz for basic words and translations
        System.out.println("\n******************** Hindi Basic Word Quiz ********************");
        for (int i = 0; i < 5; i++) {
            int randomIndex;
            do {
                randomIndex = random.nextInt(hindiWordsWithTranslationsAndLevels[0].length);
            } while (usedWordIndices[randomIndex]);

            usedWordIndices[randomIndex] = true;

            String[] wordPair = hindiWordsWithTranslationsAndLevels[0][randomIndex];
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
        System.out.println("\n******************** Hindi Grammar Quiz ********************");
        for (int i = 0; i < 5; i++) {
            int randomIndex;
            do {
                randomIndex = random.nextInt(hindiGrammarModule.length);
            } while (usedGrammarIndices[randomIndex]);

            usedGrammarIndices[randomIndex] = true;

            String[] sentencePair = hindiGrammarModule[randomIndex][0];
            System.out.println("\nTranslate: \n" + sentencePair[0]);
            String userTranslation = sc.nextLine().trim();
            if (userTranslation.equalsIgnoreCase(sentencePair[1])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + sentencePair[1]);
            }
        }

        System.out.println("\nQUIZ COMPLETE! YOUR SCORE: " + score + " OUT OF 10");
    }

    public int getScore(){
        return score;
    }
}