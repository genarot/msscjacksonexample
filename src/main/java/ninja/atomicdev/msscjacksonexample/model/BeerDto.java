package ninja.atomicdev.msscjacksonexample.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;
import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeerDto {
    @Null
    private UUID id;

    @NotBlank
    @Size(min = 3, max = 50)
    private String beerName;

    @NotBlank
    private String beerStyle;

    @DecimalMin("0")
    private BigDecimal price;

    @Positive
    private Long upc;

    private OffsetDateTime createdAt;

    private OffsetDateTime updatedAt;
}
