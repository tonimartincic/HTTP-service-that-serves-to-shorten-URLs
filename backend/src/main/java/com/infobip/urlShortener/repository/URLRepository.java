package com.infobip.urlShortener.repository;

import com.infobip.urlShortener.domain.url.URL;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface URLRepository extends CrudRepository<URL, String> {
}
