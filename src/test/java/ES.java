//
//import java.util.List;
//
//import javax.annotation.Resource;
//
//import org.elasticsearch.index.query.QueryBuilder;
//import org.elasticsearch.index.query.QueryBuilders;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.domain.Sort.Direction;
//import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
//import org.springframework.data.elasticsearch.core.aggregation.AggregatedPage;
//import org.springframework.data.elasticsearch.core.query.CriteriaQuery;
//import org.springframework.data.elasticsearch.core.query.GetQuery;
//import org.springframework.data.elasticsearch.core.query.IndexQuery;
//import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;
//import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
//import org.springframework.data.elasticsearch.core.query.SearchQuery;
//import org.springframework.data.elasticsearch.core.query.StringQuery;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.bawei.entity.Student;
//import com.bawei.util.ESUtils;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:applicationContext.xml")
//public class ES {
//	
//	@Resource
//	private ElasticsearchTemplate elasticsearchTemplate;
//	
//	
//	/**
//	 * 添加数据
//	 */
//	@Test
//	public void testAdd() {
//		//第一种方式
//		IndexQuery query = new IndexQuery();
//		
//		//第二种方式
//		new IndexQueryBuilder().build();
//		
//		Student stu = new Student(1, "张三", 20);
//		
//		//封装数据
//		query.setId(stu.getId().toString());
//		query.setObject(stu);
//		
//		elasticsearchTemplate.index(query);
//		
//		System.out.println("运行完毕");
//	}
//	
//	/**
//	 * 循环添加数据
//	 */
//	@Test
//	public void testAdd2() {
//		
//		IndexQuery query = new IndexQuery();
//		
//		for(int i=0;i<20;i++) {
//			
//			Student stu = new Student(i + 1, "张三"+i, 20+i);
//			
//			//封装数据
//			query.setId(stu.getId().toString());
//			query.setObject(stu);
//			
//			elasticsearchTemplate.index(query);
//		
//		}
//		
//		System.out.println("运行完毕");
//	}
//	
//	/**
//	 * 修改数据
//	 */
//	@Test
//	public void testUpdate() {
//		
//		IndexQuery query = new IndexQuery();
//		
//		new IndexQueryBuilder().build();
//		
//		Student stu = new Student(1, "张四", 22);
//		
//		//封装数据
//		query.setId(stu.getId().toString());
//		query.setObject(stu);
//		
//		elasticsearchTemplate.index(query);
//		
//		System.out.println("运行完毕");
//	}
//	
//	/**
//	 * 根据id获取数据
//	 */
//	@Test
//	public void testGet() {
//		GetQuery query = new GetQuery();
//		
//		query.setId("1");
//		
//		Student stu = elasticsearchTemplate.queryForObject(query , Student.class);
//		
//		System.out.println(stu);
//	}



	/**
	 * 
	 * 
	 * 
	 */
//	@Test
//	public void testGet2() {
//		String source = "{\"bool\": {\"must\": [{\"query_string\": {\"default_field\": \"id\",\"query\": \"1\"} }] }}";
//		StringQuery query = new StringQuery(source );
//		Student stu = elasticsearchTemplate.queryForObject(query  , Student.class);
//		
//		System.out.println(stu);
//	}
//	
//	/**
//	 * 删除数据
//	 */
//	@Test
//	public void testDel() {
//		String delete = elasticsearchTemplate.delete(Student.class, "1");
//		System.out.println(delete);
//	}



//	
//	/**
//	 * 查询全部数据
//	 */
//	@Test
//	public void testList() {
//		SearchQuery query = new NativeSearchQueryBuilder().build();
//		List<Student> list = elasticsearchTemplate.queryForList(query , Student.class);
//		
//		for (Student student : list) {
//			System.out.println(student);
//		}
//	}
//	



//	/**
//	 * 分页查询
//	 */
//	@Test
//	public void testPage() {
//		//从第0页开始
//		Pageable pageable = PageRequest.of(0, 10, Sort.by(Direction.DESC,"id"));
//		SearchQuery query  = new NativeSearchQueryBuilder().withPageable(pageable ).build();
//		
//		AggregatedPage<Student> page = elasticsearchTemplate.queryForPage(query, Student.class);
//		
//		List<Student> list = page.getContent();
////		for (Student student : list) {
////			System.out.println(student);
////		}
//		
//		list.forEach(System.out::println);
//		
//		System.out.println("当前页："+ page.getNumber());
//		System.out.println("总页数："+ page.getTotalPages());
//		System.out.println("总记录数："+ page.getTotalElements());-
//		System.out.println("当前页的记录数："+ page.getNumberOfElements());
//		
//		
//	}
//	





//	/**
//	 * 模糊查询，默认分页显示10条
//	 */
//	@Test
//	public void testMH() {
//		
//		QueryBuilder queryBuilder = QueryBuilders.multiMatchQuery("三", "name");
//		
//		SearchQuery query = new NativeSearchQueryBuilder().withQuery(queryBuilder ).build();
//		
//		List<Student> queryForList = elasticsearchTemplate.queryForList(query, Student.class);
//		
//		for (Student student : queryForList) {
//			System.out.println(student);
//		}
//	}
//	




//	/**
//	 * 高亮显示
//	 */
//	@Test
//	public void testHighLight() {
//		
//		AggregatedPage<?> page = ESUtils.selectObjects(elasticsearchTemplate, Student.class, 0, 10, "id", new String[] {"name"}, "张");
//		
//		List<?> list = page.getContent();
//		
//		for (Object object : list) {
//			System.out.println(object);
//		}
//	}
//	
//}
