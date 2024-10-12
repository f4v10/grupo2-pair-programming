package pe.edu.upc.grupo2pairprogramming.news.domain.services;

import pe.edu.upc.grupo2pairprogramming.news.domain.model.aggregates.FavoriteSource;
import pe.edu.upc.grupo2pairprogramming.news.domain.model.commands.CreateFavoriteSourceCommand;
import pe.edu.upc.grupo2pairprogramming.news.domain.model.commands.DeleteFavoriteSourceCommand;
import pe.edu.upc.grupo2pairprogramming.news.domain.model.commands.UpdateFavoriteSourceCommand;

import java.util.Optional;

/**
 * FavoriteSourceCommandService interface
 * @Summary
 * Interface that describes the command classes in the domain layer
 * @Author
 * Favio Landeo
 * Diego Alonso
 * Daniel Chávarri
 * José Gutiérrez
 */
public interface FavoriteSourceCommandService {
    Optional<FavoriteSource> handle(CreateFavoriteSourceCommand command);
    Optional<FavoriteSource> handle(UpdateFavoriteSourceCommand command);
    void handle(DeleteFavoriteSourceCommand command);
}
