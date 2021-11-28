package ru.iway.admin.user.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ru.iway.entity.Location;
import ru.iway.entity.LocationItem;

@RestController
@RequestMapping("location")
public class LocationRestController {
	
	@GetMapping
    public List<LocationItem> locationItems(@RequestParam(value = "q", required = false) String query) {
        if (StringUtils.isEmpty(query)) {
            return Arrays.stream(Location.values())
                         .limit(15)
                         .map(this::mapToLocationItem)
                         .collect(Collectors.toList());
        }

        return Arrays.stream(Location.values())
                     .filter(location -> location.getLabel()
                                           .toLowerCase()
                                           .contains(query))
                     .limit(15)
                     .map(this::mapToLocationItem)
                     .collect(Collectors.toList());
    }

    private LocationItem mapToLocationItem(Location location) {
        return LocationItem.builder()
                        .id(location)
                        .text(location.getLabel())
                        .slug(location.name())
                        .build();
    }
}
