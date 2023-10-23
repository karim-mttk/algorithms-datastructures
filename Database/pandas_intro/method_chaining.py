def findHeavyAnimals(animals: pd.DataFrame) -> pd.Series:
    animals = animals[animals['weight'] > 100]
    animals = animals.sort_values(by='weight', ascending=False)
    animals = animals[['name']]

    return animals