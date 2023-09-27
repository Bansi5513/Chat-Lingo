package ChatLingo;

public class french extends Language{
    String[][][] frenchWordsWithTranslationsAndLevels = {
            // Beginner Level
            {
                    {"Hello", "Bonjour"},
                    {"Goodbye", "Au revoir"},
                    {"Please", "S'il vous plaît"},
                    {"Thank you", "Merci"},
                    {"Yes/No", "Oui/Non"}
            },

            // Intermediate Level
            {
                    {"Converse", "Converser"},
                    {"Comprehend", "Comprendre"},
                    {"Eloquent", "Éloquent"},
                    {"Pronunciation", "Prononciation"},
                    {"Vocabulary", "Vocabulaire"}
            },

            // Advanced Level
            {
                    {"Fluency", "Fluidité"},
                    {"Bilingual", "Bilingue"},
                    {"Polyglot", "Polyglotte"},
                    {"Linguistics", "Linguistique"},
                    {"Idiomatic", "Idiomatique"}
            }
    };

    public void BeginnerLevel(){
        System.out.println("\nBeginner French Words:\n");
        for (String[] wordPair : frenchWordsWithTranslationsAndLevels[0]) {
            System.out.println(wordPair[0] + " - " + wordPair[1]);
        }
    };
    public void IntermediateLevel(){
        System.out.println("\nIntermediate French Words:\n");
        for (String[] wordPair : frenchWordsWithTranslationsAndLevels[1]) {
            System.out.println(wordPair[0] + " - " + wordPair[1]);
        }
    };
    public void AdvancedLevel(){
        System.out.println("\nAdvanced French Words:\n");
        for (String[] wordPair : frenchWordsWithTranslationsAndLevels[2]) {
            System.out.println(wordPair[0] + " - " + wordPair[1]);
        }
    };
}
