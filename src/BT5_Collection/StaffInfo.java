package BT5_Collection;

import java.util.HashMap;
import java.util.Map;

public class StaffInfo {
    public void staff() {
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Mã số nhân viên", "001");
        hashMap.put("Họ và tên", "Nguyễn Văn A");
        hashMap.put("Tuổi", "30");
        hashMap.put("Số điện thoại", "123456");
        for (String i : hashMap.keySet()) {
            System.out.println(i + ": " + hashMap.get(i));
        }
    }

    public static void main(String[] args) {
        StaffInfo obj = new StaffInfo();
        obj.staff();
    }
}