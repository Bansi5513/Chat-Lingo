package ChatLingo;

public class hindi extends Language{
    private static String[][][] hindiWordsWithTranslationsAndLevels = {
            // Beginner Level
            {
                    {"Hello", "नमस्ते (Namaste)"},
                    {"Goodbye", "अलविदा (Alvida)"},
                    {"Please", "कृपया (Kripya)"},
                    {"Thank you", "धन्यवाद (Dhanyavad)"},
                    {"Yes/No", "हाँ/नहीं (Haan/Nahin)"}
            },
            // Intermediate Level
            {
                    {"Converse", "बातचीत करना (Baatcheet karna)"},
                    {"Comprehend", "समझना (Samajhna)"},
                    {"Eloquent", "वाचागत (Vachagat)"},
                    {"Pronunciation", "उच्चारण (Uccharan)"},
                    {"Vocabulary", "शब्दावली (Shabdaavali)"}
            },
            // Advanced Level
            {
                    {"Fluency", "धाराप्रवाह (Dhara pravah)"},
                    {"Bilingual", "द्विभाषिक (Dvibhaashik)"},
                    {"Polyglot", "बहुभाषी (Bahubhaashi)"},
                    {"Linguistics", "भाषाशास्त्र (Bhaasha shastra)"},
                    {"Idiomatic", "अक्ख़द (Akkhad)"}
            }
    };
    public void BeginnerLevel(){
        System.out.println("\nBeginner Hindi Words:\n");
        for (String[] wordPair : hindiWordsWithTranslationsAndLevels[0]) {
            System.out.println(wordPair[0] + " - " + wordPair[1]);
        }
    };
    public void IntermediateLevel(){
        System.out.println("\nIntermediate Hindi Words:\n");
        for (String[] wordPair : hindiWordsWithTranslationsAndLevels[1]) {
            System.out.println(wordPair[0] + " - " + wordPair[1]);
        }
    };
    public void AdvancedLevel(){
        System.out.println("\nAdvanced Hindi Words:\n");
        for (String[] wordPair : hindiWordsWithTranslationsAndLevels[2]) {
            System.out.println(wordPair[0] + " - " + wordPair[1]);
        }
    };
}
