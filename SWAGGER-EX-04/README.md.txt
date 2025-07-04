SWAGGER-EX-04 (Customer API – Spring Boot + Swagger UI)


 Bu proje, Spring Boot kullanılarak geliştirilen basit bir RESTful web servisidir. Uygulama customer verileri üzerinde temel CRUD (Create, Read, Update, Delete) işlemlerini gerçekleştirmektedir.


Projenin Amacı

 Amaç, katmanlı mimari kullanarak bir müşteri yönetim servisi geliştirmek ve bu servisi Swagger UI aracılığıyla dOkümante etmektir. Swagger (OpenAPI) sayesinde API uç noktaları test edilebilir ve geliştirici dostu bir arayüz ile görüntülenebilir.


Kullanılan Teknolojiler

- Java 17
- Spring Boot 3.x
- Maven
- Swagger UI (springdoc-openapi-starter-webmvc-ui)
- Jakarta Bean Validation


Proje Katmanları

 Proje katmanlı mimari prensibine uygun şekilde yapılandırılmıştır:

- `dto` → Müşteri verilerini taşıyan sınıf (`CustomerDTO`)
- `service` → İş mantığını içeren arayüz ve in-memory servis sınıfı
- `controller` → REST API uç noktalarını tanımlayan denetleyici sınıf


API Uç Noktaları (Endpoints)

| Yöntem | URL                       | Açıklama                     |
|--------|---------------------------|------------------------------|
| POST   | `/api/customers`          | Yeni müşteri oluşturur       |
| GET    | `/api/customers`          | Tüm müşterileri listeler     |
| GET    | `/api/customers/{id}`     | Belirli müşteriyi getirir    |
| PUT    | `/api/customers/{id}`     | Müşteriyi günceller          |
| DELETE | `/api/customers/{id}`     | Müşteriyi siler              |


Swagger UI

 Swagger UI arayüzü, projeyi çalıştırdıktan sonra şu adresten erişilebilir: http://localhost:8080/swagger-ui.html
 Bu arayüz üzerinden tüm API’ler test edilebilir. “Try it out” butonu ile veri gönderme, görüntüleme, güncelleme ve silme işlemleri doğrudan yapılabilir.


Notlar

- Uygulamada veriler in-memory (geçici) olarak tutulur. Gerçek bir veritabanı bağlantısı yoktur.
- Uygulama her başlatıldığında müşteri verileri sıfırlanır.
- Swagger UI ile yapılan testlerde yeni müşteri eklendikçe ID sayısı artar (örneğin: 1, 2, 3...).


Ekran Görüntüleri

 Projenin Swagger UI çıktıları ve API’lerin çalıştığını gösteren ekran görüntüleri ödev dosyasına eklenmiştir.


Geliştirici

 Bu proje i2i Academy eğitimi kapsamında geliştirilmiştir.  
 Hazırlayan: Zeynep Gönül  
 04.07.2025 / i2i Systems

