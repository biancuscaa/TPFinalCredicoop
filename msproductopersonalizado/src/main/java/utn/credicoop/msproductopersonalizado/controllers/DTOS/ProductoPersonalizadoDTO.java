package utn.credicoop.msproductopersonalizado.controllers.DTOS;

public class ProductoPersonalizadoDTO {

        private Long id;
        private Integer precioFinal;
        //TODO: funcion que calcule precio final

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Integer getPrecioFinal() {
            return precioFinal;
        }

        public void setPrecioFinal(Integer precioFinal) {
            this.precioFinal = precioFinal;}

    public ProductoPersonalizadoDTO(){}


    }

