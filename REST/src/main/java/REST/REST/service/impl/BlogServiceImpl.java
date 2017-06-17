package REST.REST.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import REST.REST.dao.PostRepository;
import REST.REST.model.Post;
import REST.REST.service.BlogService;

@Service
@Transactional
public class BlogServiceImpl implements BlogService {
	
	@Autowired
	private PostRepository postRepository;
	
	@Override
	public Post getPost(Long id) {
		return postRepository.findOne(id);
	}
	
	@Override
	public List<Post> getAllPosts() {
		return postRepository.findAll();
	}
	
	@Override
	public boolean addNewPost(String text) {
		Post post = new Post();
		post.setText(text);
		postRepository.save(post);
		return true;
	}
	

}
