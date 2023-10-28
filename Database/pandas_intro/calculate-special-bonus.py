import pandas as pd


def calculate_special_bonus(employees: pd.DataFrame) -> pd.DataFrame:
    employees.rename(columns={'salary':'bonus'}, inplace=True)
    condition = (employees['employee_id'] % 2 == 0) | (employees['name'].str.startswith('M'))
    employees.loc[condition, 'bonus']=0
    return employees[['employee_id', 'bonus']].sort_values(by='employee_id', ascending=True)

