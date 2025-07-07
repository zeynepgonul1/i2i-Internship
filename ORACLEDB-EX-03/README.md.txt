OracleDB-EX-03


 Bu ödev kapsamında Oracle XE veritabanı üzerinde "BOOK" isimli bir tablo oluşturulmuş ve tabloya veri ekleme işlemleri gerçekleştirilmiştir. Oracle SQL Developer'da yaşanan donma sorunu nedeniyle işlemler, alternatif bir veritabanı aracı olan DBeaver kullanılarak başarıyla tamamlanmıştır.


🔹 Oracle Veritabanı Bağlantısı Kurulması

 Docker üzerinde çalışan Oracle 21c XE veritabanı konteynerine bağlantı DBeaver üzerinden şu bilgilerle sağlandı:

 - Host: localhost
 - Port: 1521
 - SID (Veritabanı Adı): XE
 - Kullanıcı Adı: system
 - Şifre: ****** (Docker başlatılırken belirlenmişti)

 Bağlantı test edildi ve başarıyla gerçekleştirildi.


🔹 BOOK Tablosunun Oluşturulması

 Yeni bir SQL komut penceresi açılarak aşağıdaki sorgu çalıştırıldı:
 
  CREATE TABLE BOOK (
   ID NUMBER,
   NAME VARCHAR2(128),
   ISBN VARCHAR2(32),
   CREATE_DATE DATE DEFAULT SYSDATE
 );

 Bu komutla birlikte "BOOK" isimli tablo oluşturuldu. Tablo; kitap ID’si, adı, ISBN numarası ve otomatik olarak sistem tarihini alan "CREATE_DATE" sütunlarını içermektedir.


🔹 Tablo Varoluşunun Doğrulanması

 Tablonun başarıyla oluşturulduğu şu sorgularla doğrulandı:

  SELECT table_name FROM user_tables;
  SELECT * FROM BOOK;

 Bu sorgular sonucunda "BOOK" tablosu listelendi ve sorgulanabilir hale geldiği görüldü.
 

🔹 Veri Ekleme İşlemleri

 Tabloya örnek kitap verileri eklendi:

  INSERT INTO BOOK (ID, NAME, ISBN)
  VALUES (1, 'Oracle Basics', '978-1111111111');

  INSERT INTO BOOK (ID, NAME, ISBN)
  VALUES (2, 'Satranç', '978-2222222222');

 Bu veriler başarıyla tabloya eklendi ve "SELECT * FROM BOOK;" komutuyla doğrulandı. "CREATE_DATE" sütununun sistem tarihi ile otomatik dolduğu görüldü.


🔹 Sonuç

 Tüm adımlar başarıyla tamamlanmış, ekran görüntüleri alınmıştır. "BOOK" tablosunun oluşturulması, doğrulanması ve veri eklenmesi işlemleri eksiksiz şekilde gerçekleştirilmiştir.


 Hazırlayan: Zeynep Gönül
 07.07.2025 / i2i Systems
