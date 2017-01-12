package practice.english.dao;

import practice.english.model.Phrase;

import java.util.Map;

/**
 * Created by StudentTC on 12.01.2017.
 */
public class PhraseDao {

    /*
    * English phrase -> Phrase
     */
    private Map<String, Phrase> englishPhrases;

    /*
    * Russian phrase -> Phrase
     */
    private Map<String, Phrase> russianPhrases;

    //get---------------
    public Phrase getByEnglishWords(String englishWords) {
        return englishPhrases.get(englishWords);
    }

    public Phrase getByRussianWords(String russianWords) {
        return russianPhrases.get(russianWords);
    }

    //save---------------
    public boolean saveOrUpdate(Phrase phrase) {
        englishPhrases.put(phrase.getEnglishPhrase(), phrase);
        russianPhrases.put(phrase.getRussianPhrase(), phrase);

        return true;
    }

    //update
    public boolean update(Phrase phrase) {
        boolean result = false;

        Phrase englishphrase = englishPhrases.get(phrase.getEnglishPhrase());

        if (englishphrase != null) {
            englishPhrases.put(phrase.getEnglishPhrase(), phrase);
            russianPhrases.put(phrase.getRussianPhrase(), phrase);
            result = true;
        } else {
            Phrase russianphrase = russianPhrases.get(phrase.getRussianPhrase());

            if (russianphrase != null) {
                englishPhrases.put(phrase.getEnglishPhrase(), phrase);
                russianPhrases.put(phrase.getRussianPhrase(), phrase);
                result = true;
            }
        }
        return result;
    }



}
