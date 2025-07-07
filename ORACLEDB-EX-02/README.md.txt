ORACLEDB-EX-02 


Konu: Oracle Express Edition (21c XE) Docker Üzerinden Kurulumu ve SQL Sorgusu


Ödevin Amacı: Bu ödevin amacı Oracle tarafından sunulan ilişkisel veritabanı yönetim sistemi olan Oracle Database Express Edition (XE) sürümünü Docker üzerinde çalıştırmak, SQLPlus arayüzü ile bağlantı kurmak ve örnek bir SQL komutu çalıştırarak veritabanının doğru şekilde kurulduğunu doğrulamaktır.


İzlenen Adımlar:


1. Docker Kurulumu

Docker Desktop uygulaması sistemime kuruldu ve çalışır hale getirildi.
"docker --version" komutu ile kurulum doğrulandı.


2. Oracle Docker Dosyalarının Klonlanması

Oracle’ın resmi GitHub reposundan docker-images adlı depo indirildi:
"git clone https://github.com/oracle/docker-images.git"


3. Kurulum Dosyasının İndirilmesi

Oracle resmi web sitesinden Oracle Database 21c XE (.rpm) dosyası indirildi ve
"dockerfiles/21.3.0" klasörüne kopyalandı.


4. Docker İmajının Oluşturulması

Git Bash terminali kullanılarak aşağıdaki komut çalıştırıldı:
"./buildContainerImage.sh -v 21.3.0 -x"
Bu işlem sonucunda "oracle/database:21.3.0-xe" adlı Docker imajı başarıyla oluşturuldu.


5. Oracle Container’ın Başlatılması

Oluşturulan imajdan "oraclexe" adında bir container başlatıldı:
"docker run --name oraclexe -p 1521:1521 -p 5500:5500 -e ORACLE_PWD=ORACLE oracle/database:21.3.0-xe"
Kurulum sırasında SYS, SYSTEM ve PDBADMIN kullanıcıları için şifreler ayarlandı.


6. SQLPlus ile Bağlantı

Aşağıdaki komutlarla konteyner içerisine girilip "sqlplus" arayüzü başlatıldı:
"docker exec -it oraclexe bash
sqlplus sys/ORACLE@//localhost:1521/XE as sysdba"


7. SQL Komutunun Çalıştırılması

Veritabanının doğru çalıştığını test etmek için şu komut girildi:
"select name from v$database;"
Çıktı: XE --> Bu, veritabanının başarılı şekilde kurulduğunu doğrulamaktadır.


Sonuç : Oracle Database 21c Express Edition, Docker ortamında başarıyla kurulmuş ve çalıştırılmıştır. SQLPlus üzerinden bağlantı sağlanarak örnek bir SQL sorgusu ile kurulumun doğruluğu test edilmiştir. Tüm adımlar başarıyla tamamlanmıştır.


 Hazırlayan: Zeynep Gönül
 07.07.2025 / i2i Systems








