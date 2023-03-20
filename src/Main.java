import java.util.*;
import java.util.logging.Logger;

public class Main {
    private static final String COPPYRIGHT = "copyright belongs to daipc@rekkeisoft.com";
    public static void main(String[] args) {
        System.err.println(COPPYRIGHT);
        treeMap("abc dè abc ghi jkl mlo asd ấ fasdf afdasd qwer qư rwe e dfgdfs sdf abc sdf fds ds fds fdsf "); // gọi hàm với văn bản truyền sẵn
    }

    public static void treeMap(String string){                      // tạo hàm treeMap()
        TreeMap<String, Integer> map = new TreeMap<>();             // tạo map rỗng với key sẽ là các Strong value kdl interger sẽ là số lượng chữ trong văn bản
        String[] strings = string.toLowerCase().split(" ");   // cắt chuỗi thành màng String[] đồng thời chuyển hết thành chữ thường.
        for (int i = 0; i < strings.length; i++) {                  // duyệt for để add vào map
            if (map.containsKey(strings[i])){                       // hàm if(map.containsKey(strings[i])) sẽ trả về true nếu strings thứ i này đã xuất hiện trong map
                int count = map.get(strings[i]);                    // tạo biến count để lấy số lượng chữ (Strings[i]) đã xuất hiện trong văn bản
                map.put(strings[i], ++count);                       // tăng giá trị của value
            }else map.put(strings[i], 1);                           // nếu if ở trên trả về false sẽ tạo 1 phẩn tử mới trong map với key là strings[i] value là 1.
        }
        System.out.println(  "Word ---- count");
        for (String str:map.keySet()
             ) {
            System.out.println(str + "----"+ map.get(str));

        }
    }
}
