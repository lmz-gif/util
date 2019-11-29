//
//
//import java.io.IOException;
//import java.io.Serializable;
//import java.util.List;
//import java.util.Set;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.HashOperations;
//import org.springframework.data.redis.core.ListOperations;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.SetOperations;
//import org.springframework.data.redis.core.ValueOperations;
//import org.springframework.data.redis.core.ZSetOperations;
//import org.springframework.data.redis.core.ZSetOperations.TypedTuple;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.lmz.utils.SerializeUtils;
//


///**
//  * @author lmz
//  * @date 2019年11月8日 下午1:37:14
//  * 
//  */
//@RunWith(SpringRunner.class)
//@ContextConfiguration("classpath:spring-beans.xml")
//public class RedisTest {
//	@Autowired
//	RedisTemplate<Object , Object> redisTemplate;
//	


//	/**
//	 *  string
//	 *
//	 *
//	 */
//	@Test
//	public void string() {
//		ValueOperations<Object , Object> string = redisTemplate.opsForValue();
//		string.set("name", "lmz");
//		string.set("age", "18");
//		
//		System.out.println("name="+string.get("name")+"\n"+"age="+string.get("age"));
//		
//	}
//	


//	@Test
//	public void hashTest() {
//		@SuppressWarnings("unused")
//		HashOperations<Object, Object, Object> hash = redisTemplate.opsForHash();

////		hash.put("person", "age", 2);
////		System.out.println(hash.get("person", "age"));

////		Map<Object, Object> entries = hash.entries("person");
////		System.out.println(entries);

////		System.out.println(hash.keys("person"));


////		HashMap<Object, Object> hashMap = new HashMap<>();
////		hashMap.put("1",new Person("张三", 18));
////		hashMap.put("2",new Person("lmz", 18));
////		hashMap.put("3",new Person("lzh", 30));
////		hashMap.put("4",new Person("李四", 25));
////		hash.putAll("person", hashMap);
////		Map<Object, Object> entries = hash.entries("person");

////		Set<Entry<Object, Object>> entrySet = entries.entrySet();
////		for (Entry<Object, Object> entry : entrySet) {
////			System.out.println(entry);
////		}
//	}
//	




//	@Test
//	public void setTest() {
//		SetOperations<Object, Object> set = redisTemplate.opsForSet();


////		set.add("person_set", new Person("lmz", 18),new Person("lzh", 38));
////		Set<Object> members = set.members("person_set");
////		for (Object object : members) {
////			System.out.println(object);
////		}
////		set.add("person1", new Person("lmz", 18),new Person("lmj", 17));

////		Set<Object> difference = set.difference("person_set", "person1");//第一参数与第二参数的差别
////		System.out.println(difference);


////		Set<Object> intersect = set.intersect("person_set", "person1");//交集
////		System.out.println(intersect);

//		System.out.println(set.union("person_set", "person1"));//并集
//		
//	}



//	@Test
//	public void listTest() {
//		ListOperations<Object, Object> list = redisTemplate.opsForList();
////		list.leftPush("person_list", new Person("zhangsan", 19));
////		list.leftPush("person_list", new Person("lisi", 19));
////		list.leftPush("person_list", new Person("wangwu", 19));
//		List<Object> range = list.range("person_list", 0, 5);
//		for (Object object : range) {
//			System.out.println(object);
//		}
//		
//	}
//	
//	@Test
//	public void zsetTest() {
//		ZSetOperations<Object, Object> zSet = redisTemplate.opsForZSet();
////		zSet.add("person_zset", new Person("lzh", 38), 90);
////		zSet.add("person_zset", new Person("lmz", 18), 98);
////		zSet.add("person_zset", new Person("lmj", 17), 93);
////		zSet.add("person_zset", new Person("qxx", 18), 97);
////		
////		Set<Object> range = zSet.range("person_zset", 0, -1);
////		for (Object object : range) {
////			System.out.println(object);
////		}
//		
//		
////		Set<TypedTuple<Object>> rangeWithScores = zSet.rangeWithScores("person_zset", 0, -1);
////		for (TypedTuple<Object> typedTuple : rangeWithScores) {
////			System.out.println(typedTuple.getValue()+"====="+typedTuple.getScore());
////		}
//		
////		zSet.add("person_zset", new Person("lzh", 38), 100);
//		Set<TypedTuple<Object>> reverseRangeByScore = zSet.reverseRangeWithScores("person_zset", 0, -1);
//		for (TypedTuple<Object> typedTuple : reverseRangeByScore) {
//			System.out.println(typedTuple.getValue()+"====="+typedTuple.getScore());
//		}
//		
//		
//	}
//	
//	@Test
//	public void SerislizeTest() throws IOException, ClassNotFoundException {
////		Person person1 = new Person("lmz", 18);
////		String str1 = SerializeUtils.serialize(person1);
////		System.out.println(str1);
////		Person serializeToObject1 = (Person)SerializeUtils.serializeToObject(str1);
////		System.out.println(serializeToObject1);
////		Person person2 = new Person("lmz", 18);
////		String str2 = SerializeUtils.serialize(person2);
////		System.out.println(str2);
////		System.out.println(str1.equals(str2));
//	}
//	
//	
//	
//}
