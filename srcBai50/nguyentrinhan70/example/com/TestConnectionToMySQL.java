package nguyentrinhan70.example.com;

import java.sql.Connection;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class TestConnectionToMySQL {

	public static void main(String[] args) {
		try{
			String strConn = "jdbc:mysql://localhost/phpmyadmin";
			Properties pro = new Properties();
			pro.put("user", "root");//root là thư mục mặc định
			pro.put("password", "");
			Driver driver = new Driver();
			Connection conn = driver.connect(strConn, pro);
			if(conn!=null){
				System.out.println("Kết nối cơ sở dữ liệu thành công");
			}
			else{
				System.out.println("Kết nối cơ sở dữ liệu thất bại");
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}

	}

}
