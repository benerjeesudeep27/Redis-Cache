package com.redis.server.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.redis.server.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>  {

}
