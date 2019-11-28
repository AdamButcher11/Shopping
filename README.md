# Shopping

Adatbázis konfiguráció

Az adatbáziskapcsolathoz szükséges adatok megadása, az application.properties fájlban történik:
#spring.datasource.url=jdbc:h2:mem:testdb;DB_CLOSE_ON_EXIT=FALSE
#spring.datasource.driverClassName=org.h2.Driver
#spring.datasource.username=sa
#spring.datasource.password=

#spring.jpa.hibernate.ddl-auto=create-drop

#spring.jpa.show-sql=true
#spring.h2.console.enabled=true
#spring.jpa.database-platform=org.hibernate.dialect.H2Dialect



spring.datasource.url=jdbc:mysql://localhost:3306/shopping_data
#spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=root
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update

Jelenleg XAMPP szerveren futtatott MYSQL adatbázishoz van kapcsolva, de tetszőlegesen ez megváltoztatható. Beállítható az alapértelmezett adatbázisra is, ilyenkor vegyük ki a # komment jeleket a használni kívánt sorok elől és kommentezzük ki helyette a MYSQL kapcsolatot. A JAVA Spring keretrendszer az indításkor automatikusan létrehozza a táblákat és feltölti működéshez szükséges adatokkal.
A spring.jpa.hibernate.ddl-auto=update parancs azt adja meg, hogy ha létezik az adatbázis, akkor ne csináljon új üres táblákat. 
