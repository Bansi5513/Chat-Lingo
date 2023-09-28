package ChatLingo;

import java.util.Random;
import java.util.Scanner;

public class chinese extends Language{
    private static final String[][][] chineseWordsWithTranslationsAndLevels = {
            // Beginner Level
            {
                    {"你好 (Nǐ hǎo)", "Hello"},
                    {"再见 (Zàijiàn)", "Goodbye"},
                    {"请 (Qǐng)", "Please"},
                    {"谢谢 (Xièxiè)", "Thank you"},
                    {"是/不是 (Shì/Bù shì)", "Yes/No"}
            },
            // Intermediate Level
            {
                    {"交谈 (Jiāotán)", "Converse"},
                    {"理解 (Lǐjiě)", "Comprehend"},
                    {"雄辩 (Xióngbiàn)", "Eloquent"},
                    {"发音 (Fāyīn)", "Pronunciation"},
                    {"词汇 (Cíhuì)", "Vocabulary"}
            },
            // Advanced Level
            {
                    {"流利 (Liúlì)", "Fluency"},
                    {"双语的 (Shuāngyǔ de)", "Bilingual"},
                    {"多语言者 (Duōyǔyán zhě)", "Polyglot"},
                    {"语言学 (Yǔyán xué)", "Linguistics"},
                    {"习语的 (Xíyǔ de)", "Idiomatic"}
            }
    };

    private static final String[][][] chineseGrammarModule = {
            // Nouns and Articles
            {
                    {"猫 (Māo)", "Cat"},
                    {"花 (Huā)", "Flower"},
                    {"狗 (Gǒu)", "Dog"},
                    {"苹果 (Píngguǒ)", "Apple"}
            },

            // Subject Pronouns
            {
                    {"我 (Wǒ)", "I"},
                    {"你 (Nǐ)", "You"},
                    {"他/她 (Tā)", "He/She"},
                    {"我们 (Wǒmen)", "We"},
                    {"你们 (Nǐmen)", "You (plural)"},
                    {"他们/她们 (Tāmen)", "They"}
            },

            // Verb '是 (Shì)' (To Be)
            {
                    {"我是 (Wǒ shì)", "I am"},
                    {"你是 (Nǐ shì)", "You are"},
                    {"他/她是 (Tā shì)", "He/She is"},
                    {"我们是 (Wǒmen shì)", "We are"},
                    {"你们是 (Nǐmen shì)", "You are (plural)"},
                    {"他们/她们是 (Tāmen shì)", "They are"}
            },

            // Verb '有 (Yǒu)' (To Have)
            {
                    {"我有 (Wǒ yǒu)", "I have"},
                    {"你有 (Nǐ yǒu)", "You have"},
                    {"他/她有 (Tā yǒu)", "He/She has"},
                    {"我们有 (Wǒmen yǒu)", "We have"},
                    {"你们有 (Nǐmen yǒu)", "You have (plural)"},
                    {"他们/她们有 (Tāmen yǒu)", "They have"}
            },

            // Basic Sentence Structure
            {
                    {"我吃一个苹果 (Subject + Verb + Object)", "I eat an apple."}
            }
    };

    private static final String[] chineseSectionTitles = {"Nouns and Articles", "Subject Pronouns", "Verb '是 (Shì)' (To Be)", "Verb '有 (Yǒu)' (To Have)", "Basic Sentence Structure"};
    int score;
    public void BeginnerLevel(){
        System.out.println("\n***** Beginner Chinese Words *****\n");
        for (String[] wordPair : chineseWordsWithTranslationsAndLevels[0]) {
            System.out.println(wordPair[0] + " - " + wordPair[1]);
        }
    }

    public void IntermediateLevel(){
        System.out.println("\n***** Intermediate Chinese Words *****\n");
        for (String[] wordPair : chineseWordsWithTranslationsAndLevels[1]) {
            System.out.println(wordPair[0] + " - " + wordPair[1]);
        }
    }

    public void AdvancedLevel(){
        System.out.println("\n***** Advanced Chinese Words *****\n");
        for (String[] wordPair : chineseWordsWithTranslationsAndLevels[2]) {
            System.out.println(wordPair[0] + " - " + wordPair[1]);
        }
    }

    public void GrammarPractice(){
        System.out.println("\n******************************************************************************************");
        for (int i = 0; i < chineseGrammarModule.length; i++) {
            System.out.println("[" + chineseSectionTitles[i] + "]");
            for (String[] topic : chineseGrammarModule[i]) {
                for (int j = 0; j < topic.length; j += 2) {
                    String chinese = topic[j];
                    String english = topic[j + 1];
                    System.out.print("Chinese: " + chinese + "\t\t\t");
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

        boolean[] usedWordIndices = new boolean[chineseWordsWithTranslationsAndLevels[0].length];
        boolean[] usedGrammarIndices = new boolean[chineseGrammarModule.length];

        // Quiz for basic words and translations
        System.out.println("\n******************** Chinese Basic Word Quiz ********************");
        for (int i = 0; i < 5; i++) {
            int randomIndex;
            do {
                randomIndex = random.nextInt(chineseWordsWithTranslationsAndLevels[0].length);
            } while (usedWordIndices[randomIndex]);

            usedWordIndices[randomIndex] = true;

            String[] wordPair = chineseWordsWithTranslationsAndLevels[0][randomIndex];
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
        System.out.println("\n******************** Chinese Grammar Quiz ********************");
        for (int i = 0; i < 5; i++) {
            int randomIndex;
            do {
                randomIndex = random.nextInt(chineseGrammarModule.length);
            } while (usedGrammarIndices[randomIndex]);

            usedGrammarIndices[randomIndex] = true;

            String[] sentencePair = chineseGrammarModule[randomIndex][0];
            System.out.println("\nTranslate: ");
            System.out.println(sentencePair[0]);
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