package pe.edu.upc.grupo2pairprogramming.news.domain.model.queries;

/**
 * @Summary
 * Record class that represents the query to get a favorite source by id.
 * @Author
 * Favio Landeo
 * Diego Alonso
 * Daniel Chávarri
 * José Gutiérrez
 */
public record GetFavoriteSourceByIdQuery(Long id) {
    public GetFavoriteSourceByIdQuery{
        if (id == null) {
            throw new IllegalArgumentException("id is required");
        }
        if (id <= 0) {
            throw new IllegalArgumentException("id must be greater than 0");
        }
    }
}
