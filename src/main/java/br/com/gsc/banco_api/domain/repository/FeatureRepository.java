package br.com.gsc.banco_api.domain.repository;

import br.com.gsc.banco_api.domain.model.Feature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeatureRepository extends JpaRepository<Feature, Long> {
}
