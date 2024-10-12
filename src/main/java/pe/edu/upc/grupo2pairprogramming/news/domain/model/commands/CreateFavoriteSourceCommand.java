package pe.edu.upc.grupo2pairprogramming.news.domain.model.commands;

/**
 * CreateFavoriteSourceCommand record class
 * @param id
 * @param title
 * @param description
 * @Summary
 * Record class that represents the command to create a favorite source.
 * @Author
 * Favio Landeo
 * Diego Alonso
 * Daniel Chávarri
 * José Gutiérrez
 */
public record CreateFavoriteSourceCommand(String title, String description) {
}
