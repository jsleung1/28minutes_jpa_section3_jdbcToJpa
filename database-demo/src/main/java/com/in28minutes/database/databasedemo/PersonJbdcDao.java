package com.in28minutes.database.databasedemo;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.in28minutes.database.databasedemo.entity.Person;

@Repository
public class PersonJbdcDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	//select * from person
	public List<Person> findAll() {
		return jdbcTemplate.query( "select * from person", new BeanPropertyRowMapper<Person>(Person.class) );
	}

	public Person findById(int id ) {
		return jdbcTemplate.queryForObject( "select * from person where id=?", new Object[] { id }, 
			new BeanPropertyRowMapper<Person>(Person.class) );
	}

	public int deleteById(int id ) {
		return jdbcTemplate.update( "delete from person where id=?", new Object[] { id } );
	}
	
	public int insert(Person person ) {
		return jdbcTemplate.update(
			"insert into person (id, name, location, birth_date ) "
			+ " values (?, ?, ?, ?)",
			new Object[] { 
					person.getId(), 
					person.getName(), 
					person.getLocation(), 
					new Timestamp( person.getBirth_date().getTime() ),
			}) ;
	}
	
	public int update(Person person ) {
		return jdbcTemplate.update(
			"udpate person set name = ?, location = ?, birth_date = ? ) "
			+ " where id = ?",
			new Object[] { 
					person.getName(), 
					person.getLocation(), 
					new Timestamp( person.getBirth_date().getTime() ),
					person.getId(),
			}) ;
	}
}

