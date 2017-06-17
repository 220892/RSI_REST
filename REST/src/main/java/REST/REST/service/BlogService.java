package REST.REST.service;

import java.util.List;

import REST.REST.model.Post;


public interface BlogService {

	boolean addNewPost(String text);
	List<Post> getAllPosts();
	Post getPost(Long id);
	boolean addNewComment(Long postId, String text);
	boolean deleteAll();

}
