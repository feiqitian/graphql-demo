package com.example.graphqldemo.repository;

import com.example.graphqldemo.graphql.Region;
import graphql.com.google.common.collect.ImmutableList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class RegionRepository {

  public List<Region> allRegions() {
    return ImmutableList.of(
        new Region("110000", "北京市", ImmutableList.of(
            new Region("110101", "东城区"),
            new Region("110102", "西城区"),
            new Region("110107", "石景山区"),
            new Region("110108", "海淀区"),
            new Region("110109", "门头沟区"),
            new Region("110112", "通州区"),
            new Region("110113", "顺义区"),
            new Region("110114", "昌平区"),
            new Region("110115", "大兴区"),
            new Region("110116", "怀柔区"),
            new Region("110117", "平谷区"),
            new Region("110118", "密云区"),
            new Region("110119", "延庆区")
        ).asList()),
        new Region("120000", "天津市", ImmutableList.of(
            new Region("120101", "和平区"),
            new Region("120102", "河东区"),
            new Region("120103", "河西区"),
            new Region("120104", "南开区"),
            new Region("120105", "河北区"),
            new Region("120106", "红桥区"),
            new Region("120110", "东丽区"),
            new Region("120111", "西青区"),
            new Region("120112", "津南区"),
            new Region("120113", "北辰区"),
            new Region("120114", "武清区"),
            new Region("120115", "宝坻区"),
            new Region("120116", "滨海新区"),
            new Region("120117", "宁河区"),
            new Region("120118", "静海区"),
            new Region("120119", "蓟州区")
        ).asList()),
        new Region("130000", "河北省", ImmutableList.of(
            new Region("130100", "石家庄市"),
            new Region("130200", "唐山市"),
            new Region("130300", "秦皇岛市"),
            new Region("130400", "邯郸市"),
            new Region("130500", "邢台市"),
            new Region("130600", "保定市"),
            new Region("130700", "张家口市"),
            new Region("130800", "承德市"),
            new Region("130900", "沧州市"),
            new Region("131000", "廊坊市"),
            new Region("131100", "衡水市")
        ).asList()));
  }
}
