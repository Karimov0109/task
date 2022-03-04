package com.example.task.controller;

import com.example.task.entity.FileEntity;
import com.example.task.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FileController {

    @Autowired
    FileService fileService;

    @GetMapping("/api/1.0/files")
    Page<FileEntity> getFiles(Pageable page){
        return fileService.getFiles(page);
    }

    @GetMapping("/api/1.0/files1")
    Page<FileEntity> getFiles1(@RequestParam int pageNumber, @RequestParam int pageSize){
        return fileService.getFiles1(pageNumber, pageSize);
    }
}