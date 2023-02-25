package ru.practicum.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewHitDto {
    private String app;
    private String uri;
    private String ip;
}