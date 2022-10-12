package com.example.demoNetflix.mapper;

//import com.example.demoNetflix.model.Movie;
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

public class MovieMapper {

//    public static String moviePopularMapper(List<Movie> str){
//        List<Movie> movieList = new ArrayList<>();
//        try {
//            if (str != null) {
//                Set<Movie> movies = new HashSet<>();
//                JSONObject jsonObject = new JSONObject(str);
//                JSONArray jsonArray = jsonObject.getJSONArray("results");
//
//                for (int i = 0; i < jsonArray.length(); i++) {
//                    JSONObject jsonObject1 = jsonArray.getJSONObject(i);
//
//                    Movie movie = new Movie();
////                    movie.setId(jsonObject1.getInt("id"));
//                    movie.setOverview(jsonObject1.getString("overview"));
////                    movie.setOriginal_title(jsonObject1.getString("original_title"));
////                    movie.setPoster_path(jsonObject1.getString("poster_path"));
//                    movieList.add(movie);
//                    System.out.println(movie.toString());
//                }
//            }
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//        str = JSONObject.valueToString(movieList);
//        return str;
//    }
}
