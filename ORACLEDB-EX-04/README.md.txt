ORACLEDB-EX-04

 Bu projede Java programlama dili ve Oracle veritabanı kullanılarak rastgele kitap verilerinin oluşturulup veritabanındaki BOOK tablosuna eklenmesi amaçlanmıştır. Çalışma, Docker üzerinde çalışan Oracle XE veritabanı, DBeaver bağlantı aracı ve Maven ile oluşturulmuş bir Java uygulaması ile gerçekleştirilmiştir.


1. Veritabanı Ortamının Hazırlanması

 - Öncelikle Oracle XE 21c veritabanı "gvenzl/oracle-xe" Docker imajı kullanılarak çalıştırılmıştır.
 - Konteyner ismi "oraclebookdb" olarak belirlenmiş, Oracle'ın default portu olan 1521 dışarı 1522 olarak yönlendirilmiştir.
 - Docker üzerinden veritabanının başarılı şekilde başlatıldığı "docker ps" komutu ile doğrulanmıştır.


2. DBeaver ile Veritabanına Bağlantı

 - Oracle XE veritabanına bağlanmak için DBeaver kullanılmıştır.
 - Host: "localhost", Port: "1522", SID: "XE", Service: "XEPDB1", Kullanıcı: "BOOKUSER" ile bağlantı kurulmuştur.
 - Bağlantı başarıyla gerçekleştirilmiş ve veritabanı içeriği görüntülenebilir hale gelmiştir.


3. BOOK Tablosunun Oluşturulması

 "BOOK" adında bir tablo oluşturulmuştur. Tablo yapısı şu şekildedir:

  CREATE TABLE BOOK (
      ID NUMBER GENERATED BY DEFAULT ON NULL AS IDENTITY,
      NAME VARCHAR2(100),
      ISBN VARCHAR2(50),
      PRIMARY KEY (ID)
  );

 Bu tablo kitap adı (NAME) ve ISBN numarası (ISBN) bilgilerini tutmak üzere tasarlanmıştır.


4. Java Uygulamasının Hazırlanması

 - Maven projesi olarak bir Java uygulaması geliştirilmiştir.
 - Main.java dosyasında, rastgele Book verileri üretilmiş ve INSERT INTO BOOK SQL komutu ile bu veriler tabloya eklenmiştir.
 - Bağlantı için JDBC kullanılmış, DriverManager.getConnection(...) metoduyla Oracle veritabanına bağlanılmıştır.


5. Uygulamanın Derlenmesi ve Çalıştırılması

 Komut satırı üzerinden aşağıdaki komutlarla uygulama çalıştırılmıştır:

  mvn clean compile
  mvn exec:java -Dexec.mainClass="com.oracle.book.Main"

 Uygulama başarıyla çalıştırılmış ve "BOOK" tablosuna 100 adet rastgele kitap kaydı başarıyla eklenmiştir.

Konsolda her bir kayıt için "Inserted record X: Book ABC, 1234567890123" şeklinde mesajlar görüntülenmiştir.


6. Doğrulama

 - "SELECT * FROM BOOK;" komutu ile veritabanındaki kayıtlar DBeaver üzerinden kontrol edilmiştir.

 - Tüm kayıtların eksiksiz ve doğru bir biçimde eklendiği görülmüştür.


7. Sonuç

 Bu ödev sayesinde Java ile Oracle veritabanı arasında bağlantı kurma, tablo oluşturma ve veri ekleme işlemleri başarıyla gerçekleştirilmiştir. Docker kullanılarak modern ve taşınabilir bir veritabanı ortamı oluşturulmuş, DBeaver ile veritabanı yönetimi yapılmış ve Java ile veritabanı işlemleri başarıyla otomatikleştirilmiştir.


 Hazırlayan: Zeynep Gönül
 08.07.2025 / i2i Systems