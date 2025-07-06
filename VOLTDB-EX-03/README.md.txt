VOLTDB-EX-03
 
 Bu ödev kapsamında VoltDB veritabanı sistemi Docker üzerinde çalıştırılarak hem komut satırı hem de web tabanlı arayüz üzerinden erişim sağlanmış, örnek bir tablo oluşturulmuş ve veri ekleme işlemleri yapılmıştır.


🔹 VoltDB Kurulumu ve Çalıştırılması:

 Aşağıdaki komut ile VoltDB konteyneri Docker üzerinde çalıştırılmıştır:

  "docker run -d --name node1 -p 8080:8080 -p 21212:21212 full360/docker-voltdb-ce voltdb create --ignore=voltdbroot"

 Bu komut sayesinde:

 - VoltDB sunucusu çalıştırılmıştır.

 - Web arayüzü (VoltDB Management Center) için 8080 portu dış dünyaya açılmıştır.

 - Terminal bağlantısı için 21212 portu dış dünyaya açılmıştır.


🔹 "docker ps" Komutu ile Konteyner Kontrolü:

 Bu çıktı ile konteynerin durumu ve port yönlendirmeleri başarıyla doğrulanmıştır.


🔹 VoltDB Web Arayüzü Kullanımı:

 "http://localhost:8080" adresinden erişilen VoltDB Management Center (Web UI) üzerinden:

  - Cluster durumu (Active)
  - Sunucu kaynak kullanımı (CPU/RAM)
  - Genel sistem istatistikleri

    görüntülenmiştir.


🔹 SQL Komutları ile Tablo Oluşturma ve Veri Ekleme:

 Komut satırından şu komutla VoltDB’ye bağlanılmıştır:

  "docker exec -it node1 sqlcmd"
 
 Bağlantı sonrası aşağıdaki SQL komutları çalıştırılmıştır:

 "create table mth3902 (
  id bigint not null,
  start_date_epoch bigint,
  create_user varchar(32),
  constraint mth3902_pk primary key(id)
);

partition table mth3902 on column id;

insert into mth3902 ( id, start_date_epoch, create_user ) values ( 1, 1698295044, 'MENNAN');
insert into mth3902 ( id, start_date_epoch, create_user ) values ( 2, 1698295088, 'ERKUT');

select * from mth3902;"


🔹 Elde Edilen Ekran Görüntüleri:

- VoltDB Web UI – Yönetim paneli, sunucu durumu
- SQLCMD Terminali – SQL sorguları ve çıktı
- Docker PS Çıktısı – Konteyner ve port durumu


🔹 Sonuç:

 Bu çalışma kapsamında Docker kullanılarak VoltDB veritabanı başarıyla ayağa kaldırılmış, Web arayüzü (VoltDB Management Center) ve komut satırı arayüzü (sqlcmd) üzerinden bağlantı kurulmuştur.
 Örnek bir tablo oluşturulmuş, veri eklenmiş ve bu veriler sorgulanarak sistemin işlevselliği test edilmiştir.
 Tüm süreç boyunca elde edilen çıktılar ve ekran görüntüleri VoltDB’nin temel kullanımı hakkında başarılı bir uygulama yapılmasını sağlamıştır.


 Hazırlayan: Zeynep Gönül
 06.07.2025 / i2i Systems



