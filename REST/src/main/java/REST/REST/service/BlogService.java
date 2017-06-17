package REST.REST.service;

import java.util.List;

import REST.REST.model.Comment;
import REST.REST.model.Post;


public interface BlogService {
	Post getPost(Long id);
	List<Post> getAllPosts();
	List<Comment> getComments(Long postId);
	boolean addNewPost(String text);
	boolean addNewComment(Long postId, String text);
	boolean modifyPost(Long postId, String text);
	boolean modifyComment(Long commentId, String text);
	boolean deleteAll();
}
