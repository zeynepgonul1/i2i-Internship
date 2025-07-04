KAFKA-EX-03


Ödevin Amacı

 Bu çalışmada Apache Kafka kullanarak Java dili ile iki ayrı uygulama geliştirildi. Bu uygulamalardan biri Producer (üretici), diğeri ise Consumer (tüketici) olarak yapılandırıldı. Amaç bir Student sınıfı nesnesini Kafka üzerinden gönderip karşı uygulama tarafından alınarak ekrana yazdırılmasını sağlamaktı.


Kullanılan Teknolojiler

- Java 8+

- Apache Kafka

- Docker

- Maven

- Kafka Java Client kütüphaneleri

- Visual Studio Code ve IntelliJ IDEA (kod geliştirme ortamları)


Kafka Ortamının Kurulumu

- Kafka ve Zookeeper, Docker kullanılarak çalıştırıldı.
- Kafka için confluentinc/cp-kafka:7.5.0 ve Zookeeper için confluentinc/cp-zookeeper:7.5.0 imajları kullanıldı.
- Docker konteynerleri başarıyla başlatıldı ve Kafka servisi dış bağlantılara açıldı (localhost:9092).
- Kafka'nın çalıştığı konteynerin adı kafka-demo-kafka-1 olarak belirlendi.


Topic Oluşturma ve Kontrol

- Kafka içerisinde mesaj alışverişinin yapılacağı bir topic oluşturuldu. Bu topic’in adı “student-topic” olarak belirlendi.
- Docker terminalinden Kafka konteynerine girilerek mevcut topic’ler listelendi.
- Student-topic'in başarıyla oluşturulduğu doğrulandı.
- Terminalde ayrıca Kafka’nın sistemsel olarak oluşturduğu __consumer_offsets gibi diğer topic’lerin de bulunduğu görüldü.
- Bu işlem sırasında alınan terminal ekranı, Word belgesine ekran görüntüsü (Screenshot 8) olarak eklendi.


Student Sınıfının Oluşturulması

- Producer ve Consumer uygulamalarında kullanılmak üzere bir Student sınıfı tanımlandı.
- Bu sınıf içinde öğrenciye ait “id” ve “isim” bilgileri yer aldı.
- Her iki uygulama da bu sınıfı kullanarak veri gönderme ve alma işlemlerini gerçekleştirdi.


Producer Uygulamasının Geliştirilmesi

- Producer uygulamasında Kafka'ya bağlanmak için gerekli ayarlamalar yapıldı.
- Uygulama bir adet Student nesnesi oluşturdu ve bunu Kafka üzerindeki student-topic topic’ine gönderdi.
- Verinin başarıyla gönderildiği terminal üzerinden doğrulandı ve ekran görüntüsü Word dosyasına eklendi.


Consumer Uygulamasının Geliştirilmesi

- Consumer uygulaması, Kafka’daki student-topic topic’ine abone olarak çalışacak şekilde yapılandırıldı.
- Producer tarafından gönderilen Student nesnesi, bu uygulama tarafından başarıyla alındı ve ekrana yazdırıldı.
- Uygulama çıktısı terminal üzerinden takip edildi ve ekran görüntüsü alındı.


Test ve Sonuç

- Kafka ortamı Docker üzerinde çalışırken Java uygulamaları host sistemde (Windows) çalıştırıldı.
- Java uygulamaları localhost:9092 adresi üzerinden Kafka'ya bağlanarak veri alışverişini sağladı.
- Student nesnesi başarılı bir şekilde serialize edilip gönderildi ve diğer tarafta deserialize edilip okunarak yazdırıldı.
- Kafka üzerinden Java nesnesi taşıma işlemi başarıyla gerçekleştirilmiş oldu.


Kazanımlar 

- Kafka’nın publish-subscribe (yayınla/abone ol) mimarisi pratikte uygulandı.
- Java nesnelerinin Kafka üzerinden nasıl taşınacağı öğrenildi.
- Kafka ile Java uygulamalarının Docker ortamında nasıl haberleştiği deneyimlendi.
- Topic oluşturma, listeleme ve kontrol etme gibi temel Kafka işlemleri uygulamalı olarak öğrenildi.


 Hazırlayan: Zeynep Gönül
 04.07.2025 / i2i Systems