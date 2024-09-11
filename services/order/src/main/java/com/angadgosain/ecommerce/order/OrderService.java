package com.angadgosain.ecommerce.order;

import com.angadgosain.ecommerce.customer.CustomerClient;
import com.angadgosain.ecommerce.exception.BusinessException;
import com.angadgosain.ecommerce.orderline.OrderLineRequest;
import com.angadgosain.ecommerce.orderline.OrderLineService;
import com.angadgosain.ecommerce.product.ProductClient;
import com.angadgosain.ecommerce.product.PurchaseRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository repository;
    private final CustomerClient customerClient;
    private final ProductClient productClient;
    private final OrderMapper mapper;
    private final OrderLineService orderLineService;
    public Integer createOrder(OrderRequest request) {
        var customer = this.customerClient.findCustomerById(request.customerId())
                .orElseThrow(() -> new BusinessException("Cannot create order:: No customer exists with the provided ID"));

        this.productClient.purchaseProducts(request.products());

        var order = this.repository.save(mapper.toOrder(request));

        for(PurchaseRequest purchaseRequest: request.products()){
            orderLineService.saveOrderLine(
                    new OrderLineRequest(
                            null,
                            order.getId(),
                            purchaseRequest.productId(),
                            purchaseRequest.quantity()
                    )
            );
        }
        // TODO: start payment process

        // send order confirmation --> notification-ms (kafka)


        return null;
    }
}
