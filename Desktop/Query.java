
    @Query(value = "SELECT " +
            "  at" +
            "  FROM " +
            "      AccountTransaction at" +
            "  WHERE at.memberId = :memberId ")
    AccountTransaction getAccountTransactionByMemberId(Long memberId);


    @Query(value = "SELECT new za.ac.nwu.as.domain.dto.AccountTransactionDto( " +

            "           at.memberId," +
            "           at.transactionType," +
            "           at.amount," +
            "           at.creationDate )" +
            "       FROM " +
            "           AccountTransaction at" +
            "       WHERE at.memberId   =   :memberId ")
    AccountTransactionDto getAccountTransactionDtoByMemberId(Long memberId);

    @Query(value = "SELECT amount FROM HR.TRANSACTION " +
            "       WHERE  MEMBER_ID   =   :memberId" +
            "       GROUP BY memberId",nativeQuery = true)
    AccountTransactionDto getAccountBalanceByMemberId(Long memberId);
//