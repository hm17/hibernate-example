package com.hm17.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hm17.models.Book;

@Repository 
public interface BookRepository extends JpaRepository<Book, Long>{

}
