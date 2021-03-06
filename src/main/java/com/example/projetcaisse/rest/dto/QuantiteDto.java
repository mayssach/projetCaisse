package com.example.projetcaisse.rest.dto;

import com.example.projetcaisse.model.entity.Produit;
import com.example.projetcaisse.model.entity.Ticket;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuantiteDto {
    private Long idQte ;
    private int qte ;
    private ProduitDto produit;
    private TicketDto ticket;
}
