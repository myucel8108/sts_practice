/*
 * package kr.co.rland.web.repository.mybatis;
 * 
 * import java.util.List;
 * 
 * import org.apache.ibatis.session.SqlSession; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Repository;
 * 
 * import kr.co.rland.web.entity.Menu; import
 * kr.co.rland.web.repository.MenuRepository;
 * 
 * //1. MYBatis 의 Session 객체를 이용해 Mapper로 구현된 클래스를 가져오는 방법 // -인터페이스 타입에
 * Sqlsession.getMapper(인터페이스 타입.class); // -Sqlsession.selectList("패키지.메퍼.함수명")
 * // -인터페이스에 @Mapper Annotation 불러오기(근데 오버로드는 어떻게 함..?)
 * 
 * 
 * //@Repository //서비스를 갖다 쓰는 친구 public class MbMenuRepository implements
 * MenuRepository {
 * 
 * 
 * private SqlSession session; private MenuRepository repository;
 * 
 * @Autowired public MbMenuRepository(SqlSession session) { // TODO
 * Auto-generated constructor stub super(); this.session = session;
 * this.repository = session.getMapper(MenuRepository.class); }
 * 
 * 
 * // @Override // public List<Menu> findAll() { //// MenuRepository repository
 * = session.getMapper(MenuRepository.class); //// return
 * repository.findAll(0,10,null,null,null,null,null); // return
 * session.selectList("kr.co.rland.web.repository.MenuRepository.findAll"); // }
 * // @Override // public List<Menu> findAll(Integer offset, Integer size) {
 * //// MenuRepository repository = session.getMapper(MenuRepository.class); //
 * return repository.findAll(offset, size,null,null,null,null,null); // }
 * 
 * @Override public Menu findById(long id) { return null; }
 * 
 * @Override public Menu insert(Menu menu) { return null; }
 * 
 * @Override public Menu update(Menu menu) { return null; }
 * 
 * @Override public void delete(long id) {
 * 
 * }
 * 
 * // @Override // public List<Menu> findAll(Integer offset, Integer size,
 * String query, Integer category, Integer price, // String orderField, String
 * orderDir) { //// MenuRepository repository =
 * session.getMapper(MenuRepository.class); // return repository.findAll(); // }
 * 
 * @Override public List<Menu> findAllByIds(List<Long> ids) { // List<Menu> list
 * = session.selectList("kr.co.rland.web.repository.MenuRepository",ids); //
 * MenuRepository repository = session.getMapper(MenuRepository.class); return
 * repository.findAllByIds(ids); }
 * 
 * 
 * @Override public List<Menu> findAll(Integer offset, Integer size, String
 * query, Integer categoryId, Integer price, String orderField, String orderDir)
 * { // TODO Auto-generated method stub return null; }
 * 
 * 
 * @Override public Integer count(String query, Integer categoryId, Integer
 * price) { // TODO Auto-generated method stub return 0; }
 * 
 * 
 * 
 * }
 */