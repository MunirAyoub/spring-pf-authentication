package br.com.fiap.springpfauthentication.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "2TDSPF_TB_PERMISSAO")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Permissao {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PERMISSAO")
    @SequenceGenerator(
            name = "SQ_PERMISSAO",
            sequenceName = "SQ_PERMISSAO",
            initialValue = 1,
            allocationSize = 1
    )
    @Column(name = "NM_PERMISSAO")
    private String nome;

    @Column(name = "ID_PERMISSAO")
    private long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(
            name = "ID_SISTEMA",
            referencedColumnName = "ID_SISTEMA",
            foreignKey = @ForeignKey(name = "FK_ID_SISTEMA")
    )

    private Sistema sistema;


}