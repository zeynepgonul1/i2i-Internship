SPRING BOOT APP

 Bu proje Spring Boot kullanarak modern bir web uygulamasının nasıl geliştirileceğine dair temel ve uygulamalı bir yol haritası sunar.


Proje kapsamında:

🔹 Spring Boot çatısını kullanarak hızlı ve yapılandırması kolay bir uygulama iskeleti oluşturuldu.
🔹 Book adlı bir veri modeli tanımlayıp bu modele ait temel id, title ve author alanlarını veritabanında saklandı.
🔹 BookController ile RESTful API endpoint'leri geliştirildi: kitap ekleme, listeleme, güncelleme ve silme işlemlerini destekleyen GET, POST, PUT, DELETE HTTP metodlarıyla çalışıldı.
🔹 BookRepository arayüzü sayesinde veritabanı işlemleri (CRUD) kolaylıkla gerçekleştirildi; Spring Data JPA bu işlemleri otomatikleştirdi.
🔹 Geliştirme süresince H2 bellek içi veritabanı ile hızlıca test edilebilir bir ortam kuruldu.
🔹 Uygulamanın güvenilirliğini sağlamak için @SpringBootTest ve MockMvc gibi güçlü test sınıfları kullanılarak otomatik testler yazıldı.
🔹 Ayrıca uygulamada oluşabilecek hataları yakalayıp kullanıcı dostu mesajlar dönmek için @ControllerAdvice ve ExceptionHandler mekanizmalarıyla merkezi hata yönetimi gerçekleştirildi.

 Tüm bu süreç boyunca Spring Boot'un modüler yapısı, az konfigürasyonla çok iş yapabilme yeteneği ve geniş eklenti desteği ile neden bu kadar yaygın kullanıldığını deneyimleme fırsatı elde edildi.

 Elbette bu proje Spring ekosisteminin sadece temel bir başlangıç noktasıdır. 


İlerleyen süreçte:

- Spring Security ile yetkilendirme,

- Swagger/OpenAPI ile API dokümantasyonu,

- Pagination & Sorting gibi veri yönetim teknikleri,

- Dış servislerle entegrasyon (REST template, WebClient),

- Production ortamına deploy etme (Docker, CI/CD),

 gibi konulara geçilerek bilgi daha da derinleştirilebilir.


 Hazırlayan: Zeynep Gönül
 05.07.2025 / i2i Systems