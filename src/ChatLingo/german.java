package ChatLingo;

public class german extends Language{
    private static String[][][] germanWordsWithTranslationsAndLevels = {
            // Beginner Level
            {
                    {"Hello", "Hallo"},
                    {"Goodbye", "Auf Wiedersehen"},
                    {"Please", "Bitte"},
                    {"Thank you", "Danke"},
                    {"Yes/No", "Ja/Nein"}
            },
            // Intermediate Level
            {
                    {"Converse", "Kommunizieren"},
                    {"Comprehend", "Verstehen"},
                    {"Eloquent", "Eloquent"},
                    {"Pronunciation", "Aussprache"},
                    {"Vocabulary", "Wortschatz"}
            },
            // Advanced Level
            {
                    {"Fluency", "Flüssigkeit"},
                    {"Bilingual", "Zweisprachig"},
                    {"Polyglot", "Polyglott"},
                    {"Linguistics", "Linguistik"},
                    {"Idiomatic", "Idiomatisch"}
            }
    };
    public void BeginnerLevel(){
        System.out.println("\nBeginner German Words:\n");
        for (String[] wordPair : germanWordsWithTranslationsAndLevels[0]) {
            System.out.println(wordPair[0] + " - " + wordPair[1]);
        }
    };
    public void IntermediateLevel(){
        System.out.println("\nIntermediate German Words:\n");
        for (String[] wordPair : germanWordsWithTranslationsAndLevels[1]) {
            System.out.println(wordPair[0] + " - " + wordPair[1]);
        }
    };
    public void AdvancedLevel(){
        System.out.println("\nAdvanced German Words:\n");
        for (String[] wordPair : germanWordsWithTranslationsAndLevels[2]) {
            System.out.println(wordPair[0] + " - " + wordPair[1]);
        }
    };
}
