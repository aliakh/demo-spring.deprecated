// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.springframework.roo.northwind.web;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import io.springlets.web.NotFoundException;
import java.io.IOException;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.northwind.domain.Report;
import org.springframework.roo.northwind.service.api.ReportService;
import org.springframework.roo.northwind.web.ReportDeserializer;

privileged aspect ReportDeserializer_Roo_EntityDeserializer {
    
    declare @type: ReportDeserializer: @JsonComponent;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ReportService
     */
    public ReportService ReportDeserializer.getReportService() {
        return reportService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param reportService
     */
    public void ReportDeserializer.setReportService(ReportService reportService) {
        this.reportService = reportService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConversionService
     */
    public ConversionService ReportDeserializer.getConversionService() {
        return conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param conversionService
     */
    public void ReportDeserializer.setConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param jsonParser
     * @param context
     * @param codec
     * @param tree
     * @return Report
     * @throws IOException
     */
    public Report ReportDeserializer.deserializeObject(JsonParser jsonParser, DeserializationContext context, ObjectCodec codec, JsonNode tree) throws IOException {
        String idText = tree.asText();
        Long id = conversionService.convert(idText, Long.class);
        Report report = reportService.findOne(id);
        if (report == null) {
            throw new NotFoundException("Report not found");
        }
        return report;
    }
    
}
