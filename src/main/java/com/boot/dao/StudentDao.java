package com.boot.dao;

import com.boot.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by wl on 2017/6/13.
 */

public interface StudentDao extends JpaRepository<Student,Long> {

}
