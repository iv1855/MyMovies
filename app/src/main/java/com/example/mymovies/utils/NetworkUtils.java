package com.example.mymovies.utils;

import android.net.Uri;

import java.net.URL;

public class NetworkUtils {

    private static final String BASE_URL = "https://api.themoviedb.org/3/discover/movie";

    public static final String PARAMS_API_KEY = "api_key";
    public static final String PARAMS_LANGUAGE = "language";
    public static final String PARAMS_SORT_BY = "api_key";
    public static final String PARAMS_PAGE = "page";

    private static final String API_KEY = "44da32d2561451b0acf05688fa5f527a";
    public static final String LANGUAGE_VALUE = "ru_RU";
    public static final String SORT_BY_POPULARITY = "popularity.desc";
    public static final String SORT_BY_TOP_RATED = "vote_average.desc";

    public static final int  POPULARITY = 0;
    public static final int TOP_RATED = 1;

    public static URL buildURL() {
        Uri uri = Uri.parse(BASE_URL).buildUpon()
    }

}
