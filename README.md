#AlfaBank Test

Создать сервис, который обращается к сервису курсов валют, и отдает gif в ответ:

Если курс по отношению к рублю за сегодня стал выше вчерашнего, то отдаем рандомную отсюда https://giphy.com/search/rich

Если ниже - отсюда https://giphy.com/search/broke

##Ссылки

REST API курсов валют - https://docs.openexchangerates.org/

REST API гифок - https://developers.giphy.com/docs/api#quick-start-guide

Сервис на Spring Boot 2 + Java / Kotlin

Запросы приходят на HTTP endpoint, туда передается код валюты

Для взаимодействия с внешними сервисами используется Feign

Все параметры (валюта по отношению к которой смотрится курс, адреса внешних сервисов и т.д.) вынесены в настройки

На сервис написаны тесты (для мока внешних сервисов можно использовать @mockbean или WireMock)

## Инструкция по запуску.
1. Запускаем Intellij IDEA
2. Menu File > New > Project from Version Control
3. Вставить ссылку на репозиторий https://github.com/INegmetov/currency-rest-service.git 
4. Run CurrencyRestServiceApplication (Shift+F10)
5. Переходим в браузере на страницу по адресу http://localhost:8080/
6. Ответ приходит в json формате
7. Для просмотра gif переходим по адресу http://localhost:8080/gif 
8. Для изменения Даты и Валюты в структуре проекта переходим по пути 
> src/main/resources/currency.properties

Меняем значения: date в формате (гггг-мм-дд) и symbols в формате (USD)

