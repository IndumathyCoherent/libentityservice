package com.spring.libentityservice.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;

@Entity
@Table(name = "Audits")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.ALWAYS)
@ToString
public class AuditsEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@JsonProperty("id")
	private Long id;

	@Column(name = "name")
	@JsonProperty("name")
	private String name;

	@Column(name = "age")
	@JsonProperty("age")
	private String age;

	@Column(name = "gender")
	@JsonProperty("gender")
	private String gender;

}
