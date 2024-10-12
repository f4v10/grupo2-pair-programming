package pe.edu.upc.grupo2pairprogramming.news.domain.model.commands;

/**
 * UpdateFavoriteSourceCommand record class.
 * @param id
 * @param title
 * @param description
 * @Summary
 * Record class that represents the command to update a favorite source selected by its id
 * @Author
 * Favio Landeo
 * Diego Alonso
 * Daniel Chávarri
 * José Gutiérrez.
 */
public record UpdateFavoriteSourceCommand(Long id, String title, String description) {
}
