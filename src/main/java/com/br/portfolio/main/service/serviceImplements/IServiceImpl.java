package com.br.portfolio.main.service.serviceImplements;

import com.br.portfolio.main.post.Post;
import com.br.portfolio.main.repository.FeedInterface;
import com.br.portfolio.main.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service
public class IServiceImpl implements IService {
    @Autowired
    FeedInterface feedInterface;

    @Override
    public List<Post> findall() {
        return feedInterface.findAll();
    }

    @Override
    public Post findByid(long id) {
        return feedInterface.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return feedInterface.save(post);
    }

    @Override
    public void delete(long id) {
      feedInterface.deleteAllById(Collections.singleton(id));
    }


}
