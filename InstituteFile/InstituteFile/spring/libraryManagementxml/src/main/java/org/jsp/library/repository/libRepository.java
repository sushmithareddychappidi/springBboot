package org.jsp.library.repository;

import org.jsp.library.entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface libRepository extends JpaRepository<Library, String> {

}
