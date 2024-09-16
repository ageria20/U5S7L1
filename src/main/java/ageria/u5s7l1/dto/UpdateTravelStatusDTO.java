package ageria.u5s7l1.dto;

import ageria.u5s7l1.enums.TravelStatus;
import jakarta.validation.constraints.NotNull;

public record UpdateTravelStatusDTO(@NotNull(message = "Travel status is required")
                                    TravelStatus travelStatus) {
}
