package io.github.dougllasfps.imageliteapi.infra.repository;

import io.github.dougllasfps.imageliteapi.domain.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ImageRepository extends JpaRepository<Image, String> {

}
