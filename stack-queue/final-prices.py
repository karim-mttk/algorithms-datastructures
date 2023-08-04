def finalPrices(self, prices: List[int]) -> List[int]:
    result = []
    for i in range(len(prices)):
        discount = 0
        for j in range(i + 1, len(prices)):
            if prices[j] <= prices[i]:
                discount = prices[j]
                break
        final_price = prices[i] - discount
        result.append(final_price)
    return result