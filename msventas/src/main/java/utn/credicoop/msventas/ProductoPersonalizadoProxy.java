package utn.credicoop.msventas;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.transaction.Transactional;
@FeignClient(name = "ProductoPersonalizado")
public interface ProductoPersonalizadoProxy {

    @GetMapping("/productopersonalizado/proxy/{idProductoPersonalizado}")
    ProductoPersonalizadoDTO buscarPorId(@PathVariable("idProductoPersonalizado") Long id);

}
