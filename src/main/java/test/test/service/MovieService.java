package test.test.service;

import test.test.dto.MovieRequest;

public interface MovieService {
    String save(MovieRequest request);
    String get(Long id);
//    String get(String title);
}
