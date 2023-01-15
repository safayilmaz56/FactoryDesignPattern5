public class CsvAktarici implements IAktarici{
    @Override
    public void aktar(boolean basliklariIcersin) {
        if(basliklariIcersin == true){
            System.out.println("CSV aktaricisi tablo basliklari icerecektir");
        }
        else
            System.out.println("CSV aktaricisi tablo basliklari icermeyecektir");
    }
}
