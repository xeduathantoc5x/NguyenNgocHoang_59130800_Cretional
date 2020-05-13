
package BaiTap1;
import java.util.ArrayList;

public class HoaDon 
{
    HoaDonHeader header = new HoaDonHeader();
    ArrayList<CTHD> chiTiet = new ArrayList<>();

    public HoaDon(Builder builder) 
    {
        this.header = builder.header;
        this.chiTiet = builder.chiTiet;
    }
   
    public static class Builder
    {
        HoaDonHeader header = new HoaDonHeader();
        ArrayList<CTHD> chiTiet = new ArrayList<>();

        public Builder() 
        {
        }
        
        public Builder addHoaDon(HoaDonHeader Header)
        {
            this.header = Header;
            return this;
        }
        
        public Builder addChiTietHoaDon(CTHD listHD)
        {
            this.chiTiet.add(listHD);
            return this;
        }
        
        public HoaDon build()
        {
            return new HoaDon(this);
        }

    }

    @Override
    public String toString() 
    {
       String inHD ="" ;
       for(int i = 0; i < chiTiet.size() ; i++)
       {
              inHD = "\n S?n ph?m: "   +chiTiet.get(i).getSanPham()
                    +"\n S? lýõngj: "  +chiTiet.get(i).getSoLuong()
                    +"\n Ðõn giá: "   +chiTiet.get(i).getDonGia()
                    +"\n Chi?t kh?u: "+chiTiet.get(i).getChietKhau();
       }
       return inHD;
    }
    
    public String hienThiHDH()
    {
        return "Thông tin hóa ðõn   :"
               +"\nM? hóa ðõn: " + header.getMaHoaDon() +
                "\nTên khách hàng: " + header.getTenKhachHang() +
                "\nNgày bán: " + header.getNgayBan()
               +"\nDanh sách m?t hàng: " + toString();
    }

}

