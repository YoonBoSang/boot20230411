package com.example.demo.mapper;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper03 {
	
	@Insert("""
			INSERT INTO MyTable34
			VALUES(#{val1}, #{val2})
			""")
	int sql1(Integer val1, String val2);
	
	@Insert("""
			INSERT INTO MyTable35
			VALUES (#{v1}, #{v2})
			""")
	int sql2(Double v1, String v2);
	
	@Insert("""
			INSERT INTO MyTable36
			VALUES(#{v1}, #{v2}, #{v3})
			""")
	int sql3(Dto09 dto09);
	
	@Insert("""
			INSERT INTO MyTable37
			VALUES (#{age}, #{name}, #{score})
			""")
	int sql4(Dto10 dto);
	
	@Insert("""
			INSERT INTO MyTable37
			VALUES (#{dto09.v1}, #{dto10.name}, #{dto09.v3})
			""")
	int sql5(Dto09 dto09, Dto10 dto10);
	
	@Insert("""
			INSERT INTO MyTable38
			VALUES (#{dto1.v1}, #{dto2.age}, #{dto1.v2}, #{dto2.name}, #{dto1.v3}, #{dto2.score})
			""")
	int sql6(Dto09 dto1, Dto10 dto2);
	
	@Insert("""
			INSERT INTO MyTable39(Col2, Col3)
			VALUES (#{prop2}, #{prop3})
			""")
	@Options(useGeneratedKeys = true, keyProperty = "prop1")
	int sql7(Dto11 dto);
	
	@Insert("""
			INSERT INTO MyTable40 (Age, Name, Score)
			VALUES (#{age}, #{name}, #{score})
			""")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int sql8(Dto12 dto);
	
}
