package ExtractDataUrl;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MainEDU {
//    public static void main(String[] args) {
//        String url = "https://zakaz.atbmarket.com/catalog/";
//        String location = "";
//        List<String> categoryLinks;
//        List<String> paginationLinks = new ArrayList<String>();
//        Set<String> linksWorks;
//        ExtractLocation el = new ExtractLocation();
//        ExtractData ed = new ExtractData();
//
//        // ссылки на категории товаров
//        String cssQueryMenu = "li[class=second-menu] a";
//
//        // ссылки на конкретные товары
////        String cssQueryProduct = "html body main section div div ul li";
//
//        // Пагинация
//        String cssQueryPagination = "a[class=page-link]";
//        // Наименование
//        String cssQueryProductName = "a div";
//        // Фото
//        String cssQueryProductImg = "img";
//        // Цена
//        String cssQueryProductCosts = "span[class=price]";
//        // Код товара
//        // ..
//
////        el.extract();
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Введите локцию магазина:");
//        try {
//            location = bufferedReader.readLine();
//            bufferedReader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(url + location);
//
//        // в -html лежит весь html-код страницы из -url
//        Document html = ed.getDataUrl(url + location);
//        System.out.println(html);
//        Document htmlProduct;
//
//        // КАТЕГОРИИ ТОВАРОВ
//        // ПОЛУЧАЕМ ТЕГИ, содержащие ссылки на категории товаров
//        Elements categoryTags = ed.getElementToTag(html, cssQueryMenu);
//        System.out.println(categoryTags);
//        // <a class="list-group-item" href="/catalog/1/253">Канцелярські товари</a>
//
//        // ПОЛУЧАЕМ -List ССЫЛОК на категории товаров (извлекая их из атрибутов тегов)
//        // и подсоединяем к нему слева текст "https://zakaz.atbmarket.com"
//        categoryLinks = ed.getLinksToAttr(categoryTags);
//        // https://zakaz.atbmarket.com/catalog/1/253
//
//        // ПОЛУЧАЕМ ТЕГИ И -List ССЫЛОК на страницы пагинации
//        for (String linksProduct : categoryLinks) {
//            // заходим на каждую страницу из меню категории товаров и
//            // ПОЛУЧАЕМ -List ССЫЛОК страницы пагинации (извлекая их из атрибутов тегов)
//            htmlProduct = ed.getDataUrl(linksProduct); // в -html ложится весь html-код страницы из -linksProduct
//            Elements paginationTags = ed.getElementToTag(htmlProduct, cssQueryPagination);
//            paginationLinks.add(linksProduct);
//            for (Element src : paginationTags) {
//                paginationLinks.add("https://zakaz.atbmarket.com" + src.attr("href"));
//            }
//        }
//        // в -linksWorks лежат ссылки на все возможные страницы с товарами сайта локации
//        // отсортированые и без дубликатов
//        linksWorks = new TreeSet<>(paginationLinks);
//        System.out.println("ССЫЛКИ НА ВСЕ СТРАНИЦЫ ТОВАРОВ ЛОКАЦИИ (ИЗ linksWorks)");
//        for (String lw : linksWorks) {
//            System.out.println(lw);
//        }
//
//
//        // ТОВАРЫ
//        // заходим на каждую страницу из -Set linksWorks
//        // и ПОЛУЧАЕМ ТЕГИ, содержащие ссылки на товары
//        for (String linksProduct : linksWorks) {
//            // в -html ложится весь html-код страницы из -linksProduct
//            htmlProduct = ed.getDataUrl(linksProduct);
//
//            // извлекаем из этого кода теги, содержащие информацию о товаре
//            // (Название)
//            Elements tagsProductName = ed.getElementToTag(htmlProduct, cssQueryProductName);
//            System.out.println(tagsProductName.toString());
//            // (Фото)
//            Elements tagsProductImg = ed.getElementToTag(htmlProduct, cssQueryProductImg);
//            System.out.println(tagsProductImg.toString());
//            // (Цена)
//            Elements tagsProductCosts = ed.getElementToTag(htmlProduct, cssQueryProductCosts);
//            System.out.println(tagsProductCosts);
//            // ...
//            // (Код товара)
//            // ...
//        }
//
//
////        // получаем -List ссылок на категории товаров
////        values = ed.getValuesToAttr(tags);
////        for (String elem : values) {
////            System.out.println(elem);
////        }
//    }
}
