package ExtractDataUrl;

import com.sun.source.util.DocTrees;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ExtractData {
    Document doc;
    List<String> valuesAttr = new ArrayList<>();

    // метод для извлечения html-кода страницы
    public Document getDataUrl(String url) {
        try {
            // в -doc ложится вся страница
            doc = Jsoup.connect(url).userAgent("Chrome/4.0.249.0 Safari/532.5").referrer("http://www.google.com").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc;
    }

    // метод для получения определенных элементов из html-кода страницы по её тегам
    public Elements getElementToTag(Document html, String cssQuery){
        Elements links = html.select(cssQuery);
        return links;
    }

    // метод для получения значений определенных атрибутов из тегов html-кода
    public List<String> getLinksToAttr(Elements elements){
        for (Element src : elements) {
            valuesAttr.add("https://zakaz.atbmarket.com" + src.attr("href"));
        }
        return valuesAttr;
    }

}
