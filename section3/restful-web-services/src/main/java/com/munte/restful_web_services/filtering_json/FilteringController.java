package com.munte.restful_web_services.filtering_json;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {

    @GetMapping("/static-filtering")
    public SomeBean staticFiltering() {
        return new SomeBean("value1", "value2", "value3");
    }

    @GetMapping("/static-filtering-list")
    public List<SomeBean> staticFilteringList() {
        return Arrays.asList(
                new SomeBean("value1", "value2", "value3"),
                new SomeBean("value4", "value5", "value6")
        );
    }

    @GetMapping("/dynamic-filtering") //field1 and field3
    @JsonView(View.View1.class)
    public AnotherBean dynamicFilteringWithView() {
        return new AnotherBean("value1", "value2", "value3");
    }

    @GetMapping("/dynamic-filtering-list") //field2 and field3
    @JsonView(View.View2.class)
    public List<AnotherBean> dynamicFilteringListWithView() {
        return Arrays.asList(
                new AnotherBean("value1", "value2", "value3"),
                new AnotherBean("value4", "value5", "value6")
        );
    }

}
