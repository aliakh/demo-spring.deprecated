// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.disid.restful.web;

import com.disid.restful.model.CustomerOrder;
import com.disid.restful.model.OrderDetail;
import com.disid.restful.service.api.CustomerOrderService;
import com.disid.restful.service.api.OrderDetailService;
import com.disid.restful.web.CustomerOrdersCollectionThymeleafController;
import com.disid.restful.web.CustomerOrdersCollectionThymeleafLinkFactory;
import com.disid.restful.web.CustomerOrdersItemDetailsItemThymeleafController;
import io.springlets.data.web.validation.GenericValidator;
import io.springlets.web.NotFoundException;
import io.springlets.web.mvc.util.ControllerMethodLinkBuilderFactory;
import io.springlets.web.mvc.util.MethodLinkBuilderFactory;
import java.util.Collections;
import java.util.Locale;
import java.util.Objects;
import javax.validation.Valid;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

privileged aspect CustomerOrdersItemDetailsItemThymeleafController_Roo_Thymeleaf {
    
    declare @type: CustomerOrdersItemDetailsItemThymeleafController: @Controller;
    
    declare @type: CustomerOrdersItemDetailsItemThymeleafController: @RequestMapping(value = "/customerorders/{customerOrder}/details/{details}", name = "CustomerOrdersItemDetailsItemThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private CustomerOrderService CustomerOrdersItemDetailsItemThymeleafController.customerOrderService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private OrderDetailService CustomerOrdersItemDetailsItemThymeleafController.orderDetailService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource CustomerOrdersItemDetailsItemThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<CustomerOrdersCollectionThymeleafController> CustomerOrdersItemDetailsItemThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param customerOrderService
     * @param orderDetailService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public CustomerOrdersItemDetailsItemThymeleafController.new(CustomerOrderService customerOrderService, OrderDetailService orderDetailService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setCustomerOrderService(customerOrderService);
        setOrderDetailService(orderDetailService);
        setMessageSource(messageSource);
        setCollectionLink(linkBuilder.of(CustomerOrdersCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return CustomerOrderService
     */
    public CustomerOrderService CustomerOrdersItemDetailsItemThymeleafController.getCustomerOrderService() {
        return customerOrderService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param customerOrderService
     */
    public void CustomerOrdersItemDetailsItemThymeleafController.setCustomerOrderService(CustomerOrderService customerOrderService) {
        this.customerOrderService = customerOrderService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return OrderDetailService
     */
    public OrderDetailService CustomerOrdersItemDetailsItemThymeleafController.getOrderDetailService() {
        return orderDetailService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param orderDetailService
     */
    public void CustomerOrdersItemDetailsItemThymeleafController.setOrderDetailService(OrderDetailService orderDetailService) {
        this.orderDetailService = orderDetailService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource CustomerOrdersItemDetailsItemThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void CustomerOrdersItemDetailsItemThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<CustomerOrdersCollectionThymeleafController> CustomerOrdersItemDetailsItemThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void CustomerOrdersItemDetailsItemThymeleafController.setCollectionLink(MethodLinkBuilderFactory<CustomerOrdersCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param locale
     * @param method
     * @return CustomerOrder
     */
    @ModelAttribute
    public CustomerOrder CustomerOrdersItemDetailsItemThymeleafController.getCustomerOrder(@PathVariable("customerOrder") Long id, Locale locale, HttpMethod method) {
        CustomerOrder customerOrder = null;
        if (HttpMethod.PUT.equals(method)) {
            customerOrder = customerOrderService.findOneForUpdate(id);
        } else {
            customerOrder = customerOrderService.findOne(id);
        }
        
        if (customerOrder == null) {
            String message = messageSource.getMessage("error_NotFound", new Object[] {"CustomerOrder", id}, "The record couldn't be found", locale);
            throw new NotFoundException(message);
        }
        return customerOrder;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param locale
     * @param method
     * @return OrderDetail
     */
    @ModelAttribute
    public OrderDetail CustomerOrdersItemDetailsItemThymeleafController.getDetails(@PathVariable("details") Long id, Locale locale, HttpMethod method) {
        OrderDetail details = null;
        if (HttpMethod.PUT.equals(method)) {
            details = orderDetailService.findOneForUpdate(id);
        } else {
            details = orderDetailService.findOne(id);
        }
        
        if (details == null) {
            String message = messageSource.getMessage("error_NotFound", new Object[] {"CustomerOrder", id}, "The record couldn't be found", locale);
            throw new NotFoundException(message);
        }
        return details;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param binder
     */
    @InitBinder("orderDetail")
    public void CustomerOrdersItemDetailsItemThymeleafController.initOrderDetailBinder(WebDataBinder binder) {
        binder.setDisallowedFields("id");
        // Register validators
        GenericValidator validator = new GenericValidator(OrderDetail.class, getCustomerOrderService());
        binder.addValidators(validator);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void CustomerOrdersItemDetailsItemThymeleafController.populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void CustomerOrdersItemDetailsItemThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param customerOrder
     * @param orderDetail
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/edit-form", name = "editForm")
    public ModelAndView CustomerOrdersItemDetailsItemThymeleafController.editForm(@ModelAttribute CustomerOrder customerOrder, @ModelAttribute OrderDetail orderDetail, Model model) {
        populateForm(model);
        
        model.addAttribute("orderDetail", orderDetail);
        return new ModelAndView("customerorders/details/edit");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param customerOrder
     * @param orderDetail
     * @param version
     * @param concurrencyControl
     * @param result
     * @param model
     * @return ModelAndView
     */
    @PutMapping(name = "update")
    public ModelAndView CustomerOrdersItemDetailsItemThymeleafController.update(@ModelAttribute CustomerOrder customerOrder, @Valid @ModelAttribute OrderDetail orderDetail, @RequestParam("version") Integer version, @RequestParam(value = "concurrency", required = false, defaultValue = "") String concurrencyControl, BindingResult result, Model model) {
        if (result.hasErrors()) {
            populateForm(model);
            
            return new ModelAndView("customerorders/details/edit");
        }
        // Concurrency control
        OrderDetail existingOrderDetail = getOrderDetailService().findOne(orderDetail.getId());
        if (!Objects.equals(orderDetail.getVersion(), existingOrderDetail.getVersion())) {
            if (StringUtils.isEmpty(concurrencyControl)){
                populateForm(model);
                model.addAttribute("concurrency", true);
                return new ModelAndView("customerorders/edit");
            } else if("discard".equals(concurrencyControl)){
                populateForm(model);
                model.addAttribute("orderDetail", existingOrderDetail);
                model.addAttribute("concurrency", false);
                return new ModelAndView("customerorders/edit");
            } else if("apply".equals(concurrencyControl)){
                // Update the version field to be able to override the existing values
                orderDetail.setVersion(existingOrderDetail.getVersion());
            } else {
                // Invalid concurrencyControlValue
                throw new IllegalArgumentException("Invalid concurrencyControlValue");
            }
        }
        getOrderDetailService().save(orderDetail);
        return new ModelAndView("redirect:" + getCollectionLink().to(CustomerOrdersCollectionThymeleafLinkFactory.LIST).toUriString());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param customerOrder
     * @param details
     * @return ResponseEntity
     */
    @DeleteMapping(name = "delete")
    @ResponseBody
    public ResponseEntity<?> CustomerOrdersItemDetailsItemThymeleafController.delete(@ModelAttribute CustomerOrder customerOrder, @ModelAttribute OrderDetail details) {
        getCustomerOrderService().removeFromDetails(customerOrder,Collections.singleton(details.getId()));
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param customerOrder
     * @param orderDetail
     * @param model
     * @return ModelAndView
     */
    @GetMapping(name = "show")
    public ModelAndView CustomerOrdersItemDetailsItemThymeleafController.show(@ModelAttribute CustomerOrder customerOrder, @ModelAttribute OrderDetail orderDetail, Model model) {
        model.addAttribute("orderDetail", orderDetail);
        return new ModelAndView("customerorders/details/show");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param customerOrder
     * @param orderDetail
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/inline", name = "showInline")
    public ModelAndView CustomerOrdersItemDetailsItemThymeleafController.showInline(@ModelAttribute CustomerOrder customerOrder, @ModelAttribute OrderDetail orderDetail, Model model) {
        model.addAttribute("orderDetail", orderDetail);
        return new ModelAndView("customerorders/details/showInline :: inline-content");
    }
    
}
