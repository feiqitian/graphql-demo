package com.example.graphqldemo.graphql;

import com.example.graphqldemo.repository.RegionRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RegionQueryResolver implements GraphQLQueryResolver {

  private final RegionRepository repository;

  public List<Region> regions() {
    return repository.allRegions();
  }
}
