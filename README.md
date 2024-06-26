# Layanan Manajemen Pelanggan

Proyek ini adalah layanan manajemen pelanggan sederhana yang diimplementasikan dalam Java. Ini menyediakan fungsionalitas untuk mengelola data pelanggan, termasuk menambahkan pelanggan, mencantumkan detail pelanggan, menghitung saldo total dan rata-rata, serta memfilter pelanggan berdasarkan status kredit mereka.

## Struktur Proyek

- **com.enigmacamp.dao**
    - `CustomerServiceImpl.java`: Implementasi dari antarmuka `CustomerService`.

- **com.enigmacamp.customerdata**
    - `CustomerData.java`: POJO sederhana yang merepresentasikan data pelanggan.

- **com.enigmacamp.service**
    - `CustomerService.java`: Antarmuka yang mendefinisikan metode layanan pelanggan.

- **com.enigmacamp.menu**
    - `Menu.java`: Menyediakan antarmuka pengguna untuk mengakses berbagai layanan manajemen pelanggan.

## Kelas dan Metode

### CustomerServiceImpl

`CustomerServiceImpl` mengimplementasikan antarmuka `CustomerService` dan menyediakan metode-metode berikut:

- `List<CustomerData> addCustomer()`: Menambahkan daftar pelanggan yang telah ditentukan.
- `void listCountCustomer(List<CustomerData> customers)`: Mencetak jumlah total pelanggan.
- `void saldoTotalCustomer(List<CustomerData> customerData)`: Mencetak total saldo tabungan semua pelanggan.
- `void averageTotalCustomer(List<CustomerData> customerData)`: Mencetak rata-rata saldo tabungan semua pelanggan.
- `void minSaldoCustomer(List<CustomerData> customerData)`: Mencetak saldo tabungan minimum di antara pelanggan.
- `void listCreditCustomer(List<CustomerData> customerData)`: Mencantumkan pelanggan berdasarkan status kredit mereka.
- `void listCustomerLongers(List<CustomerData> customerData)`: Mencetak nama pelanggan yang paling panjang.

### Menu

`Menu` menyediakan antarmuka pengguna untuk mengakses berbagai layanan manajemen pelanggan:

- `void displayMenu()`: Menampilkan menu pilihan kepada pengguna.
- `void mainMenu()`: Mengelola interaksi pengguna dengan menu.
- `void listCustomer()`: Mencantumkan semua pelanggan.
- `void listCountCustomer()`: Mencantumkan jumlah total pelanggan.
- `void saldoTotalCustomer()`: Menghitung dan mencetak total saldo pelanggan.
- `void listCreditCustomer()`: Mencantumkan pelanggan berdasarkan status kredit mereka.
- `void listCustomerLongers()`: Menemukan pelanggan dengan nama terpanjang.
- `void averageTotalCustomer()`: Menghitung dan mencetak rata-rata saldo pelanggan.
- `void minSaldoCustomer()`: Menemukan dan mencetak saldo tabungan minimum di antara pelanggan.

## Penggunaan Lambda dan Stream

Proyek ini menggunakan fitur lambda dan stream dari Java 8 untuk memproses data pelanggan secara efisien dan ringkas. Berikut adalah beberapa contoh penerapan lambda dan stream:

### Menghitung Jumlah Pelanggan

```java
public void listCountCustomer(List<CustomerData> customers) {
    Long count = customers.stream().count();
    System.out.println("Jumlah pelanggan: " + count);
}

public void saldoTotalCustomer(List<CustomerData> customerData) {
    double totalSaldo = customerData.stream()
            .mapToDouble(CustomerData::getSavingBalance)
            .sum();
    System.out.println("Total saldo: " + totalSaldo);
}

public void averageTotalCustomer(List<CustomerData> customerData) {
    double averageSaldo = customerData.stream()
            .mapToDouble(CustomerData::getSavingBalance)
            .average().orElse(0.0);
    System.out.println("Rata-rata saldo: " + averageSaldo);
}

public void minSaldoCustomer(List<CustomerData> customerData) {
    Optional<Double> minSaldo = customerData.stream()
            .map(CustomerData::getSavingBalance)
            .min(Double::compareTo);
    System.out.println("Minimum saldo: " + minSaldo);
}

public void listCreditCustomer(List<CustomerData> customerData) {
    System.out.println("-".repeat(50));
    System.out.println("Pelanggan dengan status kredit baik: ");
    System.out.println("-".repeat(50));
    customerData.stream()
            .filter(customer -> customer.getCreditStatus().equals("baik"))
            .map(CustomerData::getName)
            .forEach(System.out::println);
    // ... (kode lainnya untuk status kredit netral dan buruk)
}

public void listCustomerLongers(List<CustomerData> customerData) {
    Optional<String> name = customerData.stream()
            .map(CustomerData::getName)
            .max(String::compareTo);
    System.out.println("Pelanggan yang paling panjang: " + name);
}
```


