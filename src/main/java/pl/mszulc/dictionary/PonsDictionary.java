package pl.mszulc.dictionary;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: mateusz.szulc
 * Date: 04.02.13
 * Time: 11:13
 * To change this template use File | Settings | File Templates.
 */
public class PonsDictionary implements Dictionary {
    private static final String ponsURL = "http://pl.pons.eu/dict/search/results/?q=%s&l=%s";
    private final String dictionary;


    public PonsDictionary(String dictionaryArg) {
        dictionary = dictionaryArg;
    }

    @Override
    public String getEntry(String entry) {
        String queryURL = String.format(ponsURL, entry, dictionary);
        Document doc = loadDocument(queryURL);

        return getEntryFromHtmlDocument(doc);
    }

    private String getEntryFromHtmlDocument(Document doc) {
        Element languageDivElement = doc.getElementById("pl");
        Elements translations = languageDivElement.select("div.rom.first").first().getElementsByClass("translations");
        Element firstTranslation = translations.first();
        Element tbody = firstTranslation.getElementsByTag("tbody").first() ;
        return getFirstTranslationFromTBody(tbody);
    }

    private static String getFirstTranslationFromTBody(Element tbody) {
        Elements rows = tbody.children();
        Element row = rows.first();
        Element source = row.getElementsByClass("target").first();
        return source.text();
    }

    private static Document loadDocument(String queryURL) {
        Document doc = null;
        try {
            doc = Jsoup.connect(queryURL).timeout(5000).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc;
    }
}
