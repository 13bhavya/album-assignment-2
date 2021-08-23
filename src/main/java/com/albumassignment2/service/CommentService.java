package com.albumassignment2.service;

import com.albumassignment2.Model.Album;
import com.albumassignment2.Model.Comment;
import com.albumassignment2.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;


    public Comment saveComment(Comment comment){
        return commentRepository.save(comment);
    }

    public void getCommentbyId(String commentId) {
        commentRepository.findById(commentId);
    }

    public List<Comment> getAllComment() {
        return commentRepository.findAll();
    }

    public Comment updateComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public void deleteComment(String commentId) {
         commentRepository.deleteById(commentId);
    }
}
