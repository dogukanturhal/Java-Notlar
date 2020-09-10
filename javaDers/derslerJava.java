import java.util.jar.Attributes.Name;

/**
 * derslerJava CamelCase Kullanılarak Yazılmaktadır.
 */
public class derslerJava { // Ana tanımlama
    public static void main(String[] args) {
        // Ana Kod Buraya Yazılacak

        System.out.println("Print Line"); // Konsola yazdırma komutu
        int Number = 10; // Degisken Tanımlama
        System.out.println("Print The Number You Declared : " + Number); // Tanımlanmış Değişkeni Yazdırma
        String Name = "Berna"; // String Değer Tanımlama
        System.out.println(Name); // String Değeri Yazdır

        /* Veri Türleri */

        int newNumber = 61; // Sayısal Veri Türü -2Milyar + 2Milyar aralığında
        String newName = "Dogukan"; // Yazısal Veri Türü
        double newDouble = 12.5; // Ondalık Veri Türü
        byte newByte = 37; // -128 +127 Aralığında Veri Girişine İzin verir
        short newShort = 32000; // -32768 + 32767 Aralığında Sayılsal Veri Alır
        char newChar = 'A'; // Karekter Verisi Tutar
        boolean newBool = true; // 1 veya 0, True veya False Olacak Şekilde Değer Alır
        System.out.println("Int : " + newNumber + " String : " + newName + " Double :" + " Byte : " + newByte
                + " Short : " + newShort + " Char : " + newChar + " Boolean : " + newBool);

        /* !!! Veri Türleri !!! */

        /* Sorgular */
        // Üst taraftaki veriler kullanılacaktır

        if (newBool != false) {
            /*
             * Sorgu Değerleri ! = Eşit Değilse == Eşitse < Küçükse > Büyükse <= Küçük
             * Eşitse / >= Büyük Eşitse
             */
            System.out.println("Bool Value : " + newBool);
        }
        if (newNumber > 50 || newBool == false) {
            /*
             * Birden Fazla Sorgu Tipler || OR && AND
             */
            System.out.println("Birden Fazla Sorgu");
        } else if (newDouble < 30 && newByte > 55) {
            System.out.println("Ilk Sart Saglanmadı Yeni Sorgulu Sistem Calisti");
        } else { // if çalışmazsa herhangi bir sorgu işlemi uygulamadan buna geç

            System.out.println("Sartlar Saglanmadi");
        }
        /*
         * if çalışmazsa else if else if çalışmazsa else çalışır
         */

        switch (newChar) { // Belirli Durumlarda Kullanılır
            case 'A':
                System.out.println("Case Calisti");
                break;

            default:
                System.out.println("Herhangi Bir Sart Saglanmadi");
                break;
        }
        /* !!! Sorgular !!! */

        /* Döngüler */
        for (int i = 0; i < 5; i++) { // Üç adet Değer üzerinde Çalışır 1-Değişken 2-Şart 3-Arttırım yada Azaltım
            System.out.println("Dongu Calisti");
        }
        int i = 0;
        int a = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            // i arttırılmazsa Sonsuz Döngü Oluşur.
        }
        do {// ilk olarak do komutu çalışır sonra döngü çalışır
            System.out.println(i);
            a++;
        } while (a < 5);
        /* !!! Döngüler !!! */

        /* Diziler */
        String[] studentNames = new String[4]; // 4 Elemanlı Bir String Dizisi
        studentNames[0] = "Dogukan";
        studentNames[1] = "Berna";
        studentNames[2] = "Habip";
        studentNames[3] = "Mutlu";
        double[] newDoubleArray = { 2.4, 2.5, 2.6 }; // Kendisi yeni dizi oluşumunu gerçekleştiriyor tekrardan new
                                                     // tanımlamamıza gerek yoktur
        for (int b = 0; b < studentNames.length; b++) {
            System.out.println(studentNames[b]);

            // Bu kod şu şekilde de yazılabilir
        }
        double sumOfArray = 0;
        double maxNumberOfArray = newDoubleArray[0];
        for (double newArray : newDoubleArray) { // İçindeki değerleri newArray'e Aktar ve Boyutu Kadar Döngü İşlemi
                                                 // Uygular
            if (maxNumberOfArray < newArray) {
                // En büyük sayıyı bulma
                maxNumberOfArray = newArray;
            }
            sumOfArray += newArray; // Dizinin içindeki sayıların toplamını hesapla
        }
        System.out.println(maxNumberOfArray);
        System.out.println(sumOfArray);

        /* Çok Boyutlu Diziler */
        String[][] cities = new String[3][3];
        cities[0][0] = "Ankara";
        cities[0][1] = "Konya";
        cities[0][2] = "Kutahya";
        cities[1][0] = "Istanbul";
        cities[1][1] = "Bursa";
        cities[1][2] = "Tekirdag";
        cities[2][0] = "Trabzon";
        cities[2][1] = "Rize";
        cities[2][2] = "Artvin";

        // İç içe döngüler
        for (int Loop = 0; Loop <= 2; Loop++) {
            for (int nestedLoop = 0; nestedLoop <= 2; nestedLoop++) {
                System.out.println(cities[Loop][nestedLoop]);
            }
        }
        /* !!! Çok Boyutlu Diziler !!! */
        /* !!! Diziler !!! */

        /* Stringler */
        String stringVal = "String is array of chars. ";
        System.out.println(stringVal);
        System.out.println("Print Length Of Array : " + stringVal.length());
        System.out.println("Print val at second index : " + stringVal.charAt(1)); // Index 0'dan Başlar
        System.out.println(stringVal.concat("added with concat"));
        System.out.println(stringVal.startsWith("S")); // Eğer Başlangıç S ise True Değer Değilse False Gönder
        System.out.println(stringVal.endsWith("h")); // Eğer Bitiş . ise True Değer Değilse False Gönder
        char[] transportCharArray = new char[6];
        stringVal.getChars(0, 6, transportCharArray, 0); // Yazı "String" gönderilecek ve 0. indisten başlayacak
        System.out.println(transportCharArray);
        System.out.println(stringVal.indexOf("arr")); // İndex içinde arama yaptırır
        System.out.println(stringVal.lastIndexOf("ch")); // İndex içinde arama yaptırır fakat sondan arama yapar
        System.out.println(stringVal.replace(' ', '%')); // Belirttiğimiz boşluğunun yerine % ekle (değiştirme komutu)
        System.out.println(stringVal.substring(2, 6)); // Index içinde belirlediğimiz aralıkta ki yazıları al 6'yı almaz
        for (String splitString : stringVal.split(" ")) { // Index içinde boşluğa göre ayır (yeni dizi oluşur o yüzden
                                                          // for döngüsü kullandık)
            System.out.println(splitString);
        }
        System.out.println(stringVal.toLowerCase()); // Bütün Harfleri Küçült
        System.out.println(stringVal.toUpperCase()); // Bütün Harfleri Büyült
        System.out.println(stringVal.trim()); // Başında ve Sonundaki Boşlukları Sil
        /* !!! Stringler !!! */

        /* Metodlar */

        /*
         * Metodlar Nedir ? Basit Kısa ve Bir İşi Yapacak Şekilde Tasarım Yapılması
         * Gereken Parçalanabilir Yapı Oluşturmak İçin Tekrardan Kullanılabilir
         * Yapılardır
         */
        int search = numberFinder(); /* Metodu Çağır ve dönen değeri atama yap */
        searchNumbers(search); /* Metodu Çağır */
        int result = sumOfNumberArray(3, 5, 9, 6, 7, 5, 1, 12, 6, 98, 102); /* Metodu Çağır ve result'a eşitle */
        System.out.println(result); /* Sonucu Yazdır */
        /* !!! Metodlar !!! */

        /* Sınıflar */
        CustomerManager customerManager = new CustomerManager(); // tanımlanmış sınıf için bellekte yerel bir bölüm
                                                                 // oluşturuldu.
        customerManager.addNewCustomer(); // Sınıfın içindeki "addNewCustomer" metodunu çalıştır.
        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.sumOfNumbers(10, 11));
        System.out.println(dortIslem.subOfNumbers(10, 11));
        System.out.println(dortIslem.multipleOfNumbers(10, 11));
        System.out.println(dortIslem.divideOfNumbers(10, 10));
        /* Yada */
        int cevap = dortIslem.divideOfNumbers(50, 5);
        System.out.println(cevap);
        Product newProduct = new Product();
        
        ProductManager manageProducts = new ProductManager();
        manageProducts.addProduct(newProduct); // Buraya yerelde ki bölümün ismini yazıyoruz. Sonrasında tanımladığımız
                                               // sınıfın içinde belirttiğimiz özelliği kendisi alıyor
        /* !!! Sınıflar !!! */

        /* Encapsulation */
        /*
        * Herhangi bir alanı kullanmak için kullanıcıyı kısıtlar
        */
        System.out.println("------------------------");
        newProduct.setProductRenk("Siyah");
        newProduct.setProductName("Bilgisayar");
        newProduct.setProductDescription("Lenovo");
        newProduct.setProductId(1);
        newProduct.setProductPrice(13999.99);
        newProduct.setProductStock(2);
        System.out.println(newProduct.getProductName());
        System.out.println(newProduct.getId());
        System.out.println(newProduct.getDescription());
        System.out.println(newProduct.getkod());
        System.out.println(newProduct.getPrice());
        System.out.println(newProduct.getStock());
        System.out.println(newProduct.getRenk());
        System.out.println("------------------------");
        
        /* !!! Encapsulation !!! */
        /* Yapılacak Eklemeler */

    }

    /* 1.Metod */
    public static int numberFinder() { // int double float gibi değerler return değer döndürmek zorundadır
        int[] numbers = { 1, 2, 5, 7, 12, 6 };
        int search = 7;
        boolean numberHasFound = false;
        for (int searchNumbers : numbers) {
            if (searchNumbers == search) {
                numberHasFound = true;
                break;
            }
        }
        if (numberHasFound) {
            System.out.println("Number Has Found. Success !!!");
            return search;
        } else {
            System.out.println("Number Cannot Be Found !!!");
            return 0;
        }

    }

    /* 2.Metod */
    public static void searchNumbers(int search) {
        System.out.println("Number Has Found : " + search);
    }

    /* 3.Metod */
    public static int sumOfNumberArray(int... numberArray) { // Birden fazla değişkeni kabul edebiliyor.
        int sumOfNumbers = 0;
        for (int numbersInArray : numberArray) {
            sumOfNumbers += numbersInArray;
        }
        return sumOfNumbers;
    }
}