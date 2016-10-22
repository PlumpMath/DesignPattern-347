package flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * ��Ԫģʽ����ҪĿ����ʵ�ֶ���Ĺ���������أ���ϵͳ�ж�����ʱ����Լ����ڴ�Ŀ�����ͨ���빤��ģʽһ��ʹ�á�
 * 
 * FlyWeightFactory���𴴽��͹�����Ԫ��Ԫ����һ���ͻ�������ʱ��������Ҫ��鵱ǰ��������Ƿ��з��������Ķ���
 * ����У��ͷ����Ѿ����ڵĶ���
 * ���û�У��򴴽�һ���¶���
 * FlyWeight�ǳ��ࡣ
 * 
 * һ�ᵽ����أ����Ǻ��������뵽Java�����JDBC���ӳأ�����ÿ�����ӵ��ص㣬���ǲ����ܽ�����������������һЩ������������һЩ���е����ԣ�
 * �������ݿ����ӳ���˵��url��driverClassName��username��password��dbname����Щ���Զ���ÿ��������˵����һ���ģ�
 * ���Ծ��ʺ�����Ԫģʽ��������һ�������࣬����������������Ϊ�ڲ����ݣ���������Ϊ�ⲿ���ݣ��ڷ�������ʱ�����������������������ͽ�ʡ�˿ռ䣬������ʵ����������
 * @author Administrator
 *
 */
public class DBConnectionPool {

	private int poolsize = 10;
	
	private List<Connection> conns = new ArrayList<Connection>(poolsize);
	
	private String url = "jdbc:Oracle://192.168.0.1:9090";
	private String username = "user";
	private String password = "user";
	private String driverClassName = "com.oracle.jdbc.driver";
	
	
	
	public DBConnectionPool(){
		for (int i = 0; i < poolsize; i++) {
			try {
				Class.forName(driverClassName);
				Connection conn = DriverManager.getConnection(url, username, password);
				conns.add(conn);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public Connection getConnection(){
		if (!conns.isEmpty()){
			Connection conn = conns.remove(0);
			return conn;
		}
		return null;
	}
	
	public void releaseConnection(Connection conn){
		conns.add(conn);
	}
}
