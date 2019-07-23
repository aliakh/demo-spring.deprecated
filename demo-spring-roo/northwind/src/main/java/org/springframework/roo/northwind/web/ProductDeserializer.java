package org.springframework.roo.northwind.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;
import org.springframework.roo.northwind.domain.Product;
import org.springframework.roo.northwind.service.api.ProductService;

/**
 * = ProductDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Product.class)
public class ProductDeserializer extends JsonObjectDeserializer<Product> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ProductService productService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param productService
     * @param conversionService
     */
    @Autowired
    public ProductDeserializer(@Lazy ProductService productService, ConversionService conversionService) {
        this.productService = productService;
        this.conversionService = conversionService;
    }
}
