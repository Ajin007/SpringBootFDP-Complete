package com.example.demotwo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

@Service
// This is my Business logic area
public class MovieRepo {

    // In-memory
    // 
    List<Movie> movies=new ArrayList<>();
    AtomicLong atomicData=new AtomicLong(0);


    private MovieRepo(){

        movies.add(new Movie(atomicData.getAndIncrement(),"He-man","Action packed movie",7,2025,"Action"));
        movies.add(new Movie(atomicData.getAndIncrement(),"sHe-man","Action packed movie",7,2025,"Action"));
        movies.add(new Movie(atomicData.getAndIncrement(),"sssHe-man","Action packed movie",7,2025,"Action"));
        movies.add(new Movie(atomicData.getAndIncrement(),"shhhHe-man","Action packed movie",7,2025,"Action"));
        movies.add(new Movie(atomicData.getAndIncrement(),"heHe-man","Action packed movie",7,2025,"Action"));
        movies.add(new Movie(atomicData.getAndIncrement(),"helloHe-man","Action packed movie",7,2025,"Action"));
    }

    // crud
    // creation
    public Movie createMovie(Movie movie){

        // Error first appraoch
        if(movie.getName().equals(null)|| movie.getName()==null){

            throw new IllegalArgumentException("This is not the expected name");
        }

        movie.setId(atomicData.getAndIncrement());
        movies.add(movie);
        return movie;
    }

    // get all atomicData

    public List<Movie> getAllmovies(){
        // return movies;
        // shallow copy---->
        return new ArrayList<>(movies);
    }

    // ready by id
    public Optional<Movie> getById(Long id){

        for(Movie movie:movies){
            if(movie.getId()==id){
                return Optional.of(movie);
            }
        }
        return Optional.empty();
    }

       public boolean deleteByid(Long id){

   Iterator<Movie> iterateMovie= movies.iterator();

   while(iterateMovie.hasNext()){
   Movie data= iterateMovie.next();
   if(data.getId().equals(id)){
    iterateMovie.remove();
    return true;
   }
   }

   return false;
   }



    










//    AtomicLong atomicData= new AtomicLong(0);



//    private MovieRepo(){

//     movies.add(new Movie(atomicData.getAndIncrement(),"He-man","Masters of universe",7,2026,"Action"));
//     movies.add(new Movie(atomicData.getAndIncrement(),"He-man","Masters of universe",7,2026,"Action"));
//     movies.add(new Movie(atomicData.getAndIncrement(),"He-man","Masters of universe",7,2026,"Action"));
//     movies.add(new Movie(atomicData.getAndIncrement(),"He-man","Masters of universe",7,2026,"Action"));
//     movies.add(new Movie(atomicData.getAndIncrement(),"He-man","Masters of universe",7,2026,"Action"));
//    }

//    // creation of the Movie
//    public Movie createMovie(Movie movie){

//     if(movie.getName()==null || movie.getName().trim().isEmpty()){
//         throw new IllegalArgumentException("Name field is missing over here");
//     }
//     movie.setId(atomicData.getAndIncrement());
//     movies.add(movie);
//     return movie;
//    }

//    // get all data
//    public List<Movie> getAllMovies(){

//     // This is applied for the shallow copy.
//     return new ArrayList<>(movies);
//    }


//    // to get the data by id
//    public Optional<Movie> getById(Long id){
//     for(Movie movie:movies){
//         if(movie.getId().equals(id)){
//             return Optional.of(movie);
//         }
//     }
//     return Optional.empty();
//    }


//    //update by Id
//    public Optional<Movie> updateById(Long id,Movie updatedMovie){

//     for(Movie movie:movies){
//         if(movie.getId().equals(id)){
//             movie.setDescription(updatedMovie.getDescription());
//             movie.setName(updatedMovie.getName());
//             return Optional.of(movie);
//         }
//     }
//     return Optional.empty();
//    }


//    // remove by Id

//    public boolean deleteByid(Long id){

//    Iterator<Movie> iterateMovie= movies.iterator();

//    while(iterateMovie.hasNext()){
//    Movie data= iterateMovie.next();
//    if(data.getId().equals(id)){
//     iterateMovie.remove();
//     return true;
//    }
//    }

//    return false;
//    }

}
