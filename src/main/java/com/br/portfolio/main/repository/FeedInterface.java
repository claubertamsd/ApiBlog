package com.br.portfolio.main.repository;

import com.br.portfolio.main.post.Post;
import org.springframework.data.jpa.repository.JpaRepository;



public interface FeedInterface extends JpaRepository<Post, Long> {
}
