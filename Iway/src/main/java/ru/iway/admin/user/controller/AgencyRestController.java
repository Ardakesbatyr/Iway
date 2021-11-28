package ru.iway.admin.user.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ru.iway.entity.Agency;
import ru.iway.entity.AgencyItem;
import ru.iway.entity.Location;
import ru.iway.entity.LocationItem;

@RestController
@RequestMapping("agency")
public class AgencyRestController {
	
	@GetMapping
    public List<AgencyItem> AgencyItems(@RequestParam(value = "q", required = false) String query) {
        if (StringUtils.isEmpty(query)) {
            return Arrays.stream(Agency.values())
                         .limit(15)
                         .map(this::mapToAgencyItem)
                         .collect(Collectors.toList());
        }

        return Arrays.stream(Agency.values())
                     .filter(agency -> agency.getLabel()
                                           .toLowerCase()
                                           .contains(query))
                     .limit(15)
                     .map(this::mapToAgencyItem)
                     .collect(Collectors.toList());
    }

    private AgencyItem mapToAgencyItem(Agency agency) {
        return AgencyItem.builder()
                        .id(agency)
                        .text(agency.getLabel())
                        .slug(agency.name())
                        .build();
    }
}
