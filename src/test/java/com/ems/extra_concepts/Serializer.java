package com.ems.extra_concepts;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serializer {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		SuperHeroMoviesAndTVSeries superhero = new SuperHeroMoviesAndTVSeries();
		superhero.setCategory("Super Hero Mivies & TV Series");
		
		List<String> acceptedFranchies = new ArrayList<>();
		acceptedFranchies.add("DC");
		acceptedFranchies.add("Maver");
		superhero.setAcceptedfranchises(acceptedFranchies);
		
		List<String> genres = new ArrayList<>();
		genres.add("Action");
		genres.add("Adventure");
		genres.add("Heroic");
		genres.add("Dark");
		superhero.setGenres(genres);
		List<Movies> allmovies = new ArrayList<Movies>();
		List<TvSeries> alltvseries = new ArrayList<TvSeries>();
		
		Movies batman = new Movies();
		batman.setTitle("Batman: The Dark Knight");
		batman.setYear(2008);
		
		List<String> batmancast = new ArrayList<>();
		batmancast.add("Christian Bale");
		batmancast.add("Heath Ledger");
		batman.setCast(batmancast);
		allmovies.add(batman);
		
		Movies syndercut = new Movies();
		syndercut.setTitle("Justice League:SYC");
		syndercut.setYear(2021);
		List<String> syndercutcast = new ArrayList<>();
		syndercutcast.add("Henry Cavil");
		syndercutcast.add("Gal Gadot");
		syndercut.setCast(syndercutcast);
		allmovies.add(syndercut);
		
		superhero.setMovies(allmovies);
		
		TvSeries flash = new TvSeries();
		flash.setTitle("Flash");
		flash.setYear(2014);
		alltvseries.add(flash);
		
		TvSeries Ethirneechal = new TvSeries();
		Ethirneechal.setTitle("EthirNeechal");
		Ethirneechal.setYear(2021);
		alltvseries.add(Ethirneechal);
		
		superhero.setTvseries(alltvseries);
		
		OtherDetails od =new OtherDetails();
		od.setCountry("USA Engaluku");
		od.setLanguage("ENGLISH THADA");
		
		superhero.setOtherdetails(od);
		
		ObjectMapper mapper = new ObjectMapper();
		File Json = new File("movies.json");
		mapper.writerWithDefaultPrettyPrinter().writeValue(Json, superhero);
		
	}

}
