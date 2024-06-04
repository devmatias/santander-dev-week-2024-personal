package me.dio.sdw24.domain.model;


// Segundo passo: Criação da model de dados

public record Champions(
        Long id,
        String name,
        String role,
        String lore,
        String imageUrl
) {
}
