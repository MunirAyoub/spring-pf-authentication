package br.com.fiap.springpfauthentication.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "2TDSPF_TB_USUARIO")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_USUARIO")
    @SequenceGenerator(
            name = "SQ_USUARIO",
            sequenceName = "SQ_USUARIO",
            allocationSize = 1,
            initialValue = 1
    )
    @Column(name = "ID_USUARIO")
    private long id;

    @Column(name= "SN_USUARIO")
    private String senha;

    @Column(name= "EM_USUARIO")
    private String email;

    @OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(
            name = "ID_PESSOA",
            referencedColumnName = "ID_PESSOA",
            foreignKey = @ForeignKey(name = "FK_PESSOA")
    )
    private Pessoa pessoa;
}