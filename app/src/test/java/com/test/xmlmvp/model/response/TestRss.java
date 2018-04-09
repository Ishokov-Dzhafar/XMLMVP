package com.test.xmlmvp.model.response;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

/**
 * Created by dzhafar on 09.04.18.
 */

public class TestRss {

    private final String data = "<rss xmlns:dc=\"http://purl.org/dc/elements/1.1/\" version=\"2.0\">\n" +
            "<channel>\n" +
            "<title>Хабрахабр / Все / Тематические публикации</title>\n" +
            "<link>https://habrahabr.ru/posts/collective/all/</link>\n" +
            "<description>\n" +
            "<![CDATA[ Все публикации из тематических хабов на Хабрахабре ]]>\n" +
            "</description>\n" +
            "<language>ru</language>\n" +
            "<managingEditor>editor@habrahabr.ru</managingEditor>\n" +
            "<generator>habrahabr.ru</generator>\n" +
            "<pubDate>Mon, 09 Apr 2018 15:16:46 GMT</pubDate>\n" +
            "<lastBuildDate/>\n" +
            "<image>\n" +
            "<link>https://habrahabr.ru/</link>\n" +
            "<url>https://habrahabr.ru/images/logo.png</url>\n" +
            "<title>Хабрахабр</title>\n" +
            "</image>\n" +
            "<item>\n" +
            "<title>\n" +
            "<![CDATA[\n" +
            "Побеждаем Android Camera2 API с помощью RxJava2 (часть 2)\n" +
            "]]>\n" +
            "</title>\n" +
            "<guid isPermaLink=\"true\">https://habrahabr.ru/post/352318/</guid>\n" +
            "<link>\n" +
            "https://habrahabr.ru/post/352318/?utm_campaign=352318\n" +
            "</link>\n" +
            "<description>\n" +
            "<![CDATA[\n" +
            "<img src=\"https://habrastorage.org/web/342/d66/230/342d6623018f4d7b8d0392137429a5ba.jpg\" alt=\"image\"><br>\n" +
            " <br>\n" +
            " Это вторая часть <a href=\"https://habrahabr.ru/company/badoo/blog/330080/\">статьи</a>, в которой я показываю, как использование RxJava2 помогает строить логику поверх асинхронного API. В качестве такого интерфейса я выбрал Android Camera2 API (и не пожалел!). Этот API не только асинхронен, но и таит в себе неочевидные особенности реализации, которые нигде толком не описаны. Так что статья нанесет читателю двойную пользу. <br>\n" +
            " <br>\n" +
            " Для кого этот пост? Я рассчитываю, что читатель — умудрённый опытом, но всё ещё любознательный Android-разработчик. Очень желательны базовые знания о реактивном программировании (<a href=\"https://habrahabr.ru/company/badoo/blog/328434/\">хорошее введение — здесь</a>) и понимание Marble Diagrams. Пост будет полезен тем, кто хочет проникнуться реактивным подходом, а также тем, кто планирует использовать Camera2 API в своих проектах.  <br>\n" +
            " <br>\n" +
            " Исходники проекта можно <a href=\"https://github.com/ArkadyGamza/Camera2API_rxJava2\">найти на GitHub</a>.<br>\n" +
            " <br>\n" +
            " Чтение <a href=\"https://habrahabr.ru/company/badoo/blog/330080/\">первой части</a> обязательно!<br>\n" +
            " <br> <a href=\"https://habrahabr.ru/post/352318/?utm_campaign=352318#habracut\">Читать дальше →</a>\n" +
            "]]>\n" +
            "</description>\n" +
            "<pubDate>Mon, 09 Apr 2018 15:01:01 GMT</pubDate>\n" +
            "<dc:creator>ArkadyGamza</dc:creator>\n" +
            "<category>\n" +
            "<![CDATA[ Разработка под Android ]]>\n" +
            "</category>\n" +
            "<category>\n" +
            "<![CDATA[ Разработка мобильных приложений ]]>\n" +
            "</category>\n" +
            "<category>\n" +
            "<![CDATA[ Программирование ]]>\n" +
            "</category>\n" +
            "<category>\n" +
            "<![CDATA[ API ]]>\n" +
            "</category>\n" +
            "<category>\n" +
            "<![CDATA[ Блог компании Badoo ]]>\n" +
            "</category>\n" +
            "<category>\n" +
            "<![CDATA[ java ]]>\n" +
            "</category>\n" +
            "<category>\n" +
            "<![CDATA[ rxjava2 ]]>\n" +
            "</category>\n" +
            "<category>\n" +
            "<![CDATA[ android ]]>\n" +
            "</category>\n" +
            "<category>\n" +
            "<![CDATA[ camera2 api ]]>\n" +
            "</category>\n" +
            "<category>\n" +
            "<![CDATA[ camera ]]>\n" +
            "</category>\n" +
            "</item>\n" +
            "<item>\n" +
            "<title>\n" +
            "<![CDATA[ Что нового в PostgreSQL 11: INCLUDE-индексы ]]>\n" +
            "</title>\n" +
            "<guid isPermaLink=\"true\">https://habrahabr.ru/post/353126/</guid>\n" +
            "<link>\n" +
            "https://habrahabr.ru/post/353126/?utm_campaign=353126\n" +
            "</link>\n" +
            "<description>\n" +
            "<![CDATA[\n" +
            "<img src=\"https://habrastorage.org/getpro/habr/post_images/04c/702/81a/04c70281a6745f83e911db28b807657f.jpg\" alt=\"image\"><br>\n" +
            " <br>\n" +
            " Релиз PostgreSQL 11 состоится еще не скоро, только в октябре. Но фичфриз уже наступил, а значит мы знаем, какие фичи попали в этот релиз, и можем их потестировать, <a href=\"https://eax.me/postgresql-build/\">собрав PostgreSQL</a> из ветки master. Особого внимания заслуживает фича под названием <b>INCLUDE-индексы</b>. <a href=\"https://git.postgresql.org/gitweb/?p=postgresql.git;a=commit;h=8224de4f42ccf98e08db07b43d52fed72f962ebb\">Патч</a> изначально написан <a href=\"https://habrahabr.ru/users/lubennikovaav/\">Анастасией Лубенниковой</a>, а потом допилен <a href=\"https://habrahabr.ru/users/smagen/\">Александром Коротковым</a> и <a href=\"http://sigaev.ru/\">Федором Сигаевым</a>. Протолкнуть его в PostgreSQL заняло «всего лишь» что-то около трех лет. <a href=\"https://habrahabr.ru/post/353126/?utm_campaign=353126#habracut\">Читать дальше →</a>\n" +
            "]]>\n" +
            "</description>\n" +
            "<pubDate>Mon, 09 Apr 2018 14:50:55 GMT</pubDate>\n" +
            "<dc:creator>afiskon</dc:creator>\n" +
            "<category>\n" +
            "<![CDATA[ PostgreSQL ]]>\n" +
            "</category>\n" +
            "<category>\n" +
            "<![CDATA[ Блог компании Postgres Professional ]]>\n" +
            "</category>\n" +
            "<category>\n" +
            "<![CDATA[ postgresql ]]>\n" +
            "</category>\n" +
            "<category>\n" +
            "<![CDATA[ индексы ]]>\n" +
            "</category>\n" +
            "</item>\n" +
            "<item>\n" +
            "<title>\n" +
            "<![CDATA[ Открытый вебинар «Примеры паттернов» ]]>\n" +
            "</title>\n" +
            "<guid isPermaLink=\"true\">https://habrahabr.ru/post/353130/</guid>\n" +
            "<link>\n" +
            "https://habrahabr.ru/post/353130/?utm_campaign=353130\n" +
            "</link>\n" +
            "<description>\n" +
            "<![CDATA[\n" +
            "Доброго дня!<br>\n" +
            " <br>\n" +
            " Намедни наш замечательный <a href=\"https://otus.pw/eDhI/\">Виталий Чибриков</a> в рамках его курса <a href=\"https://otus.pw/OxQc/\">«Разработчик Java»</a> провёл открытый урок, где разобрал в чём же польза паттернов в проектировании и вне, на примере нескольких из них в формате: постановка проблемы, решение и пример для каждого.<br>\n" +
            " <br>\n" +
            " <div class=\"oembed\"><div><div style=\"left: 0; width: 100%; height: 0; position: relative; padding-bottom: 56.2493%;\"><iframe src=\"https://www.youtube.com/embed/4BeEPtpJdHg?rel=0&amp;showinfo=1\" style=\"border: 0; top: 0; left: 0; width: 100%; height: 100%; position: absolute;\" allowfullscreen scrolling=\"no\"></iframe></div></div></div><br>\n" +
            " <br>\n" +
            " Если есть какие-то вопросы, то можете задать их тут или завтра на <a href=\"https://otus.pw/DP1u/\">Дне открытых дверей.</a><br>\n" +
            " <br>\n" +
            " Спасибо! <a href=\"https://habrahabr.ru/post/353130/?utm_campaign=353130#habracut\"></a>\n" +
            "]]>\n" +
            "</description>\n" +
            "<pubDate>Mon, 09 Apr 2018 14:42:10 GMT</pubDate>\n" +
            "<dc:creator>MaxRokatansky</dc:creator>\n" +
            "<category>\n" +
            "<![CDATA[ Программирование ]]>\n" +
            "</category>\n" +
            "<category>\n" +
            "<![CDATA[ Java ]]>\n" +
            "</category>\n" +
            "<category>\n" +
            "<![CDATA[ Блог компании Отус ]]>\n" +
            "</category>\n" +
            "<category>\n" +
            "<![CDATA[ java ]]>\n" +
            "</category>\n" +
            "<category>\n" +
            "<![CDATA[ паттерны проектирования ]]>\n" +
            "</category>\n" +
            "</item>" +
            "</channel>\n" +
            "</rss>";

    public Rss getData() {
        Serializer serializer = new Persister();
        Rss habrResopnse = null;
        try {
            habrResopnse = serializer.read(Rss.class, data);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return habrResopnse;
    }
}
