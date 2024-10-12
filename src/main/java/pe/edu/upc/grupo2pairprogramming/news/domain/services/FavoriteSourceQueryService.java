package pe.edu.upc.grupo2pairprogramming.news.domain.services;

import pe.edu.upc.grupo2pairprogramming.news.domain.model.aggregates.FavoriteSource;
import pe.edu.upc.grupo2pairprogramming.news.domain.model.queries.GetFavoriteSourceByIdQuery;
import pe.edu.upc.grupo2pairprogramming.news.domain.model.queries.GetFavoriteSourceQuery;

import java.util.List;
import java.util.Optional;

/**
 * FavoriteSourceQueryService interface
 * @Summary
 * Interface that describes the query classes in the domain layer
 * @Author
 * Favio Landeo
 * Diego Alonso
 * Daniel Chávarri
 * José Gutiérrez
 */
public interface FavoriteSourceQueryService {
    Optional<FavoriteSource> handle(GetFavoriteSourceByIdQuery query);
    Optional<List<FavoriteSource>> handle(GetFavoriteSourceQuery query);
}
