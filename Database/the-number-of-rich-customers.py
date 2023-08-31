import pandas as pd

def count_rich_customers(store: pd.DataFrame) -> pd.DataFrame:
    count = store[store['amount']>500]
    num_rich_customers = count['customer_id'].nunique()
    richDf = pd.DataFrame({'rich_count': [num_rich_customers]})
    return richDf