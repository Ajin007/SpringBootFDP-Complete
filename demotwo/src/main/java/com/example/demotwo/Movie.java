package com.example.demotwo;

public class Movie {

    // field
    Long id;
    String name;
    String description;
    int ratings;
    int year;
    String genre;

    // getter , setter
public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getDescription() {
    return description;
}
public void setDescription(String description) {
    this.description = description;
}
public int getRatings() {
    return ratings;
}
public void setRatings(int ratings) {
    this.ratings = ratings;
}
public int getYear() {
    return year;
}
public void setYear(int year) {
    this.year = year;
}
public String getGenre() {
    return genre;
}
public void setGenre(String genre) {
    this.genre = genre;
}

// empty constructor
public Movie(){

    
}

// All -Args Constrcutor
public Movie(Long id, String name, String description, int ratings, int year, String genre) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.ratings = ratings;
    this.year = year;
    this.genre = genre;
}
@Override
public String toString() {
    return "Movie [id=" + id + ", name=" + name + ", description=" + description + ", ratings=" + ratings + ", year="
            + year + ", genre=" + genre + "]";
}





    

}
