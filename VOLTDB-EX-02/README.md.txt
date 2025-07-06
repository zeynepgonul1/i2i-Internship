VoltDB -EX-02

 Bu ödev kapsamında VoltDB veritabanının Community Edition sürümü Docker kullanılarak yerel bir makine üzerinde çalıştırılmıştır. Amaç, Docker Hub üzerindeki VoltDB imajını indirerek çalıştırmak ve sistemin düzgün şekilde başlatıldığını doğrulamaktır.


Uygulama Adımları

1. Docker Kurulumu Kontrol Edildi:

 Docker'ın sistemde kurulu ve çalışır durumda olup olmadığı terminal üzerinden "docker --version" komutuyla kontrol edilmiştir.


2. VoltDB İmajı İndirildi:

 Resmi VoltDB imajında yaşanan erişim sorunları nedeniyle alternatif olarak full360/docker-voltdb-ce imajı tercih edilmiştir. İlgili imaj şu komutla indirilmiştir:

	"docker pull full360/docker-voltdb-ce"


3. Özel Docker Ağı Oluşturuldu:

 VoltDB’nin çoklu node (küme) yapısına uygun bir yapı oluşturmak için özel bir Docker ağı tanımlanmıştır:

	"docker network create voltLocalCluster"


4. VoltDB Container’ı Çalıştırıldı:

 VoltDB container’ı aşağıdaki komut ile arka planda çalışacak şekilde başlatılmıştır:

	"docker run -d -e BUSY_COUNT=1 -e HOSTS=node1 --name=node1 --network=voltLocalCluster full360/docker-voltdb-ce"

	Bu komutta:

	-d: Container'ın arka planda çalışmasını sağlar,

	BUSY_COUNT=1: Minimum 1 node ile çalışması gerektiği belirtilir,

	HOSTS=node1: Cluster içindeki host tanımı yapılır.


5. Çalışma Durumu Doğrulandı:

"docker ps" komutu ile container’ın aktif olarak çalıştığı doğrulanmıştır. Ayrıca "docker logs node1" komutu ile VoltDB sunucusunun başarıyla başlatıldığı ve hazır olduğu görülmüştür.


6. Ekran Görüntüleri Eklendi:

Yapılan işlemleri belgelemek amacıyla her adımın ekran görüntüleri alınarak ödev dosyasına eklenmiştir.


Sonuç:

 VoltDB veritabanı Docker ortamında başarıyla kurulup çalıştırılmıştır. Bu süreçte karşılaşılan imaj erişim problemi alternatif bir Docker imajı kullanılarak çözülmüş ve sistem sorunsuz şekilde ayağa kaldırılmıştır. Ödev yönergesinde istenen tüm adımlar başarıyla yerine getirilmiştir.


 Hazırlayan: Zeynep Gönül
 06.07.2025 / i2i Systems
