package org.springframework.roo.northwind.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;
import org.springframework.roo.northwind.domain.Region;
import org.springframework.roo.northwind.service.api.RegionService;

/**
 * = RegionDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Region.class)
public class RegionDeserializer extends JsonObjectDeserializer<Region> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private RegionService regionService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param regionService
     * @param conversionService
     */
    @Autowired
    public RegionDeserializer(@Lazy RegionService regionService, ConversionService conversionService) {
        this.regionService = regionService;
        this.conversionService = conversionService;
    }
}
