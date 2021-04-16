package com.example.graphqldemo.graphql;

import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.stereotype.Component;

@Component
public class RegionResolver implements GraphQLResolver<Region> {

  public String description(Region region, String prefix) {
    System.out.println("description region = " + region.getName());
    return String.format("%s:%s:%s", prefix, region.getCode(), region.getName());
  }
}
