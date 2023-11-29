package com.leojung.leoprojectboard.repository;

import com.leojung.leoprojectboard.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
