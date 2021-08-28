package com.albumassignment2.Resource;

import com.albumassignment2.Model.Photo;
import com.albumassignment2.service.PhotoService;
import com.albumassignment2.validName.ValidName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/photos")
public class PhotoResource {

    @Autowired
    private PhotoService photoService;

    @PostMapping
    public Photo savePhoto(@RequestBody @Valid Photo photo){
        return photoService.savePhoto(photo);
    }

    @GetMapping
    public List<Photo> getAllPhoto(){
        return photoService.getAllPhoto();
    }

    @GetMapping("photoId")
    public void getPhotoById(@RequestParam("photoId") String photoId){
        photoService.getPhotobyId(photoId);
    }

    @PutMapping
    public Photo updatePhoto(@RequestBody Photo photo){
        return photoService.updatePhoto(photo);
    }

    @DeleteMapping
    public void deletePhoto(@RequestParam(name ="PhotoId") String photoId ){
        photoService.deletePhoto(photoId);
    }
}
