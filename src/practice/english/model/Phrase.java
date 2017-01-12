package practice.english.model;

/**
 * Created by StudentTC on 12.01.2017.
 */
public class Phrase extends Entity {

    private String englishPhrase;
    private String russianPhrase;

    public String getEnglishPhrase() {
        return englishPhrase;
    }

    public void setEnglishPhrase(String englishPhrase) {
        this.englishPhrase = englishPhrase;
    }

    public String getRussianPhrase() {
        return russianPhrase;
    }

    public void setRussianPhrase(String russianPhrase) {
        this.russianPhrase = russianPhrase;
    }
}
