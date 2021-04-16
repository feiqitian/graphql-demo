package com.example.graphqldemo.graphql;

import graphql.com.google.common.collect.ImmutableList;
import java.util.List;
import lombok.Data;

@Data
public class Region {

  private String code;
  private String name;
  private List<Region> children;

  public Region(String code, String name) {
    this.code = code;
    this.name = name;
    children = ImmutableList.of();
  }

  public Region(String code, String name,
      List<Region> children) {
    this.code = code;
    this.name = name;
    this.children = children;
  }
}
