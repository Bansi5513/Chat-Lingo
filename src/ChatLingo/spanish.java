package ChatLingo;

class spanish extends Language{
    private static String[][][] spanishWordsWithTranslationsAndLevels = {
            // Beginner Level
            {
                    {"Hello", "Hola"},
                    {"Goodbye", "Adiós"},
                    {"Please", "Por favor"},
                    {"Thank you", "Gracias"},
                    {"Yes/No", "Sí/No"}
            },
            // Intermediate Level
            {
                    {"Converse", "Conversar"},
                    {"Comprehend", "Comprender"},
                    {"Eloquent", "Elocuente"},
                    {"Pronunciation", "Pronunciación"},
                    {"Vocabulary", "Vocabulario"}
            },
            // Advanced Level
            {
                    {"Fluency", "Fluidez"},
                    {"Bilingual", "Bilingüe"},
                    {"Polyglot", "Políglota"},
                    {"Linguistics", "Lingüística"},
                    {"Idiomatic", "Idiomático"}
            }
    };
    public void BeginnerLevel(){
        System.out.println("\nBeginner Spanish Words:\n");
        for (String[] wordPair : spanishWordsWithTranslationsAndLevels[0]) {
            System.out.println(wordPair[0] + " - " + wordPair[1]);
        }
    };
    public void IntermediateLevel(){
        System.out.println("\nIntermediate Spanish Words:\n");
        for (String[] wordPair : spanishWordsWithTranslationsAndLevels[1]) {
            System.out.println(wordPair[0] + " - " + wordPair[1]);
        }
    };
    public void AdvancedLevel(){
        System.out.println("\nAdvanced Spanish Words:\n");
        for (String[] wordPair : spanishWordsWithTranslationsAndLevels[2]) {
            System.out.println(wordPair[0] + " - " + wordPair[1]);
        }
    };
}
