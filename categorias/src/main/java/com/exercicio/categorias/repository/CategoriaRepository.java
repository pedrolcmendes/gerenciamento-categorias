package com.exercicio.categorias.repository;

import com.exercicio.categorias.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}