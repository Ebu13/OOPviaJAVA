# SOLID Prensipleri

SOLID, yazılım geliştirme sürecinde kullanılan beş tasarım prensibini ifade eder. Bu prensipler, kodun daha okunabilir, bakımı daha kolay ve genel olarak daha esnek olmasını sağlamak için kullanılır.

## Tek Sorumluluk Prensibi (SRP)

Bir sınıfın yalnızca bir görevi olmalıdır ve sınıfın değişmesi gereken yalnızca bir nedeni olmalıdır. Bu prensip, bir sınıfın çok fazla sorumluluk üstlenmemesini sağlar, böylece kod daha modüler ve daha kolay bakım yapılabilir hale gelir.

## Açık/Kapalı Prensibi (OCP)

Yazılım birimleri (sınıflar, modüller, fonksiyonlar vb.), genişletilebilir olmalı ancak değiştirilemez olmalıdır. Yani, mevcut kodu değiştirmeden yeni işlevselliği ekleyebilmelidir. Bu prensip, kodun değişikliklere daha dirençli olmasını sağlar.

## Liskov Yerine Geçme Prensibi (LSP)

Bir sınıf, onun alt sınıflarının yerine geçebilir olmalıdır. Yani, bir üst sınıfın nesnesinin, alt sınıflarından herhangi biriyle değiştirilebilmesi gerekir ve bu değişiklik, programın beklendik şekilde davranışını etkilememelidir. Bu prensip, kalıtım hiyerarşisinde doğru ve tutarlı bir yapı sağlar.

## Arayüz Ayırma Prensibi (ISP)

Mümkün olduğunca özelleştirilmiş arayüzler tanımlamak gerekir, böylece istemci sadece ihtiyacı olan yöntemlere sahip arayüzleri uygular. Bir arayüzün, ihtiyaç duyulmayan yöntemleri içermemesi önemlidir. Bu prensip, istemcilerin gereksinimlerine uygun arayüzlerin sağlanmasını sağlar.

## Bağımlılıkları Tersine Çevirme Prensibi (DIP)

Yüksek seviyeli modüller, düşük seviyeli modüllere bağlı olmamalıdır. Bu prensip, soyutlamalar kullanarak bağımlılıkları tersine çevirme fikrini savunur. Böylece, kodun bağımlılıkları daha az katı hale gelir ve değişikliklere daha uygun hale gelir.

Bu prensipler, genel olarak, kodun daha esnek, bakımı daha kolay ve değişikliklere daha uygun olmasını sağlar. Bu nedenle, yazılım mühendisliği alanında SOLID prensiplerinin uygulanması yaygın bir uygulamadır. src klasöründe SOLID prensipleri denediğim java projeme göz atabilirsiniz.

