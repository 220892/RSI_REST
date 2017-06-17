package REST.REST.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import REST.REST.model.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

}
