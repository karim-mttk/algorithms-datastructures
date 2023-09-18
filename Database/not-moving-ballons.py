def not_boring_movies(cinema: pd.DataFrame) -> pd.DataFrame:
    filter = cinema[(cinema['id']% 2==1) & (cinema['description'] != 'boring')]
    filter = filter.sort_values(by ='rating', ascending = False)
    return filter