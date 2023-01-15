public class ExcelAktarici implements IAktarici{
    @Override
    public void aktar(boolean basliklariIcersin) {
        if(basliklariIcersin == true){
            System.out.println("Excel aktaricisi tablo basliklari icerecektir");
        }
        else
            System.out.println("Excel aktaricisi tablo basliklari icermeyecektir");
    }
}
