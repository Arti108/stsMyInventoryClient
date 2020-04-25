/*spackage com.niit.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.niit.inventory.model.Invoice;
import com.niit.inventory.model.InvoiceOrder1;

public interface UserInRepository extends JpaRepository<Invoice, Long> {
	@Query("SELECT new com.niit.inventory.model.InvoiceOrder1(i.invoiceId,i.date,i.order1,i.price,i.price1,i.quantity,o.order_id) "
			+ "FROM Invoice i INNER JOIN i.Order1 o")
	List<InvoiceOrder1> fetchInvoiceInnerJoin();


}
*/