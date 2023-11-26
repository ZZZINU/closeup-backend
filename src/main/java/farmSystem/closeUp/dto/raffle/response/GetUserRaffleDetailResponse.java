package farmSystem.closeUp.dto.raffle.response;

import farmSystem.closeUp.domain.WinningInfo;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Getter
@SuperBuilder
public class GetUserRaffleDetailResponse {
    private WinningInfo winningInfo;
    private LocalDateTime raffleCreateDate;
    private LocalDateTime raffleProductStartDate;
    private LocalDateTime raffleProductEndDate;
    private String raffleProductTitle;
    private String raffleProductThumbnailUrl;
    private String raffleProductContent;
}
