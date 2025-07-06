TESTAUT-EX-01

Selenium Java ile E-Ticaret Sitesi Login Otomasyonu


🔹 Ödev Tanımı

  Bu ödev kapsamında Java programlama dili ve Selenium test otomasyon aracı kullanılarak bir e-ticaret web sitesine otomatik giriş (login) işlemi gerçekleştiren bir test otomasyon projesi geliştirilmiştir. Amaç, bir kullanıcının sisteme doğru kullanıcı adı ve şifre ile giriş yapabildiğini programatik olarak doğrulamaktır.


🔹 Proje Ortamı ve Kurulum

  Kullanılan teknolojiler:

- Java 17
- Maven (Proje yönetim aracı)
- IntelliJ IDEA (Geliştirme ortamı)
- Selenium WebDriver (Tarayıcı kontrolü için)
- WebDriverManager (Driver yönetimi)
- TestNG (Test framework)

Kurulum adımları:

- mJava 17 ve IntelliJ IDEA kuruldu.

- IntelliJ üzerinde yeni bir Maven projesi oluşturuldu.

- pom.xml dosyasına aşağıdaki bağımlılıklar eklendi:

	- selenium-java
	- webdrivermanager
	- testng

- Maven bağımlılıkları indirildi ve proje senkronize edildi.


🔹 Proje Yapısı

  Proje dizini aşağıdaki yapıya göre oluşturulmuştur:

  login-test
  └── src
      └── test
          └── java
              └── com.automation.logintest
                  └── LoginTest.java


🔹 Test Senaryosu: Başarılı Giriş (Valid Login)

  Test senaryosunda kullanılan site:

  https://www.saucedemo.com/

  Kullanıcı bilgileri:

  - Kullanıcı adı: standard_user
  - Şifre: secret_sauce

  Test adımları:

  - Tarayıcı açılır ve ilgili siteye gidilir.

  - Kullanıcı adı ve şifre alanları doldurulur.

  - "Login" butonuna tıklanır.

  - Giriş başarılıysa kullanıcı inventory.html sayfasına yönlendirilir.

  - Bu yönlendirme kontrol edilerek testin geçerli olup olmadığı doğrulanır.


🔹 Ekran Görüntüsü Alımı

  Tarayıcının açılıp sayfanın hemen kapanmaması için "Thread.sleep(5000)" komutu ile test sırasında tarayıcı 5 saniye açık tutulmuştur. Bu sayede aşağıdaki ekran görüntüsü alınmıştır:

  inventory.html sayfası
  (Ürünlerin ve “Add to Cart” butonlarının görünür olduğu ekran)


🔹 Test Sonucu

  Test çalıştırıldığında IntelliJ'de aşağıdaki çıktı alınmıştır:

  "Total tests run: 1, Passes: 1, Failures: 0, Skips: 0"

  Bu sonuç otomasyon testinin başarıyla tamamlandığını ve login işleminin doğru şekilde gerçekleştirildiğini göstermektedir.


🔹 Sonuç

  Bu proje bir e-ticaret sitesine yapılan giriş işleminin Selenium kullanılarak nasıl otomatikleştirileceğini göstermektedir. Projede Maven, Selenium, WebDriverManager ve TestNG kullanılmıştır. Kodlama, testin çalıştırılması ve ekran görüntüsü alma adımları başarıyla tamamlanmış ve ödev gereklilikleri yerine getirilmiştir.


  Hazırlayan: Zeynep Gönül
  06.07.2025 / i2i Systems





