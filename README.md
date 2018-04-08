# XMLMVP
Просмотр RSS хабра: https://habrahabr.ru/rss/hubs/all/ . Вывод списком со всеми атрибутами:
теги, хабы и т.п. (это всё есть в RSS). Ограничения: support/recycler, SimpleXML. Можно
добавить pull to refresh.
Обязательные требования:

- Код пишется только на Java. Kotlin/Scala/Brainfuck и т.п. использовать нельзя.
- Из библиотек использовать можно только библиотеки Android Support и Jackson/GSON.

Будет плюсом:
- В проекте имеется выверенная архитектура с четким разделением обязанностей по слоям.
Какой мета-паттерн (MVC, MVP, MVVM) и какие паттерны проектирования использовать, – всё
это остается на усмотрение автора.
- Модель защищена юнит-тестами на уровне method coverage (branch coverage – это плюс, но
необязательный).
- Написаны UI-тесты на Espresso.
- Приложение оформлено в Material Design.