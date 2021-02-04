// ЗАПИСЫВАЕМ ЛОКАЦИИ МАГАЗИНОВ АТБ В ФАЙЛ

package ExtractDataUrl;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class ExtractLocation {
// забиваем адрес линка с конкатенацией последнего символа
// и извлекаем город и локацию в городе в виде город_локация
    Document doc;
    Elements elCity, elLocation;
    Set<String> location = new HashSet<>();
    BufferedWriter bw;
    String line;

    String url="https://zakaz.atbmarket.com/";
    public void extract() {
        for (int i=0; i<10000; i++) {
            try {
                doc = Jsoup.connect(url+i).get();
            } catch (IOException e) {
                e.printStackTrace();
            }
            elCity = doc.select("span[class=delivery-info__city]");
            elLocation = doc.select("span[class=delivery-info__address]");
            location.add(i + "_" + elCity + "_" + elLocation);
//            int beg = elCity.toString().lastIndexOf("</span>");
            int end = elCity.toString().indexOf("</span>");
            System.out.println(end);
            line = i + ";" + elCity.toString().substring(40, end) + ";" + elLocation.toString().substring(40) + "\n";

            try {
                bw = new BufferedWriter(new FileWriter("atb_locations.txt", true));
                bw.write(line);
                bw.flush();
                bw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

}
