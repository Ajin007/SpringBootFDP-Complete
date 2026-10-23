package com.example.demotwo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api")
public class MovieController {

    @Autowired
    MovieRepo movierepo;

    @GetMapping("/v1")
    public ResponseEntity<List<Movie>> getAllMovies(){

    //    return movierepo.getAllMovies();
return ResponseEntity.status(HttpStatus.OK).body(movierepo.getAllmovies());

    }


    @PostMapping("/addition")
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie){
        movierepo.createMovie(movie);
        return ResponseEntity.status(HttpStatus.CREATED).body(movie);
    }


    @DeleteMapping("v1/{id}")
    public ResponseEntity<String> deletetheMovie(Long id){

       Boolean deleted= movierepo.deleteByid(id);
       if(deleted){

        return ResponseEntity.status(HttpStatus.OK).body("Movie deleted successfully");
    }else{
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Movie is not found");

       }
    }

    // @PutMapping("/{id}")
    // public ResponseEntity<Movie> updateMovie(){

    // }

    

}
