package com.example.sprinkling.domain.sprinkling.dto;

import com.example.sprinkling.domain.sprinkling.SprinklingStatus;
import com.example.sprinkling.domain.sprinkling.entity.Receive;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ReceiveDto {

  private Long id;
  private Long amount;
  private SprinklingStatus status;
  private Long userId;
  private LocalDateTime receiveDate;

  protected ReceiveDto(Receive entity) {
    this.id = entity.getId();
    this.amount = entity.getAmount();
    this.status = entity.getStatus();
    this.userId = entity.getUserId();
    this.receiveDate = entity.getReceiveDate();
  }
  public static ReceiveDto ofEntity(Receive entity) {
    return new ReceiveDto(entity);
  }
}
