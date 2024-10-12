package pe.edu.upc.grupo2pairprogramming.news.domain.model.aggregates;
import org.springframework.data.domain.AbstractAggregateRoot;

/**
 * FavoriteSource aggregate
 * @Summary
 * The favorite source class is an aggregate that represents a favorite source of news.
 * It is responsible for managing the favorite source information and the domain events.
 * @Author
 * Favio Landeo
 * Diego Alonso
 * Daniel Chávarri
 * José Gutiérrez
 */
public class FavoriteSource extends AbstractAggregateRoot<FavoriteSource> {
    public Long id;
    public String title;
    public String description;

    public FavoriteSource(Long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }
}
