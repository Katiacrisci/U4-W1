package day3.ecommerce;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Article {
    private String articleId;
    private String description;
    private float price;
    private int availablePieces;

    public Article(String articleId, String description, float price, int availablePieces) {
        this.articleId = articleId;
        this.description = description;
        this.price = price;
        this.availablePieces = availablePieces;
    }

}
