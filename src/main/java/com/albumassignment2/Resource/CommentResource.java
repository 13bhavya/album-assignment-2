package com.albumassignment2.Resource;

import com.albumassignment2.Model.Album;
import com.albumassignment2.Model.Comment;
import com.albumassignment2.service.CommentService;
import com.albumassignment2.validName.ValidName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.ValidationException;
import java.util.List;

@RestController
@RequestMapping("api/comment")
public class CommentResource {

    @Autowired
    private CommentService commentService;

    @PostMapping
    public Comment saveComment(@RequestBody @Valid Comment comment) throws ValidationException {
        return commentService.saveComment(comment);
    }

    @GetMapping
    public List<Comment> getAllComment(){
        return commentService.getAllComment();
    }

    @GetMapping("commentId")
    public void getCommentById(@RequestParam("commentId") String commentId){
        commentService.getCommentbyId(commentId);
    }

    @PutMapping
    public Comment updateComment(@RequestBody Comment comment){
        return commentService.updateComment(comment);
    }

    @DeleteMapping
    public void deleteComment(@RequestParam(name ="commentId") String commentId ){
        commentService.deleteComment(commentId);
    }
}
