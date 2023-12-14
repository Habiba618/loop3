import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /**  int eded;
        double cem = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("ededi daxil edin: ");
        eded=sc.nextInt();
        for (double i =1; i<=eded; i++){
            cem += (1/i);
        }
        System.out.println("cem = " + cem); */

      /*//Java'da döngüler kullanarak yıldızlar ile elmas yapınız.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elmasın yüksekliğini (tek sayı) girin: ");
        int yukseklik = scanner.nextInt();
        // Üst kısmı oluştur
        if(yukseklik%2==1){
        for (int i = 1; i <= yukseklik; i += 2) {
            // Boşlukları ekle
            for (int j = 0; j < (yukseklik - i) / 2; j++) {
                System.out.print(" ");
            }
           // Yıldızları ekle
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println(); // Bir sonraki satıra geç
        }
        // Alt kısmı oluştur
        for (int i = yukseklik - 2; i >= 1; i -= 2) {
            // Boşlukları ekle
            for (int j = 0; j < (yukseklik - i) / 2; j++) {
                System.out.print(" ");
            }
            // Yıldızları ekle
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println(); // Bir sonraki satıra geç
        }
        scanner.close();} else{
            System.out.println("Tek eded daxil edin...");
        }*/

       /** //ATM işlemlerini "Switch-Case" kullanarak yapınız.
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                   switch (select) {
                       case 1: System.out.print("Para miktarı : ");
                        int price = input.nextInt();
                        balance += price;
                        break;
                       case 2:
                        System.out.print("Para miktarı : ");
                         price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            balance -= price;
                        }
                    break;
                       case 3:
                        System.out.println("Bakiyeniz : " + balance);
                 break;}
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }*/

       /* int i = 1;
        int ebob = 1;
                Scanner sc = new Scanner(System.in);

        System.out.print("Birinci ededi daxil edin: ");
        int a = sc.nextInt();
        System.out.print("Ikinci ededi daxil edin: ");
        int b = sc.nextInt();

        int c = (a < b) ? a : b;

        while (i <= c) {
            if (a % i == 0 && b % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("ebob: " + ebob); */

        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci ededi daxil edin: ");
        int c = sc.nextInt();
        System.out.print("Ikinci ededi daxil edin: ");
        int d = sc.nextInt();

        int m = (c > d) ? c : d;
int j=m;
int ekob;
        while (j >= m) {
                    if (j % c == 0 && j % d == 0) {
                        ekob = j;
                        System.out.println("ekob: " + ekob);
                        break;
            }
            j++;
        }


    }
    }




