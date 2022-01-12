package com.br.portfolio.main.service;

import com.br.portfolio.main.post.Post;

import java.util.List;

public interface IService {
    List<Post> findall();
    Post findByid(long id);
    Post save(Post post);


}
