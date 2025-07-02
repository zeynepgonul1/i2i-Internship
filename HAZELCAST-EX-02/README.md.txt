HAZELCAST-EX-02

    Bu ödev kapsamında Hazelcast ve Hazelcast Management Center bileşenleri Docker kullanılarak yerel bilgisayarda çalıştırılmıştır. Aşağıda adım adım yapılan işlemler ve alınan çıktılar açıklanmıştır.


GEREKLİ ARAÇLAR VE ORTAM

- Bilgisayarda Docker Desktop kurulu ve çalışır durumda olmalıdır.
- Terminal (CMD) kullanılmıştır.
- İnternet bağlantısı aktif olarak Docker Hub üzerinden imajlar çekilmiştir.


HAZELCAST KURULUMU VE ÇALIŞTIRILMASI

    İlk olarak Hazelcast imajı Docker Hub üzerinden çekilmiştir:

        docker pull hazelcast/hazelcast:latest

    Daha sonra Hazelcast container’ı arka planda çalışacak şekilde başlatılmıştır:

        docker run -d --name hazelcast-node hazelcast/hazelcast:latest

    Bu komutla Hazelcast başarılı bir şekilde çalıştırılmış ve container listesine eklenmiştir.


MANAGEMENT CENTER KURULUMU VE ÇALIŞTIRILMASI

    Hazelcast Management Center için imaj indirilmiş ve aşağıdaki komutla başlatılmıştır:

        docker pull hazelcast/management-center:latest

        docker run -d --name hazelcast-mc -p 8080:8080 hazelcast/management-center:latest

    Bu komutla Management Center container’ı başlatılmış ve port yönlendirmesi yapılmıştır. Böylece tarayıcı üzerinden arayüz erişimi sağlanmıştır.


ÇALIŞMA KONTROLLERİ

    Çalışan container’lar `docker ps` komutu ile kontrol edilmiştir. Alınan örnek çıktı aşağıdaki gibidir:

        CONTAINER ID   IMAGE                                 STATUS        PORTS                    NAMES
        xxxxxxxx       hazelcast/hazelcast:latest            Up            5701/tcp                 hazelcast-node
        yyyyyyyy       hazelcast/management-center:latest    Up            0.0.0.0:8080->8080/tcp   hazelcast-mc

    Tarayıcı üzerinden `http://localhost:8080` adresine gidilerek Hazelcast Management Center arayüzü başarıyla görüntülenmiştir.


EKRAN GÖRÜNTÜLERİ

    Aşağıdaki ekran görüntüleri ödev dosyasına eklenmiştir:

    - `docker ps` komutu çıktısı (çalışan container’lar)
    - Management Center web arayüzü (localhost:8080)
    - Hazelcast container loglarının bir kısmı (opsiyonel olarak `docker logs hazelcast-node` ile alınmıştır)


SONUÇ

    Hazelcast ve Management Center container’ları Docker ortamında sorunsuz şekilde çalıştırılmış ve arayüz başarıyla test edilmiştir. Ödev istenilen yönergelere uygun olarak tamamlanmıştır.


    Hazırlayan: Zeynep Gönül
    02.07.2025 / i2i Systems
