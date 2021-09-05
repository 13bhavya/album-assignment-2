package com.albumassignment2.service;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.S3Object;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class FileService {

    public boolean upload(MultipartFile file) {

        Object file_path = "ss";
        Object bucket_name = "amazefirstbucket";
        System.out.format("Uploading %s to S3 bucket %s...\n", file_path, bucket_name);
        BasicAWSCredentials basic = new BasicAWSCredentials("AKIAYOFIMBX653JNFDEL ","Az7U4GyOcBf7jUbg/P1T+NO1I9ySXSnvaVd4D5aG");
        final AmazonS3 s3 = AmazonS3ClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(basic)).withRegion(Regions.US_EAST_2).build();
        try {
            ObjectMetadata metadata = new ObjectMetadata();
            metadata.setContentLength(file.getSize());
            metadata.setContentType(file.getContentType());
            s3.putObject("amazefirstbucket", file.getOriginalFilename(), file.getInputStream(), metadata);
            return true;
        } catch (AmazonServiceException | IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public S3Object getfile(String key) {
        BasicAWSCredentials basic = new BasicAWSCredentials("AKIAYOFIMBX653JNFDEL ","Az7U4GyOcBf7jUbg/P1T+NO1I9ySXSnvaVd4D5aG");
        final AmazonS3 s3 = AmazonS3ClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(basic)).withRegion(Regions.US_EAST_2).build();
        return s3.getObject("amazefirstbucket", key);
    }

    public void deletefile(String key) {
        BasicAWSCredentials basic = new BasicAWSCredentials("AKIAYOFIMBX653JNFDEL ","Az7U4GyOcBf7jUbg/P1T+NO1I9ySXSnvaVd4D5aG");
        final AmazonS3 s3 = AmazonS3ClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(basic)).withRegion(Regions.US_EAST_2).build();
         s3.deleteObject("amazefirstbucket", key);
    }
}


