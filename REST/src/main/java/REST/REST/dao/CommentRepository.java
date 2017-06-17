package REST.REST.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import REST.REST.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{

}
