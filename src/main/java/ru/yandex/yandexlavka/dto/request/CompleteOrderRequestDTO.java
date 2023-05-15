package ru.yandex.yandexlavka.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class CompleteOrderRequestDTO {
    @NotNull
    private List<@Valid CompleteOrderDTO> completeInfo;
}
