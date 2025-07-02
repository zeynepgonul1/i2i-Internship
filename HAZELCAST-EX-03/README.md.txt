HAZELCAST-EX-03


Proje Açıklaması

 Bu proje i2i Academy tarafından verilen Hazelcast eğitim programı kapsamındaki HAZELCAST-EX-03 ödevinin çözümünü içermektedir.
 Bu çalışmanın temel amacı Java dili kullanılarak Hazelcast sunucusuna bağlanan basit bir uygulama geliştirerek dağıtık veri yapılarının kullanımını öğrenmektir. 

Projede gerçekleştirilen adımlar şunlardır:
- Daha önce kurulan bir Hazelcast sunucusuna bağlantı sağlanmıştır (HAZELCAST-EX-02 referans alınmıştır).
- Örnek bir Person sınıfı oluşturulmuştur.
- 10.000 adet sahte (dummy) Person nesnesi bir Map yapısına döngü kullanılarak eklenmiştir.
- Hazelcast üzerindeki bu nesneler daha sonra map’ten çekilerek konsola yazdırılmıştır.
- Bu sayede Hazelcast’in dağıtık veri yapılarının (özellikle Map) Java üzerinden temel kullanımı pratikte gösterilmiştir.


Kullanılan Teknolojiler

- Java: OpenJDK 1.8 (Adoptium Temurin dağıtımı)
- Hazelcast: Sürüm 5.3.6
- İşletim Sistemi: Windows 10 (CMD Terminal)
- Derleme Aracı: Komut satırı ile manuel derleme


Dosya İçeriği

- Person.java - Örnek person sınıfı
- HazelcastExample.java – Tüm uygulama kodunu içeren ana Java dosyasıdır.
- hazelcast-5.3.6.jar – Hazelcast kütüphanesi (Projenin derlenmesi ve çalışması için gereklidir).


Uygulama Adımları

- Derleme
- Çalıştırma


Uygulama Çıktısı

 Program çalıştırıldığında Hazelcast map'ine eklenen 10.000 adet Person nesnesi konsola yazdırılır. Bu çıktı veri ekleme ve alma işlemlerinin başarıyla gerçekleştiğini göstermektedir.


 Hazırlayan: Zeynep Gönül
 02.07.2025 / i2i Systems
