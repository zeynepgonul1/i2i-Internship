KAFKA-EX-02


  Bu proje Kafka mesaj kuyruğu sistemi üzerine yapılmış bir ödev çalışmasıdır. Proje kapsamında Kafka kullanarak mesajların üretimi (producer), tüketimi (consumer) ve temel Kafka bileşenlerinin yapılandırılması ele alınmıştır.


Proje Hakkında

  Bu proje Kafka ortamını Docker ve Docker Compose kullanarak ayağa kaldırmak, ardından basit bir producer ve consumer uygulaması ile mesaj alışverişini gerçekleştirmek üzere hazırlanmıştır. Amaç, Kafka'nın temel çalışma mantığını anlamak ve pratik uygulamaktır.
  Kafka ve Zookeeper bileşenleri, Docker ve Docker Compose ile konteyner ortamında yapılandırılmıştır. Zookeeper, Kafka cluster yönetimi ve broker koordinasyonu için kullanılmıştır. Kafka broker ise mesajların tutulduğu ve iletildiği merkez olarak görev yapmıştır.
  Projedeki producer uygulaması belirlenen topic’e JSON formatında mesajlar göndermiş, consumer uygulaması ise bu topic’ten mesajları gerçek zamanlı olarak okuyup işleyerek sistemin uçtan uca mesaj akışını sağlamıştır.


Kullanılan Teknolojiler

- Apache Kafka

- Zookeeper

- Docker ve Docker Compose


Teknik Detaylar

- Docker Compose: Kafka ve Zookeeper servisleri docker-compose.yml dosyası kullanılarak kolayca başlatılmış ve izole bir ortamda çalıştırılmıştır.

- Kafka Broker: Tek brokerlı bir Kafka yapısı kurulmuş, gerekli portlar (9092) açılmıştır.

- Zookeeper: Kafka broker’ın durumunu takip etmek ve koordinasyonu sağlamak için Zookeeper kullanılmıştır.

- Producer: Java ile geliştirilmiş, Kafka Client API kullanılarak topic’e mesaj gönderilmiştir. Mesajlar JSON formatında olup içinde zaman damgası ve örnek veriler bulunmaktadır.

- Consumer: Aynı API ile geliştirilmiş, producer’dan gelen mesajları dinleyip konsola yazdırmıştır. Mesajlar başarıyla tüketildiğinde commit işlemi yapılarak mesajın işlendiği doğrulanmıştır.

- Topic Yapılandırması: Varsayılan topic yapılandırması kullanılmıştır. Gerekli durumlarda partition ve replication faktörleri ayarlanabilir.

- Mesaj Güvenilirliği: Producer tarafında ACK mekanizması aktif edilerek mesajların broker tarafından alındığı garantilenmiştir.


Sonuçlar

  Projede Kafka’nın temel fonksiyonları başarıyla gerçekleştirilmiş ve mesajların üretimi, kuyruklanması ve tüketimi arasındaki akış sorunsuz bir şekilde sağlanmıştır. Docker tabanlı yap uygulamanın taşınabilirliğini artırmış, kurulum ve yönetimi kolaylaştırmıştır.
  Bu çalışma Kafka’nın dağıtık mimarisini, Zookeeper entegrasyonunu ve client uygulamalarla etkileşimini öğrenmek için faydalı bir uygulama olmuştur.


  Hazırlayan: Zeynep Gönül
  02.07.2025 / i2i Systems



