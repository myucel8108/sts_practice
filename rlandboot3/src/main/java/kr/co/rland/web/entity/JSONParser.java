package kr.co.rland.web.entity;

import java.lang.reflect.Field;

public class JSONParser{
	
	private Object  entity;
	public JSONParser(Object entity) {
		this.entity=entity;
		
		
	}
	
	
	public String toJSON() throws IllegalArgumentException, IllegalAccessException {
		StringBuilder builder = new StringBuilder(); //문자열을 더하지말고 bulider를 써자
		
		builder.append("{");
		
		Field[] fields =	entity.getClass().getDeclaredFields();
		for(Field f: fields) {
			f.setAccessible(true);
			String name = f.getName();
			Column col = f.getAnnotation(Column.class);
			
			if(col != null) {
				name = col.value();
			}
			
			Object value =f.get(entity);
			String filedVaule = String.format("\"%s:%s\"",name,value);
			builder.append(filedVaule);
			builder.append(",");
		}
		
		
		builder.append("}");
		
		String json = builder.toString();
		
		
		return json;
		
	}
		
	
}
