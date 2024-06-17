package com.project.crudhandler.repository;

import com.project.crudhandler.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long>{

}
