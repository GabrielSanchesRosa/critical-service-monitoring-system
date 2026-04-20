package io.github.gabrielsanchesrosa.csms.repositorys.entities;

import io.github.gabrielsanchesrosa.csms.enums.CriticalityLevelEnum;
import io.github.gabrielsanchesrosa.csms.enums.SystemStatusEnum;
import jakarta.persistence.*;
import lombok.*;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "monitored_system")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MonitoredSystemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "description", length = 255, nullable = true)
    private String description;

    @Column(name = "environment", length = 20, nullable = false)
    private String environment;

    @Column(name = "monitoring_enabled", nullable = false)
    private Boolean monitoringEnabled;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "acceptable_response_time", nullable = false)
    private Duration acceptableResponseTime;

    @Column(name = "status", length = 11, nullable = false)
    @Enumerated(EnumType.STRING)
    private SystemStatusEnum status;

    @Column(name = "criticality_level", length = 6, nullable = false)
    @Enumerated(EnumType.STRING)
    private CriticalityLevelEnum criticalityLevel;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "primary_responsible_id", nullable = true)
    private ResponsibleContactEntity primaryResponsible;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "team_id", nullable = false)
    private TeamEntity team;
}
