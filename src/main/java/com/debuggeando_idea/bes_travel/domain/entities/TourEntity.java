package com.debuggeando_idea.bes_travel.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity(name = "tour")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class TourEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true,
            mappedBy = "tour"
    )
    private Set<ReservationEntity> reservations;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true,
            mappedBy = "tour"
    )
    private Set<TicketEntity> tickets;
    @ManyToOne
    @JoinColumn(name = "id_costumer")
    private CustomerEntity costumer;
}
