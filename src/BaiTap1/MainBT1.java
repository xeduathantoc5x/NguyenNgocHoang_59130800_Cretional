
package BaiTap1;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class MainBT1 {

    public static void main(String[] args) throws ParseException 
    {
       HoaDonHeader hoadonHeader1 = new HoaDonHeader
        ("HD01","Ð? Hoàng Anh",new SimpleDateFormat("dd/mm/yy").parse("24/5/1995"));
      //danh sach chi tiet hoa don
        CTHD cthd1 = new CTHD("SP01", "Laptop Gaming MSI core i7", 2, 25000000, 0.05f);
        CTHD cthd2 = new CTHD("SP02", "Máy ði?u h?a gi?i nhi?t Parasonic", 5, 18000000, 0.1f);
       HoaDon hoaDon2 = new HoaDon.Builder()
               .addHoaDon(hoadonHeader1)
               .addChiTietHoaDon(cthd1)
               .addChiTietHoaDon(cthd2)
               .build();
        System.out.println(hoaDon2.hienThiHDH());
    }   
}
