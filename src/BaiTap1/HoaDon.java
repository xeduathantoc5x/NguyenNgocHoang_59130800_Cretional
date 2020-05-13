
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
                    +"\n S? l��ngj: "  +chiTiet.get(i).getSoLuong()
                    +"\n ��n gi�: "   +chiTiet.get(i).getDonGia()
                    +"\n Chi?t kh?u: "+chiTiet.get(i).getChietKhau();
       }
       return inHD;
    }
    
    public String hienThiHDH()
    {
        return "Th�ng tin h�a ��n   :"
               +"\nM? h�a ��n: " + header.getMaHoaDon() +
                "\nT�n kh�ch h�ng: " + header.getTenKhachHang() +
                "\nNg�y b�n: " + header.getNgayBan()
               +"\nDanh s�ch m?t h�ng: " + toString();
    }

}

