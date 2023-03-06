package kr.co.rland.web.repository.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.stereotype.Repository;

import com.zaxxer.hikari.HikariDataSource;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;

//@Repository
public class JdbcMenuRepository implements MenuRepository {

	@Autowired
	private DataSource dataSource;

	@Override
	public List<Menu> findAll() {

		/*
		 * String sql = String.
		 * format("select id, name, price, regDate, categoryId , regMemberId from menu"
		 * );
		 * 
		 * //스프링을 통해 사용하는 기본 데이터 소스 DataSourceBuilder dataSourceBuilder =
		 * DataSourceBuilder.create();
		 * dataSourceBuilder.driverClassName("org.mariadb.jdbc.Driver"); //드라이버 이름
		 * dataSourceBuilder.url("jdbc:mariadb://db.newlecture.com:3306/rlanddb"); //url
		 * dataSourceBuilder.username("rland"); //시용자명
		 * dataSourceBuilder.password("20220823"); //비밀번호 DataSource dataSource =
		 * dataSourceBuilder.build();//정보를 전달하기
		 * 
		 * 
		 * 
		 * JdbcTemplate template = new JdbcTemplate(dataSource);
		 * 
		 * List<Menu> list = template.query(sql, new BeanPropertyRowMapper(Menu.class));
		 * //우리가 작성해야할 내용에서 나머지는 라이브러리가 해주는 것 필터링 집계 정렬을 한번에!
		 */

		String sql = "select id, name, price, regDate, categoryId from menu";

		/*
		 * DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
		 * dataSourceBuilder.driverClassName("org.mariadb.jdbc.Driver");
		 * dataSourceBuilder.url("jdbc:mariadb://db.newlecture.com:3306/rlanddb");
		 * dataSourceBuilder.username("rland"); dataSourceBuilder.password("20220823");
		 */
//
//		dataSource = dataSourceBuilder.build();

		JdbcTemplate template = new JdbcTemplate(dataSource); 
		List<Menu> list = template.query(sql, new BeanPropertyRowMapper(Menu.class));
		return list;

	}

	@Override
	public Menu findById(long id) {
	
		return null;
	}

	@Override
	public Menu insert(Menu menu) {

		return null;
	}

	@Override
	public Menu update(Menu menu) {
	
		return null;
	}

	@Override
	public void delete(long id) {

		
	}

}

//기존에 사용하던 방식
/*
 * @Override public List<Menu> findAll() { // TODO Auto-generated method stub
 * 
 * String sql = String.
 * format("select id, name, price, regDate, categoryId , regMemberId from menu"
 * ); List<Menu> list = new ArrayList<>();
 * 
 * try { Class.forName("org.mariadb.jdbc.Driver"); String url =
 * "jdbc:mariadb://db.newlecture.com:3306/rlanddb"; Connection con =
 * DriverManager.getConnection(url, "rland", "20220823");
 * 
 * Statement st = con.createStatement(); ResultSet rs = st.executeQuery(sql);
 * //con.setAutoCommit(false); 무언가 sql를 실행하고 바로 오토로 커밋시켜주는 것 // 필터링, 집계, 정렬
 * while (rs.next()) // 서버의 커서를 한칸 내리고 그 위치의 레코드를 옮겨 오는 것. -> 레코드 하나가 저장되는 공간은?
 * { int id = rs.getInt("id"); String name = rs.getString("name"); int price =
 * rs.getInt("price"); Date regDate = rs.getDate("regDate"); int categoryId =
 * rs.getInt("categoryId"); long regMemberId = rs.getLong("regMemberId"); Menu
 * menu = new Menu(id, name, price, regDate,categoryId,regMemberId);
 * list.add(menu); } con.commit(); con.close(); } catch (Exception e) {
 * //con.rollback; e.printStackTrace(); } return list;
 * 
 * } }
 */