public class Antondanriko {
    public static void main(String[] args){
        Person orang = new Person();

        orang.Nama = "Anton";
        orang.jenisKelamin = "Laki-laki";
        orang.umur = 21;
        System.out.println("Nama          : "+ orang.Nama);
        System.out.println("Jenis Kelamin : "+ orang.jenisKelamin);
        System.out.println("Umur          : "+ orang.umur);

        orang.Nama = "Riko";
        orang.jenisKelamin = "Laki-laki";
        orang.umur = 19;
        System.out.println("Nama          : "+ orang.Nama);
        System.out.println("Jenis Kelamin : "+ orang.jenisKelamin);
        System.out.println("Umur          : "+ orang.umur);
    }
}
