//package com.br.portfolio.main.dummyData;
//
//import com.br.portfolio.main.post.Post;
//import com.br.portfolio.main.repository.FeedInterface;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//@Component
//public class postsSaveds {
//    @Autowired
//    FeedInterface feedInterface;
//
//    @PostConstruct
//    public void savePost(){
//        List<Post> postList = new ArrayList<>();
//        Post post1 = new Post();
//        post1.setAutor("Pedro Lustosa");
//        post1.setData(LocalDate.now());
//        post1.setTitulo("Programador JavaScript");
//        post1.setTexto("Lorem Ipsum Lorem IPSUM");
//
//        postList.add(post1);
//
//        for (Post post:postList){
//            Post postSaved = feedInterface.save(post);
//            System.out.println(postSaved.getId());
//        }
//    }
//}
