package com.albumassignment2.repository;

import com.albumassignment2.Model.Album;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends MongoRepository<Album,String> {
}
