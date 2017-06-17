package REST.REST.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import REST.REST.model.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

	@Query("select p from Post p where p.id > ?1 AND p.id <= ?2")
	public List<Post> findPart(Long startId, Long endId);
}
