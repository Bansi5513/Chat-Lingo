package ChatLingo;

abstract class Language{
    abstract public void BeginnerLevel();
    abstract public void IntermediateLevel();
    abstract public void AdvancedLevel();
    abstract public void GrammarPractice();
    abstract public void TakeQuiz();
    abstract public int getScore();
}