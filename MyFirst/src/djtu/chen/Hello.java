package djtu.chen;
import javax.swing.*;
import java.sql.*;
public class Hello {
    public static void main(String[] args) {
      /*  JFrame win1 =new JFrame("你好");
        JFrame win2 =new JFrame("你好2");
        win1.setBounds(200,200,400,400);
        win2.setBounds(200,200,400,400);
        win1.setVisible(true);
        win2.setVisible(true);*/
      //  System.out.println("hello,world!");
      /*  try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection con=null;
            con=DriverManager.getConnection("jdbc:derby:C:\\Users\\陈宫\\mydb");
            String sql="select * from mytable";
            Statement sta=con.createStatement();
            ResultSet rs=sta.executeQuery(sql);
            while(rs.next()){
                System.out.println("你好中国"+rs.getString(1)+rs.getString(2)+rs.getString(3)+rs.getString(4));

            }
            con.close();

        }
        catch (Exception e){
            System.out.println(e);
        }
*/
        Hugo hugo=new Hugo();
        hugo.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
