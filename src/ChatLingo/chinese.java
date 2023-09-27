package ChatLingo;

public class chinese extends Language{
    private static String[][][] chineseWordsWithTranslationsAndLevels = {
            // Beginner Level
            {
                    {"Hello", "你好 (Nǐ hǎo)"},
                    {"Goodbye", "再见 (Zàijiàn)"},
                    {"Please", "请 (Qǐng)"},
                    {"Thank you", "谢谢 (Xièxiè)"},
                    {"Yes/No", "是/不是 (Shì/Bù shì)"}
            },
            // Intermediate Level
            {
                    {"Converse", "交谈 (Jiāotán)"},
                    {"Comprehend", "理解 (Lǐjiě)"},
                    {"Eloquent", "雄辩 (Xióngbiàn)"},
                    {"Pronunciation", "发音 (Fāyīn)"},
                    {"Vocabulary", "词汇 (Cíhuì)"}
            },
            // Advanced Level
            {
                    {"Fluency", "流利 (Liúlì)"},
                    {"Bilingual", "双语的 (Shuāngyǔ de)"},
                    {"Polyglot", "多语言者 (Duōyǔyán zhě)"},
                    {"Linguistics", "语言学 (Yǔyán xué)"},
                    {"Idiomatic", "习语的 (Xíyǔ de)"}
            }
    };
    public void BeginnerLevel(){
        System.out.println("\nBeginner Chinese Words:\n");
        for (String[] wordPair : chineseWordsWithTranslationsAndLevels[0]) {
            System.out.println(wordPair[0] + " - " + wordPair[1]);
        }
    };
    public void IntermediateLevel(){
        System.out.println("\nIntermediate Chinese Words:\n");
        for (String[] wordPair : chineseWordsWithTranslationsAndLevels[1]) {
            System.out.println(wordPair[0] + " - " + wordPair[1]);
        }
    };
    public void AdvancedLevel(){
        System.out.println("\nAdvanced Chinese Words:\n");
        for (String[] wordPair : chineseWordsWithTranslationsAndLevels[2]) {
            System.out.println(wordPair[0] + " - " + wordPair[1]);
        }
    };
}
