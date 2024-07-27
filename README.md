# Real-Estate-Booking
Программа для отображения и бронирования доступных лотов в агентстве недвижимости.

## Локальный запуск
Для локального запуска можно использовать базу данных PostgreSQL с помощью Docker Compose.

## Установка Docker Desktop
Для установки Docker Desktop на Windows следуйте этой инструкции https://docs.docker.com/desktop/install/windows-install/

## Запуск Docker Compose
После установки Docker Desktop, запустите Docker и выполните команду для запуска скрипта из файла docker-compose.yml:
docker-compose up -d

## Настройки приложения
Все параметры подключения к базе данных в файле .properties по умолчанию совпадают с теми, что указаны в docker-compose.yml.

## Использование pgAdmin
Для наглядной работы с PostgreSQL можно использовать pgAdmin, который также прописан в docker-compose.yml.

## Дефолтные креденшиалы для pgAdmin:
url для входа: http://localhost/login
Логин: admin@admin.com
Пароль: admin

## Подключение к базе данных в pgAdmin
Зарегистрируйте новый сервер в pgAdmin.
Укажите следующие параметры подключения:
Имя сервера: любое (например, RealEstateDB).
Host name/address: postgres (если на локальной машине).
Port: 5432 (по умолчанию).
Username: potest (как указано в docker-compose.yml).
Password: potest (как указано в docker-compose.yml).

## API и документация
UI для просмотра API, технической документации и тестирования приложения доступен в браузере по адресу:
http://localhost:8080/swagger-ui/index.html