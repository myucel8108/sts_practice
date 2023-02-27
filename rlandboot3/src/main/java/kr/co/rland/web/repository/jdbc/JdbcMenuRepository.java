package kr.co.rland.web.repository.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;

public class JdbcMenuRepository implements MenuRepository {

   @Override
   public List<Menu> findAll() {
      // TODO Auto-generated method stub

      String sql = String.format("select id, name, price, regDate, categoryId , regMemberId from menu");
      List<Menu> list = new ArrayList<>();

      try {
         Class.forName("org.mariadb.jdbc.Driver");
         String url = "jdbc:mariadb://db.newlecture.com:3306/rlanddb";
         Connection con = DriverManager.getConnection(url, "rland", "20220823");

         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery(sql);

         // 필터링, 집계, 정렬
         while (rs.next()) // 서버의 커서를 한칸 내리고 그 위치의 레코드를 옮겨 오는 것. -> 레코드 하나가 저장되는 공간은?
         {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int price = rs.getInt("price");
            Date regDate = rs.getDate("regDate");
            int categoryId = rs.getInt("categoryId");
            long regMemberId = rs.getLong("regMemberId");
            Menu menu = new Menu(id, name, price, regDate,categoryId,regMemberId);
            list.add(menu);
         }
         con.close();
      } catch (Exception e) {
         e.printStackTrace();
      }
      return list;

   }
}