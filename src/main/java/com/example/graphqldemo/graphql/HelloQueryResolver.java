package com.example.graphqldemo.graphql;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class HelloQueryResolver implements GraphQLQueryResolver {

  public String hello() {
    return "Hello World!";
  }
}
