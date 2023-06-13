package com.ems.extra_concepts;

import java.util.List;

public class SuperHeroMoviesAndTVSeries {
private String category;
private List<String> acceptedfranchises;
private List<String> genres;
private List<Movies> movies;
private List<TvSeries> tvseries;
private OtherDetails otherdetails;
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public List<String> getAcceptedfranchises() {
	return acceptedfranchises;
}
public void setAcceptedfranchises(List<String> acceptedfranchises) {
	this.acceptedfranchises = acceptedfranchises;
}
public List<String> getGenres() {
	return genres;
}
public void setGenres(List<String> genres) {
	this.genres = genres;
}
public List<Movies> getMovies() {
	return movies;
}
public void setMovies(List<Movies> movies) {
	this.movies = movies;
}
public List<TvSeries> getTvseries() {
	return tvseries;
}
public void setTvseries(List<TvSeries> tvseries) {
	this.tvseries = tvseries;
}
public OtherDetails getOtherdetails() {
	return otherdetails;
}
public void setOtherdetails(OtherDetails otherdetails) {
	this.otherdetails = otherdetails;
}


}
