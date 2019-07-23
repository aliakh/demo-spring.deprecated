package org.springframework.roo.northwind.service.api;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;
import org.springframework.roo.northwind.model.Report;

/**
 * = ReportService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Report.class)
public interface ReportService extends EntityResolver<Report, Long>, ValidatorService<Report> {
}
