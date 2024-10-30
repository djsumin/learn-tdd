package sample.cafekiosk.spring.domain.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


    //select * from product where selling_Status in ('SELLING', 'HOLD');
    List<Product> findAllBySellingStatusIn(List<ProductSellingStatus> sellingStatuses);


    List<Product> findAllByProductNumberIn(List<String> productNumbers);





}
